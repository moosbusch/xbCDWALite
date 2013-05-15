/*
 * An XML document type.
 * Localname: roleCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RoleCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one roleCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RoleCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RoleCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public RoleCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLECREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "roleCreator");
    
    
    /**
     * Gets the "roleCreator" element
     */
    public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator getRoleCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator)get_store().find_element_user(ROLECREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "roleCreator" element
     */
    @Inject(optional=true) public void setRoleCreator(edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator roleCreator)
    {
        generatedSetterHelperImpl(roleCreator, ROLECREATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "roleCreator" element
     */
    public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator addNewRoleCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator)get_store().add_element_user(ROLECREATOR$0);
            return target;
        }
    }
    /**
     * An XML roleCreator(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.RoleCreatorDocument$RoleCreator.
     */
    public static class RoleCreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator
    {
        private static final long serialVersionUID = 1L;
        
        public RoleCreatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RoleCreatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
