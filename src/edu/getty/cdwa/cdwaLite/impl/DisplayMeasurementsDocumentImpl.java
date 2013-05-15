/*
 * An XML document type.
 * Localname: displayMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DisplayMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one displayMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayMeasurements");
    
    
    /**
     * Gets the "displayMeasurements" element
     */
    public java.lang.String getDisplayMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayMeasurements" element
     */
    @Inject(optional=true) public void setDisplayMeasurements(java.lang.String displayMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYMEASUREMENTS$0);
            }
            target.setStringValue(displayMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "displayMeasurements" element
     */
    public void xsetDisplayMeasurements(org.apache.xmlbeans.XmlString displayMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYMEASUREMENTS$0);
            }
            target.set(displayMeasurements);
        }
    }
}
