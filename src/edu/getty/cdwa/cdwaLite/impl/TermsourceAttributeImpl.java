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
 * A document containing one termsource(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class TermsourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TermsourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TermsourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMSOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
    
    
    /**
     * Gets the "termsource" attribute
     */
    public java.lang.String getTermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "termsource" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
            return target;
        }
    }
    
    /**
     * True if has "termsource" attribute
     */
    public boolean isSetTermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TERMSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "termsource" attribute
     */
    @Inject(optional=true) public void setTermsource(java.lang.String termsource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$0);
            }
            target.setStringValue(termsource);
        }
    }
    
    /**
     * Sets (as xml) the "termsource" attribute
     */
    public void xsetTermsource(org.apache.xmlbeans.XmlString termsource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$0);
            }
            target.set(termsource);
        }
    }
    
    /**
     * Unsets the "termsource" attribute
     */
    public void unsetTermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TERMSOURCE$0);
        }
    }
}
