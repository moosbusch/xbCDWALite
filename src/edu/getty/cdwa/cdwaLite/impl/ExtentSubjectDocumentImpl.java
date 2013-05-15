/*
 * An XML document type.
 * Localname: extentSubject
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ExtentSubjectDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one extentSubject(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ExtentSubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ExtentSubjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentSubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENTSUBJECT$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "extentSubject");
    
    
    /**
     * Gets the "extentSubject" element
     */
    public java.lang.String getExtentSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTSUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extentSubject" element
     */
    public org.apache.xmlbeans.XmlString xgetExtentSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTSUBJECT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extentSubject" element
     */
    @Inject(optional=true) public void setExtentSubject(java.lang.String extentSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTSUBJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENTSUBJECT$0);
            }
            target.setStringValue(extentSubject);
        }
    }
    
    /**
     * Sets (as xml) the "extentSubject" element
     */
    public void xsetExtentSubject(org.apache.xmlbeans.XmlString extentSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTSUBJECT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENTSUBJECT$0);
            }
            target.set(extentSubject);
        }
    }
}
