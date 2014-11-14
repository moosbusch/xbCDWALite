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
 * A document containing one resourceViewDate(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ResourceViewDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceViewDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceViewDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEVIEWDATE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceViewDate");
    
    
    /**
     * Gets the "resourceViewDate" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate getResourceViewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate)get_store().find_element_user(RESOURCEVIEWDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceViewDate" element
     */
    public void setResourceViewDate(edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate resourceViewDate)
    {
        generatedSetterHelperImpl(resourceViewDate, RESOURCEVIEWDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceViewDate" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate)get_store().add_element_user(RESOURCEVIEWDATE$0);
            return target;
        }
    }
    /**
     * An XML resourceViewDate(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.ResourceViewDateDocument$ResourceViewDate.
     */
    public static class ResourceViewDateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceViewDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResourceViewDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        private static final javax.xml.namespace.QName EARLIESTDATE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "earliestdate");
        private static final javax.xml.namespace.QName LATESTDATE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "latestdate");
        
        
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
        
        /**
         * Gets the "earliestdate" attribute
         */
        public java.lang.String getEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "earliestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "earliestdate" attribute
         */
        public boolean isSetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EARLIESTDATE$2) != null;
            }
        }
        
        /**
         * Sets the "earliestdate" attribute
         */
        public void setEarliestdate(java.lang.String earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EARLIESTDATE$2);
                }
                target.setStringValue(earliestdate);
            }
        }
        
        /**
         * Sets (as xml) the "earliestdate" attribute
         */
        public void xsetEarliestdate(org.apache.xmlbeans.XmlString earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EARLIESTDATE$2);
                }
                target.set(earliestdate);
            }
        }
        
        /**
         * Unsets the "earliestdate" attribute
         */
        public void unsetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EARLIESTDATE$2);
            }
        }
        
        /**
         * Gets the "latestdate" attribute
         */
        public java.lang.String getLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "latestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$4);
                return target;
            }
        }
        
        /**
         * True if has "latestdate" attribute
         */
        public boolean isSetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATESTDATE$4) != null;
            }
        }
        
        /**
         * Sets the "latestdate" attribute
         */
        public void setLatestdate(java.lang.String latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATESTDATE$4);
                }
                target.setStringValue(latestdate);
            }
        }
        
        /**
         * Sets (as xml) the "latestdate" attribute
         */
        public void xsetLatestdate(org.apache.xmlbeans.XmlString latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LATESTDATE$4);
                }
                target.set(latestdate);
            }
        }
        
        /**
         * Unsets the "latestdate" attribute
         */
        public void unsetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATESTDATE$4);
            }
        }
    }
}
