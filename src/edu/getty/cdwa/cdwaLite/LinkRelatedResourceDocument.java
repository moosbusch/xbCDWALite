/*
 * An XML document type.
 * Localname: linkRelatedResource
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one linkRelatedResource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface LinkRelatedResourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkRelatedResourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("linkrelatedresource9462doctype");
    
    /**
     * Gets the "linkRelatedResource" element
     */
    edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResource();
    
    /**
     * Sets the "linkRelatedResource" element
     */
    void setLinkRelatedResource(edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource);
    
    /**
     * Appends and returns a new empty "linkRelatedResource" element
     */
    edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource();
    
    /**
     * An XML linkRelatedResource(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface LinkRelatedResource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkRelatedResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("linkrelatedresource8057elemtype");
        
        /**
         * Gets the "relatedResourceRelType" element
         */
        java.lang.String getRelatedResourceRelType();
        
        /**
         * Gets (as xml) the "relatedResourceRelType" element
         */
        org.apache.xmlbeans.XmlString xgetRelatedResourceRelType();
        
        /**
         * True if has "relatedResourceRelType" element
         */
        boolean isSetRelatedResourceRelType();
        
        /**
         * Sets the "relatedResourceRelType" element
         */
        void setRelatedResourceRelType(java.lang.String relatedResourceRelType);
        
        /**
         * Sets (as xml) the "relatedResourceRelType" element
         */
        void xsetRelatedResourceRelType(org.apache.xmlbeans.XmlString relatedResourceRelType);
        
        /**
         * Unsets the "relatedResourceRelType" element
         */
        void unsetRelatedResourceRelType();
        
        /**
         * Gets a List of "labelRelatedResource" elements
         */
        java.util.List<java.lang.String> getLabelRelatedResourceList();
        
        /**
         * Gets array of all "labelRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getLabelRelatedResourceArray();
        
        /**
         * Gets ith "labelRelatedResource" element
         */
        java.lang.String getLabelRelatedResourceArray(int i);
        
        /**
         * Gets (as xml) a List of "labelRelatedResource" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetLabelRelatedResourceList();
        
        /**
         * Gets (as xml) array of all "labelRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetLabelRelatedResourceArray();
        
        /**
         * Gets (as xml) ith "labelRelatedResource" element
         */
        org.apache.xmlbeans.XmlString xgetLabelRelatedResourceArray(int i);
        
        /**
         * Returns number of "labelRelatedResource" element
         */
        int sizeOfLabelRelatedResourceArray();
        
        /**
         * Sets array of all "labelRelatedResource" element
         */
        void setLabelRelatedResourceArray(java.lang.String[] labelRelatedResourceArray);
        
        /**
         * Sets ith "labelRelatedResource" element
         */
        void setLabelRelatedResourceArray(int i, java.lang.String labelRelatedResource);
        
        /**
         * Sets (as xml) array of all "labelRelatedResource" element
         */
        void xsetLabelRelatedResourceArray(org.apache.xmlbeans.XmlString[] labelRelatedResourceArray);
        
        /**
         * Sets (as xml) ith "labelRelatedResource" element
         */
        void xsetLabelRelatedResourceArray(int i, org.apache.xmlbeans.XmlString labelRelatedResource);
        
        /**
         * Inserts the value as the ith "labelRelatedResource" element
         */
        void insertLabelRelatedResource(int i, java.lang.String labelRelatedResource);
        
        /**
         * Appends the value as the last "labelRelatedResource" element
         */
        void addLabelRelatedResource(java.lang.String labelRelatedResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedResource" element
         */
        org.apache.xmlbeans.XmlString insertNewLabelRelatedResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedResource" element
         */
        org.apache.xmlbeans.XmlString addNewLabelRelatedResource();
        
        /**
         * Removes the ith "labelRelatedResource" element
         */
        void removeLabelRelatedResource(int i);
        
        /**
         * Gets the "linkscheme" attribute
         */
        java.lang.String getLinkscheme();
        
        /**
         * Gets (as xml) the "linkscheme" attribute
         */
        org.apache.xmlbeans.XmlString xgetLinkscheme();
        
        /**
         * True if has "linkscheme" attribute
         */
        boolean isSetLinkscheme();
        
        /**
         * Sets the "linkscheme" attribute
         */
        void setLinkscheme(java.lang.String linkscheme);
        
        /**
         * Sets (as xml) the "linkscheme" attribute
         */
        void xsetLinkscheme(org.apache.xmlbeans.XmlString linkscheme);
        
        /**
         * Unsets the "linkscheme" attribute
         */
        void unsetLinkscheme();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource newInstance() {
              return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
