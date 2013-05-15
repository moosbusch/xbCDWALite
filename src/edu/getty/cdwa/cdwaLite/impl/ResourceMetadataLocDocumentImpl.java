/*
 * An XML document type.
 * Localname: resourceMetadataLoc
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one resourceMetadataLoc(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ResourceMetadataLocDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceMetadataLocDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEMETADATALOC$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceMetadataLoc");
    
    
    /**
     * Gets the "resourceMetadataLoc" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc getResourceMetadataLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().find_element_user(RESOURCEMETADATALOC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceMetadataLoc" element
     */
    @Inject(optional=true) public void setResourceMetadataLoc(edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc resourceMetadataLoc)
    {
        generatedSetterHelperImpl(resourceMetadataLoc, RESOURCEMETADATALOC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceMetadataLoc" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc addNewResourceMetadataLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().add_element_user(RESOURCEMETADATALOC$0);
            return target;
        }
    }
    /**
     * An XML resourceMetadataLoc(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument$ResourceMetadataLoc.
     */
    public static class ResourceMetadataLocImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceMetadataLocImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResourceMetadataLocImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
