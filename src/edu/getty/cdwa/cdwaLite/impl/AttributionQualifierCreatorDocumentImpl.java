/*
 * An XML document type.
 * Localname: attributionQualifierCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.AttributionQualifierCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one attributionQualifierCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class AttributionQualifierCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.AttributionQualifierCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributionQualifierCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTIONQUALIFIERCREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "attributionQualifierCreator");
    
    
    /**
     * Gets the "attributionQualifierCreator" element
     */
    public java.lang.String getAttributionQualifierCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributionQualifierCreator" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributionQualifierCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributionQualifierCreator" element
     */
    @Inject(optional=true) public void setAttributionQualifierCreator(java.lang.String attributionQualifierCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTIONQUALIFIERCREATOR$0);
            }
            target.setStringValue(attributionQualifierCreator);
        }
    }
    
    /**
     * Sets (as xml) the "attributionQualifierCreator" element
     */
    public void xsetAttributionQualifierCreator(org.apache.xmlbeans.XmlString attributionQualifierCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTIONQUALIFIERCREATOR$0);
            }
            target.set(attributionQualifierCreator);
        }
    }
}
