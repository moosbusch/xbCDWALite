/*
 * An XML document type.
 * Localname: earliestDate
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.EarliestDateDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one earliestDate(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class EarliestDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.EarliestDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EarliestDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EARLIESTDATE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "earliestDate");
    
    
    /**
     * Gets the "earliestDate" element
     */
    public edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate getEarliestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate target = null;
            target = (edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate)get_store().find_element_user(EARLIESTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "earliestDate" element
     */
    @Inject(optional=true) public void setEarliestDate(edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate earliestDate)
    {
        generatedSetterHelperImpl(earliestDate, EARLIESTDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "earliestDate" element
     */
    public edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate addNewEarliestDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate target = null;
            target = (edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate)get_store().add_element_user(EARLIESTDATE$0);
            return target;
        }
    }
    /**
     * An XML earliestDate(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.EarliestDateDocument$EarliestDate.
     */
    public static class EarliestDateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate
    {
        private static final long serialVersionUID = 1L;
        
        public EarliestDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected EarliestDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TERMSOURCE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        
        
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
    }
}
