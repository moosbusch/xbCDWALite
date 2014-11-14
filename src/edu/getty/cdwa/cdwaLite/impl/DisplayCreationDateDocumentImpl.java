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
 * A document containing one displayCreationDate(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayCreationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayCreationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayCreationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYCREATIONDATE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayCreationDate");
    
    
    /**
     * Gets the "displayCreationDate" element
     */
    public java.lang.String getDisplayCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayCreationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDisplayCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "displayCreationDate" element
     */
    public void setDisplayCreationDate(java.lang.String displayCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYCREATIONDATE$0);
            }
            target.setStringValue(displayCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "displayCreationDate" element
     */
    public void xsetDisplayCreationDate(org.apache.xmlbeans.XmlString displayCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYCREATIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYCREATIONDATE$0);
            }
            target.set(displayCreationDate);
        }
    }
}
