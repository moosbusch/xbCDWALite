/*
 * An XML document type.
 * Localname: linkResource
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LinkResourceDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one linkResource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LinkResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LinkResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKRESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkResource");
    
    
    /**
     * Gets the "linkResource" element
     */
    public edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource getLinkResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource target = null;
            target = (edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource)get_store().find_element_user(LINKRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkResource" element
     */
    public void setLinkResource(edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource linkResource)
    {
        generatedSetterHelperImpl(linkResource, LINKRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linkResource" element
     */
    public edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource addNewLinkResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource target = null;
            target = (edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource)get_store().add_element_user(LINKRESOURCE$0);
            return target;
        }
    }
    /**
     * An XML linkResource(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.LinkResourceDocument$LinkResource.
     */
    public static class LinkResourceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource
    {
        private static final long serialVersionUID = 1L;
        
        public LinkResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LinkResourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        private static final javax.xml.namespace.QName FORMATRESOURCE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "formatResource");
        
        
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
        public void setType(java.lang.String type)
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
        
        /**
         * Gets the "formatResource" attribute
         */
        public java.lang.String getFormatResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "formatResource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormatResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
                return target;
            }
        }
        
        /**
         * True if has "formatResource" attribute
         */
        public boolean isSetFormatResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMATRESOURCE$2) != null;
            }
        }
        
        /**
         * Sets the "formatResource" attribute
         */
        public void setFormatResource(java.lang.String formatResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATRESOURCE$2);
                }
                target.setStringValue(formatResource);
            }
        }
        
        /**
         * Sets (as xml) the "formatResource" attribute
         */
        public void xsetFormatResource(org.apache.xmlbeans.XmlString formatResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMATRESOURCE$2);
                }
                target.set(formatResource);
            }
        }
        
        /**
         * Unsets the "formatResource" attribute
         */
        public void unsetFormatResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMATRESOURCE$2);
            }
        }
    }
}
