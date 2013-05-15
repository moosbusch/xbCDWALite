/*
 * An XML document type.
 * Localname: qualifierMeasurements
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.QualifierMeasurementsDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one qualifierMeasurements(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class QualifierMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.QualifierMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public QualifierMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALIFIERMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "qualifierMeasurements");
    
    
    /**
     * Gets the "qualifierMeasurements" element
     */
    public java.lang.String getQualifierMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qualifierMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetQualifierMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "qualifierMeasurements" element
     */
    @Inject(optional=true) public void setQualifierMeasurements(java.lang.String qualifierMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIERMEASUREMENTS$0);
            }
            target.setStringValue(qualifierMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "qualifierMeasurements" element
     */
    public void xsetQualifierMeasurements(org.apache.xmlbeans.XmlString qualifierMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALIFIERMEASUREMENTS$0);
            }
            target.set(qualifierMeasurements);
        }
    }
}
