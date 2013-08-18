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
 * A document containing one recordInfoLink(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RecordInfoLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordInfoLinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordInfoLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINFOLINK$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoLink");
    
    
    /**
     * Gets the "recordInfoLink" element
     */
    public java.lang.String getRecordInfoLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINFOLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "recordInfoLink" element
     */
    public org.apache.xmlbeans.XmlString xgetRecordInfoLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDINFOLINK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "recordInfoLink" element
     */
    @Inject(optional=true) public void setRecordInfoLink(java.lang.String recordInfoLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINFOLINK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDINFOLINK$0);
            }
            target.setStringValue(recordInfoLink);
        }
    }
    
    /**
     * Sets (as xml) the "recordInfoLink" element
     */
    public void xsetRecordInfoLink(org.apache.xmlbeans.XmlString recordInfoLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDINFOLINK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECORDINFOLINK$0);
            }
            target.set(recordInfoLink);
        }
    }
}
