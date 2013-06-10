/*

 *
 */
package org.moosbusch.museum.cdwaLite.inject.impl;

import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlObjectFactory;
import org.moosbusch.museum.cdwaLite.inject.CDWALiteModule;

/**
 *
 * @author moosbusch
 */
public class CDWALiteObjectFactory extends AbstractXmlObjectFactory<CDWALiteModule, CdwaliteWrapDocument> {

    @Override
    protected CDWALiteModule createModule() {
        return new CDWALiteModuleImpl();
    }

    @Override
    public CdwaliteWrapDocument createRootElement() {
        return createTypedObject(CdwaliteWrapDocument.class);
    }
}
