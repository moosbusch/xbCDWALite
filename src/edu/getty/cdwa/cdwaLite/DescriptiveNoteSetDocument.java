/*
 * An XML document type.
 * Localname: descriptiveNoteSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one descriptiveNoteSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface DescriptiveNoteSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivenoteset590bdoctype");
    
    /**
     * Gets the "descriptiveNoteSet" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSet();
    
    /**
     * Sets the "descriptiveNoteSet" element
     */
    void setDescriptiveNoteSet(edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet);
    
    /**
     * Appends and returns a new empty "descriptiveNoteSet" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet();
    
    /**
     * An XML descriptiveNoteSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface DescriptiveNoteSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivenoteset384belemtype");
        
        /**
         * Gets the "descriptiveNote" element
         */
        java.lang.String getDescriptiveNote();
        
        /**
         * Gets (as xml) the "descriptiveNote" element
         */
        org.apache.xmlbeans.XmlString xgetDescriptiveNote();
        
        /**
         * True if has "descriptiveNote" element
         */
        boolean isSetDescriptiveNote();
        
        /**
         * Sets the "descriptiveNote" element
         */
        void setDescriptiveNote(java.lang.String descriptiveNote);
        
        /**
         * Sets (as xml) the "descriptiveNote" element
         */
        void xsetDescriptiveNote(org.apache.xmlbeans.XmlString descriptiveNote);
        
        /**
         * Unsets the "descriptiveNote" element
         */
        void unsetDescriptiveNote();
        
        /**
         * Gets a List of "sourceDescriptiveNote" elements
         */
        java.util.List<java.lang.String> getSourceDescriptiveNoteList();
        
        /**
         * Gets array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getSourceDescriptiveNoteArray();
        
        /**
         * Gets ith "sourceDescriptiveNote" element
         */
        java.lang.String getSourceDescriptiveNoteArray(int i);
        
        /**
         * Gets (as xml) a List of "sourceDescriptiveNote" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetSourceDescriptiveNoteList();
        
        /**
         * Gets (as xml) array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetSourceDescriptiveNoteArray();
        
        /**
         * Gets (as xml) ith "sourceDescriptiveNote" element
         */
        org.apache.xmlbeans.XmlString xgetSourceDescriptiveNoteArray(int i);
        
        /**
         * Returns number of "sourceDescriptiveNote" element
         */
        int sizeOfSourceDescriptiveNoteArray();
        
        /**
         * Sets array of all "sourceDescriptiveNote" element
         */
        void setSourceDescriptiveNoteArray(java.lang.String[] sourceDescriptiveNoteArray);
        
        /**
         * Sets ith "sourceDescriptiveNote" element
         */
        void setSourceDescriptiveNoteArray(int i, java.lang.String sourceDescriptiveNote);
        
        /**
         * Sets (as xml) array of all "sourceDescriptiveNote" element
         */
        void xsetSourceDescriptiveNoteArray(org.apache.xmlbeans.XmlString[] sourceDescriptiveNoteArray);
        
        /**
         * Sets (as xml) ith "sourceDescriptiveNote" element
         */
        void xsetSourceDescriptiveNoteArray(int i, org.apache.xmlbeans.XmlString sourceDescriptiveNote);
        
        /**
         * Inserts the value as the ith "sourceDescriptiveNote" element
         */
        void insertSourceDescriptiveNote(int i, java.lang.String sourceDescriptiveNote);
        
        /**
         * Appends the value as the last "sourceDescriptiveNote" element
         */
        void addSourceDescriptiveNote(java.lang.String sourceDescriptiveNote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
         */
        org.apache.xmlbeans.XmlString insertNewSourceDescriptiveNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
         */
        org.apache.xmlbeans.XmlString addNewSourceDescriptiveNote();
        
        /**
         * Removes the ith "sourceDescriptiveNote" element
         */
        void removeSourceDescriptiveNote(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
