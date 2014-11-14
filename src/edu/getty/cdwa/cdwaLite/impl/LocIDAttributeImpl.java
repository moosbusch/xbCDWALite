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
 * A document containing one locID(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class LocIDAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocIDAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LocIDAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCID$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locID");
    
    
    /**
     * Gets the "locID" attribute
     */
    public java.lang.String getLocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$0);
            return target;
        }
    }
    
    /**
     * True if has "locID" attribute
     */
    public boolean isSetLocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCID$0) != null;
        }
    }
    
    /**
     * Sets the "locID" attribute
     */
    public void setLocID(java.lang.String locID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCID$0);
            }
            target.setStringValue(locID);
        }
    }
    
    /**
     * Sets (as xml) the "locID" attribute
     */
    public void xsetLocID(org.apache.xmlbeans.XmlString locID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCID$0);
            }
            target.set(locID);
        }
    }
    
    /**
     * Unsets the "locID" attribute
     */
    public void unsetLocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCID$0);
        }
    }
}
