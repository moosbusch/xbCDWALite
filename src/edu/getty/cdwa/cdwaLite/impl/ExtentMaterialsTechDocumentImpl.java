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
 * A document containing one extentMaterialsTech(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ExtentMaterialsTechDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ExtentMaterialsTechDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentMaterialsTechDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENTMATERIALSTECH$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "extentMaterialsTech");
    
    
    /**
     * Gets the "extentMaterialsTech" element
     */
    public java.lang.String getExtentMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMATERIALSTECH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extentMaterialsTech" element
     */
    public org.apache.xmlbeans.XmlString xgetExtentMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMATERIALSTECH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extentMaterialsTech" element
     */
    @Inject(optional=true) public void setExtentMaterialsTech(java.lang.String extentMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENTMATERIALSTECH$0);
            }
            target.setStringValue(extentMaterialsTech);
        }
    }
    
    /**
     * Sets (as xml) the "extentMaterialsTech" element
     */
    public void xsetExtentMaterialsTech(org.apache.xmlbeans.XmlString extentMaterialsTech)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMATERIALSTECH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENTMATERIALSTECH$0);
            }
            target.set(extentMaterialsTech);
        }
    }
}
