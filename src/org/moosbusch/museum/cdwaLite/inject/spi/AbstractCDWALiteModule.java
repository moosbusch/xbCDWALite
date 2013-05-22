/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.cdwaLite.inject.spi;

import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.cdwaLite.inject.CDWALiteModule;
import org.moosbusch.museum.cdwaLite.inject.impl.CDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractCDWALiteModule extends AbstractMuseumXmlModule
    implements CDWALiteModule {

    public AbstractCDWALiteModule(CDWALiteObjectFactory objFactory) {
        super(objFactory);
    }

    @Override
    protected String createLanguage() {
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public CDWALiteObjectFactory getObjectFactory() {
        return (CDWALiteObjectFactory) super.getObjectFactory();
    }

}
