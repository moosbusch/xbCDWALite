/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one rightsWork(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface RightsWorkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightsWorkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("rightsworkb8a7doctype");
    
    /**
     * Gets the "rightsWork" element
     */
    edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork getRightsWork();
    
    /**
     * Sets the "rightsWork" element
     */
    void setRightsWork(edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork rightsWork);
    
    /**
     * Appends and returns a new empty "rightsWork" element
     */
    edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork addNewRightsWork();
    
    /**
     * An XML rightsWork(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.RightsWorkDocument$RightsWork.
     */
    public interface RightsWork extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightsWork.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("rightswork84cbelemtype");
        
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
            public static edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork newInstance() {
              return (edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RightsWorkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RightsWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
