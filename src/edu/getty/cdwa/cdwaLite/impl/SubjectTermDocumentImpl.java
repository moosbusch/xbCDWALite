/*
 * An XML document type.
 * Localname: subjectTerm
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SubjectTermDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one subjectTerm(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SubjectTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SubjectTermDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTTERM$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "subjectTerm");
    
    
    /**
     * Gets the "subjectTerm" element
     */
    public edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm getSubjectTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm target = null;
            target = (edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm)get_store().find_element_user(SUBJECTTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subjectTerm" element
     */
    @Inject(optional=true) public void setSubjectTerm(edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm subjectTerm)
    {
        generatedSetterHelperImpl(subjectTerm, SUBJECTTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subjectTerm" element
     */
    public edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm addNewSubjectTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm target = null;
            target = (edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm)get_store().add_element_user(SUBJECTTERM$0);
            return target;
        }
    }
    /**
     * An XML subjectTerm(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.SubjectTermDocument$SubjectTerm.
     */
    public static class SubjectTermImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.SubjectTermDocument.SubjectTerm
    {
        private static final long serialVersionUID = 1L;
        
        public SubjectTermImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SubjectTermImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        private static final javax.xml.namespace.QName TERMSOURCE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        private static final javax.xml.namespace.QName TERMSOURCEID$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsourceID");
        
        
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
         * Gets the "termsource" attribute
         */
        public java.lang.String getTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
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
                return get_store().find_attribute_user(TERMSOURCE$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$2);
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
                get_store().remove_attribute(TERMSOURCE$2);
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
    }
}
