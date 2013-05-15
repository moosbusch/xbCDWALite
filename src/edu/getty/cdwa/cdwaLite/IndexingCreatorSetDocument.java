/*
 * An XML document type.
 * Localname: indexingCreatorSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one indexingCreatorSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface IndexingCreatorSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingCreatorSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingcreatorset07e9doctype");
    
    /**
     * Gets the "indexingCreatorSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet getIndexingCreatorSet();
    
    /**
     * Sets the "indexingCreatorSet" element
     */
    void setIndexingCreatorSet(edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet indexingCreatorSet);
    
    /**
     * Appends and returns a new empty "indexingCreatorSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet addNewIndexingCreatorSet();
    
    /**
     * An XML indexingCreatorSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface IndexingCreatorSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingCreatorSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingcreatorsetcf0belemtype");
        
        /**
         * Gets a List of "nameCreatorSet" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet> getNameCreatorSetList();
        
        /**
         * Gets array of all "nameCreatorSet" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[] getNameCreatorSetArray();
        
        /**
         * Gets ith "nameCreatorSet" element
         */
        edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet getNameCreatorSetArray(int i);
        
        /**
         * Returns number of "nameCreatorSet" element
         */
        int sizeOfNameCreatorSetArray();
        
        /**
         * Sets array of all "nameCreatorSet" element
         */
        void setNameCreatorSetArray(edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[] nameCreatorSetArray);
        
        /**
         * Sets ith "nameCreatorSet" element
         */
        void setNameCreatorSetArray(int i, edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet nameCreatorSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameCreatorSet" element
         */
        edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet insertNewNameCreatorSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameCreatorSet" element
         */
        edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet addNewNameCreatorSet();
        
        /**
         * Removes the ith "nameCreatorSet" element
         */
        void removeNameCreatorSet(int i);
        
        /**
         * Gets a List of "nationalityCreator" elements
         */
        java.util.List<java.lang.String> getNationalityCreatorList();
        
        /**
         * Gets array of all "nationalityCreator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getNationalityCreatorArray();
        
        /**
         * Gets ith "nationalityCreator" element
         */
        java.lang.String getNationalityCreatorArray(int i);
        
        /**
         * Gets (as xml) a List of "nationalityCreator" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetNationalityCreatorList();
        
        /**
         * Gets (as xml) array of all "nationalityCreator" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetNationalityCreatorArray();
        
        /**
         * Gets (as xml) ith "nationalityCreator" element
         */
        org.apache.xmlbeans.XmlString xgetNationalityCreatorArray(int i);
        
        /**
         * Returns number of "nationalityCreator" element
         */
        int sizeOfNationalityCreatorArray();
        
        /**
         * Sets array of all "nationalityCreator" element
         */
        void setNationalityCreatorArray(java.lang.String[] nationalityCreatorArray);
        
        /**
         * Sets ith "nationalityCreator" element
         */
        void setNationalityCreatorArray(int i, java.lang.String nationalityCreator);
        
        /**
         * Sets (as xml) array of all "nationalityCreator" element
         */
        void xsetNationalityCreatorArray(org.apache.xmlbeans.XmlString[] nationalityCreatorArray);
        
        /**
         * Sets (as xml) ith "nationalityCreator" element
         */
        void xsetNationalityCreatorArray(int i, org.apache.xmlbeans.XmlString nationalityCreator);
        
        /**
         * Inserts the value as the ith "nationalityCreator" element
         */
        void insertNationalityCreator(int i, java.lang.String nationalityCreator);
        
        /**
         * Appends the value as the last "nationalityCreator" element
         */
        void addNationalityCreator(java.lang.String nationalityCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nationalityCreator" element
         */
        org.apache.xmlbeans.XmlString insertNewNationalityCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nationalityCreator" element
         */
        org.apache.xmlbeans.XmlString addNewNationalityCreator();
        
        /**
         * Removes the ith "nationalityCreator" element
         */
        void removeNationalityCreator(int i);
        
        /**
         * Gets a List of "vitalDatesCreator" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator> getVitalDatesCreatorList();
        
        /**
         * Gets array of all "vitalDatesCreator" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[] getVitalDatesCreatorArray();
        
        /**
         * Gets ith "vitalDatesCreator" element
         */
        edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator getVitalDatesCreatorArray(int i);
        
        /**
         * Returns number of "vitalDatesCreator" element
         */
        int sizeOfVitalDatesCreatorArray();
        
        /**
         * Sets array of all "vitalDatesCreator" element
         */
        void setVitalDatesCreatorArray(edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[] vitalDatesCreatorArray);
        
        /**
         * Sets ith "vitalDatesCreator" element
         */
        void setVitalDatesCreatorArray(int i, edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator vitalDatesCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "vitalDatesCreator" element
         */
        edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator insertNewVitalDatesCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "vitalDatesCreator" element
         */
        edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator addNewVitalDatesCreator();
        
        /**
         * Removes the ith "vitalDatesCreator" element
         */
        void removeVitalDatesCreator(int i);
        
        /**
         * Gets the "genderCreator" element
         */
        java.lang.String getGenderCreator();
        
        /**
         * Gets (as xml) the "genderCreator" element
         */
        org.apache.xmlbeans.XmlString xgetGenderCreator();
        
        /**
         * True if has "genderCreator" element
         */
        boolean isSetGenderCreator();
        
        /**
         * Sets the "genderCreator" element
         */
        void setGenderCreator(java.lang.String genderCreator);
        
        /**
         * Sets (as xml) the "genderCreator" element
         */
        void xsetGenderCreator(org.apache.xmlbeans.XmlString genderCreator);
        
        /**
         * Unsets the "genderCreator" element
         */
        void unsetGenderCreator();
        
        /**
         * Gets a List of "roleCreator" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator> getRoleCreatorList();
        
        /**
         * Gets array of all "roleCreator" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[] getRoleCreatorArray();
        
        /**
         * Gets ith "roleCreator" element
         */
        edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator getRoleCreatorArray(int i);
        
        /**
         * Returns number of "roleCreator" element
         */
        int sizeOfRoleCreatorArray();
        
        /**
         * Sets array of all "roleCreator" element
         */
        void setRoleCreatorArray(edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[] roleCreatorArray);
        
        /**
         * Sets ith "roleCreator" element
         */
        void setRoleCreatorArray(int i, edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator roleCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleCreator" element
         */
        edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator insertNewRoleCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleCreator" element
         */
        edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator addNewRoleCreator();
        
        /**
         * Removes the ith "roleCreator" element
         */
        void removeRoleCreator(int i);
        
        /**
         * Gets a List of "attributionQualifierCreator" elements
         */
        java.util.List<java.lang.String> getAttributionQualifierCreatorList();
        
        /**
         * Gets array of all "attributionQualifierCreator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getAttributionQualifierCreatorArray();
        
        /**
         * Gets ith "attributionQualifierCreator" element
         */
        java.lang.String getAttributionQualifierCreatorArray(int i);
        
        /**
         * Gets (as xml) a List of "attributionQualifierCreator" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetAttributionQualifierCreatorList();
        
        /**
         * Gets (as xml) array of all "attributionQualifierCreator" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetAttributionQualifierCreatorArray();
        
        /**
         * Gets (as xml) ith "attributionQualifierCreator" element
         */
        org.apache.xmlbeans.XmlString xgetAttributionQualifierCreatorArray(int i);
        
        /**
         * Returns number of "attributionQualifierCreator" element
         */
        int sizeOfAttributionQualifierCreatorArray();
        
        /**
         * Sets array of all "attributionQualifierCreator" element
         */
        void setAttributionQualifierCreatorArray(java.lang.String[] attributionQualifierCreatorArray);
        
        /**
         * Sets ith "attributionQualifierCreator" element
         */
        void setAttributionQualifierCreatorArray(int i, java.lang.String attributionQualifierCreator);
        
        /**
         * Sets (as xml) array of all "attributionQualifierCreator" element
         */
        void xsetAttributionQualifierCreatorArray(org.apache.xmlbeans.XmlString[] attributionQualifierCreatorArray);
        
        /**
         * Sets (as xml) ith "attributionQualifierCreator" element
         */
        void xsetAttributionQualifierCreatorArray(int i, org.apache.xmlbeans.XmlString attributionQualifierCreator);
        
        /**
         * Inserts the value as the ith "attributionQualifierCreator" element
         */
        void insertAttributionQualifierCreator(int i, java.lang.String attributionQualifierCreator);
        
        /**
         * Appends the value as the last "attributionQualifierCreator" element
         */
        void addAttributionQualifierCreator(java.lang.String attributionQualifierCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierCreator" element
         */
        org.apache.xmlbeans.XmlString insertNewAttributionQualifierCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributionQualifierCreator" element
         */
        org.apache.xmlbeans.XmlString addNewAttributionQualifierCreator();
        
        /**
         * Removes the ith "attributionQualifierCreator" element
         */
        void removeAttributionQualifierCreator(int i);
        
        /**
         * Gets a List of "extentCreator" elements
         */
        java.util.List<java.lang.String> getExtentCreatorList();
        
        /**
         * Gets array of all "extentCreator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getExtentCreatorArray();
        
        /**
         * Gets ith "extentCreator" element
         */
        java.lang.String getExtentCreatorArray(int i);
        
        /**
         * Gets (as xml) a List of "extentCreator" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetExtentCreatorList();
        
        /**
         * Gets (as xml) array of all "extentCreator" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetExtentCreatorArray();
        
        /**
         * Gets (as xml) ith "extentCreator" element
         */
        org.apache.xmlbeans.XmlString xgetExtentCreatorArray(int i);
        
        /**
         * Returns number of "extentCreator" element
         */
        int sizeOfExtentCreatorArray();
        
        /**
         * Sets array of all "extentCreator" element
         */
        void setExtentCreatorArray(java.lang.String[] extentCreatorArray);
        
        /**
         * Sets ith "extentCreator" element
         */
        void setExtentCreatorArray(int i, java.lang.String extentCreator);
        
        /**
         * Sets (as xml) array of all "extentCreator" element
         */
        void xsetExtentCreatorArray(org.apache.xmlbeans.XmlString[] extentCreatorArray);
        
        /**
         * Sets (as xml) ith "extentCreator" element
         */
        void xsetExtentCreatorArray(int i, org.apache.xmlbeans.XmlString extentCreator);
        
        /**
         * Inserts the value as the ith "extentCreator" element
         */
        void insertExtentCreator(int i, java.lang.String extentCreator);
        
        /**
         * Appends the value as the last "extentCreator" element
         */
        void addExtentCreator(java.lang.String extentCreator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentCreator" element
         */
        org.apache.xmlbeans.XmlString insertNewExtentCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentCreator" element
         */
        org.apache.xmlbeans.XmlString addNewExtentCreator();
        
        /**
         * Removes the ith "extentCreator" element
         */
        void removeExtentCreator(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
