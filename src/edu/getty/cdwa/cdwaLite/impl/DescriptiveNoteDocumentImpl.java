/*
 * An XML document type.
 * Localname: descriptiveNote
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DescriptiveNoteDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one descriptiveNote(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DescriptiveNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveNoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVENOTE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNote");
    
    
    /**
     * Gets the "descriptiveNote" element
     */
    public java.lang.String getDescriptiveNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptiveNote" element
     */
    public org.apache.xmlbeans.XmlString xgetDescriptiveNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveNote" element
     */
    @Inject(optional=true) public void setDescriptiveNote(java.lang.String descriptiveNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIVENOTE$0);
            }
            target.setStringValue(descriptiveNote);
        }
    }
    
    /**
     * Sets (as xml) the "descriptiveNote" element
     */
    public void xsetDescriptiveNote(org.apache.xmlbeans.XmlString descriptiveNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIVENOTE$0);
            }
            target.set(descriptiveNote);
        }
    }
}
