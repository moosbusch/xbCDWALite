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
 * A document containing one locRelatedWork(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LocRelatedWorkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocRelatedWorkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCRELATEDWORK$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locRelatedWork");
    
    
    /**
     * Gets the "locRelatedWork" element
     */
    public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork target = null;
            target = (edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork)get_store().find_element_user(LOCRELATEDWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locRelatedWork" element
     */
    @Inject(optional=true) public void setLocRelatedWork(edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork locRelatedWork)
    {
        generatedSetterHelperImpl(locRelatedWork, LOCRELATEDWORK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locRelatedWork" element
     */
    public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork target = null;
            target = (edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork)get_store().add_element_user(LOCRELATEDWORK$0);
            return target;
        }
    }
    /**
     * An XML locRelatedWork(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument$LocRelatedWork.
     */
    public static class LocRelatedWorkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork
    {
        private static final long serialVersionUID = 1L;
        
        public LocRelatedWorkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LocRelatedWorkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName RELWORKID$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relWorkID");
        private static final javax.xml.namespace.QName TERMSOURCE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        private static final javax.xml.namespace.QName LOCID$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locID");
        private static final javax.xml.namespace.QName LOCIDTYPE$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locIDtype");
        
        
        /**
         * Gets the "relWorkID" attribute
         */
        public java.lang.String getRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relWorkID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELWORKID$0);
                return target;
            }
        }
        
        /**
         * True if has "relWorkID" attribute
         */
        public boolean isSetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELWORKID$0) != null;
            }
        }
        
        /**
         * Sets the "relWorkID" attribute
         */
        @Inject(optional=true) public void setRelWorkID(java.lang.String relWorkID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELWORKID$0);
                }
                target.setStringValue(relWorkID);
            }
        }
        
        /**
         * Sets (as xml) the "relWorkID" attribute
         */
        public void xsetRelWorkID(org.apache.xmlbeans.XmlString relWorkID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELWORKID$0);
                }
                target.set(relWorkID);
            }
        }
        
        /**
         * Unsets the "relWorkID" attribute
         */
        public void unsetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELWORKID$0);
            }
        }
        
        /**
         * Gets the "termsource" attribute
         */
        public java.lang.String getTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
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
                return get_store().find_attribute_user(TERMSOURCE$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$2);
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
                get_store().remove_attribute(TERMSOURCE$2);
            }
        }
        
        /**
         * Gets the "locID" attribute
         */
        public java.lang.String getLocID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$4);
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
                return get_store().find_attribute_user(LOCID$4) != null;
            }
        }
        
        /**
         * Sets the "locID" attribute
         */
        @Inject(optional=true) public void setLocID(java.lang.String locID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCID$4);
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
                get_store().remove_attribute(LOCID$4);
            }
        }
        
        /**
         * Gets the "locIDtype" attribute
         */
        public java.lang.String getLocIDtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$6);
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
                return get_store().find_attribute_user(LOCIDTYPE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCIDTYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCIDTYPE$6);
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
                get_store().remove_attribute(LOCIDTYPE$6);
            }
        }
    }
}
