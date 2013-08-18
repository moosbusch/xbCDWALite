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
 * A document containing one indexingDatesWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingDatesWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingDatesWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGDATESWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingDatesWrap");
    
    
    /**
     * Gets the "indexingDatesWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap getIndexingDatesWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap)get_store().find_element_user(INDEXINGDATESWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingDatesWrap" element
     */
    @Inject(optional=true) public void setIndexingDatesWrap(edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap indexingDatesWrap)
    {
        generatedSetterHelperImpl(indexingDatesWrap, INDEXINGDATESWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingDatesWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap addNewIndexingDatesWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap)get_store().add_element_user(INDEXINGDATESWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingDatesWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingDatesWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingDatesWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGDATESSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingDatesSet");
        
        
        /**
         * Gets a List of "indexingDatesSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet> getIndexingDatesSetList()
        {
            final class IndexingDatesSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet get(int i)
                    { return IndexingDatesWrapImpl.this.getIndexingDatesSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet set(int i, edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet o)
                {
                    edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet old = IndexingDatesWrapImpl.this.getIndexingDatesSetArray(i);
                    IndexingDatesWrapImpl.this.setIndexingDatesSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet o)
                    { IndexingDatesWrapImpl.this.insertNewIndexingDatesSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet old = IndexingDatesWrapImpl.this.getIndexingDatesSetArray(i);
                    IndexingDatesWrapImpl.this.removeIndexingDatesSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingDatesWrapImpl.this.sizeOfIndexingDatesSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingDatesSetList();
            }
        }
        
        /**
         * Gets array of all "indexingDatesSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet[] getIndexingDatesSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet>();
                get_store().find_all_element_users(INDEXINGDATESSET$0, targetList);
                edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet[] result = new edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingDatesSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet getIndexingDatesSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet)get_store().find_element_user(INDEXINGDATESSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingDatesSet" element
         */
        public int sizeOfIndexingDatesSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGDATESSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingDatesSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingDatesSetArray(edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet[] indexingDatesSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingDatesSetArray, INDEXINGDATESSET$0);
        }
        
        /**
         * Sets ith "indexingDatesSet" element
         */
        @Inject(optional=true) public void setIndexingDatesSetArray(int i, edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet indexingDatesSet)
        {
            generatedSetterHelperImpl(indexingDatesSet, INDEXINGDATESSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingDatesSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet insertNewIndexingDatesSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet)get_store().insert_element_user(INDEXINGDATESSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingDatesSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet addNewIndexingDatesSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet)get_store().add_element_user(INDEXINGDATESSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingDatesSet" element
         */
        public void removeIndexingDatesSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGDATESSET$0, i);
            }
        }
    }
}
