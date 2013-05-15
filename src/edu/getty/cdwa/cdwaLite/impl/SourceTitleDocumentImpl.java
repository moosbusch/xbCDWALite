/*
 * An XML document type.
 * Localname: sourceTitle
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SourceTitleDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one sourceTitle(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SourceTitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SourceTitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceTitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCETITLE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceTitle");
    
    
    /**
     * Gets the "sourceTitle" element
     */
    public java.lang.String getSourceTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceTitle" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceTitle" element
     */
    @Inject(optional=true) public void setSourceTitle(java.lang.String sourceTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETITLE$0);
            }
            target.setStringValue(sourceTitle);
        }
    }
    
    /**
     * Sets (as xml) the "sourceTitle" element
     */
    public void xsetSourceTitle(org.apache.xmlbeans.XmlString sourceTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCETITLE$0);
            }
            target.set(sourceTitle);
        }
    }
}
