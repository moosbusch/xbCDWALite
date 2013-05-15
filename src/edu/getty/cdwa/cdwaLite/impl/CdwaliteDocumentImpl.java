/*
 * An XML document type.
 * Localname: cdwalite
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.CdwaliteDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one cdwalite(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class CdwaliteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CdwaliteDocument
{
    private static final long serialVersionUID = 1L;
    
    public CdwaliteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDWALITE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "cdwalite");
    
    
    /**
     * Gets the "cdwalite" element
     */
    public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite getCdwalite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite target = null;
            target = (edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite)get_store().find_element_user(CDWALITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cdwalite" element
     */
    public void setCdwalite(edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite cdwalite)
    {
        generatedSetterHelperImpl(cdwalite, CDWALITE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cdwalite" element
     */
    public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite addNewCdwalite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite target = null;
            target = (edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite)get_store().add_element_user(CDWALITE$0);
            return target;
        }
    }
    /**
     * An XML cdwalite(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class CdwaliteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite
    {
        private static final long serialVersionUID = 1L;
        
        public CdwaliteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveMetadata");
        private static final javax.xml.namespace.QName ADMINISTRATIVEMETADATA$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "administrativeMetadata");
        
        
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
         * Gets the "administrativeMetadata" element
         */
        public edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata getAdministrativeMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
                target = (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().find_element_user(ADMINISTRATIVEMETADATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "administrativeMetadata" element
         */
        public void setAdministrativeMetadata(edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata administrativeMetadata)
        {
            generatedSetterHelperImpl(administrativeMetadata, ADMINISTRATIVEMETADATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "administrativeMetadata" element
         */
        public edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata addNewAdministrativeMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
                target = (edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().add_element_user(ADMINISTRATIVEMETADATA$2);
                return target;
            }
        }
    }
}
