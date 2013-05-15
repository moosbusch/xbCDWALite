/*
 * An XML document type.
 * Localname: nationalityCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.NationalityCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one nationalityCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class NationalityCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.NationalityCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public NationalityCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NATIONALITYCREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nationalityCreator");
    
    
    /**
     * Gets the "nationalityCreator" element
     */
    public java.lang.String getNationalityCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITYCREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nationalityCreator" element
     */
    public org.apache.xmlbeans.XmlString xgetNationalityCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITYCREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nationalityCreator" element
     */
    public void setNationalityCreator(java.lang.String nationalityCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITYCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALITYCREATOR$0);
            }
            target.setStringValue(nationalityCreator);
        }
    }
    
    /**
     * Sets (as xml) the "nationalityCreator" element
     */
    public void xsetNationalityCreator(org.apache.xmlbeans.XmlString nationalityCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITYCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALITYCREATOR$0);
            }
            target.set(nationalityCreator);
        }
    }
}
