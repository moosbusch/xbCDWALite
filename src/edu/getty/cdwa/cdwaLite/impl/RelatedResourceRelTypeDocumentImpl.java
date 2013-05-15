/*
 * An XML document type.
 * Localname: relatedResourceRelType
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.RelatedResourceRelTypeDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one relatedResourceRelType(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RelatedResourceRelTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RelatedResourceRelTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedResourceRelTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDRESOURCERELTYPE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedResourceRelType");
    
    
    /**
     * Gets the "relatedResourceRelType" element
     */
    public java.lang.String getRelatedResourceRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedResourceRelType" element
     */
    public org.apache.xmlbeans.XmlString xgetRelatedResourceRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relatedResourceRelType" element
     */
    public void setRelatedResourceRelType(java.lang.String relatedResourceRelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDRESOURCERELTYPE$0);
            }
            target.setStringValue(relatedResourceRelType);
        }
    }
    
    /**
     * Sets (as xml) the "relatedResourceRelType" element
     */
    public void xsetRelatedResourceRelType(org.apache.xmlbeans.XmlString relatedResourceRelType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDRESOURCERELTYPE$0);
            }
            target.set(relatedResourceRelType);
        }
    }
}
