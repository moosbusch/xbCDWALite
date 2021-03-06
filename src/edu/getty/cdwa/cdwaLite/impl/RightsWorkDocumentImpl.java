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
 * A document containing one rightsWork(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RightsWorkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RightsWorkDocument
{
    private static final long serialVersionUID = 1L;
    
    public RightsWorkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIGHTSWORK$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "rightsWork");
    
    
    /**
     * Gets the "rightsWork" element
     */
    public edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork getRightsWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork target = null;
            target = (edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork)get_store().find_element_user(RIGHTSWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rightsWork" element
     */
    public void setRightsWork(edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork rightsWork)
    {
        generatedSetterHelperImpl(rightsWork, RIGHTSWORK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rightsWork" element
     */
    public edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork addNewRightsWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork target = null;
            target = (edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork)get_store().add_element_user(RIGHTSWORK$0);
            return target;
        }
    }
    /**
     * An XML rightsWork(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.RightsWorkDocument$RightsWork.
     */
    public static class RightsWorkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.RightsWorkDocument.RightsWork
    {
        private static final long serialVersionUID = 1L;
        
        public RightsWorkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RightsWorkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
    }
}
