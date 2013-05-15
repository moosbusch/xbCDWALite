/*
 * An XML document type.
 * Localname: indexingDatesSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingDatesSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingDatesSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingDatesSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGDATESSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingDatesSet");
    
    
    /**
     * Gets the "indexingDatesSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet getIndexingDatesSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet)get_store().find_element_user(INDEXINGDATESSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingDatesSet" element
     */
    @Inject(optional=true) public void setIndexingDatesSet(edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet indexingDatesSet)
    {
        generatedSetterHelperImpl(indexingDatesSet, INDEXINGDATESSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingDatesSet" element
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
     * An XML indexingDatesSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingDatesSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument.IndexingDatesSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingDatesSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATEQUALIFIER$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "dateQualifier");
        private static final javax.xml.namespace.QName EARLIESTDATE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "earliestDate");
        private static final javax.xml.namespace.QName LATESTDATE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "latestDate");
        
        
        /**
         * Gets a List of "dateQualifier" elements
         */
        public java.util.List<java.lang.String> getDateQualifierList()
        {
            final class DateQualifierList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingDatesSetImpl.this.getDateQualifierArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingDatesSetImpl.this.getDateQualifierArray(i);
                    IndexingDatesSetImpl.this.setDateQualifierArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingDatesSetImpl.this.insertDateQualifier(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingDatesSetImpl.this.getDateQualifierArray(i);
                    IndexingDatesSetImpl.this.removeDateQualifier(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingDatesSetImpl.this.sizeOfDateQualifierArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DateQualifierList();
            }
        }
        
        /**
         * Gets array of all "dateQualifier" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getDateQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DATEQUALIFIER$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "dateQualifier" element
         */
        public java.lang.String getDateQualifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEQUALIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "dateQualifier" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetDateQualifierList()
        {
            final class DateQualifierList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingDatesSetImpl.this.xgetDateQualifierArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingDatesSetImpl.this.xgetDateQualifierArray(i);
                    IndexingDatesSetImpl.this.xsetDateQualifierArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingDatesSetImpl.this.insertNewDateQualifier(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingDatesSetImpl.this.xgetDateQualifierArray(i);
                    IndexingDatesSetImpl.this.removeDateQualifier(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingDatesSetImpl.this.sizeOfDateQualifierArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DateQualifierList();
            }
        }
        
        /**
         * Gets array of all "dateQualifier" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetDateQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DATEQUALIFIER$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "dateQualifier" element
         */
        public org.apache.xmlbeans.XmlString xgetDateQualifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEQUALIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dateQualifier" element
         */
        public int sizeOfDateQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATEQUALIFIER$0);
            }
        }
        
        /**
         * Sets array of all "dateQualifier" element
         */
        @Inject(optional=true) public void setDateQualifierArray(java.lang.String[] dateQualifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dateQualifierArray, DATEQUALIFIER$0);
            }
        }
        
        /**
         * Sets ith "dateQualifier" element
         */
        @Inject(optional=true) public void setDateQualifierArray(int i, java.lang.String dateQualifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEQUALIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(dateQualifier);
            }
        }
        
        /**
         * Sets (as xml) array of all "dateQualifier" element
         */
        public void xsetDateQualifierArray(org.apache.xmlbeans.XmlString[]dateQualifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dateQualifierArray, DATEQUALIFIER$0);
            }
        }
        
        /**
         * Sets (as xml) ith "dateQualifier" element
         */
        public void xsetDateQualifierArray(int i, org.apache.xmlbeans.XmlString dateQualifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATEQUALIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dateQualifier);
            }
        }
        
        /**
         * Inserts the value as the ith "dateQualifier" element
         */
        public void insertDateQualifier(int i, java.lang.String dateQualifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATEQUALIFIER$0, i);
                target.setStringValue(dateQualifier);
            }
        }
        
        /**
         * Appends the value as the last "dateQualifier" element
         */
        public void addDateQualifier(java.lang.String dateQualifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEQUALIFIER$0);
                target.setStringValue(dateQualifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dateQualifier" element
         */
        public org.apache.xmlbeans.XmlString insertNewDateQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DATEQUALIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dateQualifier" element
         */
        public org.apache.xmlbeans.XmlString addNewDateQualifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATEQUALIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dateQualifier" element
         */
        public void removeDateQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATEQUALIFIER$0, i);
            }
        }
        
        /**
         * Gets the "earliestDate" element
         */
        public edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate getEarliestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate target = null;
                target = (edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate)get_store().find_element_user(EARLIESTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "earliestDate" element
         */
        @Inject(optional=true) public void setEarliestDate(edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate earliestDate)
        {
            generatedSetterHelperImpl(earliestDate, EARLIESTDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "earliestDate" element
         */
        public edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate addNewEarliestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate target = null;
                target = (edu.getty.cdwa.cdwaLite.EarliestDateDocument.EarliestDate)get_store().add_element_user(EARLIESTDATE$2);
                return target;
            }
        }
        
        /**
         * Gets the "latestDate" element
         */
        public edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate getLatestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate target = null;
                target = (edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate)get_store().find_element_user(LATESTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "latestDate" element
         */
        @Inject(optional=true) public void setLatestDate(edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate latestDate)
        {
            generatedSetterHelperImpl(latestDate, LATESTDATE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "latestDate" element
         */
        public edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate addNewLatestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate target = null;
                target = (edu.getty.cdwa.cdwaLite.LatestDateDocument.LatestDate)get_store().add_element_user(LATESTDATE$4);
                return target;
            }
        }
    }
}
