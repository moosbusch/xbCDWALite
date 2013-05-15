/*
 * An XML document type.
 * Localname: nameCreatorSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.NameCreatorSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one nameCreatorSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface NameCreatorSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameCreatorSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("namecreatorset128edoctype");
    
    /**
     * Gets the "nameCreatorSet" element
     */
    edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet getNameCreatorSet();
    
    /**
     * Sets the "nameCreatorSet" element
     */
    void setNameCreatorSet(edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet nameCreatorSet);
    
    /**
     * Appends and returns a new empty "nameCreatorSet" element
     */
    edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet addNewNameCreatorSet();
    
    /**
     * An XML nameCreatorSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface NameCreatorSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameCreatorSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("namecreatorsetf62belemtype");
        
        /**
         * Gets the "nameCreator" element
         */
        edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator getNameCreator();
        
        /**
         * Sets the "nameCreator" element
         */
        void setNameCreator(edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator nameCreator);
        
        /**
         * Appends and returns a new empty "nameCreator" element
         */
        edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator addNewNameCreator();
        
        /**
         * Gets a List of "sourceNameCreator" elements
         */
        java.util.List<java.lang.String> getSourceNameCreatorList();
        
        /**
         * Gets array of all "sourceNameCreator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getSourceNameCreatorArray();
        
        /**
         * Gets ith "sourceNameCreator" element
         */
        java.lang.String getSourceNameCreatorArray(int i);
        
        /**
         * Gets (as xml) a List of "sourceNameCreator" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetSourceNameCreatorList();
        
        /**
         * Gets (as xml) array of all "sourceNameCreator" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetSourceNameCreatorArray();
        
        /**
         * Gets (as xml) ith "sourceNameCreator" element
         */
        org.apache.xmlbeans.XmlString xgetSourceNameCreatorArray(int i);
        
        /**
         * Returns number of "sourceNameCreator" element
         */
        int sizeOfSourceNameCreatorArray();
        
        /**
         * Sets array of all "sourceNameCreator" element
         */
        void setSourceNameCreatorArray(java.lang.String[] sourceNameCreatorArray);
        
        /**
         * Sets ith "sourceNameCreator" element
         */
        void setSourceNameCreatorArray(int i, java.lang.String sourceNameCreator);
        
        /**
         * Sets (as xml) array of all "sourceNameCreator" element
         */
        void xsetSourceNameCreatorArray(org.apache.xmlbeans.XmlString[] sourceNameCreatorArray);
        
        /**
         * Sets (as xml) ith "sourceNameCreator" element
         */
        void xsetSourceNameCreatorArray(int i, org.apache.xmlbeans.XmlString sourceNameCreator);
        
        /**
         * Inserts the value as the ith "sourceNameCreator" element
         */
        void insertSourceNameCreator(int i, java.lang.String sourceNameCreator);
        
        /**
         * Appends the value as the last "sourceNameCreator" element
         */
        void addSourceNameCreator(java.lang.String sourceNameCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceNameCreator" element
         */
        org.apache.xmlbeans.XmlString insertNewSourceNameCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceNameCreator" element
         */
        org.apache.xmlbeans.XmlString addNewSourceNameCreator();
        
        /**
         * Removes the ith "sourceNameCreator" element
         */
        void removeSourceNameCreator(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.NameCreatorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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