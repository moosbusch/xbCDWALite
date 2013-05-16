/*

 *
 */
package org.moosbusch.museum.cdwaLite.inject.impl;

import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.cdwaLite.inject.CDWALiteModule;
import static org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory.SCHEMA_LOCATION_ATTR;
import static org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory.XML_SCHEMA_NS_URI;

/**
 *
 * @author moosbusch
 */
public class CDWALiteObjectFactory extends AbstractMuseumXmlObjectFactory<CDWALiteModule, CdwaliteWrapDocument> {

    public static final String CDWALITE_NS_URI = "http://www.getty.edu/CDWA/CDWALite";
    public static final String CDWALITE_NS_PREFIX = "cdwalite";
    public static final String CDWALITE_SCHEMA_LOCATION =
            "http://www.getty.edu/CDWA/CDWALite http://www.getty.edu/CDWA/CDWALite/CDWALite-xsd-public-v1-1.xsd";

    @Override
    protected CDWALiteModule createModule() {
        return new CDWALiteModuleImpl();
    }

    protected void addSchemaLocation(CdwaliteWrapDocument cdwaliteWrapDocument) {
        XmlCursor cursor = cdwaliteWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), CDWALITE_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    public CdwaliteWrapDocument createRootElement() {
        return createTypedObject(CdwaliteWrapDocument.class);
    }

    @Override
    public CdwaliteWrapDocument loadDocument(InputStream in)
            throws IOException, XmlException {
        return CdwaliteWrapDocument.Factory.parse(in);
    }

    @Override
    public void saveDocument(CdwaliteWrapDocument cdwaliteWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(CDWALITE_NS_URI, CDWALITE_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        addSchemaLocation(cdwaliteWrapDocument);
        cdwaliteWrapDocument.save(out, xmlOptions);
    }
}
