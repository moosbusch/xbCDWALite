/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.getty.cdwa.cdwaLite.impl;  
/**
 * A document containing one indentifier(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class IndentifierAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndentifierAttribute
{
    private static final long serialVersionUID = 1L;
    
    public IndentifierAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indentifier");
    
    
    /**
     * Gets the "indentifier" attribute
     */
    public java.lang.String getIndentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENTIFIER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "indentifier" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIndentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * True if has "indentifier" attribute
     */
    public boolean isSetIndentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDENTIFIER$0) != null;
        }
    }
    
    /**
     * Sets the "indentifier" attribute
     */
    public void setIndentifier(java.lang.String indentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDENTIFIER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDENTIFIER$0);
            }
            target.setStringValue(indentifier);
        }
    }
    
    /**
     * Sets (as xml) the "indentifier" attribute
     */
    public void xsetIndentifier(org.apache.xmlbeans.XmlString indentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INDENTIFIER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INDENTIFIER$0);
            }
            target.set(indentifier);
        }
    }
    
    /**
     * Unsets the "indentifier" attribute
     */
    public void unsetIndentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDENTIFIER$0);
        }
    }
}
