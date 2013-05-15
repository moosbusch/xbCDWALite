/*

 *
 */
package org.moosbusch.museum.cdwaLite.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.cdwaLite.document.Document;
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
    protected CDWALiteObjectFactory createObjectFactory() {
        return new CDWALiteObjectFactory();
    }
}
