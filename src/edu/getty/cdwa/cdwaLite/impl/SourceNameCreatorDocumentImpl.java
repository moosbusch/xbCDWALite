/*
 * An XML document type.
 * Localname: sourceNameCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.SourceNameCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one sourceNameCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class SourceNameCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.SourceNameCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceNameCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCENAMECREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceNameCreator");
    
    
    /**
     * Gets the "sourceNameCreator" element
     */
    public java.lang.String getSourceNameCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAMECREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceNameCreator" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceNameCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAMECREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceNameCreator" element
     */
    public void setSourceNameCreator(java.lang.String sourceNameCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAMECREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCENAMECREATOR$0);
            }
            target.setStringValue(sourceNameCreator);
        }
    }
    
    /**
     * Sets (as xml) the "sourceNameCreator" element
     */
    public void xsetSourceNameCreator(org.apache.xmlbeans.XmlString sourceNameCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAMECREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCENAMECREATOR$0);
            }
            target.set(sourceNameCreator);
        }
    }
}
