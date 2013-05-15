/*
 * An XML document type.
 * Localname: objectWorkType
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one objectWorkType(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ObjectWorkTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectWorkTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTWORKTYPE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "objectWorkType");
    
    
    /**
     * Gets the "objectWorkType" element
     */
    public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType getObjectWorkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType target = null;
            target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType)get_store().find_element_user(OBJECTWORKTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectWorkType" element
     */
    @Inject(optional=true) public void setObjectWorkType(edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType objectWorkType)
    {
        generatedSetterHelperImpl(objectWorkType, OBJECTWORKTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectWorkType" element
     */
    public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType addNewObjectWorkType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType target = null;
            target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType)get_store().add_element_user(OBJECTWORKTYPE$0);
            return target;
        }
    }
    /**
     * An XML objectWorkType(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument$ObjectWorkType.
     */
    public static class ObjectWorkTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectWorkTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ObjectWorkTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TERMSOURCE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        private static final javax.xml.namespace.QName TERMSOURCEID$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsourceID");
        
        
        /**
         * Gets the "termsource" attribute
         */
        public java.lang.String getTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "termsource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
                return target;
            }
        }
        
        /**
         * True if has "termsource" attribute
         */
        public boolean isSetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMSOURCE$0) != null;
            }
        }
        
        /**
         * Sets the "termsource" attribute
         */
        @Inject(optional=true) public void setTermsource(java.lang.String termsource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$0);
                }
                target.setStringValue(termsource);
            }
        }
        
        /**
         * Sets (as xml) the "termsource" attribute
         */
        public void xsetTermsource(org.apache.xmlbeans.XmlString termsource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$0);
                }
                target.set(termsource);
            }
        }
        
        /**
         * Unsets the "termsource" attribute
         */
        public void unsetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMSOURCE$0);
            }
        }
        
        /**
         * Gets the "termsourceID" attribute
         */
        public java.lang.String getTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "termsourceID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$2);
                return target;
            }
        }
        
        /**
         * True if has "termsourceID" attribute
         */
        public boolean isSetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMSOURCEID$2) != null;
            }
        }
        
        /**
         * Sets the "termsourceID" attribute
         */
        @Inject(optional=true) public void setTermsourceID(java.lang.String termsourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCEID$2);
                }
                target.setStringValue(termsourceID);
            }
        }
        
        /**
         * Sets (as xml) the "termsourceID" attribute
         */
        public void xsetTermsourceID(org.apache.xmlbeans.XmlString termsourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCEID$2);
                }
                target.set(termsourceID);
            }
        }
        
        /**
         * Unsets the "termsourceID" attribute
         */
        public void unsetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMSOURCEID$2);
            }
        }
    }
}
