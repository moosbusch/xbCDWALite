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
package io.github.moosbusch.museum.document.cdwaLite.spi;

import edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import io.github.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import io.github.moosbusch.museum.document.cdwaLite.CdwaLiteXmlDocument;
import io.github.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import io.github.moosbusch.museum.document.cdwaLite.impl.DefaultCDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractCdwaLiteXmlDocument<T extends DefaultCDWALiteObjectFactory>
        extends AbstractMuseumXmlDocument<CdwaliteWrapDocument, T, CdwaliteWrap, Cdwalite>
        implements CdwaLiteXmlDocument<T> {

    public AbstractCdwaLiteXmlDocument() {
    }

    public AbstractCdwaLiteXmlDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    protected abstract void addSchemaLocation(CdwaliteWrapDocument cdwaliteWrapDocument);

    @Override
    public CdwaliteWrap getRootElement() {
        return getRootWrapperElement().getCdwaliteWrap();
    }

    @Override
    public Collection<Cdwalite> getRecords() {
        return getRootElement().getCdwaliteList();
    }
}
