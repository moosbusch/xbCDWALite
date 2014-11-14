/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.moosbusch.museum.document.cdwaLite.impl;

import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import io.github.moosbusch.museum.document.spi.AbstractMuseumXmlObjectFactory;
import io.github.moosbusch.museum.inject.cdwaLite.CDWALiteModule;
import io.github.moosbusch.museum.inject.cdwaLite.impl.DefaultCDWALiteModule;

/**
 *
 * @author moosbusch
 */
public class DefaultCDWALiteObjectFactory extends AbstractMuseumXmlObjectFactory<CDWALiteModule, CdwaliteWrapDocument> {

    @Override
    protected CDWALiteModule createModule() {
        return new DefaultCDWALiteModule();
    }

    @Override
    public CdwaliteWrapDocument createRootWrapperElement() {
        return createTypedObject(CdwaliteWrapDocument.class);
    }
}
