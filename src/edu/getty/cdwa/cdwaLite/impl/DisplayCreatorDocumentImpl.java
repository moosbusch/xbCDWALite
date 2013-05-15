/*
 * An XML document type.
 * Localname: displayCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one displayCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYCREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayCreator");
    
    
    /**
     * Gets the "displayCreator" element
     */
    public java.lang.String getDisplayCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayCreator" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayCreator" element
     */
    @Inject(optional=true) public void setDisplayCreator(java.lang.String displayCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYCREATOR$0);
            }
            target.setStringValue(displayCreator);
        }
    }
    
    /**
     * Sets (as xml) the "displayCreator" element
     */
    public void xsetDisplayCreator(org.apache.xmlbeans.XmlString displayCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYCREATOR$0);
            }
            target.set(displayCreator);
        }
    }
}
