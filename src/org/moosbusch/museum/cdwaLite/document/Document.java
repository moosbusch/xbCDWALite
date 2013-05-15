/*

 *
 */
package org.moosbusch.museum.cdwaLite.document;

import edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.cdwaLite.inject.impl.CDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends CDWALiteObjectFactory>
    extends MuseumXmlDocument<CdwaliteWrapDocument, T, CdwaliteWrap, Cdwalite> {

}
