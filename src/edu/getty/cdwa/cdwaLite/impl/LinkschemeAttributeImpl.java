/*
 * An XML attribute type.
 * Localname: linkscheme
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LinkschemeAttribute
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one linkscheme(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class LinkschemeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LinkschemeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LinkschemeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkscheme");
    
    
    /**
     * Gets the "linkscheme" attribute
     */
    public java.lang.String getLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "linkscheme" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$0);
            return target;
        }
    }
    
    /**
     * True if has "linkscheme" attribute
     */
    public boolean isSetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINKSCHEME$0) != null;
        }
    }
    
    /**
     * Sets the "linkscheme" attribute
     */
    public void setLinkscheme(java.lang.String linkscheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKSCHEME$0);
            }
            target.setStringValue(linkscheme);
        }
    }
    
    /**
     * Sets (as xml) the "linkscheme" attribute
     */
    public void xsetLinkscheme(org.apache.xmlbeans.XmlString linkscheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LINKSCHEME$0);
            }
            target.set(linkscheme);
        }
    }
    
    /**
     * Unsets the "linkscheme" attribute
     */
    public void unsetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINKSCHEME$0);
        }
    }
}
