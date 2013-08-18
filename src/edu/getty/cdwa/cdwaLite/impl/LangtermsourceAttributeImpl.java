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
 * A document containing one langtermsource(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class LangtermsourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LangtermsourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LangtermsourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGTERMSOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "langtermsource");
    
    
    /**
     * Gets the "langtermsource" attribute
     */
    public java.lang.String getLangtermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGTERMSOURCE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "langtermsource" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLangtermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGTERMSOURCE$0);
            return target;
        }
    }
    
    /**
     * True if has "langtermsource" attribute
     */
    public boolean isSetLangtermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGTERMSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "langtermsource" attribute
     */
    @Inject(optional=true) public void setLangtermsource(java.lang.String langtermsource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGTERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGTERMSOURCE$0);
            }
            target.setStringValue(langtermsource);
        }
    }
    
    /**
     * Sets (as xml) the "langtermsource" attribute
     */
    public void xsetLangtermsource(org.apache.xmlbeans.XmlString langtermsource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGTERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANGTERMSOURCE$0);
            }
            target.set(langtermsource);
        }
    }
    
    /**
     * Unsets the "langtermsource" attribute
     */
    public void unsetLangtermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGTERMSOURCE$0);
        }
    }
}
