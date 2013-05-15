/*
 * An XML document type.
 * Localname: indexingMaterialsTechSet
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingMaterialsTechSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class IndexingMaterialsTechSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMaterialsTechSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "indexingMaterialsTechSet");
    
    
    /**
     * Gets the "indexingMaterialsTechSet" element
     */
    public edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
            target = (edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().find_element_user(INDEXINGMATERIALSTECHSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMaterialsTechSet" element
     */
    @Inject(optional=true) public void setIndexingMaterialsTechSet(edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet)
    {
        generatedSetterHelperImpl(indexingMaterialsTechSet, INDEXINGMATERIALSTECHSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechSet" element
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
     * An XML indexingMaterialsTechSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class IndexingMaterialsTechSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMaterialsTechSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERMMATERIALSTECH$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "termMaterialsTech");
        private static final javax.xml.namespace.QName EXTENTMATERIALSTECH$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "extentMaterialsTech");
        private static final javax.xml.namespace.QName SOURCEMATERIALSTECH$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceMaterialsTech");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "type");
        
        
        /**
         * Gets a List of "termMaterialsTech" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech> getTermMaterialsTechList()
        {
            final class TermMaterialsTechList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech set(int i, edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech o)
                {
                    edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech old = IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setTermMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech o)
                    { IndexingMaterialsTechSetImpl.this.insertNewTermMaterialsTech(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech old = IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeTermMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfTermMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TermMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "termMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[] getTermMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech>();
                get_store().find_all_element_users(TERMMATERIALSTECH$0, targetList);
                edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[] result = new edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "termMaterialsTech" element
         */
        public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech getTermMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech)get_store().find_element_user(TERMMATERIALSTECH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "termMaterialsTech" element
         */
        public int sizeOfTermMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERMMATERIALSTECH$0);
            }
        }
        
        /**
         * Sets array of all "termMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setTermMaterialsTechArray(edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech[] termMaterialsTechArray)
        {
            check_orphaned();
            arraySetterHelper(termMaterialsTechArray, TERMMATERIALSTECH$0);
        }
        
        /**
         * Sets ith "termMaterialsTech" element
         */
        @Inject(optional=true) public void setTermMaterialsTechArray(int i, edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech termMaterialsTech)
        {
            generatedSetterHelperImpl(termMaterialsTech, TERMMATERIALSTECH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
         */
        public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech insertNewTermMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech)get_store().insert_element_user(TERMMATERIALSTECH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
         */
        public edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech addNewTermMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument.TermMaterialsTech)get_store().add_element_user(TERMMATERIALSTECH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "termMaterialsTech" element
         */
        public void removeTermMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERMMATERIALSTECH$0, i);
            }
        }
        
        /**
         * Gets a List of "extentMaterialsTech" elements
         */
        public java.util.List<java.lang.String> getExtentMaterialsTechList()
        {
            final class ExtentMaterialsTechList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setExtentMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMaterialsTechSetImpl.this.insertExtentMaterialsTech(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeExtentMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfExtentMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getExtentMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTMATERIALSTECH$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "extentMaterialsTech" element
         */
        public java.lang.String getExtentMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "extentMaterialsTech" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetExtentMaterialsTechList()
        {
            final class ExtentMaterialsTechList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMaterialsTechSetImpl.this.xgetExtentMaterialsTechArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMaterialsTechSetImpl.this.xgetExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.xsetExtentMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMaterialsTechSetImpl.this.insertNewExtentMaterialsTech(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMaterialsTechSetImpl.this.xgetExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeExtentMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfExtentMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetExtentMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(EXTENTMATERIALSTECH$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "extentMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString xgetExtentMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentMaterialsTech" element
         */
        public int sizeOfExtentMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTMATERIALSTECH$2);
            }
        }
        
        /**
         * Sets array of all "extentMaterialsTech" element
         */
        @Inject(optional=true) public void setExtentMaterialsTechArray(java.lang.String[] extentMaterialsTechArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentMaterialsTechArray, EXTENTMATERIALSTECH$2);
            }
        }
        
        /**
         * Sets ith "extentMaterialsTech" element
         */
        @Inject(optional=true) public void setExtentMaterialsTechArray(int i, java.lang.String extentMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(extentMaterialsTech);
            }
        }
        
        /**
         * Sets (as xml) array of all "extentMaterialsTech" element
         */
        public void xsetExtentMaterialsTechArray(org.apache.xmlbeans.XmlString[]extentMaterialsTechArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(extentMaterialsTechArray, EXTENTMATERIALSTECH$2);
            }
        }
        
        /**
         * Sets (as xml) ith "extentMaterialsTech" element
         */
        public void xsetExtentMaterialsTechArray(int i, org.apache.xmlbeans.XmlString extentMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(extentMaterialsTech);
            }
        }
        
        /**
         * Inserts the value as the ith "extentMaterialsTech" element
         */
        public void insertExtentMaterialsTech(int i, java.lang.String extentMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXTENTMATERIALSTECH$2, i);
                target.setStringValue(extentMaterialsTech);
            }
        }
        
        /**
         * Appends the value as the last "extentMaterialsTech" element
         */
        public void addExtentMaterialsTech(java.lang.String extentMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENTMATERIALSTECH$2);
                target.setStringValue(extentMaterialsTech);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString insertNewExtentMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXTENTMATERIALSTECH$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString addNewExtentMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENTMATERIALSTECH$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentMaterialsTech" element
         */
        public void removeExtentMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTMATERIALSTECH$2, i);
            }
        }
        
        /**
         * Gets a List of "sourceMaterialsTech" elements
         */
        public java.util.List<java.lang.String> getSourceMaterialsTechList()
        {
            final class SourceMaterialsTechList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setSourceMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMaterialsTechSetImpl.this.insertSourceMaterialsTech(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeSourceMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfSourceMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSourceMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCEMATERIALSTECH$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceMaterialsTech" element
         */
        public java.lang.String getSourceMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "sourceMaterialsTech" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSourceMaterialsTechList()
        {
            final class SourceMaterialsTechList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMaterialsTechSetImpl.this.xgetSourceMaterialsTechArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMaterialsTechSetImpl.this.xgetSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.xsetSourceMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMaterialsTechSetImpl.this.insertNewSourceMaterialsTech(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMaterialsTechSetImpl.this.xgetSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeSourceMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfSourceMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetSourceMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCEMATERIALSTECH$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceMaterialsTech" element
         */
        public int sizeOfSourceMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEMATERIALSTECH$4);
            }
        }
        
        /**
         * Sets array of all "sourceMaterialsTech" element
         */
        @Inject(optional=true) public void setSourceMaterialsTechArray(java.lang.String[] sourceMaterialsTechArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceMaterialsTechArray, SOURCEMATERIALSTECH$4);
            }
        }
        
        /**
         * Sets ith "sourceMaterialsTech" element
         */
        @Inject(optional=true) public void setSourceMaterialsTechArray(int i, java.lang.String sourceMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceMaterialsTech);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceMaterialsTech" element
         */
        public void xsetSourceMaterialsTechArray(org.apache.xmlbeans.XmlString[]sourceMaterialsTechArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceMaterialsTechArray, SOURCEMATERIALSTECH$4);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceMaterialsTech" element
         */
        public void xsetSourceMaterialsTechArray(int i, org.apache.xmlbeans.XmlString sourceMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceMaterialsTech);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceMaterialsTech" element
         */
        public void insertSourceMaterialsTech(int i, java.lang.String sourceMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCEMATERIALSTECH$4, i);
                target.setStringValue(sourceMaterialsTech);
            }
        }
        
        /**
         * Appends the value as the last "sourceMaterialsTech" element
         */
        public void addSourceMaterialsTech(java.lang.String sourceMaterialsTech)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEMATERIALSTECH$4);
                target.setStringValue(sourceMaterialsTech);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCEMATERIALSTECH$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEMATERIALSTECH$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceMaterialsTech" element
         */
        public void removeSourceMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEMATERIALSTECH$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                get_store().remove_attribute(TYPE$6);
            }
        }
    }
}
