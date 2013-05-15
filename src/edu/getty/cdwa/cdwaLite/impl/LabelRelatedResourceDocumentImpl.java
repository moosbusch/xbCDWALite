/*
 * An XML document type.
 * Localname: labelRelatedResource
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LabelRelatedResourceDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one labelRelatedResource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LabelRelatedResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LabelRelatedResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelRelatedResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELRELATEDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "labelRelatedResource");
    
    
    /**
     * Gets the "labelRelatedResource" element
     */
    public java.lang.String getLabelRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "labelRelatedResource" element
     */
    public org.apache.xmlbeans.XmlString xgetLabelRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDRESOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "labelRelatedResource" element
     */
    @Inject(optional=true) public void setLabelRelatedResource(java.lang.String labelRelatedResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDRESOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELRELATEDRESOURCE$0);
            }
            target.setStringValue(labelRelatedResource);
        }
    }
    
    /**
     * Sets (as xml) the "labelRelatedResource" element
     */
    public void xsetLabelRelatedResource(org.apache.xmlbeans.XmlString labelRelatedResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDRESOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELRELATEDRESOURCE$0);
            }
            target.set(labelRelatedResource);
        }
    }
}
