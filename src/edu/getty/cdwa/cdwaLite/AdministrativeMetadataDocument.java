/*
 * An XML document type.
 * Localname: administrativeMetadata
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one administrativeMetadata(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface AdministrativeMetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdministrativeMetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("administrativemetadata5112doctype");
    
    /**
     * Gets the "administrativeMetadata" element
     */
    edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata getAdministrativeMetadata();
    
    /**
     * Sets the "administrativeMetadata" element
     */
    void setAdministrativeMetadata(edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata administrativeMetadata);
    
    /**
     * Appends and returns a new empty "administrativeMetadata" element
     */
    edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata addNewAdministrativeMetadata();
    
    /**
     * An XML administrativeMetadata(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface AdministrativeMetadata extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdministrativeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("administrativemetadatad6abelemtype");
        
        /**
         * Gets a List of "rightsWork" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork> getRightsWorkList();
        
        /**
         * Gets array of all "rightsWork" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork[] getRightsWorkArray();
        
        /**
         * Gets ith "rightsWork" element
         */
        edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork getRightsWorkArray(int i);
        
        /**
         * Returns number of "rightsWork" element
         */
        int sizeOfRightsWorkArray();
        
        /**
         * Sets array of all "rightsWork" element
         */
        void setRightsWorkArray(edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork[] rightsWorkArray);
        
        /**
         * Sets ith "rightsWork" element
         */
        void setRightsWorkArray(int i, edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork rightsWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsWork" element
         */
        edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork insertNewRightsWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsWork" element
         */
        edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork addNewRightsWork();
        
        /**
         * Removes the ith "rightsWork" element
         */
        void removeRightsWork(int i);
        
        /**
         * Gets the "recordWrap" element
         */
        edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap getRecordWrap();
        
        /**
         * True if has "recordWrap" element
         */
        boolean isSetRecordWrap();
        
        /**
         * Sets the "recordWrap" element
         */
        void setRecordWrap(edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap recordWrap);
        
        /**
         * Appends and returns a new empty "recordWrap" element
         */
        edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap addNewRecordWrap();
        
        /**
         * Unsets the "recordWrap" element
         */
        void unsetRecordWrap();
        
        /**
         * Gets the "resourceWrap" element
         */
        edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap getResourceWrap();
        
        /**
         * True if has "resourceWrap" element
         */
        boolean isSetResourceWrap();
        
        /**
         * Sets the "resourceWrap" element
         */
        void setResourceWrap(edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap resourceWrap);
        
        /**
         * Appends and returns a new empty "resourceWrap" element
         */
        edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap addNewResourceWrap();
        
        /**
         * Unsets the "resourceWrap" element
         */
        void unsetResourceWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata newInstance() {
              return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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