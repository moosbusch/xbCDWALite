/*
 * An XML document type.
 * Localname: displayMaterialsTech
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayMaterialsTechDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one displayMaterialsTech(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayMaterialsTechDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayMaterialsTechDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayMaterialsTechDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYMATERIALSTECH$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayMaterialsTech");
    
    
    /**
     * Gets the "displayMaterialsTech" element
     */
    public java.lang.String getDisplayMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMATERIALSTECH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayMaterialsTech" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMATERIALSTECH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayMaterialsTech" element
     */
    public void setDisplayMaterialsTech(java.lang.String displayMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYMATERIALSTECH$0);
            }
            target.setStringValue(displayMaterialsTech);
        }
    }
    
    /**
     * Sets (as xml) the "displayMaterialsTech" element
     */
    public void xsetDisplayMaterialsTech(org.apache.xmlbeans.XmlString displayMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYMATERIALSTECH$0);
            }
            target.set(displayMaterialsTech);
        }
    }
}
