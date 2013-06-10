/*
 *
 *
 */
package org.moosbusch.museum.cdwaLite.inject.spi;

import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlModule;
import org.moosbusch.museum.cdwaLite.inject.CDWALiteModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractCDWALiteModule extends AbstractXmlModule
    implements CDWALiteModule {

    @Override
    protected String createLanguage() {
        return XmlDocument.DEFAULT_LANGUAGE;
    }

}
