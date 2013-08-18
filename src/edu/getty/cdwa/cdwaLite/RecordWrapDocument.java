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
 * A document containing one recordWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface RecordWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("recordwrap3d14doctype");
    
    /**
     * Gets the "recordWrap" element
     */
    edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap getRecordWrap();
    
    /**
     * Sets the "recordWrap" element
     */
    void setRecordWrap(edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap recordWrap);
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap addNewRecordWrap();
    
    /**
     * An XML recordWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface RecordWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("recordwrapddebelemtype");
        
        /**
         * Gets a List of "recordID" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID> getRecordIDList();
        
        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[] getRecordIDArray();
        
        /**
         * Gets ith "recordID" element
         */
        edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID getRecordIDArray(int i);
        
        /**
         * Returns number of "recordID" element
         */
        int sizeOfRecordIDArray();
        
        /**
         * Sets array of all "recordID" element
         */
        void setRecordIDArray(edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[] recordIDArray);
        
        /**
         * Sets ith "recordID" element
         */
        void setRecordIDArray(int i, edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID recordID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID insertNewRecordID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID addNewRecordID();
        
        /**
         * Removes the ith "recordID" element
         */
        void removeRecordID(int i);
        
        /**
         * Gets the "recordType" element
         */
        java.lang.String getRecordType();
        
        /**
         * Gets (as xml) the "recordType" element
         */
        org.apache.xmlbeans.XmlString xgetRecordType();
        
        /**
         * Sets the "recordType" element
         */
        void setRecordType(java.lang.String recordType);
        
        /**
         * Sets (as xml) the "recordType" element
         */
        void xsetRecordType(org.apache.xmlbeans.XmlString recordType);
        
        /**
         * Gets a List of "recordSource" elements
         */
        java.util.List<java.lang.String> getRecordSourceList();
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getRecordSourceArray();
        
        /**
         * Gets ith "recordSource" element
         */
        java.lang.String getRecordSourceArray(int i);
        
        /**
         * Gets (as xml) a List of "recordSource" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetRecordSourceList();
        
        /**
         * Gets (as xml) array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetRecordSourceArray();
        
        /**
         * Gets (as xml) ith "recordSource" element
         */
        org.apache.xmlbeans.XmlString xgetRecordSourceArray(int i);
        
        /**
         * Returns number of "recordSource" element
         */
        int sizeOfRecordSourceArray();
        
        /**
         * Sets array of all "recordSource" element
         */
        void setRecordSourceArray(java.lang.String[] recordSourceArray);
        
        /**
         * Sets ith "recordSource" element
         */
        void setRecordSourceArray(int i, java.lang.String recordSource);
        
        /**
         * Sets (as xml) array of all "recordSource" element
         */
        void xsetRecordSourceArray(org.apache.xmlbeans.XmlString[] recordSourceArray);
        
        /**
         * Sets (as xml) ith "recordSource" element
         */
        void xsetRecordSourceArray(int i, org.apache.xmlbeans.XmlString recordSource);
        
        /**
         * Inserts the value as the ith "recordSource" element
         */
        void insertRecordSource(int i, java.lang.String recordSource);
        
        /**
         * Appends the value as the last "recordSource" element
         */
        void addRecordSource(java.lang.String recordSource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        org.apache.xmlbeans.XmlString insertNewRecordSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        org.apache.xmlbeans.XmlString addNewRecordSource();
        
        /**
         * Removes the ith "recordSource" element
         */
        void removeRecordSource(int i);
        
        /**
         * Gets a List of "recordInfoWrap" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap> getRecordInfoWrapList();
        
        /**
         * Gets array of all "recordInfoWrap" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[] getRecordInfoWrapArray();
        
        /**
         * Gets ith "recordInfoWrap" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap getRecordInfoWrapArray(int i);
        
        /**
         * Returns number of "recordInfoWrap" element
         */
        int sizeOfRecordInfoWrapArray();
        
        /**
         * Sets array of all "recordInfoWrap" element
         */
        void setRecordInfoWrapArray(edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[] recordInfoWrapArray);
        
        /**
         * Sets ith "recordInfoWrap" element
         */
        void setRecordInfoWrapArray(int i, edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap recordInfoWrap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoWrap" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap insertNewRecordInfoWrap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoWrap" element
         */
        edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap addNewRecordInfoWrap();
        
        /**
         * Removes the ith "recordInfoWrap" element
         */
        void removeRecordInfoWrap(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap newInstance() {
              return (edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
