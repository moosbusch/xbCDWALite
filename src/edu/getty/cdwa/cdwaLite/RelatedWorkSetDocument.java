/*
 * An XML document type.
 * Localname: relatedWorkSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one relatedWorkSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface RelatedWorkSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("relatedworkset3d09doctype");
    
    /**
     * Gets the "relatedWorkSet" element
     */
    edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet getRelatedWorkSet();
    
    /**
     * Sets the "relatedWorkSet" element
     */
    void setRelatedWorkSet(edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet relatedWorkSet);
    
    /**
     * Appends and returns a new empty "relatedWorkSet" element
     */
    edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet addNewRelatedWorkSet();
    
    /**
     * An XML relatedWorkSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface RelatedWorkSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("relatedworksetdb8belemtype");
        
        /**
         * Gets a List of "linkRelatedWork" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork> getLinkRelatedWorkList();
        
        /**
         * Gets array of all "linkRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[] getLinkRelatedWorkArray();
        
        /**
         * Gets ith "linkRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork getLinkRelatedWorkArray(int i);
        
        /**
         * Returns number of "linkRelatedWork" element
         */
        int sizeOfLinkRelatedWorkArray();
        
        /**
         * Sets array of all "linkRelatedWork" element
         */
        void setLinkRelatedWorkArray(edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[] linkRelatedWorkArray);
        
        /**
         * Sets ith "linkRelatedWork" element
         */
        void setLinkRelatedWorkArray(int i, edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork linkRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork insertNewLinkRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork addNewLinkRelatedWork();
        
        /**
         * Removes the ith "linkRelatedWork" element
         */
        void removeLinkRelatedWork(int i);
        
        /**
         * Gets the "relatedWorkRelType" element
         */
        java.lang.String getRelatedWorkRelType();
        
        /**
         * Gets (as xml) the "relatedWorkRelType" element
         */
        org.apache.xmlbeans.XmlString xgetRelatedWorkRelType();
        
        /**
         * True if has "relatedWorkRelType" element
         */
        boolean isSetRelatedWorkRelType();
        
        /**
         * Sets the "relatedWorkRelType" element
         */
        void setRelatedWorkRelType(java.lang.String relatedWorkRelType);
        
        /**
         * Sets (as xml) the "relatedWorkRelType" element
         */
        void xsetRelatedWorkRelType(org.apache.xmlbeans.XmlString relatedWorkRelType);
        
        /**
         * Unsets the "relatedWorkRelType" element
         */
        void unsetRelatedWorkRelType();
        
        /**
         * Gets a List of "labelRelatedWork" elements
         */
        java.util.List<java.lang.String> getLabelRelatedWorkList();
        
        /**
         * Gets array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getLabelRelatedWorkArray();
        
        /**
         * Gets ith "labelRelatedWork" element
         */
        java.lang.String getLabelRelatedWorkArray(int i);
        
        /**
         * Gets (as xml) a List of "labelRelatedWork" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetLabelRelatedWorkList();
        
        /**
         * Gets (as xml) array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetLabelRelatedWorkArray();
        
        /**
         * Gets (as xml) ith "labelRelatedWork" element
         */
        org.apache.xmlbeans.XmlString xgetLabelRelatedWorkArray(int i);
        
        /**
         * Returns number of "labelRelatedWork" element
         */
        int sizeOfLabelRelatedWorkArray();
        
        /**
         * Sets array of all "labelRelatedWork" element
         */
        void setLabelRelatedWorkArray(java.lang.String[] labelRelatedWorkArray);
        
        /**
         * Sets ith "labelRelatedWork" element
         */
        void setLabelRelatedWorkArray(int i, java.lang.String labelRelatedWork);
        
        /**
         * Sets (as xml) array of all "labelRelatedWork" element
         */
        void xsetLabelRelatedWorkArray(org.apache.xmlbeans.XmlString[] labelRelatedWorkArray);
        
        /**
         * Sets (as xml) ith "labelRelatedWork" element
         */
        void xsetLabelRelatedWorkArray(int i, org.apache.xmlbeans.XmlString labelRelatedWork);
        
        /**
         * Inserts the value as the ith "labelRelatedWork" element
         */
        void insertLabelRelatedWork(int i, java.lang.String labelRelatedWork);
        
        /**
         * Appends the value as the last "labelRelatedWork" element
         */
        void addLabelRelatedWork(java.lang.String labelRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedWork" element
         */
        org.apache.xmlbeans.XmlString insertNewLabelRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedWork" element
         */
        org.apache.xmlbeans.XmlString addNewLabelRelatedWork();
        
        /**
         * Removes the ith "labelRelatedWork" element
         */
        void removeLabelRelatedWork(int i);
        
        /**
         * Gets a List of "locRelatedWork" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork> getLocRelatedWorkList();
        
        /**
         * Gets array of all "locRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[] getLocRelatedWorkArray();
        
        /**
         * Gets ith "locRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWorkArray(int i);
        
        /**
         * Returns number of "locRelatedWork" element
         */
        int sizeOfLocRelatedWorkArray();
        
        /**
         * Sets array of all "locRelatedWork" element
         */
        void setLocRelatedWorkArray(edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[] locRelatedWorkArray);
        
        /**
         * Sets ith "locRelatedWork" element
         */
        void setLocRelatedWorkArray(int i, edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork locRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "locRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork insertNewLocRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "locRelatedWork" element
         */
        edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork();
        
        /**
         * Removes the ith "locRelatedWork" element
         */
        void removeLocRelatedWork(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
