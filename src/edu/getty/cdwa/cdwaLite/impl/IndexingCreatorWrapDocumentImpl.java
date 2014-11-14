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
 * A document containing one indexingCreatorWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingCreatorWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingCreatorWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGCREATORWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingCreatorWrap");
    
    
    /**
     * Gets the "indexingCreatorWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap getIndexingCreatorWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap)get_store().find_element_user(INDEXINGCREATORWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingCreatorWrap" element
     */
    public void setIndexingCreatorWrap(edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap indexingCreatorWrap)
    {
        generatedSetterHelperImpl(indexingCreatorWrap, INDEXINGCREATORWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingCreatorWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap addNewIndexingCreatorWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap)get_store().add_element_user(INDEXINGCREATORWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingCreatorWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingCreatorWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingCreatorWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGCREATORSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingCreatorSet");
        
        
        /**
         * Gets a List of "indexingCreatorSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet> getIndexingCreatorSetList()
        {
            final class IndexingCreatorSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet get(int i)
                    { return IndexingCreatorWrapImpl.this.getIndexingCreatorSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet set(int i, edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet o)
                {
                    edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet old = IndexingCreatorWrapImpl.this.getIndexingCreatorSetArray(i);
                    IndexingCreatorWrapImpl.this.setIndexingCreatorSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet o)
                    { IndexingCreatorWrapImpl.this.insertNewIndexingCreatorSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet old = IndexingCreatorWrapImpl.this.getIndexingCreatorSetArray(i);
                    IndexingCreatorWrapImpl.this.removeIndexingCreatorSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingCreatorWrapImpl.this.sizeOfIndexingCreatorSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingCreatorSetList();
            }
        }
        
        /**
         * Gets array of all "indexingCreatorSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet[] getIndexingCreatorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet>();
                get_store().find_all_element_users(INDEXINGCREATORSET$0, targetList);
                edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet[] result = new edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingCreatorSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet getIndexingCreatorSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet)get_store().find_element_user(INDEXINGCREATORSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingCreatorSet" element
         */
        public int sizeOfIndexingCreatorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGCREATORSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingCreatorSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIndexingCreatorSetArray(edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet[] indexingCreatorSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingCreatorSetArray, INDEXINGCREATORSET$0);
        }
        
        /**
         * Sets ith "indexingCreatorSet" element
         */
        public void setIndexingCreatorSetArray(int i, edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet indexingCreatorSet)
        {
            generatedSetterHelperImpl(indexingCreatorSet, INDEXINGCREATORSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingCreatorSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet insertNewIndexingCreatorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument.IndexingCreatorSet)get_store().insert_element_user(INDEXINGCREATORSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingCreatorSet" element
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
         * Removes the ith "indexingCreatorSet" element
         */
        public void removeIndexingCreatorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGCREATORSET$0, i);
            }
        }
    }
}
