/*
 * An XML document type.
 * Localname: displayCreationDate
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayCreationDateDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one displayCreationDate(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayCreationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayCreationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayCreationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYCREATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayCreationDate");
    
    
    /**
     * Gets the "displayCreationDate" element
     */
    public java.lang.String getDisplayCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayCreationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayCreationDate" element
     */
    @Inject(optional=true) public void setDisplayCreationDate(java.lang.String displayCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYCREATIONDATE$0);
            }
            target.setStringValue(displayCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "displayCreationDate" element
     */
    public void xsetDisplayCreationDate(org.apache.xmlbeans.XmlString displayCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYCREATIONDATE$0);
            }
            target.set(displayCreationDate);
        }
    }
}
