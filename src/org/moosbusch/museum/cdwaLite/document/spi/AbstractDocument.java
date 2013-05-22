/*

 *
 */
package org.moosbusch.museum.cdwaLite.document.spi;

import edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.cdwaLite.document.Document;
import org.moosbusch.museum.cdwaLite.inject.impl.CDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends CDWALiteObjectFactory>
        extends AbstractMuseumXmlDocument<CdwaliteWrapDocument, T, CdwaliteWrap, Cdwalite>
        implements Document<T> {

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    protected abstract void addSchemaLocation(CdwaliteWrapDocument cdwaliteWrapDocument);

    @Override
    public CdwaliteWrap getRootElement() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootWrapperElement().getCdwaliteWrap();
        }
    }

    @Override
    public Collection<Cdwalite> getItems() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootElement().getCdwaliteList();
        }
    }
}
