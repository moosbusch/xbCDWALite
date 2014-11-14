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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import io.github.moosbusch.museum.document.cdwaLite.spi.AbstractCdwaLiteXmlDocument;

/**
 *
 * @author moosbusch
 */
public class DefaultCdwaLiteXmlDocument extends AbstractCdwaLiteXmlDocument<DefaultCDWALiteObjectFactory> {

    public DefaultCdwaLiteXmlDocument() {
    }

    public DefaultCdwaLiteXmlDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected void addSchemaLocation(CdwaliteWrapDocument cdwaliteWrapDocument) {
        XmlCursor cursor = cdwaliteWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), CDWALITE_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    protected CdwaliteWrapDocument loadDocumentImpl(InputStream in)
            throws IOException, XmlException {
        return CdwaliteWrapDocument.Factory.parse(in);
    }

    @Override
    protected void saveDocumentImpl(CdwaliteWrapDocument cdwaliteWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(CDWALITE_NS_URI, CDWALITE_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        addSchemaLocation(cdwaliteWrapDocument);
        cdwaliteWrapDocument.save(out, xmlOptions);
    }

    @Override
    protected DefaultCDWALiteObjectFactory createObjectFactory() {
        return new DefaultCDWALiteObjectFactory();
    }
}
