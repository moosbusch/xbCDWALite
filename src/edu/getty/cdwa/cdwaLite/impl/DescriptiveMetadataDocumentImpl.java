/*
 * An XML document type.
 * Localname: descriptiveMetadata
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one descriptiveMetadata(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DescriptiveMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveMetadata");
    
    
    /**
     * Gets the "descriptiveMetadata" element
     */
    public edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata getDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
            target = (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().find_element_user(DESCRIPTIVEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveMetadata" element
     */
    public void setDescriptiveMetadata(edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata descriptiveMetadata)
    {
        generatedSetterHelperImpl(descriptiveMetadata, DESCRIPTIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveMetadata" element
     */
    public edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata addNewDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
            target = (edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().add_element_user(DESCRIPTIVEMETADATA$0);
            return target;
        }
    }
    /**
     * An XML descriptiveMetadata(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class DescriptiveMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveMetadataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "objectWorkTypeWrap");
        private static final javax.xml.namespace.QName TITLEWRAP$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "titleWrap");
        private static final javax.xml.namespace.QName DISPLAYCREATOR$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayCreator");
        private static final javax.xml.namespace.QName INDEXINGCREATORWRAP$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingCreatorWrap");
        private static final javax.xml.namespace.QName DISPLAYMEASUREMENTS$8 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayMeasurements");
        private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSWRAP$10 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMeasurementsWrap");
        private static final javax.xml.namespace.QName DISPLAYMATERIALSTECH$12 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayMaterialsTech");
        private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHWRAP$14 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMaterialsTechWrap");
        private static final javax.xml.namespace.QName DISPLAYSTATEEDITIONWRAP$16 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayStateEditionWrap");
        private static final javax.xml.namespace.QName STYLEWRAP$18 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "styleWrap");
        private static final javax.xml.namespace.QName CULTUREWRAP$20 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "cultureWrap");
        private static final javax.xml.namespace.QName DISPLAYCREATIONDATE$22 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayCreationDate");
        private static final javax.xml.namespace.QName INDEXINGDATESWRAP$24 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingDatesWrap");
        private static final javax.xml.namespace.QName LOCATIONWRAP$26 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locationWrap");
        private static final javax.xml.namespace.QName INDEXINGSUBJECTWRAP$28 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingSubjectWrap");
        private static final javax.xml.namespace.QName CLASSWRAP$30 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "classWrap");
        private static final javax.xml.namespace.QName DESCRIPTIVENOTEWRAP$32 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNoteWrap");
        private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$34 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "inscriptionsWrap");
        private static final javax.xml.namespace.QName RELATEDWORKSWRAP$36 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedWorksWrap");
        
        
        /**
         * Gets the "objectWorkTypeWrap" element
         */
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "objectWorkTypeWrap" element
         */
        public void setObjectWorkTypeWrap(edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
        {
            generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "objectWorkTypeWrap" element
         */
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "titleWrap" element
         */
        public edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap getTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap)get_store().find_element_user(TITLEWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "titleWrap" element
         */
        public void setTitleWrap(edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap titleWrap)
        {
            generatedSetterHelperImpl(titleWrap, TITLEWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "titleWrap" element
         */
        public edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap addNewTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap)get_store().add_element_user(TITLEWRAP$2);
                return target;
            }
        }
        
        /**
         * Gets the "displayCreator" element
         */
        public java.lang.String getDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATOR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATOR$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "displayCreator" element
         */
        public void setDisplayCreator(java.lang.String displayCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYCREATOR$4);
                }
                target.setStringValue(displayCreator);
            }
        }
        
        /**
         * Sets (as xml) the "displayCreator" element
         */
        public void xsetDisplayCreator(org.apache.xmlbeans.XmlString displayCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYCREATOR$4);
                }
                target.set(displayCreator);
            }
        }
        
        /**
         * Gets the "indexingCreatorWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap getIndexingCreatorWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap)get_store().find_element_user(INDEXINGCREATORWRAP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "indexingCreatorWrap" element
         */
        public void setIndexingCreatorWrap(edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap indexingCreatorWrap)
        {
            generatedSetterHelperImpl(indexingCreatorWrap, INDEXINGCREATORWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingCreatorWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap addNewIndexingCreatorWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap)get_store().add_element_user(INDEXINGCREATORWRAP$6);
                return target;
            }
        }
        
        /**
         * Gets the "displayMeasurements" element
         */
        public java.lang.String getDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMEASUREMENTS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMEASUREMENTS$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "displayMeasurements" element
         */
        public boolean isSetDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYMEASUREMENTS$8) != 0;
            }
        }
        
        /**
         * Sets the "displayMeasurements" element
         */
        public void setDisplayMeasurements(java.lang.String displayMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMEASUREMENTS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYMEASUREMENTS$8);
                }
                target.setStringValue(displayMeasurements);
            }
        }
        
        /**
         * Sets (as xml) the "displayMeasurements" element
         */
        public void xsetDisplayMeasurements(org.apache.xmlbeans.XmlString displayMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMEASUREMENTS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYMEASUREMENTS$8);
                }
                target.set(displayMeasurements);
            }
        }
        
        /**
         * Unsets the "displayMeasurements" element
         */
        public void unsetDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYMEASUREMENTS$8, 0);
            }
        }
        
        /**
         * Gets the "indexingMeasurementsWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap getIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().find_element_user(INDEXINGMEASUREMENTSWRAP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingMeasurementsWrap" element
         */
        public boolean isSetIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMEASUREMENTSWRAP$10) != 0;
            }
        }
        
        /**
         * Sets the "indexingMeasurementsWrap" element
         */
        public void setIndexingMeasurementsWrap(edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap indexingMeasurementsWrap)
        {
            generatedSetterHelperImpl(indexingMeasurementsWrap, INDEXINGMEASUREMENTSWRAP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingMeasurementsWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap addNewIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().add_element_user(INDEXINGMEASUREMENTSWRAP$10);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingMeasurementsWrap" element
         */
        public void unsetIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMEASUREMENTSWRAP$10, 0);
            }
        }
        
        /**
         * Gets the "displayMaterialsTech" element
         */
        public java.lang.String getDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMATERIALSTECH$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMATERIALSTECH$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "displayMaterialsTech" element
         */
        public void setDisplayMaterialsTech(java.lang.String displayMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMATERIALSTECH$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYMATERIALSTECH$12);
                }
                target.setStringValue(displayMaterialsTech);
            }
        }
        
        /**
         * Sets (as xml) the "displayMaterialsTech" element
         */
        public void xsetDisplayMaterialsTech(org.apache.xmlbeans.XmlString displayMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMATERIALSTECH$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYMATERIALSTECH$12);
                }
                target.set(displayMaterialsTech);
            }
        }
        
        /**
         * Gets the "indexingMaterialsTechWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().find_element_user(INDEXINGMATERIALSTECHWRAP$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingMaterialsTechWrap" element
         */
        public boolean isSetIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMATERIALSTECHWRAP$14) != 0;
            }
        }
        
        /**
         * Sets the "indexingMaterialsTechWrap" element
         */
        public void setIndexingMaterialsTechWrap(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap)
        {
            generatedSetterHelperImpl(indexingMaterialsTechWrap, INDEXINGMATERIALSTECHWRAP$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingMaterialsTechWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().add_element_user(INDEXINGMATERIALSTECHWRAP$14);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingMaterialsTechWrap" element
         */
        public void unsetIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMATERIALSTECHWRAP$14, 0);
            }
        }
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        public edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().find_element_user(DISPLAYSTATEEDITIONWRAP$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        public boolean isSetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYSTATEEDITIONWRAP$16) != 0;
            }
        }
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        public void setDisplayStateEditionWrap(edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap)
        {
            generatedSetterHelperImpl(displayStateEditionWrap, DISPLAYSTATEEDITIONWRAP$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        public edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().add_element_user(DISPLAYSTATEEDITIONWRAP$16);
                return target;
            }
        }
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        public void unsetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYSTATEEDITIONWRAP$16, 0);
            }
        }
        
        /**
         * Gets the "styleWrap" element
         */
        public edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap getStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap)get_store().find_element_user(STYLEWRAP$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "styleWrap" element
         */
        public boolean isSetStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYLEWRAP$18) != 0;
            }
        }
        
        /**
         * Sets the "styleWrap" element
         */
        public void setStyleWrap(edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap styleWrap)
        {
            generatedSetterHelperImpl(styleWrap, STYLEWRAP$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "styleWrap" element
         */
        public edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap addNewStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap)get_store().add_element_user(STYLEWRAP$18);
                return target;
            }
        }
        
        /**
         * Unsets the "styleWrap" element
         */
        public void unsetStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYLEWRAP$18, 0);
            }
        }
        
        /**
         * Gets the "cultureWrap" element
         */
        public edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap getCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap)get_store().find_element_user(CULTUREWRAP$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cultureWrap" element
         */
        public boolean isSetCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CULTUREWRAP$20) != 0;
            }
        }
        
        /**
         * Sets the "cultureWrap" element
         */
        public void setCultureWrap(edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap cultureWrap)
        {
            generatedSetterHelperImpl(cultureWrap, CULTUREWRAP$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "cultureWrap" element
         */
        public edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap addNewCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap)get_store().add_element_user(CULTUREWRAP$20);
                return target;
            }
        }
        
        /**
         * Unsets the "cultureWrap" element
         */
        public void unsetCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CULTUREWRAP$20, 0);
            }
        }
        
        /**
         * Gets the "displayCreationDate" element
         */
        public java.lang.String getDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayCreationDate" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "displayCreationDate" element
         */
        public void setDisplayCreationDate(java.lang.String displayCreationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYCREATIONDATE$22);
                }
                target.setStringValue(displayCreationDate);
            }
        }
        
        /**
         * Sets (as xml) the "displayCreationDate" element
         */
        public void xsetDisplayCreationDate(org.apache.xmlbeans.XmlString displayCreationDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYCREATIONDATE$22);
                }
                target.set(displayCreationDate);
            }
        }
        
        /**
         * Gets the "indexingDatesWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap getIndexingDatesWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap)get_store().find_element_user(INDEXINGDATESWRAP$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "indexingDatesWrap" element
         */
        public void setIndexingDatesWrap(edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap indexingDatesWrap)
        {
            generatedSetterHelperImpl(indexingDatesWrap, INDEXINGDATESWRAP$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingDatesWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap addNewIndexingDatesWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap)get_store().add_element_user(INDEXINGDATESWRAP$24);
                return target;
            }
        }
        
        /**
         * Gets the "locationWrap" element
         */
        public edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap getLocationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap)get_store().find_element_user(LOCATIONWRAP$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locationWrap" element
         */
        public void setLocationWrap(edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap locationWrap)
        {
            generatedSetterHelperImpl(locationWrap, LOCATIONWRAP$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "locationWrap" element
         */
        public edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap addNewLocationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap)get_store().add_element_user(LOCATIONWRAP$26);
                return target;
            }
        }
        
        /**
         * Gets the "indexingSubjectWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap getIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().find_element_user(INDEXINGSUBJECTWRAP$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingSubjectWrap" element
         */
        public boolean isSetIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGSUBJECTWRAP$28) != 0;
            }
        }
        
        /**
         * Sets the "indexingSubjectWrap" element
         */
        public void setIndexingSubjectWrap(edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap indexingSubjectWrap)
        {
            generatedSetterHelperImpl(indexingSubjectWrap, INDEXINGSUBJECTWRAP$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingSubjectWrap" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap addNewIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().add_element_user(INDEXINGSUBJECTWRAP$28);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingSubjectWrap" element
         */
        public void unsetIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGSUBJECTWRAP$28, 0);
            }
        }
        
        /**
         * Gets the "classWrap" element
         */
        public edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap getClassWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap)get_store().find_element_user(CLASSWRAP$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "classWrap" element
         */
        public boolean isSetClassWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSWRAP$30) != 0;
            }
        }
        
        /**
         * Sets the "classWrap" element
         */
        public void setClassWrap(edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap classWrap)
        {
            generatedSetterHelperImpl(classWrap, CLASSWRAP$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "classWrap" element
         */
        public edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap addNewClassWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap)get_store().add_element_user(CLASSWRAP$30);
                return target;
            }
        }
        
        /**
         * Unsets the "classWrap" element
         */
        public void unsetClassWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSWRAP$30, 0);
            }
        }
        
        /**
         * Gets the "descriptiveNoteWrap" element
         */
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().find_element_user(DESCRIPTIVENOTEWRAP$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descriptiveNoteWrap" element
         */
        public boolean isSetDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTEWRAP$32) != 0;
            }
        }
        
        /**
         * Sets the "descriptiveNoteWrap" element
         */
        public void setDescriptiveNoteWrap(edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap)
        {
            generatedSetterHelperImpl(descriptiveNoteWrap, DESCRIPTIVENOTEWRAP$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "descriptiveNoteWrap" element
         */
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().add_element_user(DESCRIPTIVENOTEWRAP$32);
                return target;
            }
        }
        
        /**
         * Unsets the "descriptiveNoteWrap" element
         */
        public void unsetDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTEWRAP$32, 0);
            }
        }
        
        /**
         * Gets the "inscriptionsWrap" element
         */
        public edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inscriptionsWrap" element
         */
        public boolean isSetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONSWRAP$34) != 0;
            }
        }
        
        /**
         * Sets the "inscriptionsWrap" element
         */
        public void setInscriptionsWrap(edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
        {
            generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "inscriptionsWrap" element
         */
        public edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$34);
                return target;
            }
        }
        
        /**
         * Unsets the "inscriptionsWrap" element
         */
        public void unsetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONSWRAP$34, 0);
            }
        }
        
        /**
         * Gets the "relatedWorksWrap" element
         */
        public edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().find_element_user(RELATEDWORKSWRAP$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relatedWorksWrap" element
         */
        public boolean isSetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKSWRAP$36) != 0;
            }
        }
        
        /**
         * Sets the "relatedWorksWrap" element
         */
        public void setRelatedWorksWrap(edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap)
        {
            generatedSetterHelperImpl(relatedWorksWrap, RELATEDWORKSWRAP$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedWorksWrap" element
         */
        public edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().add_element_user(RELATEDWORKSWRAP$36);
                return target;
            }
        }
        
        /**
         * Unsets the "relatedWorksWrap" element
         */
        public void unsetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKSWRAP$36, 0);
            }
        }
    }
}
