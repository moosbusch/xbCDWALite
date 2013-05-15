/*
 * An XML document type.
 * Localname: shapeMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ShapeMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one shapeMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ShapeMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ShapeMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShapeMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAPEMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "shapeMeasurements");
    
    
    /**
     * Gets the "shapeMeasurements" element
     */
    public java.lang.String getShapeMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shapeMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetShapeMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAPEMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shapeMeasurements" element
     */
    public void setShapeMeasurements(java.lang.String shapeMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAPEMEASUREMENTS$0);
            }
            target.setStringValue(shapeMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "shapeMeasurements" element
     */
    public void xsetShapeMeasurements(org.apache.xmlbeans.XmlString shapeMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAPEMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAPEMEASUREMENTS$0);
            }
            target.set(shapeMeasurements);
        }
    }
}
