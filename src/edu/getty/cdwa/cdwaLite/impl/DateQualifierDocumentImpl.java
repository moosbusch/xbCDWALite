/*
 * An XML document type.
 * Localname: dateQualifier
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DateQualifierDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one dateQualifier(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DateQualifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DateQualifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateQualifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEQUALIFIER$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "dateQualifier");
    
    
    /**
     * Gets the "dateQualifier" element
     */
    public java.lang.String getDateQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEQUALIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateQualifier" element
     */
    public org.apache.xmlbeans.XmlString xgetDateQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEQUALIFIER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateQualifier" element
     */
    @Inject(optional=true) public void setDateQualifier(java.lang.String dateQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEQUALIFIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEQUALIFIER$0);
            }
            target.setStringValue(dateQualifier);
        }
    }
    
    /**
     * Sets (as xml) the "dateQualifier" element
     */
    public void xsetDateQualifier(org.apache.xmlbeans.XmlString dateQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEQUALIFIER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEQUALIFIER$0);
            }
            target.set(dateQualifier);
        }
    }
}
