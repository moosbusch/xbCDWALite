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
 * A document containing one recordInfoWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RecordInfoWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordInfoWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINFOWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoWrap");
    
    
    /**
     * Gets the "recordInfoWrap" element
     */
    public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap getRecordInfoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap)get_store().find_element_user(RECORDINFOWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordInfoWrap" element
     */
    public void setRecordInfoWrap(edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap recordInfoWrap)
    {
        generatedSetterHelperImpl(recordInfoWrap, RECORDINFOWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordInfoWrap" element
     */
    public edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap addNewRecordInfoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap)get_store().add_element_user(RECORDINFOWRAP$0);
            return target;
        }
    }
    /**
     * An XML recordInfoWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class RecordInfoWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RecordInfoWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDINFOID$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoID");
        private static final javax.xml.namespace.QName RECORDINFOLINK$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordInfoLink");
        private static final javax.xml.namespace.QName RECORDRELID$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordRelID");
        private static final javax.xml.namespace.QName RECORDMETADATALOC$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordMetadataLoc");
        private static final javax.xml.namespace.QName RECORDMETADATADATE$8 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "recordMetadataDate");
        private static final javax.xml.namespace.QName TYPE$10 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        
        
        /**
         * Gets a List of "recordInfoID" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID> getRecordInfoIDList()
        {
            final class RecordInfoIDList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID get(int i)
                    { return RecordInfoWrapImpl.this.getRecordInfoIDArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID set(int i, edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID o)
                {
                    edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID old = RecordInfoWrapImpl.this.getRecordInfoIDArray(i);
                    RecordInfoWrapImpl.this.setRecordInfoIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID o)
                    { RecordInfoWrapImpl.this.insertNewRecordInfoID(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID old = RecordInfoWrapImpl.this.getRecordInfoIDArray(i);
                    RecordInfoWrapImpl.this.removeRecordInfoID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordInfoIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoIDList();
            }
        }
        
        /**
         * Gets array of all "recordInfoID" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[] getRecordInfoIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID>();
                get_store().find_all_element_users(RECORDINFOID$0, targetList);
                edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[] result = new edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID getRecordInfoIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID)get_store().find_element_user(RECORDINFOID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoID" element
         */
        public int sizeOfRecordInfoIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOID$0);
            }
        }
        
        /**
         * Sets array of all "recordInfoID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordInfoIDArray(edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID[] recordInfoIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoIDArray, RECORDINFOID$0);
        }
        
        /**
         * Sets ith "recordInfoID" element
         */
        public void setRecordInfoIDArray(int i, edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID recordInfoID)
        {
            generatedSetterHelperImpl(recordInfoID, RECORDINFOID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID insertNewRecordInfoID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID)get_store().insert_element_user(RECORDINFOID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID addNewRecordInfoID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordInfoIDDocument.RecordInfoID)get_store().add_element_user(RECORDINFOID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoID" element
         */
        public void removeRecordInfoID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOID$0, i);
            }
        }
        
        /**
         * Gets a List of "recordInfoLink" elements
         */
        public java.util.List<java.lang.String> getRecordInfoLinkList()
        {
            final class RecordInfoLinkList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return RecordInfoWrapImpl.this.getRecordInfoLinkArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = RecordInfoWrapImpl.this.getRecordInfoLinkArray(i);
                    RecordInfoWrapImpl.this.setRecordInfoLinkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { RecordInfoWrapImpl.this.insertRecordInfoLink(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = RecordInfoWrapImpl.this.getRecordInfoLinkArray(i);
                    RecordInfoWrapImpl.this.removeRecordInfoLink(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordInfoLinkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoLinkList();
            }
        }
        
        /**
         * Gets array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getRecordInfoLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(RECORDINFOLINK$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoLink" element
         */
        public java.lang.String getRecordInfoLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINFOLINK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "recordInfoLink" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetRecordInfoLinkList()
        {
            final class RecordInfoLinkList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return RecordInfoWrapImpl.this.xgetRecordInfoLinkArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = RecordInfoWrapImpl.this.xgetRecordInfoLinkArray(i);
                    RecordInfoWrapImpl.this.xsetRecordInfoLinkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { RecordInfoWrapImpl.this.insertNewRecordInfoLink(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = RecordInfoWrapImpl.this.xgetRecordInfoLinkArray(i);
                    RecordInfoWrapImpl.this.removeRecordInfoLink(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordInfoLinkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoLinkList();
            }
        }
        
        /**
         * Gets array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetRecordInfoLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(RECORDINFOLINK$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "recordInfoLink" element
         */
        public org.apache.xmlbeans.XmlString xgetRecordInfoLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDINFOLINK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoLink" element
         */
        public int sizeOfRecordInfoLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOLINK$2);
            }
        }
        
        /**
         * Sets array of all "recordInfoLink" element
         */
        public void setRecordInfoLinkArray(java.lang.String[] recordInfoLinkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recordInfoLinkArray, RECORDINFOLINK$2);
            }
        }
        
        /**
         * Sets ith "recordInfoLink" element
         */
        public void setRecordInfoLinkArray(int i, java.lang.String recordInfoLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDINFOLINK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(recordInfoLink);
            }
        }
        
        /**
         * Sets (as xml) array of all "recordInfoLink" element
         */
        public void xsetRecordInfoLinkArray(org.apache.xmlbeans.XmlString[]recordInfoLinkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recordInfoLinkArray, RECORDINFOLINK$2);
            }
        }
        
        /**
         * Sets (as xml) ith "recordInfoLink" element
         */
        public void xsetRecordInfoLinkArray(int i, org.apache.xmlbeans.XmlString recordInfoLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RECORDINFOLINK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(recordInfoLink);
            }
        }
        
        /**
         * Inserts the value as the ith "recordInfoLink" element
         */
        public void insertRecordInfoLink(int i, java.lang.String recordInfoLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RECORDINFOLINK$2, i);
                target.setStringValue(recordInfoLink);
            }
        }
        
        /**
         * Appends the value as the last "recordInfoLink" element
         */
        public void addRecordInfoLink(java.lang.String recordInfoLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDINFOLINK$2);
                target.setStringValue(recordInfoLink);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
         */
        public org.apache.xmlbeans.XmlString insertNewRecordInfoLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(RECORDINFOLINK$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
         */
        public org.apache.xmlbeans.XmlString addNewRecordInfoLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RECORDINFOLINK$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoLink" element
         */
        public void removeRecordInfoLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOLINK$2, i);
            }
        }
        
        /**
         * Gets a List of "recordRelID" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID> getRecordRelIDList()
        {
            final class RecordRelIDList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID get(int i)
                    { return RecordInfoWrapImpl.this.getRecordRelIDArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID set(int i, edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID o)
                {
                    edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID old = RecordInfoWrapImpl.this.getRecordRelIDArray(i);
                    RecordInfoWrapImpl.this.setRecordRelIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID o)
                    { RecordInfoWrapImpl.this.insertNewRecordRelID(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID old = RecordInfoWrapImpl.this.getRecordRelIDArray(i);
                    RecordInfoWrapImpl.this.removeRecordRelID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordRelIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordRelIDList();
            }
        }
        
        /**
         * Gets array of all "recordRelID" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[] getRecordRelIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID>();
                get_store().find_all_element_users(RECORDRELID$4, targetList);
                edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[] result = new edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordRelID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID getRecordRelIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID)get_store().find_element_user(RECORDRELID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordRelID" element
         */
        public int sizeOfRecordRelIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDRELID$4);
            }
        }
        
        /**
         * Sets array of all "recordRelID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordRelIDArray(edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID[] recordRelIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordRelIDArray, RECORDRELID$4);
        }
        
        /**
         * Sets ith "recordRelID" element
         */
        public void setRecordRelIDArray(int i, edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID recordRelID)
        {
            generatedSetterHelperImpl(recordRelID, RECORDRELID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRelID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID insertNewRecordRelID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID)get_store().insert_element_user(RECORDRELID$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordRelID" element
         */
        public edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID addNewRecordRelID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordRelIDDocument.RecordRelID)get_store().add_element_user(RECORDRELID$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordRelID" element
         */
        public void removeRecordRelID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDRELID$4, i);
            }
        }
        
        /**
         * Gets a List of "recordMetadataLoc" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc> getRecordMetadataLocList()
        {
            final class RecordMetadataLocList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc get(int i)
                    { return RecordInfoWrapImpl.this.getRecordMetadataLocArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc set(int i, edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc o)
                {
                    edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc old = RecordInfoWrapImpl.this.getRecordMetadataLocArray(i);
                    RecordInfoWrapImpl.this.setRecordMetadataLocArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc o)
                    { RecordInfoWrapImpl.this.insertNewRecordMetadataLoc(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc old = RecordInfoWrapImpl.this.getRecordMetadataLocArray(i);
                    RecordInfoWrapImpl.this.removeRecordMetadataLoc(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordMetadataLocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordMetadataLocList();
            }
        }
        
        /**
         * Gets array of all "recordMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[] getRecordMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc>();
                get_store().find_all_element_users(RECORDMETADATALOC$6, targetList);
                edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[] result = new edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc getRecordMetadataLocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc)get_store().find_element_user(RECORDMETADATALOC$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordMetadataLoc" element
         */
        public int sizeOfRecordMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDMETADATALOC$6);
            }
        }
        
        /**
         * Sets array of all "recordMetadataLoc" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordMetadataLocArray(edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc[] recordMetadataLocArray)
        {
            check_orphaned();
            arraySetterHelper(recordMetadataLocArray, RECORDMETADATALOC$6);
        }
        
        /**
         * Sets ith "recordMetadataLoc" element
         */
        public void setRecordMetadataLocArray(int i, edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc recordMetadataLoc)
        {
            generatedSetterHelperImpl(recordMetadataLoc, RECORDMETADATALOC$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc insertNewRecordMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc)get_store().insert_element_user(RECORDMETADATALOC$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc addNewRecordMetadataLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument.RecordMetadataLoc)get_store().add_element_user(RECORDMETADATALOC$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordMetadataLoc" element
         */
        public void removeRecordMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDMETADATALOC$6, i);
            }
        }
        
        /**
         * Gets a List of "recordMetadataDate" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate> getRecordMetadataDateList()
        {
            final class RecordMetadataDateList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate get(int i)
                    { return RecordInfoWrapImpl.this.getRecordMetadataDateArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate set(int i, edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate o)
                {
                    edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate old = RecordInfoWrapImpl.this.getRecordMetadataDateArray(i);
                    RecordInfoWrapImpl.this.setRecordMetadataDateArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate o)
                    { RecordInfoWrapImpl.this.insertNewRecordMetadataDate(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate old = RecordInfoWrapImpl.this.getRecordMetadataDateArray(i);
                    RecordInfoWrapImpl.this.removeRecordMetadataDate(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoWrapImpl.this.sizeOfRecordMetadataDateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordMetadataDateList();
            }
        }
        
        /**
         * Gets array of all "recordMetadataDate" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[] getRecordMetadataDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate>();
                get_store().find_all_element_users(RECORDMETADATADATE$8, targetList);
                edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[] result = new edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordMetadataDate" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate getRecordMetadataDateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate)get_store().find_element_user(RECORDMETADATADATE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordMetadataDate" element
         */
        public int sizeOfRecordMetadataDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDMETADATADATE$8);
            }
        }
        
        /**
         * Sets array of all "recordMetadataDate" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordMetadataDateArray(edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate[] recordMetadataDateArray)
        {
            check_orphaned();
            arraySetterHelper(recordMetadataDateArray, RECORDMETADATADATE$8);
        }
        
        /**
         * Sets ith "recordMetadataDate" element
         */
        public void setRecordMetadataDateArray(int i, edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate recordMetadataDate)
        {
            generatedSetterHelperImpl(recordMetadataDate, RECORDMETADATADATE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate insertNewRecordMetadataDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate)get_store().insert_element_user(RECORDMETADATADATE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
         */
        public edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate addNewRecordMetadataDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument.RecordMetadataDate)get_store().add_element_user(RECORDMETADATADATE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordMetadataDate" element
         */
        public void removeRecordMetadataDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDMETADATADATE$8, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
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
                return get_store().find_attribute_user(TYPE$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
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
                get_store().remove_attribute(TYPE$10);
            }
        }
    }
}
