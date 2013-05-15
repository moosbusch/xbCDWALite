/*
 * An XML document type.
 * Localname: displayStateEditionWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one displayStateEditionWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface DisplayStateEditionWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("displaystateeditionwrapf0e8doctype");
    
    /**
     * Gets the "displayStateEditionWrap" element
     */
    edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
    
    /**
     * Sets the "displayStateEditionWrap" element
     */
    void setDisplayStateEditionWrap(edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
    
    /**
     * Appends and returns a new empty "displayStateEditionWrap" element
     */
    edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
    
    /**
     * An XML displayStateEditionWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface DisplayStateEditionWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("displaystateeditionwrapd3e3elemtype");
        
        /**
         * Gets a List of "displayState" elements
         */
        java.util.List<java.lang.String> getDisplayStateList();
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getDisplayStateArray();
        
        /**
         * Gets ith "displayState" element
         */
        java.lang.String getDisplayStateArray(int i);
        
        /**
         * Gets (as xml) a List of "displayState" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetDisplayStateList();
        
        /**
         * Gets (as xml) array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetDisplayStateArray();
        
        /**
         * Gets (as xml) ith "displayState" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayStateArray(int i);
        
        /**
         * Returns number of "displayState" element
         */
        int sizeOfDisplayStateArray();
        
        /**
         * Sets array of all "displayState" element
         */
        void setDisplayStateArray(java.lang.String[] displayStateArray);
        
        /**
         * Sets ith "displayState" element
         */
        void setDisplayStateArray(int i, java.lang.String displayState);
        
        /**
         * Sets (as xml) array of all "displayState" element
         */
        void xsetDisplayStateArray(org.apache.xmlbeans.XmlString[] displayStateArray);
        
        /**
         * Sets (as xml) ith "displayState" element
         */
        void xsetDisplayStateArray(int i, org.apache.xmlbeans.XmlString displayState);
        
        /**
         * Inserts the value as the ith "displayState" element
         */
        void insertDisplayState(int i, java.lang.String displayState);
        
        /**
         * Appends the value as the last "displayState" element
         */
        void addDisplayState(java.lang.String displayState);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayState" element
         */
        org.apache.xmlbeans.XmlString insertNewDisplayState(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayState" element
         */
        org.apache.xmlbeans.XmlString addNewDisplayState();
        
        /**
         * Removes the ith "displayState" element
         */
        void removeDisplayState(int i);
        
        /**
         * Gets a List of "displayEdition" elements
         */
        java.util.List<java.lang.String> getDisplayEditionList();
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getDisplayEditionArray();
        
        /**
         * Gets ith "displayEdition" element
         */
        java.lang.String getDisplayEditionArray(int i);
        
        /**
         * Gets (as xml) a List of "displayEdition" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetDisplayEditionList();
        
        /**
         * Gets (as xml) array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetDisplayEditionArray();
        
        /**
         * Gets (as xml) ith "displayEdition" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayEditionArray(int i);
        
        /**
         * Returns number of "displayEdition" element
         */
        int sizeOfDisplayEditionArray();
        
        /**
         * Sets array of all "displayEdition" element
         */
        void setDisplayEditionArray(java.lang.String[] displayEditionArray);
        
        /**
         * Sets ith "displayEdition" element
         */
        void setDisplayEditionArray(int i, java.lang.String displayEdition);
        
        /**
         * Sets (as xml) array of all "displayEdition" element
         */
        void xsetDisplayEditionArray(org.apache.xmlbeans.XmlString[] displayEditionArray);
        
        /**
         * Sets (as xml) ith "displayEdition" element
         */
        void xsetDisplayEditionArray(int i, org.apache.xmlbeans.XmlString displayEdition);
        
        /**
         * Inserts the value as the ith "displayEdition" element
         */
        void insertDisplayEdition(int i, java.lang.String displayEdition);
        
        /**
         * Appends the value as the last "displayEdition" element
         */
        void addDisplayEdition(java.lang.String displayEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEdition" element
         */
        org.apache.xmlbeans.XmlString insertNewDisplayEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEdition" element
         */
        org.apache.xmlbeans.XmlString addNewDisplayEdition();
        
        /**
         * Removes the ith "displayEdition" element
         */
        void removeDisplayEdition(int i);
        
        /**
         * Gets a List of "sourceStateEdition" elements
         */
        java.util.List<java.lang.String> getSourceStateEditionList();
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getSourceStateEditionArray();
        
        /**
         * Gets ith "sourceStateEdition" element
         */
        java.lang.String getSourceStateEditionArray(int i);
        
        /**
         * Gets (as xml) a List of "sourceStateEdition" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetSourceStateEditionList();
        
        /**
         * Gets (as xml) array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetSourceStateEditionArray();
        
        /**
         * Gets (as xml) ith "sourceStateEdition" element
         */
        org.apache.xmlbeans.XmlString xgetSourceStateEditionArray(int i);
        
        /**
         * Returns number of "sourceStateEdition" element
         */
        int sizeOfSourceStateEditionArray();
        
        /**
         * Sets array of all "sourceStateEdition" element
         */
        void setSourceStateEditionArray(java.lang.String[] sourceStateEditionArray);
        
        /**
         * Sets ith "sourceStateEdition" element
         */
        void setSourceStateEditionArray(int i, java.lang.String sourceStateEdition);
        
        /**
         * Sets (as xml) array of all "sourceStateEdition" element
         */
        void xsetSourceStateEditionArray(org.apache.xmlbeans.XmlString[] sourceStateEditionArray);
        
        /**
         * Sets (as xml) ith "sourceStateEdition" element
         */
        void xsetSourceStateEditionArray(int i, org.apache.xmlbeans.XmlString sourceStateEdition);
        
        /**
         * Inserts the value as the ith "sourceStateEdition" element
         */
        void insertSourceStateEdition(int i, java.lang.String sourceStateEdition);
        
        /**
         * Appends the value as the last "sourceStateEdition" element
         */
        void addSourceStateEdition(java.lang.String sourceStateEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceStateEdition" element
         */
        org.apache.xmlbeans.XmlString insertNewSourceStateEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceStateEdition" element
         */
        org.apache.xmlbeans.XmlString addNewSourceStateEdition();
        
        /**
         * Removes the ith "sourceStateEdition" element
         */
        void removeSourceStateEdition(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance() {
              return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
