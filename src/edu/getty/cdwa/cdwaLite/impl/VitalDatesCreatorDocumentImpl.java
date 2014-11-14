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
 * A document containing one vitalDatesCreator(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class VitalDatesCreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public VitalDatesCreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VITALDATESCREATOR$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "vitalDatesCreator");
    
    
    /**
     * Gets the "vitalDatesCreator" element
     */
    public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator getVitalDatesCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator)get_store().find_element_user(VITALDATESCREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vitalDatesCreator" element
     */
    public void setVitalDatesCreator(edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator vitalDatesCreator)
    {
        generatedSetterHelperImpl(vitalDatesCreator, VITALDATESCREATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vitalDatesCreator" element
     */
    public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator addNewVitalDatesCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator target = null;
            target = (edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator)get_store().add_element_user(VITALDATESCREATOR$0);
            return target;
        }
    }
    /**
     * An XML vitalDatesCreator(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is an atomic type that is a restriction of edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument$VitalDatesCreator.
     */
    public static class VitalDatesCreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator
    {
        private static final long serialVersionUID = 1L;
        
        public VitalDatesCreatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected VitalDatesCreatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName BIRTHDATE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "birthDate");
        private static final javax.xml.namespace.QName DEATHDATE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "deathDate");
        private static final javax.xml.namespace.QName TERMSOURCE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termsource");
        
        
        /**
         * Gets the "birthDate" attribute
         */
        public java.lang.String getBirthDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "birthDate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBirthDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BIRTHDATE$0);
                return target;
            }
        }
        
        /**
         * True if has "birthDate" attribute
         */
        public boolean isSetBirthDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BIRTHDATE$0) != null;
            }
        }
        
        /**
         * Sets the "birthDate" attribute
         */
        public void setBirthDate(java.lang.String birthDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BIRTHDATE$0);
                }
                target.setStringValue(birthDate);
            }
        }
        
        /**
         * Sets (as xml) the "birthDate" attribute
         */
        public void xsetBirthDate(org.apache.xmlbeans.XmlString birthDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BIRTHDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BIRTHDATE$0);
                }
                target.set(birthDate);
            }
        }
        
        /**
         * Unsets the "birthDate" attribute
         */
        public void unsetBirthDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BIRTHDATE$0);
            }
        }
        
        /**
         * Gets the "deathDate" attribute
         */
        public java.lang.String getDeathDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEATHDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "deathDate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDeathDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEATHDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "deathDate" attribute
         */
        public boolean isSetDeathDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEATHDATE$2) != null;
            }
        }
        
        /**
         * Sets the "deathDate" attribute
         */
        public void setDeathDate(java.lang.String deathDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEATHDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEATHDATE$2);
                }
                target.setStringValue(deathDate);
            }
        }
        
        /**
         * Sets (as xml) the "deathDate" attribute
         */
        public void xsetDeathDate(org.apache.xmlbeans.XmlString deathDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEATHDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEATHDATE$2);
                }
                target.set(deathDate);
            }
        }
        
        /**
         * Unsets the "deathDate" attribute
         */
        public void unsetDeathDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEATHDATE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$4);
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
                return get_store().find_attribute_user(TERMSOURCE$4) != null;
            }
        }
        
        /**
         * Sets the "termsource" attribute
         */
        public void setTermsource(java.lang.String termsource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$4);
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
                get_store().remove_attribute(TERMSOURCE$4);
            }
        }
    }
}
