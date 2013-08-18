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
 * A document containing one descriptiveMetadata(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface DescriptiveMetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveMetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivemetadatae4c6doctype");
    
    /**
     * Gets the "descriptiveMetadata" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata getDescriptiveMetadata();
    
    /**
     * Sets the "descriptiveMetadata" element
     */
    void setDescriptiveMetadata(edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata descriptiveMetadata);
    
    /**
     * Appends and returns a new empty "descriptiveMetadata" element
     */
    edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata addNewDescriptiveMetadata();
    
    /**
     * An XML descriptiveMetadata(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface DescriptiveMetadata extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("descriptivemetadatafe1felemtype");
        
        /**
         * Gets the "objectWorkTypeWrap" element
         */
        edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap();
        
        /**
         * Sets the "objectWorkTypeWrap" element
         */
        void setObjectWorkTypeWrap(edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap);
        
        /**
         * Appends and returns a new empty "objectWorkTypeWrap" element
         */
        edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap();
        
        /**
         * Gets the "titleWrap" element
         */
        edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap getTitleWrap();
        
        /**
         * Sets the "titleWrap" element
         */
        void setTitleWrap(edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap titleWrap);
        
        /**
         * Appends and returns a new empty "titleWrap" element
         */
        edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap addNewTitleWrap();
        
        /**
         * Gets the "displayCreator" element
         */
        java.lang.String getDisplayCreator();
        
        /**
         * Gets (as xml) the "displayCreator" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayCreator();
        
        /**
         * Sets the "displayCreator" element
         */
        void setDisplayCreator(java.lang.String displayCreator);
        
        /**
         * Sets (as xml) the "displayCreator" element
         */
        void xsetDisplayCreator(org.apache.xmlbeans.XmlString displayCreator);
        
        /**
         * Gets the "indexingCreatorWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap getIndexingCreatorWrap();
        
        /**
         * Sets the "indexingCreatorWrap" element
         */
        void setIndexingCreatorWrap(edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap indexingCreatorWrap);
        
        /**
         * Appends and returns a new empty "indexingCreatorWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap addNewIndexingCreatorWrap();
        
        /**
         * Gets the "displayMeasurements" element
         */
        java.lang.String getDisplayMeasurements();
        
        /**
         * Gets (as xml) the "displayMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayMeasurements();
        
        /**
         * True if has "displayMeasurements" element
         */
        boolean isSetDisplayMeasurements();
        
        /**
         * Sets the "displayMeasurements" element
         */
        void setDisplayMeasurements(java.lang.String displayMeasurements);
        
        /**
         * Sets (as xml) the "displayMeasurements" element
         */
        void xsetDisplayMeasurements(org.apache.xmlbeans.XmlString displayMeasurements);
        
        /**
         * Unsets the "displayMeasurements" element
         */
        void unsetDisplayMeasurements();
        
        /**
         * Gets the "indexingMeasurementsWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap getIndexingMeasurementsWrap();
        
        /**
         * True if has "indexingMeasurementsWrap" element
         */
        boolean isSetIndexingMeasurementsWrap();
        
        /**
         * Sets the "indexingMeasurementsWrap" element
         */
        void setIndexingMeasurementsWrap(edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap indexingMeasurementsWrap);
        
        /**
         * Appends and returns a new empty "indexingMeasurementsWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap addNewIndexingMeasurementsWrap();
        
        /**
         * Unsets the "indexingMeasurementsWrap" element
         */
        void unsetIndexingMeasurementsWrap();
        
        /**
         * Gets the "displayMaterialsTech" element
         */
        java.lang.String getDisplayMaterialsTech();
        
        /**
         * Gets (as xml) the "displayMaterialsTech" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayMaterialsTech();
        
        /**
         * Sets the "displayMaterialsTech" element
         */
        void setDisplayMaterialsTech(java.lang.String displayMaterialsTech);
        
        /**
         * Sets (as xml) the "displayMaterialsTech" element
         */
        void xsetDisplayMaterialsTech(org.apache.xmlbeans.XmlString displayMaterialsTech);
        
        /**
         * Gets the "indexingMaterialsTechWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap();
        
        /**
         * True if has "indexingMaterialsTechWrap" element
         */
        boolean isSetIndexingMaterialsTechWrap();
        
        /**
         * Sets the "indexingMaterialsTechWrap" element
         */
        void setIndexingMaterialsTechWrap(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap);
        
        /**
         * Appends and returns a new empty "indexingMaterialsTechWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap();
        
        /**
         * Unsets the "indexingMaterialsTechWrap" element
         */
        void unsetIndexingMaterialsTechWrap();
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        boolean isSetDisplayStateEditionWrap();
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        void setDisplayStateEditionWrap(edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        void unsetDisplayStateEditionWrap();
        
        /**
         * Gets the "styleWrap" element
         */
        edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap getStyleWrap();
        
        /**
         * True if has "styleWrap" element
         */
        boolean isSetStyleWrap();
        
        /**
         * Sets the "styleWrap" element
         */
        void setStyleWrap(edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap styleWrap);
        
        /**
         * Appends and returns a new empty "styleWrap" element
         */
        edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap addNewStyleWrap();
        
        /**
         * Unsets the "styleWrap" element
         */
        void unsetStyleWrap();
        
        /**
         * Gets the "cultureWrap" element
         */
        edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap getCultureWrap();
        
        /**
         * True if has "cultureWrap" element
         */
        boolean isSetCultureWrap();
        
        /**
         * Sets the "cultureWrap" element
         */
        void setCultureWrap(edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap cultureWrap);
        
        /**
         * Appends and returns a new empty "cultureWrap" element
         */
        edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap addNewCultureWrap();
        
        /**
         * Unsets the "cultureWrap" element
         */
        void unsetCultureWrap();
        
        /**
         * Gets the "displayCreationDate" element
         */
        java.lang.String getDisplayCreationDate();
        
        /**
         * Gets (as xml) the "displayCreationDate" element
         */
        org.apache.xmlbeans.XmlString xgetDisplayCreationDate();
        
        /**
         * Sets the "displayCreationDate" element
         */
        void setDisplayCreationDate(java.lang.String displayCreationDate);
        
        /**
         * Sets (as xml) the "displayCreationDate" element
         */
        void xsetDisplayCreationDate(org.apache.xmlbeans.XmlString displayCreationDate);
        
        /**
         * Gets the "indexingDatesWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap getIndexingDatesWrap();
        
        /**
         * Sets the "indexingDatesWrap" element
         */
        void setIndexingDatesWrap(edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap indexingDatesWrap);
        
        /**
         * Appends and returns a new empty "indexingDatesWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap addNewIndexingDatesWrap();
        
        /**
         * Gets the "locationWrap" element
         */
        edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap getLocationWrap();
        
        /**
         * Sets the "locationWrap" element
         */
        void setLocationWrap(edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap locationWrap);
        
        /**
         * Appends and returns a new empty "locationWrap" element
         */
        edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap addNewLocationWrap();
        
        /**
         * Gets the "indexingSubjectWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap getIndexingSubjectWrap();
        
        /**
         * True if has "indexingSubjectWrap" element
         */
        boolean isSetIndexingSubjectWrap();
        
        /**
         * Sets the "indexingSubjectWrap" element
         */
        void setIndexingSubjectWrap(edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap indexingSubjectWrap);
        
        /**
         * Appends and returns a new empty "indexingSubjectWrap" element
         */
        edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap addNewIndexingSubjectWrap();
        
        /**
         * Unsets the "indexingSubjectWrap" element
         */
        void unsetIndexingSubjectWrap();
        
        /**
         * Gets the "classWrap" element
         */
        edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap getClassWrap();
        
        /**
         * True if has "classWrap" element
         */
        boolean isSetClassWrap();
        
        /**
         * Sets the "classWrap" element
         */
        void setClassWrap(edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap classWrap);
        
        /**
         * Appends and returns a new empty "classWrap" element
         */
        edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap addNewClassWrap();
        
        /**
         * Unsets the "classWrap" element
         */
        void unsetClassWrap();
        
        /**
         * Gets the "descriptiveNoteWrap" element
         */
        edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap();
        
        /**
         * True if has "descriptiveNoteWrap" element
         */
        boolean isSetDescriptiveNoteWrap();
        
        /**
         * Sets the "descriptiveNoteWrap" element
         */
        void setDescriptiveNoteWrap(edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap);
        
        /**
         * Appends and returns a new empty "descriptiveNoteWrap" element
         */
        edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap();
        
        /**
         * Unsets the "descriptiveNoteWrap" element
         */
        void unsetDescriptiveNoteWrap();
        
        /**
         * Gets the "inscriptionsWrap" element
         */
        edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap();
        
        /**
         * True if has "inscriptionsWrap" element
         */
        boolean isSetInscriptionsWrap();
        
        /**
         * Sets the "inscriptionsWrap" element
         */
        void setInscriptionsWrap(edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap);
        
        /**
         * Appends and returns a new empty "inscriptionsWrap" element
         */
        edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap();
        
        /**
         * Unsets the "inscriptionsWrap" element
         */
        void unsetInscriptionsWrap();
        
        /**
         * Gets the "relatedWorksWrap" element
         */
        edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap();
        
        /**
         * True if has "relatedWorksWrap" element
         */
        boolean isSetRelatedWorksWrap();
        
        /**
         * Sets the "relatedWorksWrap" element
         */
        void setRelatedWorksWrap(edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap);
        
        /**
         * Appends and returns a new empty "relatedWorksWrap" element
         */
        edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap();
        
        /**
         * Unsets the "relatedWorksWrap" element
         */
        void unsetRelatedWorksWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata newInstance() {
              return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
