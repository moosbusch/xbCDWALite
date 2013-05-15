/*
 * An XML document type.
 * Localname: sourceStateEdition
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SourceStateEditionDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one sourceStateEdition(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SourceStateEditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SourceStateEditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceStateEditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCESTATEEDITION$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceStateEdition");
    
    
    /**
     * Gets the "sourceStateEdition" element
     */
    public java.lang.String getSourceStateEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTATEEDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceStateEdition" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceStateEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTATEEDITION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceStateEdition" element
     */
    public void setSourceStateEdition(java.lang.String sourceStateEdition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTATEEDITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESTATEEDITION$0);
            }
            target.setStringValue(sourceStateEdition);
        }
    }
    
    /**
     * Sets (as xml) the "sourceStateEdition" element
     */
    public void xsetSourceStateEdition(org.apache.xmlbeans.XmlString sourceStateEdition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTATEEDITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESTATEEDITION$0);
            }
            target.set(sourceStateEdition);
        }
    }
}
