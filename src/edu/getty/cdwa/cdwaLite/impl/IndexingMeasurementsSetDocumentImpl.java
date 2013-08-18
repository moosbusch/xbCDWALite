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
 * A document containing one indexingMeasurementsSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingMeasurementsSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMeasurementsSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMeasurementsSet");
    
    
    /**
     * Gets the "indexingMeasurementsSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet getIndexingMeasurementsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().find_element_user(INDEXINGMEASUREMENTSSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMeasurementsSet" element
     */
    @Inject(optional=true) public void setIndexingMeasurementsSet(edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet indexingMeasurementsSet)
    {
        generatedSetterHelperImpl(indexingMeasurementsSet, INDEXINGMEASUREMENTSSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMeasurementsSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet addNewIndexingMeasurementsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().add_element_user(INDEXINGMEASUREMENTSSET$0);
            return target;
        }
    }
    /**
     * An XML indexingMeasurementsSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingMeasurementsSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument.IndexingMeasurementsSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMeasurementsSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEASUREMENTSSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "measurementsSet");
        private static final javax.xml.namespace.QName EXTENTMEASUREMENTS$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "extentMeasurements");
        private static final javax.xml.namespace.QName QUALIFIERMEASUREMENTS$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "qualifierMeasurements");
        private static final javax.xml.namespace.QName FORMATMEASUREMENTS$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "formatMeasurements");
        private static final javax.xml.namespace.QName SHAPEMEASUREMENTS$8 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "shapeMeasurements");
        private static final javax.xml.namespace.QName SCALEMEASUREMENTS$10 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "scaleMeasurements");
        
        
        /**
         * Gets a List of "measurementsSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet> getMeasurementsSetList()
        {
            final class MeasurementsSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet get(int i)
                    { return IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet set(int i, edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet o)
                {
                    edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet old = IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i);
                    IndexingMeasurementsSetImpl.this.setMeasurementsSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet o)
                    { IndexingMeasurementsSetImpl.this.insertNewMeasurementsSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet old = IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i);
                    IndexingMeasurementsSetImpl.this.removeMeasurementsSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfMeasurementsSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MeasurementsSetList();
            }
        }
        
        /**
         * Gets array of all "measurementsSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[] getMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet>();
                get_store().find_all_element_users(MEASUREMENTSSET$0, targetList);
                edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[] result = new edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "measurementsSet" element
         */
        public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet getMeasurementsSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet)get_store().find_element_user(MEASUREMENTSSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "measurementsSet" element
         */
        public int sizeOfMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEASUREMENTSSET$0);
            }
        }
        
        /**
         * Sets array of all "measurementsSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setMeasurementsSetArray(edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet[] measurementsSetArray)
        {
            check_orphaned();
            arraySetterHelper(measurementsSetArray, MEASUREMENTSSET$0);
        }
        
        /**
         * Sets ith "measurementsSet" element
         */
        @Inject(optional=true) public void setMeasurementsSetArray(int i, edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet measurementsSet)
        {
            generatedSetterHelperImpl(measurementsSet, MEASUREMENTSSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "measurementsSet" element
         */
        public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet insertNewMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet)get_store().insert_element_user(MEASUREMENTSSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measurementsSet" element
         */
        public edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet addNewMeasurementsSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (edu.getty.cdwa.cdwaLite.MeasurementsSetDocument.MeasurementsSet)get_store().add_element_user(MEASUREMENTSSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "measurementsSet" element
         */
        public void removeMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEASUREMENTSSET$0, i);
            }
        }
        
        /**
         * Gets a List of "extentMeasurements" elements
         */
        public java.util.List<java.lang.String> getExtentMeasurementsList()
        {
            final class ExtentMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setExtentMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertExtentMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeExtentMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfExtentMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getExtentMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTMEASUREMENTS$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extentMeasurements" element
         */
        public java.lang.String getExtentMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "extentMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetExtentMeasurementsList()
        {
            final class ExtentMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetExtentMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetExtentMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewExtentMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeExtentMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfExtentMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetExtentMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTMEASUREMENTS$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extentMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetExtentMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentMeasurements" element
         */
        public int sizeOfExtentMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTMEASUREMENTS$2);
            }
        }
        
        /**
         * Sets array of all "extentMeasurements" element
         */
        @Inject(optional=true) public void setExtentMeasurementsArray(java.lang.String[] extentMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentMeasurementsArray, EXTENTMEASUREMENTS$2);
            }
        }
        
        /**
         * Sets ith "extentMeasurements" element
         */
        @Inject(optional=true) public void setExtentMeasurementsArray(int i, java.lang.String extentMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extentMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "extentMeasurements" element
         */
        public void xsetExtentMeasurementsArray(org.apache.xmlbeans.XmlString[]extentMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentMeasurementsArray, EXTENTMEASUREMENTS$2);
            }
        }
        
        /**
         * Sets (as xml) ith "extentMeasurements" element
         */
        public void xsetExtentMeasurementsArray(int i, org.apache.xmlbeans.XmlString extentMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extentMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "extentMeasurements" element
         */
        public void insertExtentMeasurements(int i, java.lang.String extentMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTENTMEASUREMENTS$2, i);
                target.setStringValue(extentMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "extentMeasurements" element
         */
        public void addExtentMeasurements(java.lang.String extentMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENTMEASUREMENTS$2);
                target.setStringValue(extentMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtentMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTENTMEASUREMENTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewExtentMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENTMEASUREMENTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentMeasurements" element
         */
        public void removeExtentMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTMEASUREMENTS$2, i);
            }
        }
        
        /**
         * Gets a List of "qualifierMeasurements" elements
         */
        public java.util.List<java.lang.String> getQualifierMeasurementsList()
        {
            final class QualifierMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setQualifierMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertQualifierMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeQualifierMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfQualifierMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new QualifierMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(QUALIFIERMEASUREMENTS$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "qualifierMeasurements" element
         */
        public java.lang.String getQualifierMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "qualifierMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetQualifierMeasurementsList()
        {
            final class QualifierMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetQualifierMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewQualifierMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeQualifierMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfQualifierMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new QualifierMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(QUALIFIERMEASUREMENTS$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetQualifierMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "qualifierMeasurements" element
         */
        public int sizeOfQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets array of all "qualifierMeasurements" element
         */
        @Inject(optional=true) public void setQualifierMeasurementsArray(java.lang.String[] qualifierMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qualifierMeasurementsArray, QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets ith "qualifierMeasurements" element
         */
        @Inject(optional=true) public void setQualifierMeasurementsArray(int i, java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "qualifierMeasurements" element
         */
        public void xsetQualifierMeasurementsArray(org.apache.xmlbeans.XmlString[]qualifierMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qualifierMeasurementsArray, QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "qualifierMeasurements" element
         */
        public void xsetQualifierMeasurementsArray(int i, org.apache.xmlbeans.XmlString qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(qualifierMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "qualifierMeasurements" element
         */
        public void insertQualifierMeasurements(int i, java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(QUALIFIERMEASUREMENTS$4, i);
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "qualifierMeasurements" element
         */
        public void addQualifierMeasurements(java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIERMEASUREMENTS$4);
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewQualifierMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(QUALIFIERMEASUREMENTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewQualifierMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALIFIERMEASUREMENTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "qualifierMeasurements" element
         */
        public void removeQualifierMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALIFIERMEASUREMENTS$4, i);
            }
        }
        
        /**
         * Gets a List of "formatMeasurements" elements
         */
        public java.util.List<java.lang.String> getFormatMeasurementsList()
        {
            final class FormatMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setFormatMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertFormatMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeFormatMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfFormatMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FormatMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getFormatMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(FORMATMEASUREMENTS$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "formatMeasurements" element
         */
        public java.lang.String getFormatMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "formatMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetFormatMeasurementsList()
        {
            final class FormatMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetFormatMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetFormatMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewFormatMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeFormatMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfFormatMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FormatMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetFormatMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(FORMATMEASUREMENTS$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "formatMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetFormatMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "formatMeasurements" element
         */
        public int sizeOfFormatMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMATMEASUREMENTS$6);
            }
        }
        
        /**
         * Sets array of all "formatMeasurements" element
         */
        @Inject(optional=true) public void setFormatMeasurementsArray(java.lang.String[] formatMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(formatMeasurementsArray, FORMATMEASUREMENTS$6);
            }
        }
        
        /**
         * Sets ith "formatMeasurements" element
         */
        @Inject(optional=true) public void setFormatMeasurementsArray(int i, java.lang.String formatMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(formatMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "formatMeasurements" element
         */
        public void xsetFormatMeasurementsArray(org.apache.xmlbeans.XmlString[]formatMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(formatMeasurementsArray, FORMATMEASUREMENTS$6);
            }
        }
        
        /**
         * Sets (as xml) ith "formatMeasurements" element
         */
        public void xsetFormatMeasurementsArray(int i, org.apache.xmlbeans.XmlString formatMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(formatMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "formatMeasurements" element
         */
        public void insertFormatMeasurements(int i, java.lang.String formatMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FORMATMEASUREMENTS$6, i);
                target.setStringValue(formatMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "formatMeasurements" element
         */
        public void addFormatMeasurements(java.lang.String formatMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATMEASUREMENTS$6);
                target.setStringValue(formatMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "formatMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewFormatMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FORMATMEASUREMENTS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "formatMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewFormatMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMATMEASUREMENTS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "formatMeasurements" element
         */
        public void removeFormatMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMATMEASUREMENTS$6, i);
            }
        }
        
        /**
         * Gets a List of "shapeMeasurements" elements
         */
        public java.util.List<java.lang.String> getShapeMeasurementsList()
        {
            final class ShapeMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setShapeMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertShapeMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeShapeMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfShapeMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ShapeMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getShapeMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SHAPEMEASUREMENTS$8, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "shapeMeasurements" element
         */
        public java.lang.String getShapeMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "shapeMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetShapeMeasurementsList()
        {
            final class ShapeMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetShapeMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetShapeMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewShapeMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeShapeMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfShapeMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ShapeMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetShapeMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SHAPEMEASUREMENTS$8, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "shapeMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetShapeMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shapeMeasurements" element
         */
        public int sizeOfShapeMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHAPEMEASUREMENTS$8);
            }
        }
        
        /**
         * Sets array of all "shapeMeasurements" element
         */
        @Inject(optional=true) public void setShapeMeasurementsArray(java.lang.String[] shapeMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(shapeMeasurementsArray, SHAPEMEASUREMENTS$8);
            }
        }
        
        /**
         * Sets ith "shapeMeasurements" element
         */
        @Inject(optional=true) public void setShapeMeasurementsArray(int i, java.lang.String shapeMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(shapeMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "shapeMeasurements" element
         */
        public void xsetShapeMeasurementsArray(org.apache.xmlbeans.XmlString[]shapeMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(shapeMeasurementsArray, SHAPEMEASUREMENTS$8);
            }
        }
        
        /**
         * Sets (as xml) ith "shapeMeasurements" element
         */
        public void xsetShapeMeasurementsArray(int i, org.apache.xmlbeans.XmlString shapeMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(shapeMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "shapeMeasurements" element
         */
        public void insertShapeMeasurements(int i, java.lang.String shapeMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SHAPEMEASUREMENTS$8, i);
                target.setStringValue(shapeMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "shapeMeasurements" element
         */
        public void addShapeMeasurements(java.lang.String shapeMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAPEMEASUREMENTS$8);
                target.setStringValue(shapeMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shapeMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewShapeMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SHAPEMEASUREMENTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shapeMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewShapeMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAPEMEASUREMENTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "shapeMeasurements" element
         */
        public void removeShapeMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHAPEMEASUREMENTS$8, i);
            }
        }
        
        /**
         * Gets a List of "scaleMeasurements" elements
         */
        public java.util.List<java.lang.String> getScaleMeasurementsList()
        {
            final class ScaleMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setScaleMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertScaleMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeScaleMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfScaleMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ScaleMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getScaleMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SCALEMEASUREMENTS$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "scaleMeasurements" element
         */
        public java.lang.String getScaleMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "scaleMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetScaleMeasurementsList()
        {
            final class ScaleMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetScaleMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetScaleMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewScaleMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeScaleMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfScaleMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ScaleMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetScaleMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SCALEMEASUREMENTS$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "scaleMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetScaleMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "scaleMeasurements" element
         */
        public int sizeOfScaleMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCALEMEASUREMENTS$10);
            }
        }
        
        /**
         * Sets array of all "scaleMeasurements" element
         */
        @Inject(optional=true) public void setScaleMeasurementsArray(java.lang.String[] scaleMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scaleMeasurementsArray, SCALEMEASUREMENTS$10);
            }
        }
        
        /**
         * Sets ith "scaleMeasurements" element
         */
        @Inject(optional=true) public void setScaleMeasurementsArray(int i, java.lang.String scaleMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(scaleMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "scaleMeasurements" element
         */
        public void xsetScaleMeasurementsArray(org.apache.xmlbeans.XmlString[]scaleMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(scaleMeasurementsArray, SCALEMEASUREMENTS$10);
            }
        }
        
        /**
         * Sets (as xml) ith "scaleMeasurements" element
         */
        public void xsetScaleMeasurementsArray(int i, org.apache.xmlbeans.XmlString scaleMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(scaleMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "scaleMeasurements" element
         */
        public void insertScaleMeasurements(int i, java.lang.String scaleMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SCALEMEASUREMENTS$10, i);
                target.setStringValue(scaleMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "scaleMeasurements" element
         */
        public void addScaleMeasurements(java.lang.String scaleMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALEMEASUREMENTS$10);
                target.setStringValue(scaleMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scaleMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewScaleMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SCALEMEASUREMENTS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scaleMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewScaleMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCALEMEASUREMENTS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "scaleMeasurements" element
         */
        public void removeScaleMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCALEMEASUREMENTS$10, i);
            }
        }
    }
}
