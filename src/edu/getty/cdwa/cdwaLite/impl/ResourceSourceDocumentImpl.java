/*
 * An XML document type.
 * Localname: resourceSource
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ResourceSourceDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one resourceSource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ResourceSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceSource");
    
    
    /**
     * Gets the "resourceSource" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource getResourceSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource)get_store().find_element_user(RESOURCESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceSource" element
     */
    @Inject(optional=true) public void setResourceSource(edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource resourceSource)
    {
        generatedSetterHelperImpl(resourceSource, RESOURCESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceSource" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource addNewResourceSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource)get_store().add_element_user(RESOURCESOURCE$0);
            return target;
        }
    }
    /**
     * An XML resourceSource(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.ResourceSourceDocument$ResourceSource.
     */
    public static class ResourceSourceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResourceSourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        private static final javax.xml.namespace.QName EARLIESTDATE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "earliestdate");
        private static final javax.xml.namespace.QName LATESTDATE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "latestdate");
        
        
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
        
        /**
         * Gets the "earliestdate" attribute
         */
        public java.lang.String getEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "earliestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "earliestdate" attribute
         */
        public boolean isSetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EARLIESTDATE$2) != null;
            }
        }
        
        /**
         * Sets the "earliestdate" attribute
         */
        @Inject(optional=true) public void setEarliestdate(java.lang.String earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EARLIESTDATE$2);
                }
                target.setStringValue(earliestdate);
            }
        }
        
        /**
         * Sets (as xml) the "earliestdate" attribute
         */
        public void xsetEarliestdate(org.apache.xmlbeans.XmlString earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EARLIESTDATE$2);
                }
                target.set(earliestdate);
            }
        }
        
        /**
         * Unsets the "earliestdate" attribute
         */
        public void unsetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EARLIESTDATE$2);
            }
        }
        
        /**
         * Gets the "latestdate" attribute
         */
        public java.lang.String getLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "latestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$4);
                return target;
            }
        }
        
        /**
         * True if has "latestdate" attribute
         */
        public boolean isSetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATESTDATE$4) != null;
            }
        }
        
        /**
         * Sets the "latestdate" attribute
         */
        @Inject(optional=true) public void setLatestdate(java.lang.String latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATESTDATE$4);
                }
                target.setStringValue(latestdate);
            }
        }
        
        /**
         * Sets (as xml) the "latestdate" attribute
         */
        public void xsetLatestdate(org.apache.xmlbeans.XmlString latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LATESTDATE$4);
                }
                target.set(latestdate);
            }
        }
        
        /**
         * Unsets the "latestdate" attribute
         */
        public void unsetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATESTDATE$4);
            }
        }
    }
}
