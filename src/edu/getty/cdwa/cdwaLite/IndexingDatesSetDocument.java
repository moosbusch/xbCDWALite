/*
 * An XML document type.
 * Localname: indexingDatesSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one indexingDatesSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface IndexingDatesSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingDatesSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingdatessete542doctype");
    
    /**
     * Gets the "indexingDatesSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet getIndexingDatesSet();
    
    /**
     * Sets the "indexingDatesSet" element
     */
    void setIndexingDatesSet(edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet indexingDatesSet);
    
    /**
     * Appends and returns a new empty "indexingDatesSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet addNewIndexingDatesSet();
    
    /**
     * An XML indexingDatesSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface IndexingDatesSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingDatesSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingdatesset52abelemtype");
        
        /**
         * Gets a List of "dateQualifier" elements
         */
        java.util.List<java.lang.String> getDateQualifierList();
        
        /**
         * Gets array of all "dateQualifier" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getDateQualifierArray();
        
        /**
         * Gets ith "dateQualifier" element
         */
        java.lang.String getDateQualifierArray(int i);
        
        /**
         * Gets (as xml) a List of "dateQualifier" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetDateQualifierList();
        
        /**
         * Gets (as xml) array of all "dateQualifier" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetDateQualifierArray();
        
        /**
         * Gets (as xml) ith "dateQualifier" element
         */
        org.apache.xmlbeans.XmlString xgetDateQualifierArray(int i);
        
        /**
         * Returns number of "dateQualifier" element
         */
        int sizeOfDateQualifierArray();
        
        /**
         * Sets array of all "dateQualifier" element
         */
        void setDateQualifierArray(java.lang.String[] dateQualifierArray);
        
        /**
         * Sets ith "dateQualifier" element
         */
        void setDateQualifierArray(int i, java.lang.String dateQualifier);
        
        /**
         * Sets (as xml) array of all "dateQualifier" element
         */
        void xsetDateQualifierArray(org.apache.xmlbeans.XmlString[] dateQualifierArray);
        
        /**
         * Sets (as xml) ith "dateQualifier" element
         */
        void xsetDateQualifierArray(int i, org.apache.xmlbeans.XmlString dateQualifier);
        
        /**
         * Inserts the value as the ith "dateQualifier" element
         */
        void insertDateQualifier(int i, java.lang.String dateQualifier);
        
        /**
         * Appends the value as the last "dateQualifier" element
         */
        void addDateQualifier(java.lang.String dateQualifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dateQualifier" element
         */
        org.apache.xmlbeans.XmlString insertNewDateQualifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dateQualifier" element
         */
        org.apache.xmlbeans.XmlString addNewDateQualifier();
        
        /**
         * Removes the ith "dateQualifier" element
         */
        void removeDateQualifier(int i);
        
        /**
         * Gets the "earliestDate" element
         */
        edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate getEarliestDate();
        
        /**
         * Sets the "earliestDate" element
         */
        void setEarliestDate(edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate earliestDate);
        
        /**
         * Appends and returns a new empty "earliestDate" element
         */
        edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate addNewEarliestDate();
        
        /**
         * Gets the "latestDate" element
         */
        edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate getLatestDate();
        
        /**
         * Sets the "latestDate" element
         */
        void setLatestDate(edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate latestDate);
        
        /**
         * Appends and returns a new empty "latestDate" element
         */
        edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate addNewLatestDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
