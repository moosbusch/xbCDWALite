/*
 * An XML document type.
 * Localname: sourceMaterialsTech
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SourceMaterialsTechDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one sourceMaterialsTech(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SourceMaterialsTechDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SourceMaterialsTechDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceMaterialsTechDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEMATERIALSTECH$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceMaterialsTech");
    
    
    /**
     * Gets the "sourceMaterialsTech" element
     */
    public java.lang.String getSourceMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEMATERIALSTECH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceMaterialsTech" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEMATERIALSTECH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceMaterialsTech" element
     */
    public void setSourceMaterialsTech(java.lang.String sourceMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEMATERIALSTECH$0);
            }
            target.setStringValue(sourceMaterialsTech);
        }
    }
    
    /**
     * Sets (as xml) the "sourceMaterialsTech" element
     */
    public void xsetSourceMaterialsTech(org.apache.xmlbeans.XmlString sourceMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEMATERIALSTECH$0);
            }
            target.set(sourceMaterialsTech);
        }
    }
}
