/*
 * An XML document type.
 * Localname: formatMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one formatMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class FormatMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormatMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "formatMeasurements");
    
    
    /**
     * Gets the "formatMeasurements" element
     */
    public java.lang.String getFormatMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetFormatMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "formatMeasurements" element
     */
    @Inject(optional=true) public void setFormatMeasurements(java.lang.String formatMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATMEASUREMENTS$0);
            }
            target.setStringValue(formatMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "formatMeasurements" element
     */
    public void xsetFormatMeasurements(org.apache.xmlbeans.XmlString formatMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMATMEASUREMENTS$0);
            }
            target.set(formatMeasurements);
        }
    }
}
