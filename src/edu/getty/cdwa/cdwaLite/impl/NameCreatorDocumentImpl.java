/*
 * An XML document type.
 * Localname: nameCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.NameCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one nameCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class NameCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.NameCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMECREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nameCreator");
    
    
    /**
     * Gets the "nameCreator" element
     */
    public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator getNameCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator)get_store().find_element_user(NAMECREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nameCreator" element
     */
    @Inject(optional=true) public void setNameCreator(edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator nameCreator)
    {
        generatedSetterHelperImpl(nameCreator, NAMECREATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nameCreator" element
     */
    public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator addNewNameCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator)get_store().add_element_user(NAMECREATOR$0);
            return target;
        }
    }
    /**
     * An XML nameCreator(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.NameCreatorDocument$NameCreator.
     */
    public static class NameCreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator
    {
        private static final long serialVersionUID = 1L;
        
        public NameCreatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NameCreatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TERMSOURCE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        private static final javax.xml.namespace.QName TERMSOURCEID$4 = 
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
         * Gets the "type" attribute
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type)get_store().find_attribute_user(TYPE$2);
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
                return get_store().find_attribute_user(TYPE$2) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type)get_store().add_attribute_user(TYPE$2);
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
                get_store().remove_attribute(TYPE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$4);
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
                return get_store().find_attribute_user(TERMSOURCEID$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCEID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCEID$4);
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
                get_store().remove_attribute(TERMSOURCEID$4);
            }
        }
        /**
         * An XML type(@http://www.getty.edu/CDWA/CDWALite).
         *
         * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.NameCreatorDocument$NameCreator$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
