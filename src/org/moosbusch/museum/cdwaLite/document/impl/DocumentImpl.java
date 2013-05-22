/*

 *
 */
package org.moosbusch.museum.cdwaLite.document.impl;

import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.cdwaLite.document.spi.AbstractDocument;
import org.moosbusch.museum.cdwaLite.inject.impl.CDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<CDWALiteObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected void addSchemaLocation(CdwaliteWrapDocument cdwaliteWrapDocument) {
        XmlCursor cursor = cdwaliteWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), CDWALITE_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    protected CdwaliteWrapDocument loadDocumentImpl(InputStream in)
            throws IOException, XmlException {
        return CdwaliteWrapDocument.Factory.parse(in);
    }

    @Override
    protected void saveDocumentImpl(CdwaliteWrapDocument cdwaliteWrapDocument,
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

    @Override
    protected CDWALiteObjectFactory createObjectFactory() {
        return new CDWALiteObjectFactory();
    }
}
