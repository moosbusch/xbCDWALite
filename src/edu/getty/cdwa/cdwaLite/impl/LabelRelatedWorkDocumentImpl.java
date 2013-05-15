/*
 * An XML document type.
 * Localname: labelRelatedWork
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LabelRelatedWorkDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one labelRelatedWork(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LabelRelatedWorkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LabelRelatedWorkDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelRelatedWorkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELRELATEDWORK$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "labelRelatedWork");
    
    
    /**
     * Gets the "labelRelatedWork" element
     */
    public java.lang.String getLabelRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "labelRelatedWork" element
     */
    public org.apache.xmlbeans.XmlString xgetLabelRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDWORK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "labelRelatedWork" element
     */
    public void setLabelRelatedWork(java.lang.String labelRelatedWork)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELRELATEDWORK$0);
            }
            target.setStringValue(labelRelatedWork);
        }
    }
    
    /**
     * Sets (as xml) the "labelRelatedWork" element
     */
    public void xsetLabelRelatedWork(org.apache.xmlbeans.XmlString labelRelatedWork)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELRELATEDWORK$0);
            }
            target.set(labelRelatedWork);
        }
    }
}
