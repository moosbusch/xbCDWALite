/*
 * An XML document type.
 * Localname: scaleMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ScaleMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one scaleMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ScaleMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ScaleMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScaleMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCALEMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "scaleMeasurements");
    
    
    /**
     * Gets the "scaleMeasurements" element
     */
    public java.lang.String getScaleMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaleMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetScaleMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALEMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scaleMeasurements" element
     */
    @Inject(optional=true) public void setScaleMeasurements(java.lang.String scaleMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALEMEASUREMENTS$0);
            }
            target.setStringValue(scaleMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "scaleMeasurements" element
     */
    public void xsetScaleMeasurements(org.apache.xmlbeans.XmlString scaleMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALEMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCALEMEASUREMENTS$0);
            }
            target.set(scaleMeasurements);
        }
    }
}
