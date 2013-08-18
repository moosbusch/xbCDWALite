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
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one locIDtype(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class LocIDtypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocIDtypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LocIDtypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCIDTYPE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locIDtype");
    
    
    /**
     * Gets the "locIDtype" attribute
     */
    public java.lang.String getLocIDtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "locIDtype" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLocIDtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "locIDtype" attribute
     */
    public boolean isSetLocIDtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCIDTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "locIDtype" attribute
     */
    @Inject(optional=true) public void setLocIDtype(java.lang.String locIDtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCIDTYPE$0);
            }
            target.setStringValue(locIDtype);
        }
    }
    
    /**
     * Sets (as xml) the "locIDtype" attribute
     */
    public void xsetLocIDtype(org.apache.xmlbeans.XmlString locIDtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCIDTYPE$0);
            }
            target.set(locIDtype);
        }
    }
    
    /**
     * Unsets the "locIDtype" attribute
     */
    public void unsetLocIDtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCIDTYPE$0);
        }
    }
}
