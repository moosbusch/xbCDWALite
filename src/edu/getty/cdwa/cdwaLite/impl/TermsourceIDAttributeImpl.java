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
 * A document containing one termsourceID(@http://www.getty.edu/CDWA/CDWALite) attribute.
 *
 * This is a complex type.
 */
public class TermsourceIDAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TermsourceIDAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TermsourceIDAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMSOURCEID$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsourceID");
    
    
    /**
     * Gets the "termsourceID" attribute
     */
    public java.lang.String getTermsourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "termsourceID" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTermsourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$0);
            return target;
        }
    }
    
    /**
     * True if has "termsourceID" attribute
     */
    public boolean isSetTermsourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TERMSOURCEID$0) != null;
        }
    }
    
    /**
     * Sets the "termsourceID" attribute
     */
    @Inject(optional=true) public void setTermsourceID(java.lang.String termsourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCEID$0);
            }
            target.setStringValue(termsourceID);
        }
    }
    
    /**
     * Sets (as xml) the "termsourceID" attribute
     */
    public void xsetTermsourceID(org.apache.xmlbeans.XmlString termsourceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCEID$0);
            }
            target.set(termsourceID);
        }
    }
    
    /**
     * Unsets the "termsourceID" attribute
     */
    public void unsetTermsourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TERMSOURCEID$0);
        }
    }
}
