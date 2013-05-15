/*
 * An XML document type.
 * Localname: recordInfoID
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RecordInfoIDDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one recordInfoID(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RecordInfoIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordInfoIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordInfoIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINFOID$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoID");
    
    
    /**
     * Gets the "recordInfoID" element
     */
    public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID getRecordInfoID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID)get_store().find_element_user(RECORDINFOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordInfoID" element
     */
    @Inject(optional=true) public void setRecordInfoID(edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID recordInfoID)
    {
        generatedSetterHelperImpl(recordInfoID, RECORDINFOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordInfoID" element
     */
    public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID addNewRecordInfoID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID)get_store().add_element_user(RECORDINFOID$0);
            return target;
        }
    }
    /**
     * An XML recordInfoID(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.RecordInfoIDDocument$RecordInfoID.
     */
    public static class RecordInfoIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID
    {
        private static final long serialVersionUID = 1L;
        
        public RecordInfoIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RecordInfoIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
