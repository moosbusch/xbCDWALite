/*
 * An XML document type.
 * Localname: sourceDescriptiveNote
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SourceDescriptiveNoteDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one sourceDescriptiveNote(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SourceDescriptiveNoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SourceDescriptiveNoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDescriptiveNoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEDESCRIPTIVENOTE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceDescriptiveNote");
    
    
    /**
     * Gets the "sourceDescriptiveNote" element
     */
    public java.lang.String getSourceDescriptiveNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDescriptiveNote" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceDescriptiveNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceDescriptiveNote" element
     */
    @Inject(optional=true) public void setSourceDescriptiveNote(java.lang.String sourceDescriptiveNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$0);
            }
            target.setStringValue(sourceDescriptiveNote);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDescriptiveNote" element
     */
    public void xsetSourceDescriptiveNote(org.apache.xmlbeans.XmlString sourceDescriptiveNote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$0);
            }
            target.set(sourceDescriptiveNote);
        }
    }
}
