/*
 * An XML document type.
 * Localname: genderCreator
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.GenderCreatorDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one genderCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class GenderCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.GenderCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenderCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENDERCREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "genderCreator");
    
    
    /**
     * Gets the "genderCreator" element
     */
    public java.lang.String getGenderCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDERCREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "genderCreator" element
     */
    public org.apache.xmlbeans.XmlString xgetGenderCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDERCREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "genderCreator" element
     */
    @Inject(optional=true) public void setGenderCreator(java.lang.String genderCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDERCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDERCREATOR$0);
            }
            target.setStringValue(genderCreator);
        }
    }
    
    /**
     * Sets (as xml) the "genderCreator" element
     */
    public void xsetGenderCreator(org.apache.xmlbeans.XmlString genderCreator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDERCREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENDERCREATOR$0);
            }
            target.set(genderCreator);
        }
    }
}
