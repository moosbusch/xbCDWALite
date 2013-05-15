/*
 * An XML document type.
 * Localname: indexingSubjectWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingSubjectWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingSubjectWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingSubjectWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGSUBJECTWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingSubjectWrap");
    
    
    /**
     * Gets the "indexingSubjectWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap getIndexingSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().find_element_user(INDEXINGSUBJECTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingSubjectWrap" element
     */
    @Inject(optional=true) public void setIndexingSubjectWrap(edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap indexingSubjectWrap)
    {
        generatedSetterHelperImpl(indexingSubjectWrap, INDEXINGSUBJECTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingSubjectWrap" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap addNewIndexingSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().add_element_user(INDEXINGSUBJECTWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingSubjectWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingSubjectWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingSubjectWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGSUBJECTSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingSubjectSet");
        
        
        /**
         * Gets a List of "indexingSubjectSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet> getIndexingSubjectSetList()
        {
            final class IndexingSubjectSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet get(int i)
                    { return IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet set(int i, edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet o)
                {
                    edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet old = IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i);
                    IndexingSubjectWrapImpl.this.setIndexingSubjectSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet o)
                    { IndexingSubjectWrapImpl.this.insertNewIndexingSubjectSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet old = IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i);
                    IndexingSubjectWrapImpl.this.removeIndexingSubjectSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingSubjectWrapImpl.this.sizeOfIndexingSubjectSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingSubjectSetList();
            }
        }
        
        /**
         * Gets array of all "indexingSubjectSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet[] getIndexingSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet>();
                get_store().find_all_element_users(INDEXINGSUBJECTSET$0, targetList);
                edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet[] result = new edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingSubjectSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet getIndexingSubjectSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().find_element_user(INDEXINGSUBJECTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingSubjectSet" element
         */
        public int sizeOfIndexingSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGSUBJECTSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingSubjectSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingSubjectSetArray(edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet[] indexingSubjectSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingSubjectSetArray, INDEXINGSUBJECTSET$0);
        }
        
        /**
         * Sets ith "indexingSubjectSet" element
         */
        @Inject(optional=true) public void setIndexingSubjectSetArray(int i, edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet indexingSubjectSet)
        {
            generatedSetterHelperImpl(indexingSubjectSet, INDEXINGSUBJECTSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingSubjectSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet insertNewIndexingSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().insert_element_user(INDEXINGSUBJECTSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingSubjectSet" element
         */
        public edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet addNewIndexingSubjectSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().add_element_user(INDEXINGSUBJECTSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingSubjectSet" element
         */
        public void removeIndexingSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGSUBJECTSET$0, i);
            }
        }
    }
}
