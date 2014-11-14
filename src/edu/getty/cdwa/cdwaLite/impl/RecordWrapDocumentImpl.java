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
 * A document containing one recordWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RecordWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordWrap");
    
    
    /**
     * Gets the "recordWrap" element
     */
    public edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap getRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap)get_store().find_element_user(RECORDWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordWrap" element
     */
    public void setRecordWrap(edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap recordWrap)
    {
        generatedSetterHelperImpl(recordWrap, RECORDWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    public edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap addNewRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap)get_store().add_element_user(RECORDWRAP$0);
            return target;
        }
    }
    /**
     * An XML recordWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class RecordWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RecordWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordID");
        private static final javax.xml.namespace.QName RECORDTYPE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordType");
        private static final javax.xml.namespace.QName RECORDSOURCE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordSource");
        private static final javax.xml.namespace.QName RECORDINFOWRAP$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoWrap");
        
        
        /**
         * Gets a List of "recordID" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID> getRecordIDList()
        {
            final class RecordIDList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID get(int i)
                    { return RecordWrapImpl.this.getRecordIDArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID set(int i, edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID o)
                {
                    edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.setRecordIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID o)
                    { RecordWrapImpl.this.insertNewRecordID(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.removeRecordID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordIDList();
            }
        }
        
        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[] getRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID>();
                get_store().find_all_element_users(RECORDID$0, targetList);
                edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[] result = new edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID getRecordIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID)get_store().find_element_user(RECORDID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordID" element
         */
        public int sizeOfRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDID$0);
            }
        }
        
        /**
         * Sets array of all "recordID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordIDArray(edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID[] recordIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordIDArray, RECORDID$0);
        }
        
        /**
         * Sets ith "recordID" element
         */
        public void setRecordIDArray(int i, edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID recordID)
        {
            generatedSetterHelperImpl(recordID, RECORDID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID insertNewRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID)get_store().insert_element_user(RECORDID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID addNewRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordIDDocument.RecordID)get_store().add_element_user(RECORDID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordID" element
         */
        public void removeRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDID$0, i);
            }
        }
        
        /**
         * Gets the "recordType" element
         */
        public java.lang.String getRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "recordType" element
         */
        public org.apache.xmlbeans.XmlString xgetRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "recordType" element
         */
        public void setRecordType(java.lang.String recordType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDTYPE$2);
                }
                target.setStringValue(recordType);
            }
        }
        
        /**
         * Sets (as xml) the "recordType" element
         */
        public void xsetRecordType(org.apache.xmlbeans.XmlString recordType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECORDTYPE$2);
                }
                target.set(recordType);
            }
        }
        
        /**
         * Gets a List of "recordSource" elements
         */
        public java.util.List<java.lang.String> getRecordSourceList()
        {
            final class RecordSourceList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return RecordWrapImpl.this.getRecordSourceArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.setRecordSourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { RecordWrapImpl.this.insertRecordSource(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.removeRecordSource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordSourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordSourceList();
            }
        }
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(RECORDSOURCE$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "recordSource" element
         */
        public java.lang.String getRecordSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "recordSource" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetRecordSourceList()
        {
            final class RecordSourceList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return RecordWrapImpl.this.xgetRecordSourceArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = RecordWrapImpl.this.xgetRecordSourceArray(i);
                    RecordWrapImpl.this.xsetRecordSourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { RecordWrapImpl.this.insertNewRecordSource(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = RecordWrapImpl.this.xgetRecordSourceArray(i);
                    RecordWrapImpl.this.removeRecordSource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordSourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordSourceList();
            }
        }
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(RECORDSOURCE$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "recordSource" element
         */
        public org.apache.xmlbeans.XmlString xgetRecordSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordSource" element
         */
        public int sizeOfRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDSOURCE$4);
            }
        }
        
        /**
         * Sets array of all "recordSource" element
         */
        public void setRecordSourceArray(java.lang.String[] recordSourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recordSourceArray, RECORDSOURCE$4);
            }
        }
        
        /**
         * Sets ith "recordSource" element
         */
        public void setRecordSourceArray(int i, java.lang.String recordSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(recordSource);
            }
        }
        
        /**
         * Sets (as xml) array of all "recordSource" element
         */
        public void xsetRecordSourceArray(org.apache.xmlbeans.XmlString[]recordSourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recordSourceArray, RECORDSOURCE$4);
            }
        }
        
        /**
         * Sets (as xml) ith "recordSource" element
         */
        public void xsetRecordSourceArray(int i, org.apache.xmlbeans.XmlString recordSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(recordSource);
            }
        }
        
        /**
         * Inserts the value as the ith "recordSource" element
         */
        public void insertRecordSource(int i, java.lang.String recordSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RECORDSOURCE$4, i);
                target.setStringValue(recordSource);
            }
        }
        
        /**
         * Appends the value as the last "recordSource" element
         */
        public void addRecordSource(java.lang.String recordSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDSOURCE$4);
                target.setStringValue(recordSource);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        public org.apache.xmlbeans.XmlString insertNewRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(RECORDSOURCE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        public org.apache.xmlbeans.XmlString addNewRecordSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECORDSOURCE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordSource" element
         */
        public void removeRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDSOURCE$4, i);
            }
        }
        
        /**
         * Gets a List of "recordInfoWrap" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap> getRecordInfoWrapList()
        {
            final class RecordInfoWrapList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap get(int i)
                    { return RecordWrapImpl.this.getRecordInfoWrapArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap set(int i, edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap o)
                {
                    edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap old = RecordWrapImpl.this.getRecordInfoWrapArray(i);
                    RecordWrapImpl.this.setRecordInfoWrapArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap o)
                    { RecordWrapImpl.this.insertNewRecordInfoWrap(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap old = RecordWrapImpl.this.getRecordInfoWrapArray(i);
                    RecordWrapImpl.this.removeRecordInfoWrap(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordInfoWrapArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoWrapList();
            }
        }
        
        /**
         * Gets array of all "recordInfoWrap" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[] getRecordInfoWrapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap>();
                get_store().find_all_element_users(RECORDINFOWRAP$6, targetList);
                edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[] result = new edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoWrap" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap getRecordInfoWrapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap)get_store().find_element_user(RECORDINFOWRAP$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoWrap" element
         */
        public int sizeOfRecordInfoWrapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOWRAP$6);
            }
        }
        
        /**
         * Sets array of all "recordInfoWrap" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordInfoWrapArray(edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap[] recordInfoWrapArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoWrapArray, RECORDINFOWRAP$6);
        }
        
        /**
         * Sets ith "recordInfoWrap" element
         */
        public void setRecordInfoWrapArray(int i, edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap recordInfoWrap)
        {
            generatedSetterHelperImpl(recordInfoWrap, RECORDINFOWRAP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoWrap" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap insertNewRecordInfoWrap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap)get_store().insert_element_user(RECORDINFOWRAP$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoWrap" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap addNewRecordInfoWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap)get_store().add_element_user(RECORDINFOWRAP$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoWrap" element
         */
        public void removeRecordInfoWrap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOWRAP$6, i);
            }
        }
    }
}
