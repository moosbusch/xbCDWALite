/*
 * An XML document type.
 * Localname: relatedWorkRelType
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RelatedWorkRelTypeDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one relatedWorkRelType(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RelatedWorkRelTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RelatedWorkRelTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedWorkRelTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDWORKRELTYPE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedWorkRelType");
    
    
    /**
     * Gets the "relatedWorkRelType" element
     */
    public java.lang.String getRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDWORKRELTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedWorkRelType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDWORKRELTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relatedWorkRelType" element
     */
    public void setRelatedWorkRelType(java.lang.String relatedWorkRelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDWORKRELTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDWORKRELTYPE$0);
            }
            target.setStringValue(relatedWorkRelType);
        }
    }
    
    /**
     * Sets (as xml) the "relatedWorkRelType" element
     */
    public void xsetRelatedWorkRelType(org.apache.xmlbeans.XmlString relatedWorkRelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDWORKRELTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDWORKRELTYPE$0);
            }
            target.set(relatedWorkRelType);
        }
    }
}