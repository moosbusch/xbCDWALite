/*
 * An XML document type.
 * Localname: rightsResource
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RightsResourceDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one rightsResource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RightsResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RightsResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public RightsResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIGHTSRESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "rightsResource");
    
    
    /**
     * Gets the "rightsResource" element
     */
    public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource getRightsResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource target = null;
            target = (edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource)get_store().find_element_user(RIGHTSRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rightsResource" element
     */
    @Inject(optional=true) public void setRightsResource(edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource rightsResource)
    {
        generatedSetterHelperImpl(rightsResource, RIGHTSRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rightsResource" element
     */
    public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource addNewRightsResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource target = null;
            target = (edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource)get_store().add_element_user(RIGHTSRESOURCE$0);
            return target;
        }
    }
    /**
     * An XML rightsResource(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.RightsResourceDocument$RightsResource.
     */
    public static class RightsResourceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource
    {
        private static final long serialVersionUID = 1L;
        
        public RightsResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RightsResourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
    }
}
