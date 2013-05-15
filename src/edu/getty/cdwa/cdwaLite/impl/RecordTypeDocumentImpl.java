/*
 * An XML document type.
 * Localname: recordType
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RecordTypeDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one recordType(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RecordTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDTYPE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordType");
    
    
    /**
     * Gets the "recordType" element
     */
    public java.lang.String getRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "recordType" element
     */
    public org.apache.xmlbeans.XmlString xgetRecordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "recordType" element
     */
    @Inject(optional=true) public void setRecordType(java.lang.String recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDTYPE$0);
            }
            target.setStringValue(recordType);
        }
    }
    
    /**
     * Sets (as xml) the "recordType" element
     */
    public void xsetRecordType(org.apache.xmlbeans.XmlString recordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECORDTYPE$0);
            }
            target.set(recordType);
        }
    }
}
