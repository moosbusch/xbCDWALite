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
 * A document containing one indexingMaterialsTechWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingMaterialsTechWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMaterialsTechWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMaterialsTechWrap");
    
    
    /**
     * Gets the "indexingMaterialsTechWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().find_element_user(INDEXINGMATERIALSTECHWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMaterialsTechWrap" element
     */
    @Inject(optional=true) public void setIndexingMaterialsTechWrap(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap)
    {
        generatedSetterHelperImpl(indexingMaterialsTechWrap, INDEXINGMATERIALSTECHWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().add_element_user(INDEXINGMATERIALSTECHWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingMaterialsTechWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingMaterialsTechWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMaterialsTechWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMaterialsTechSet");
        
        
        /**
         * Gets a List of "indexingMaterialsTechSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet> getIndexingMaterialsTechSetList()
        {
            final class IndexingMaterialsTechSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet get(int i)
                    { return IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet set(int i, edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet o)
                {
                    edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet old = IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i);
                    IndexingMaterialsTechWrapImpl.this.setIndexingMaterialsTechSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet o)
                    { IndexingMaterialsTechWrapImpl.this.insertNewIndexingMaterialsTechSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet old = IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i);
                    IndexingMaterialsTechWrapImpl.this.removeIndexingMaterialsTechSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechWrapImpl.this.sizeOfIndexingMaterialsTechSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingMaterialsTechSetList();
            }
        }
        
        /**
         * Gets array of all "indexingMaterialsTechSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] getIndexingMaterialsTechSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet>();
                get_store().find_all_element_users(INDEXINGMATERIALSTECHSET$0, targetList);
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] result = new edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingMaterialsTechSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().find_element_user(INDEXINGMATERIALSTECHSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingMaterialsTechSet" element
         */
        public int sizeOfIndexingMaterialsTechSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMATERIALSTECHSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingMaterialsTechSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingMaterialsTechSetArray(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] indexingMaterialsTechSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingMaterialsTechSetArray, INDEXINGMATERIALSTECHSET$0);
        }
        
        /**
         * Sets ith "indexingMaterialsTechSet" element
         */
        @Inject(optional=true) public void setIndexingMaterialsTechSetArray(int i, edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet)
        {
            generatedSetterHelperImpl(indexingMaterialsTechSet, INDEXINGMATERIALSTECHSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingMaterialsTechSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet insertNewIndexingMaterialsTechSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().insert_element_user(INDEXINGMATERIALSTECHSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingMaterialsTechSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet addNewIndexingMaterialsTechSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().add_element_user(INDEXINGMATERIALSTECHSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingMaterialsTechSet" element
         */
        public void removeIndexingMaterialsTechSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMATERIALSTECHSET$0, i);
            }
        }
    }
}
