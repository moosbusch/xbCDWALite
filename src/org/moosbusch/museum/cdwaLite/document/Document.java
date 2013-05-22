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

    public static final String CDWALITE_NS_URI = "http://www.getty.edu/CDWA/CDWALite";
    public static final String CDWALITE_NS_PREFIX = "cdwalite";
    public static final String CDWALITE_SCHEMA_LOCATION =
            "http://www.getty.edu/CDWA/CDWALite http://www.getty.edu/CDWA/CDWALite/CDWALite-xsd-public-v1-1.xsd";

}
