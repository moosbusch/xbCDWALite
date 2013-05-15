/*
 * An XML document type.
 * Localname: displayState
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayStateDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one displayState(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYSTATE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayState");
    
    
    /**
     * Gets the "displayState" element
     */
    public java.lang.String getDisplayState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayState" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYSTATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayState" element
     */
    @Inject(optional=true) public void setDisplayState(java.lang.String displayState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYSTATE$0);
            }
            target.setStringValue(displayState);
        }
    }
    
    /**
     * Sets (as xml) the "displayState" element
     */
    public void xsetDisplayState(org.apache.xmlbeans.XmlString displayState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYSTATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYSTATE$0);
            }
            target.set(displayState);
        }
    }
}
