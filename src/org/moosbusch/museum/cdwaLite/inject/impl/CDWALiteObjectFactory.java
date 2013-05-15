/*

 *
 */
package org.moosbusch.museum.cdwaLite.inject.impl;

import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.cdwaLite.inject.CDWALiteModule;

/**
 *
 * @author moosbusch
 */
public class CDWALiteObjectFactory extends AbstractMuseumXmlObjectFactory<CDWALiteModule, CdwaliteWrapDocument> {

    public static final String MUSEUMVOK_DOCTYPE_NAME = "museumvok";
    public static final String MUSEUMVOK_DOCTYPE_SYSTEM_ID = "museumvok0.2.dtd";

    @Override
    protected CDWALiteModule createModule() {
        return new CDWALiteModuleImpl();
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
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        cdwaliteWrapDocument.save(out, xmlOptions);
    }
}
