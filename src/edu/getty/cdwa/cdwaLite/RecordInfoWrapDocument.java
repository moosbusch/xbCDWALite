/*
 * An XML document type.
 * Localname: recordInfoWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one recordInfoWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface RecordInfoWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordInfoWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("recordinfowraped86doctype");
    
    /**
     * Gets the "recordInfoWrap" element
     */
    edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap getRecordInfoWrap();
    
    /**
     * Sets the "recordInfoWrap" element
     */
    void setRecordInfoWrap(edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap recordInfoWrap);
    
    /**
     * Appends and returns a new empty "recordInfoWrap" element
     */
    edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap addNewRecordInfoWrap();
    
    /**
     * An XML recordInfoWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface RecordInfoWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordInfoWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("recordinfowrap452belemtype");
        
        /**
         * Gets a List of "recordInfoID" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID> getRecordInfoIDList();
        
        /**
         * Gets array of all "recordInfoID" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[] getRecordInfoIDArray();
        
        /**
         * Gets ith "recordInfoID" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID getRecordInfoIDArray(int i);
        
        /**
         * Returns number of "recordInfoID" element
         */
        int sizeOfRecordInfoIDArray();
        
        /**
         * Sets array of all "recordInfoID" element
         */
        void setRecordInfoIDArray(edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[] recordInfoIDArray);
        
        /**
         * Sets ith "recordInfoID" element
         */
        void setRecordInfoIDArray(int i, edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID recordInfoID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID insertNewRecordInfoID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID addNewRecordInfoID();
        
        /**
         * Removes the ith "recordInfoID" element
         */
        void removeRecordInfoID(int i);
        
        /**
         * Gets a List of "recordInfoLink" elements
         */
        java.util.List<java.lang.String> getRecordInfoLinkList();
        
        /**
         * Gets array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getRecordInfoLinkArray();
        
        /**
         * Gets ith "recordInfoLink" element
         */
        java.lang.String getRecordInfoLinkArray(int i);
        
        /**
         * Gets (as xml) a List of "recordInfoLink" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetRecordInfoLinkList();
        
        /**
         * Gets (as xml) array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetRecordInfoLinkArray();
        
        /**
         * Gets (as xml) ith "recordInfoLink" element
         */
        org.apache.xmlbeans.XmlString xgetRecordInfoLinkArray(int i);
        
        /**
         * Returns number of "recordInfoLink" element
         */
        int sizeOfRecordInfoLinkArray();
        
        /**
         * Sets array of all "recordInfoLink" element
         */
        void setRecordInfoLinkArray(java.lang.String[] recordInfoLinkArray);
        
        /**
         * Sets ith "recordInfoLink" element
         */
        void setRecordInfoLinkArray(int i, java.lang.String recordInfoLink);
        
        /**
         * Sets (as xml) array of all "recordInfoLink" element
         */
        void xsetRecordInfoLinkArray(org.apache.xmlbeans.XmlString[] recordInfoLinkArray);
        
        /**
         * Sets (as xml) ith "recordInfoLink" element
         */
        void xsetRecordInfoLinkArray(int i, org.apache.xmlbeans.XmlString recordInfoLink);
        
        /**
         * Inserts the value as the ith "recordInfoLink" element
         */
        void insertRecordInfoLink(int i, java.lang.String recordInfoLink);
        
        /**
         * Appends the value as the last "recordInfoLink" element
         */
        void addRecordInfoLink(java.lang.String recordInfoLink);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
         */
        org.apache.xmlbeans.XmlString insertNewRecordInfoLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
         */
        org.apache.xmlbeans.XmlString addNewRecordInfoLink();
        
        /**
         * Removes the ith "recordInfoLink" element
         */
        void removeRecordInfoLink(int i);
        
        /**
         * Gets a List of "recordRelID" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID> getRecordRelIDList();
        
        /**
         * Gets array of all "recordRelID" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[] getRecordRelIDArray();
        
        /**
         * Gets ith "recordRelID" element
         */
        edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID getRecordRelIDArray(int i);
        
        /**
         * Returns number of "recordRelID" element
         */
        int sizeOfRecordRelIDArray();
        
        /**
         * Sets array of all "recordRelID" element
         */
        void setRecordRelIDArray(edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[] recordRelIDArray);
        
        /**
         * Sets ith "recordRelID" element
         */
        void setRecordRelIDArray(int i, edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID recordRelID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRelID" element
         */
        edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID insertNewRecordRelID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordRelID" element
         */
        edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID addNewRecordRelID();
        
        /**
         * Removes the ith "recordRelID" element
         */
        void removeRecordRelID(int i);
        
        /**
         * Gets a List of "recordMetadataLoc" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc> getRecordMetadataLocList();
        
        /**
         * Gets array of all "recordMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[] getRecordMetadataLocArray();
        
        /**
         * Gets ith "recordMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc getRecordMetadataLocArray(int i);
        
        /**
         * Returns number of "recordMetadataLoc" element
         */
        int sizeOfRecordMetadataLocArray();
        
        /**
         * Sets array of all "recordMetadataLoc" element
         */
        void setRecordMetadataLocArray(edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[] recordMetadataLocArray);
        
        /**
         * Sets ith "recordMetadataLoc" element
         */
        void setRecordMetadataLocArray(int i, edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc recordMetadataLoc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc insertNewRecordMetadataLoc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc addNewRecordMetadataLoc();
        
        /**
         * Removes the ith "recordMetadataLoc" element
         */
        void removeRecordMetadataLoc(int i);
        
        /**
         * Gets a List of "recordMetadataDate" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate> getRecordMetadataDateList();
        
        /**
         * Gets array of all "recordMetadataDate" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[] getRecordMetadataDateArray();
        
        /**
         * Gets ith "recordMetadataDate" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate getRecordMetadataDateArray(int i);
        
        /**
         * Returns number of "recordMetadataDate" element
         */
        int sizeOfRecordMetadataDateArray();
        
        /**
         * Sets array of all "recordMetadataDate" element
         */
        void setRecordMetadataDateArray(edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[] recordMetadataDateArray);
        
        /**
         * Sets ith "recordMetadataDate" element
         */
        void setRecordMetadataDateArray(int i, edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate recordMetadataDate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate insertNewRecordMetadataDate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
         */
        edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate addNewRecordMetadataDate();
        
        /**
         * Removes the ith "recordMetadataDate" element
         */
        void removeRecordMetadataDate(int i);
        
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
            public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap newInstance() {
              return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
