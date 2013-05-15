/*
 * An XML document type.
 * Localname: indexingMeasurementsSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one indexingMeasurementsSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface IndexingMeasurementsSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMeasurementsSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingmeasurementssetd3a6doctype");
    
    /**
     * Gets the "indexingMeasurementsSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet getIndexingMeasurementsSet();
    
    /**
     * Sets the "indexingMeasurementsSet" element
     */
    void setIndexingMeasurementsSet(edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet indexingMeasurementsSet);
    
    /**
     * Appends and returns a new empty "indexingMeasurementsSet" element
     */
    edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet addNewIndexingMeasurementsSet();
    
    /**
     * An XML indexingMeasurementsSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface IndexingMeasurementsSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMeasurementsSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("indexingmeasurementsset87dfelemtype");
        
        /**
         * Gets a List of "measurementsSet" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet> getMeasurementsSetList();
        
        /**
         * Gets array of all "measurementsSet" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[] getMeasurementsSetArray();
        
        /**
         * Gets ith "measurementsSet" element
         */
        edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet getMeasurementsSetArray(int i);
        
        /**
         * Returns number of "measurementsSet" element
         */
        int sizeOfMeasurementsSetArray();
        
        /**
         * Sets array of all "measurementsSet" element
         */
        void setMeasurementsSetArray(edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[] measurementsSetArray);
        
        /**
         * Sets ith "measurementsSet" element
         */
        void setMeasurementsSetArray(int i, edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet measurementsSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "measurementsSet" element
         */
        edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet insertNewMeasurementsSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measurementsSet" element
         */
        edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet addNewMeasurementsSet();
        
        /**
         * Removes the ith "measurementsSet" element
         */
        void removeMeasurementsSet(int i);
        
        /**
         * Gets a List of "extentMeasurements" elements
         */
        java.util.List<java.lang.String> getExtentMeasurementsList();
        
        /**
         * Gets array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getExtentMeasurementsArray();
        
        /**
         * Gets ith "extentMeasurements" element
         */
        java.lang.String getExtentMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "extentMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetExtentMeasurementsList();
        
        /**
         * Gets (as xml) array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetExtentMeasurementsArray();
        
        /**
         * Gets (as xml) ith "extentMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetExtentMeasurementsArray(int i);
        
        /**
         * Returns number of "extentMeasurements" element
         */
        int sizeOfExtentMeasurementsArray();
        
        /**
         * Sets array of all "extentMeasurements" element
         */
        void setExtentMeasurementsArray(java.lang.String[] extentMeasurementsArray);
        
        /**
         * Sets ith "extentMeasurements" element
         */
        void setExtentMeasurementsArray(int i, java.lang.String extentMeasurements);
        
        /**
         * Sets (as xml) array of all "extentMeasurements" element
         */
        void xsetExtentMeasurementsArray(org.apache.xmlbeans.XmlString[] extentMeasurementsArray);
        
        /**
         * Sets (as xml) ith "extentMeasurements" element
         */
        void xsetExtentMeasurementsArray(int i, org.apache.xmlbeans.XmlString extentMeasurements);
        
        /**
         * Inserts the value as the ith "extentMeasurements" element
         */
        void insertExtentMeasurements(int i, java.lang.String extentMeasurements);
        
        /**
         * Appends the value as the last "extentMeasurements" element
         */
        void addExtentMeasurements(java.lang.String extentMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewExtentMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewExtentMeasurements();
        
        /**
         * Removes the ith "extentMeasurements" element
         */
        void removeExtentMeasurements(int i);
        
        /**
         * Gets a List of "qualifierMeasurements" elements
         */
        java.util.List<java.lang.String> getQualifierMeasurementsList();
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getQualifierMeasurementsArray();
        
        /**
         * Gets ith "qualifierMeasurements" element
         */
        java.lang.String getQualifierMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "qualifierMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetQualifierMeasurementsList();
        
        /**
         * Gets (as xml) array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetQualifierMeasurementsArray();
        
        /**
         * Gets (as xml) ith "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetQualifierMeasurementsArray(int i);
        
        /**
         * Returns number of "qualifierMeasurements" element
         */
        int sizeOfQualifierMeasurementsArray();
        
        /**
         * Sets array of all "qualifierMeasurements" element
         */
        void setQualifierMeasurementsArray(java.lang.String[] qualifierMeasurementsArray);
        
        /**
         * Sets ith "qualifierMeasurements" element
         */
        void setQualifierMeasurementsArray(int i, java.lang.String qualifierMeasurements);
        
        /**
         * Sets (as xml) array of all "qualifierMeasurements" element
         */
        void xsetQualifierMeasurementsArray(org.apache.xmlbeans.XmlString[] qualifierMeasurementsArray);
        
        /**
         * Sets (as xml) ith "qualifierMeasurements" element
         */
        void xsetQualifierMeasurementsArray(int i, org.apache.xmlbeans.XmlString qualifierMeasurements);
        
        /**
         * Inserts the value as the ith "qualifierMeasurements" element
         */
        void insertQualifierMeasurements(int i, java.lang.String qualifierMeasurements);
        
        /**
         * Appends the value as the last "qualifierMeasurements" element
         */
        void addQualifierMeasurements(java.lang.String qualifierMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewQualifierMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewQualifierMeasurements();
        
        /**
         * Removes the ith "qualifierMeasurements" element
         */
        void removeQualifierMeasurements(int i);
        
        /**
         * Gets a List of "formatMeasurements" elements
         */
        java.util.List<java.lang.String> getFormatMeasurementsList();
        
        /**
         * Gets array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getFormatMeasurementsArray();
        
        /**
         * Gets ith "formatMeasurements" element
         */
        java.lang.String getFormatMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "formatMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetFormatMeasurementsList();
        
        /**
         * Gets (as xml) array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetFormatMeasurementsArray();
        
        /**
         * Gets (as xml) ith "formatMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetFormatMeasurementsArray(int i);
        
        /**
         * Returns number of "formatMeasurements" element
         */
        int sizeOfFormatMeasurementsArray();
        
        /**
         * Sets array of all "formatMeasurements" element
         */
        void setFormatMeasurementsArray(java.lang.String[] formatMeasurementsArray);
        
        /**
         * Sets ith "formatMeasurements" element
         */
        void setFormatMeasurementsArray(int i, java.lang.String formatMeasurements);
        
        /**
         * Sets (as xml) array of all "formatMeasurements" element
         */
        void xsetFormatMeasurementsArray(org.apache.xmlbeans.XmlString[] formatMeasurementsArray);
        
        /**
         * Sets (as xml) ith "formatMeasurements" element
         */
        void xsetFormatMeasurementsArray(int i, org.apache.xmlbeans.XmlString formatMeasurements);
        
        /**
         * Inserts the value as the ith "formatMeasurements" element
         */
        void insertFormatMeasurements(int i, java.lang.String formatMeasurements);
        
        /**
         * Appends the value as the last "formatMeasurements" element
         */
        void addFormatMeasurements(java.lang.String formatMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "formatMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewFormatMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "formatMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewFormatMeasurements();
        
        /**
         * Removes the ith "formatMeasurements" element
         */
        void removeFormatMeasurements(int i);
        
        /**
         * Gets a List of "shapeMeasurements" elements
         */
        java.util.List<java.lang.String> getShapeMeasurementsList();
        
        /**
         * Gets array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getShapeMeasurementsArray();
        
        /**
         * Gets ith "shapeMeasurements" element
         */
        java.lang.String getShapeMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "shapeMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetShapeMeasurementsList();
        
        /**
         * Gets (as xml) array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetShapeMeasurementsArray();
        
        /**
         * Gets (as xml) ith "shapeMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetShapeMeasurementsArray(int i);
        
        /**
         * Returns number of "shapeMeasurements" element
         */
        int sizeOfShapeMeasurementsArray();
        
        /**
         * Sets array of all "shapeMeasurements" element
         */
        void setShapeMeasurementsArray(java.lang.String[] shapeMeasurementsArray);
        
        /**
         * Sets ith "shapeMeasurements" element
         */
        void setShapeMeasurementsArray(int i, java.lang.String shapeMeasurements);
        
        /**
         * Sets (as xml) array of all "shapeMeasurements" element
         */
        void xsetShapeMeasurementsArray(org.apache.xmlbeans.XmlString[] shapeMeasurementsArray);
        
        /**
         * Sets (as xml) ith "shapeMeasurements" element
         */
        void xsetShapeMeasurementsArray(int i, org.apache.xmlbeans.XmlString shapeMeasurements);
        
        /**
         * Inserts the value as the ith "shapeMeasurements" element
         */
        void insertShapeMeasurements(int i, java.lang.String shapeMeasurements);
        
        /**
         * Appends the value as the last "shapeMeasurements" element
         */
        void addShapeMeasurements(java.lang.String shapeMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shapeMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewShapeMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shapeMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewShapeMeasurements();
        
        /**
         * Removes the ith "shapeMeasurements" element
         */
        void removeShapeMeasurements(int i);
        
        /**
         * Gets a List of "scaleMeasurements" elements
         */
        java.util.List<java.lang.String> getScaleMeasurementsList();
        
        /**
         * Gets array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getScaleMeasurementsArray();
        
        /**
         * Gets ith "scaleMeasurements" element
         */
        java.lang.String getScaleMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "scaleMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetScaleMeasurementsList();
        
        /**
         * Gets (as xml) array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetScaleMeasurementsArray();
        
        /**
         * Gets (as xml) ith "scaleMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetScaleMeasurementsArray(int i);
        
        /**
         * Returns number of "scaleMeasurements" element
         */
        int sizeOfScaleMeasurementsArray();
        
        /**
         * Sets array of all "scaleMeasurements" element
         */
        void setScaleMeasurementsArray(java.lang.String[] scaleMeasurementsArray);
        
        /**
         * Sets ith "scaleMeasurements" element
         */
        void setScaleMeasurementsArray(int i, java.lang.String scaleMeasurements);
        
        /**
         * Sets (as xml) array of all "scaleMeasurements" element
         */
        void xsetScaleMeasurementsArray(org.apache.xmlbeans.XmlString[] scaleMeasurementsArray);
        
        /**
         * Sets (as xml) ith "scaleMeasurements" element
         */
        void xsetScaleMeasurementsArray(int i, org.apache.xmlbeans.XmlString scaleMeasurements);
        
        /**
         * Inserts the value as the ith "scaleMeasurements" element
         */
        void insertScaleMeasurements(int i, java.lang.String scaleMeasurements);
        
        /**
         * Appends the value as the last "scaleMeasurements" element
         */
        void addScaleMeasurements(java.lang.String scaleMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scaleMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewScaleMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scaleMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewScaleMeasurements();
        
        /**
         * Removes the ith "scaleMeasurements" element
         */
        void removeScaleMeasurements(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
