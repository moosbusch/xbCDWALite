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
package org.moosbusch.museum.cdwaLite.document;

import edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.cdwaLite.inject.impl.CDWALiteObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends CDWALiteObjectFactory>
    extends XmlDocument<CdwaliteWrapDocument, T, CdwaliteWrap, Cdwalite> {

    public static final String CDWALITE_NS_URI = "http://www.getty.edu/CDWA/CDWALite";
    public static final String CDWALITE_NS_PREFIX = "cdwalite";
    public static final String CDWALITE_SCHEMA_LOCATION =
            "http://www.getty.edu/CDWA/CDWALite http://www.getty.edu/CDWA/CDWALite/CDWALite-xsd-public-v1-1.xsd";

}
