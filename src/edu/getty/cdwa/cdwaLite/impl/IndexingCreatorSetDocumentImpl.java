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
 * A document containing one indexingCreatorSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingCreatorSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingCreatorSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGCREATORSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingCreatorSet");
    
    
    /**
     * Gets the "indexingCreatorSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet getIndexingCreatorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet)get_store().find_element_user(INDEXINGCREATORSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingCreatorSet" element
     */
    @Inject(optional=true) public void setIndexingCreatorSet(edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet indexingCreatorSet)
    {
        generatedSetterHelperImpl(indexingCreatorSet, INDEXINGCREATORSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingCreatorSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet addNewIndexingCreatorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet)get_store().add_element_user(INDEXINGCREATORSET$0);
            return target;
        }
    }
    /**
     * An XML indexingCreatorSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingCreatorSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingCreatorSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMECREATORSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nameCreatorSet");
        private static final javax.xml.namespace.QName NATIONALITYCREATOR$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nationalityCreator");
        private static final javax.xml.namespace.QName VITALDATESCREATOR$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "vitalDatesCreator");
        private static final javax.xml.namespace.QName GENDERCREATOR$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "genderCreator");
        private static final javax.xml.namespace.QName ROLECREATOR$8 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "roleCreator");
        private static final javax.xml.namespace.QName ATTRIBUTIONQUALIFIERCREATOR$10 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "attributionQualifierCreator");
        private static final javax.xml.namespace.QName EXTENTCREATOR$12 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "extentCreator");
        
        
        /**
         * Gets a List of "nameCreatorSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet> getNameCreatorSetList()
        {
            final class NameCreatorSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet get(int i)
                    { return IndexingCreatorSetImpl.this.getNameCreatorSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet set(int i, edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet o)
                {
                    edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet old = IndexingCreatorSetImpl.this.getNameCreatorSetArray(i);
                    IndexingCreatorSetImpl.this.setNameCreatorSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet o)
                    { IndexingCreatorSetImpl.this.insertNewNameCreatorSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet old = IndexingCreatorSetImpl.this.getNameCreatorSetArray(i);
                    IndexingCreatorSetImpl.this.removeNameCreatorSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfNameCreatorSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NameCreatorSetList();
            }
        }
        
        /**
         * Gets array of all "nameCreatorSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[] getNameCreatorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet>();
                get_store().find_all_element_users(NAMECREATORSET$0, targetList);
                edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[] result = new edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "nameCreatorSet" element
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet getNameCreatorSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet)get_store().find_element_user(NAMECREATORSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "nameCreatorSet" element
         */
        public int sizeOfNameCreatorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMECREATORSET$0);
            }
        }
        
        /**
         * Sets array of all "nameCreatorSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setNameCreatorSetArray(edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet[] nameCreatorSetArray)
        {
            check_orphaned();
            arraySetterHelper(nameCreatorSetArray, NAMECREATORSET$0);
        }
        
        /**
         * Sets ith "nameCreatorSet" element
         */
        @Inject(optional=true) public void setNameCreatorSetArray(int i, edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet nameCreatorSet)
        {
            generatedSetterHelperImpl(nameCreatorSet, NAMECREATORSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameCreatorSet" element
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet insertNewNameCreatorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet)get_store().insert_element_user(NAMECREATORSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameCreatorSet" element
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet addNewNameCreatorSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet)get_store().add_element_user(NAMECREATORSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "nameCreatorSet" element
         */
        public void removeNameCreatorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMECREATORSET$0, i);
            }
        }
        
        /**
         * Gets a List of "nationalityCreator" elements
         */
        public java.util.List<java.lang.String> getNationalityCreatorList()
        {
            final class NationalityCreatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingCreatorSetImpl.this.getNationalityCreatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getNationalityCreatorArray(i);
                    IndexingCreatorSetImpl.this.setNationalityCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingCreatorSetImpl.this.insertNationalityCreator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getNationalityCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeNationalityCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfNationalityCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NationalityCreatorList();
            }
        }
        
        /**
         * Gets array of all "nationalityCreator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getNationalityCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(NATIONALITYCREATOR$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "nationalityCreator" element
         */
        public java.lang.String getNationalityCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITYCREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "nationalityCreator" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetNationalityCreatorList()
        {
            final class NationalityCreatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingCreatorSetImpl.this.xgetNationalityCreatorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetNationalityCreatorArray(i);
                    IndexingCreatorSetImpl.this.xsetNationalityCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingCreatorSetImpl.this.insertNewNationalityCreator(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetNationalityCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeNationalityCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfNationalityCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NationalityCreatorList();
            }
        }
        
        /**
         * Gets array of all "nationalityCreator" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetNationalityCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(NATIONALITYCREATOR$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "nationalityCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetNationalityCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITYCREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "nationalityCreator" element
         */
        public int sizeOfNationalityCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NATIONALITYCREATOR$2);
            }
        }
        
        /**
         * Sets array of all "nationalityCreator" element
         */
        @Inject(optional=true) public void setNationalityCreatorArray(java.lang.String[] nationalityCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nationalityCreatorArray, NATIONALITYCREATOR$2);
            }
        }
        
        /**
         * Sets ith "nationalityCreator" element
         */
        @Inject(optional=true) public void setNationalityCreatorArray(int i, java.lang.String nationalityCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALITYCREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(nationalityCreator);
            }
        }
        
        /**
         * Sets (as xml) array of all "nationalityCreator" element
         */
        public void xsetNationalityCreatorArray(org.apache.xmlbeans.XmlString[]nationalityCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nationalityCreatorArray, NATIONALITYCREATOR$2);
            }
        }
        
        /**
         * Sets (as xml) ith "nationalityCreator" element
         */
        public void xsetNationalityCreatorArray(int i, org.apache.xmlbeans.XmlString nationalityCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NATIONALITYCREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(nationalityCreator);
            }
        }
        
        /**
         * Inserts the value as the ith "nationalityCreator" element
         */
        public void insertNationalityCreator(int i, java.lang.String nationalityCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NATIONALITYCREATOR$2, i);
                target.setStringValue(nationalityCreator);
            }
        }
        
        /**
         * Appends the value as the last "nationalityCreator" element
         */
        public void addNationalityCreator(java.lang.String nationalityCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALITYCREATOR$2);
                target.setStringValue(nationalityCreator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nationalityCreator" element
         */
        public org.apache.xmlbeans.XmlString insertNewNationalityCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NATIONALITYCREATOR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nationalityCreator" element
         */
        public org.apache.xmlbeans.XmlString addNewNationalityCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NATIONALITYCREATOR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "nationalityCreator" element
         */
        public void removeNationalityCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NATIONALITYCREATOR$2, i);
            }
        }
        
        /**
         * Gets a List of "vitalDatesCreator" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator> getVitalDatesCreatorList()
        {
            final class VitalDatesCreatorList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator get(int i)
                    { return IndexingCreatorSetImpl.this.getVitalDatesCreatorArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator set(int i, edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator o)
                {
                    edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator old = IndexingCreatorSetImpl.this.getVitalDatesCreatorArray(i);
                    IndexingCreatorSetImpl.this.setVitalDatesCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator o)
                    { IndexingCreatorSetImpl.this.insertNewVitalDatesCreator(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator old = IndexingCreatorSetImpl.this.getVitalDatesCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeVitalDatesCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfVitalDatesCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new VitalDatesCreatorList();
            }
        }
        
        /**
         * Gets array of all "vitalDatesCreator" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[] getVitalDatesCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator>();
                get_store().find_all_element_users(VITALDATESCREATOR$4, targetList);
                edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[] result = new edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "vitalDatesCreator" element
         */
        public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator getVitalDatesCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator)get_store().find_element_user(VITALDATESCREATOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "vitalDatesCreator" element
         */
        public int sizeOfVitalDatesCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VITALDATESCREATOR$4);
            }
        }
        
        /**
         * Sets array of all "vitalDatesCreator" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setVitalDatesCreatorArray(edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator[] vitalDatesCreatorArray)
        {
            check_orphaned();
            arraySetterHelper(vitalDatesCreatorArray, VITALDATESCREATOR$4);
        }
        
        /**
         * Sets ith "vitalDatesCreator" element
         */
        @Inject(optional=true) public void setVitalDatesCreatorArray(int i, edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator vitalDatesCreator)
        {
            generatedSetterHelperImpl(vitalDatesCreator, VITALDATESCREATOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "vitalDatesCreator" element
         */
        public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator insertNewVitalDatesCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator)get_store().insert_element_user(VITALDATESCREATOR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "vitalDatesCreator" element
         */
        public edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator addNewVitalDatesCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument.VitalDatesCreator)get_store().add_element_user(VITALDATESCREATOR$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "vitalDatesCreator" element
         */
        public void removeVitalDatesCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VITALDATESCREATOR$4, i);
            }
        }
        
        /**
         * Gets the "genderCreator" element
         */
        public java.lang.String getGenderCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDERCREATOR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "genderCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetGenderCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDERCREATOR$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "genderCreator" element
         */
        public boolean isSetGenderCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENDERCREATOR$6) != 0;
            }
        }
        
        /**
         * Sets the "genderCreator" element
         */
        @Inject(optional=true) public void setGenderCreator(java.lang.String genderCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDERCREATOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDERCREATOR$6);
                }
                target.setStringValue(genderCreator);
            }
        }
        
        /**
         * Sets (as xml) the "genderCreator" element
         */
        public void xsetGenderCreator(org.apache.xmlbeans.XmlString genderCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENDERCREATOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENDERCREATOR$6);
                }
                target.set(genderCreator);
            }
        }
        
        /**
         * Unsets the "genderCreator" element
         */
        public void unsetGenderCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENDERCREATOR$6, 0);
            }
        }
        
        /**
         * Gets a List of "roleCreator" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator> getRoleCreatorList()
        {
            final class RoleCreatorList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator get(int i)
                    { return IndexingCreatorSetImpl.this.getRoleCreatorArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator set(int i, edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator o)
                {
                    edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator old = IndexingCreatorSetImpl.this.getRoleCreatorArray(i);
                    IndexingCreatorSetImpl.this.setRoleCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator o)
                    { IndexingCreatorSetImpl.this.insertNewRoleCreator(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator old = IndexingCreatorSetImpl.this.getRoleCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeRoleCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfRoleCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoleCreatorList();
            }
        }
        
        /**
         * Gets array of all "roleCreator" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[] getRoleCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator>();
                get_store().find_all_element_users(ROLECREATOR$8, targetList);
                edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[] result = new edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "roleCreator" element
         */
        public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator getRoleCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator)get_store().find_element_user(ROLECREATOR$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "roleCreator" element
         */
        public int sizeOfRoleCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLECREATOR$8);
            }
        }
        
        /**
         * Sets array of all "roleCreator" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRoleCreatorArray(edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator[] roleCreatorArray)
        {
            check_orphaned();
            arraySetterHelper(roleCreatorArray, ROLECREATOR$8);
        }
        
        /**
         * Sets ith "roleCreator" element
         */
        @Inject(optional=true) public void setRoleCreatorArray(int i, edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator roleCreator)
        {
            generatedSetterHelperImpl(roleCreator, ROLECREATOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleCreator" element
         */
        public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator insertNewRoleCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator)get_store().insert_element_user(ROLECREATOR$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleCreator" element
         */
        public edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator addNewRoleCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.RoleCreatorDocument.RoleCreator)get_store().add_element_user(ROLECREATOR$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "roleCreator" element
         */
        public void removeRoleCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLECREATOR$8, i);
            }
        }
        
        /**
         * Gets a List of "attributionQualifierCreator" elements
         */
        public java.util.List<java.lang.String> getAttributionQualifierCreatorList()
        {
            final class AttributionQualifierCreatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingCreatorSetImpl.this.getAttributionQualifierCreatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getAttributionQualifierCreatorArray(i);
                    IndexingCreatorSetImpl.this.setAttributionQualifierCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingCreatorSetImpl.this.insertAttributionQualifierCreator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getAttributionQualifierCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeAttributionQualifierCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfAttributionQualifierCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AttributionQualifierCreatorList();
            }
        }
        
        /**
         * Gets array of all "attributionQualifierCreator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getAttributionQualifierCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(ATTRIBUTIONQUALIFIERCREATOR$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "attributionQualifierCreator" element
         */
        public java.lang.String getAttributionQualifierCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "attributionQualifierCreator" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetAttributionQualifierCreatorList()
        {
            final class AttributionQualifierCreatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingCreatorSetImpl.this.xgetAttributionQualifierCreatorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetAttributionQualifierCreatorArray(i);
                    IndexingCreatorSetImpl.this.xsetAttributionQualifierCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingCreatorSetImpl.this.insertNewAttributionQualifierCreator(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetAttributionQualifierCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeAttributionQualifierCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfAttributionQualifierCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AttributionQualifierCreatorList();
            }
        }
        
        /**
         * Gets array of all "attributionQualifierCreator" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetAttributionQualifierCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(ATTRIBUTIONQUALIFIERCREATOR$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "attributionQualifierCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetAttributionQualifierCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attributionQualifierCreator" element
         */
        public int sizeOfAttributionQualifierCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTIONQUALIFIERCREATOR$10);
            }
        }
        
        /**
         * Sets array of all "attributionQualifierCreator" element
         */
        @Inject(optional=true) public void setAttributionQualifierCreatorArray(java.lang.String[] attributionQualifierCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributionQualifierCreatorArray, ATTRIBUTIONQUALIFIERCREATOR$10);
            }
        }
        
        /**
         * Sets ith "attributionQualifierCreator" element
         */
        @Inject(optional=true) public void setAttributionQualifierCreatorArray(int i, java.lang.String attributionQualifierCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(attributionQualifierCreator);
            }
        }
        
        /**
         * Sets (as xml) array of all "attributionQualifierCreator" element
         */
        public void xsetAttributionQualifierCreatorArray(org.apache.xmlbeans.XmlString[]attributionQualifierCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributionQualifierCreatorArray, ATTRIBUTIONQUALIFIERCREATOR$10);
            }
        }
        
        /**
         * Sets (as xml) ith "attributionQualifierCreator" element
         */
        public void xsetAttributionQualifierCreatorArray(int i, org.apache.xmlbeans.XmlString attributionQualifierCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attributionQualifierCreator);
            }
        }
        
        /**
         * Inserts the value as the ith "attributionQualifierCreator" element
         */
        public void insertAttributionQualifierCreator(int i, java.lang.String attributionQualifierCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                target.setStringValue(attributionQualifierCreator);
            }
        }
        
        /**
         * Appends the value as the last "attributionQualifierCreator" element
         */
        public void addAttributionQualifierCreator(java.lang.String attributionQualifierCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTIONQUALIFIERCREATOR$10);
                target.setStringValue(attributionQualifierCreator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierCreator" element
         */
        public org.apache.xmlbeans.XmlString insertNewAttributionQualifierCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ATTRIBUTIONQUALIFIERCREATOR$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributionQualifierCreator" element
         */
        public org.apache.xmlbeans.XmlString addNewAttributionQualifierCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTIONQUALIFIERCREATOR$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "attributionQualifierCreator" element
         */
        public void removeAttributionQualifierCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTIONQUALIFIERCREATOR$10, i);
            }
        }
        
        /**
         * Gets a List of "extentCreator" elements
         */
        public java.util.List<java.lang.String> getExtentCreatorList()
        {
            final class ExtentCreatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingCreatorSetImpl.this.getExtentCreatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getExtentCreatorArray(i);
                    IndexingCreatorSetImpl.this.setExtentCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingCreatorSetImpl.this.insertExtentCreator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingCreatorSetImpl.this.getExtentCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeExtentCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfExtentCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentCreatorList();
            }
        }
        
        /**
         * Gets array of all "extentCreator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getExtentCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTCREATOR$12, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extentCreator" element
         */
        public java.lang.String getExtentCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTCREATOR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "extentCreator" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetExtentCreatorList()
        {
            final class ExtentCreatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingCreatorSetImpl.this.xgetExtentCreatorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetExtentCreatorArray(i);
                    IndexingCreatorSetImpl.this.xsetExtentCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingCreatorSetImpl.this.insertNewExtentCreator(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingCreatorSetImpl.this.xgetExtentCreatorArray(i);
                    IndexingCreatorSetImpl.this.removeExtentCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorSetImpl.this.sizeOfExtentCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentCreatorList();
            }
        }
        
        /**
         * Gets array of all "extentCreator" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetExtentCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTCREATOR$12, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extentCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetExtentCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTCREATOR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentCreator" element
         */
        public int sizeOfExtentCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTCREATOR$12);
            }
        }
        
        /**
         * Sets array of all "extentCreator" element
         */
        @Inject(optional=true) public void setExtentCreatorArray(java.lang.String[] extentCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentCreatorArray, EXTENTCREATOR$12);
            }
        }
        
        /**
         * Sets ith "extentCreator" element
         */
        @Inject(optional=true) public void setExtentCreatorArray(int i, java.lang.String extentCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTCREATOR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extentCreator);
            }
        }
        
        /**
         * Sets (as xml) array of all "extentCreator" element
         */
        public void xsetExtentCreatorArray(org.apache.xmlbeans.XmlString[]extentCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentCreatorArray, EXTENTCREATOR$12);
            }
        }
        
        /**
         * Sets (as xml) ith "extentCreator" element
         */
        public void xsetExtentCreatorArray(int i, org.apache.xmlbeans.XmlString extentCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTCREATOR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extentCreator);
            }
        }
        
        /**
         * Inserts the value as the ith "extentCreator" element
         */
        public void insertExtentCreator(int i, java.lang.String extentCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTENTCREATOR$12, i);
                target.setStringValue(extentCreator);
            }
        }
        
        /**
         * Appends the value as the last "extentCreator" element
         */
        public void addExtentCreator(java.lang.String extentCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENTCREATOR$12);
                target.setStringValue(extentCreator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentCreator" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtentCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTENTCREATOR$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentCreator" element
         */
        public org.apache.xmlbeans.XmlString addNewExtentCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENTCREATOR$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentCreator" element
         */
        public void removeExtentCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTCREATOR$12, i);
            }
        }
    }
}
