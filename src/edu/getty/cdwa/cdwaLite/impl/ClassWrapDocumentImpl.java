/*
 * An XML document type.
 * Localname: classWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ClassWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one classWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ClassWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ClassWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClassWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "classWrap");
    
    
    /**
     * Gets the "classWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap getClassWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap)get_store().find_element_user(CLASSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "classWrap" element
     */
    public void setClassWrap(edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap classWrap)
    {
        generatedSetterHelperImpl(classWrap, CLASSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "classWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap addNewClassWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap)get_store().add_element_user(CLASSWRAP$0);
            return target;
        }
    }
    /**
     * An XML classWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class ClassWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ClassWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "classification");
        
        
        /**
         * Gets a List of "classification" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification> getClassificationList()
        {
            final class ClassificationList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification get(int i)
                    { return ClassWrapImpl.this.getClassificationArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification set(int i, edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification o)
                {
                    edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification old = ClassWrapImpl.this.getClassificationArray(i);
                    ClassWrapImpl.this.setClassificationArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification o)
                    { ClassWrapImpl.this.insertNewClassification(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification old = ClassWrapImpl.this.getClassificationArray(i);
                    ClassWrapImpl.this.removeClassification(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ClassWrapImpl.this.sizeOfClassificationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ClassificationList();
            }
        }
        
        /**
         * Gets array of all "classification" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification>();
                get_store().find_all_element_users(CLASSIFICATION$0, targetList);
                edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification[] result = new edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "classification" element
         */
        public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification target = null;
                target = (edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification)get_store().find_element_user(CLASSIFICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$0);
            }
        }
        
        /**
         * Sets array of all "classification" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClassificationArray(edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$0);
        }
        
        /**
         * Sets ith "classification" element
         */
        public void setClassificationArray(int i, edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "classification" element
         */
        public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification target = null;
                target = (edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification)get_store().insert_element_user(CLASSIFICATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "classification" element
         */
        public edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification target = null;
                target = (edu.getty.cdwa.cdwaLite.ClassificationDocument.Classification)get_store().add_element_user(CLASSIFICATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$0, i);
            }
        }
    }
}
