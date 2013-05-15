/*
 * An XML document type.
 * Localname: formatMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one formatMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface FormatMeasurementsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatMeasurementsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("formatmeasurementsd7a1doctype");
    
    /**
     * Gets the "formatMeasurements" element
     */
    java.lang.String getFormatMeasurements();
    
    /**
     * Gets (as xml) the "formatMeasurements" element
     */
    org.apache.xmlbeans.XmlString xgetFormatMeasurements();
    
    /**
     * Sets the "formatMeasurements" element
     */
    void setFormatMeasurements(java.lang.String formatMeasurements);
    
    /**
     * Sets (as xml) the "formatMeasurements" element
     */
    void xsetFormatMeasurements(org.apache.xmlbeans.XmlString formatMeasurements);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
