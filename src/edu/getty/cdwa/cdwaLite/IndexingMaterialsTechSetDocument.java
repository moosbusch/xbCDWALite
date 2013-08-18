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
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one indexingMaterialsTechSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface IndexingMaterialsTechSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMaterialsTechSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingmaterialstechset4adfdoctype");
    
    /**
     * Gets the "indexingMaterialsTechSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSet();
    
    /**
     * Sets the "indexingMaterialsTechSet" element
     */
    void setIndexingMaterialsTechSet(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet);
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet addNewIndexingMaterialsTechSet();
    
    /**
     * An XML indexingMaterialsTechSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface IndexingMaterialsTechSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMaterialsTechSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingmaterialstechsetf08belemtype");
        
        /**
         * Gets a List of "termMaterialsTech" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech> getTermMaterialsTechList();
        
        /**
         * Gets array of all "termMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[] getTermMaterialsTechArray();
        
        /**
         * Gets ith "termMaterialsTech" element
         */
        edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech getTermMaterialsTechArray(int i);
        
        /**
         * Returns number of "termMaterialsTech" element
         */
        int sizeOfTermMaterialsTechArray();
        
        /**
         * Sets array of all "termMaterialsTech" element
         */
        void setTermMaterialsTechArray(edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[] termMaterialsTechArray);
        
        /**
         * Sets ith "termMaterialsTech" element
         */
        void setTermMaterialsTechArray(int i, edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech termMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
         */
        edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech insertNewTermMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
         */
        edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech addNewTermMaterialsTech();
        
        /**
         * Removes the ith "termMaterialsTech" element
         */
        void removeTermMaterialsTech(int i);
        
        /**
         * Gets a List of "extentMaterialsTech" elements
         */
        java.util.List<java.lang.String> getExtentMaterialsTechList();
        
        /**
         * Gets array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getExtentMaterialsTechArray();
        
        /**
         * Gets ith "extentMaterialsTech" element
         */
        java.lang.String getExtentMaterialsTechArray(int i);
        
        /**
         * Gets (as xml) a List of "extentMaterialsTech" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetExtentMaterialsTechList();
        
        /**
         * Gets (as xml) array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetExtentMaterialsTechArray();
        
        /**
         * Gets (as xml) ith "extentMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString xgetExtentMaterialsTechArray(int i);
        
        /**
         * Returns number of "extentMaterialsTech" element
         */
        int sizeOfExtentMaterialsTechArray();
        
        /**
         * Sets array of all "extentMaterialsTech" element
         */
        void setExtentMaterialsTechArray(java.lang.String[] extentMaterialsTechArray);
        
        /**
         * Sets ith "extentMaterialsTech" element
         */
        void setExtentMaterialsTechArray(int i, java.lang.String extentMaterialsTech);
        
        /**
         * Sets (as xml) array of all "extentMaterialsTech" element
         */
        void xsetExtentMaterialsTechArray(org.apache.xmlbeans.XmlString[] extentMaterialsTechArray);
        
        /**
         * Sets (as xml) ith "extentMaterialsTech" element
         */
        void xsetExtentMaterialsTechArray(int i, org.apache.xmlbeans.XmlString extentMaterialsTech);
        
        /**
         * Inserts the value as the ith "extentMaterialsTech" element
         */
        void insertExtentMaterialsTech(int i, java.lang.String extentMaterialsTech);
        
        /**
         * Appends the value as the last "extentMaterialsTech" element
         */
        void addExtentMaterialsTech(java.lang.String extentMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString insertNewExtentMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString addNewExtentMaterialsTech();
        
        /**
         * Removes the ith "extentMaterialsTech" element
         */
        void removeExtentMaterialsTech(int i);
        
        /**
         * Gets a List of "sourceMaterialsTech" elements
         */
        java.util.List<java.lang.String> getSourceMaterialsTechList();
        
        /**
         * Gets array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getSourceMaterialsTechArray();
        
        /**
         * Gets ith "sourceMaterialsTech" element
         */
        java.lang.String getSourceMaterialsTechArray(int i);
        
        /**
         * Gets (as xml) a List of "sourceMaterialsTech" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetSourceMaterialsTechList();
        
        /**
         * Gets (as xml) array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetSourceMaterialsTechArray();
        
        /**
         * Gets (as xml) ith "sourceMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString xgetSourceMaterialsTechArray(int i);
        
        /**
         * Returns number of "sourceMaterialsTech" element
         */
        int sizeOfSourceMaterialsTechArray();
        
        /**
         * Sets array of all "sourceMaterialsTech" element
         */
        void setSourceMaterialsTechArray(java.lang.String[] sourceMaterialsTechArray);
        
        /**
         * Sets ith "sourceMaterialsTech" element
         */
        void setSourceMaterialsTechArray(int i, java.lang.String sourceMaterialsTech);
        
        /**
         * Sets (as xml) array of all "sourceMaterialsTech" element
         */
        void xsetSourceMaterialsTechArray(org.apache.xmlbeans.XmlString[] sourceMaterialsTechArray);
        
        /**
         * Sets (as xml) ith "sourceMaterialsTech" element
         */
        void xsetSourceMaterialsTechArray(int i, org.apache.xmlbeans.XmlString sourceMaterialsTech);
        
        /**
         * Inserts the value as the ith "sourceMaterialsTech" element
         */
        void insertSourceMaterialsTech(int i, java.lang.String sourceMaterialsTech);
        
        /**
         * Appends the value as the last "sourceMaterialsTech" element
         */
        void addSourceMaterialsTech(java.lang.String sourceMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString insertNewSourceMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString addNewSourceMaterialsTech();
        
        /**
         * Removes the ith "sourceMaterialsTech" element
         */
        void removeSourceMaterialsTech(int i);
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
