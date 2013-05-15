/*
 * An XML document type.
 * Localname: descriptiveNoteWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one descriptiveNoteWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface DescriptiveNoteWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivenotewrap9d79doctype");
    
    /**
     * Gets the "descriptiveNoteWrap" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap();
    
    /**
     * Sets the "descriptiveNoteWrap" element
     */
    void setDescriptiveNoteWrap(edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap);
    
    /**
     * Appends and returns a new empty "descriptiveNoteWrap" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap();
    
    /**
     * An XML descriptiveNoteWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface DescriptiveNoteWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivenotewrap9745elemtype");
        
        /**
         * Gets a List of "descriptiveNoteSet" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet> getDescriptiveNoteSetList();
        
        /**
         * Gets array of all "descriptiveNoteSet" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[] getDescriptiveNoteSetArray();
        
        /**
         * Gets ith "descriptiveNoteSet" element
         */
        edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSetArray(int i);
        
        /**
         * Returns number of "descriptiveNoteSet" element
         */
        int sizeOfDescriptiveNoteSetArray();
        
        /**
         * Sets array of all "descriptiveNoteSet" element
         */
        void setDescriptiveNoteSetArray(edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[] descriptiveNoteSetArray);
        
        /**
         * Sets ith "descriptiveNoteSet" element
         */
        void setDescriptiveNoteSetArray(int i, edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteSet" element
         */
        edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet insertNewDescriptiveNoteSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "descriptiveNoteSet" element
         */
        edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet();
        
        /**
         * Removes the ith "descriptiveNoteSet" element
         */
        void removeDescriptiveNoteSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap newInstance() {
              return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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