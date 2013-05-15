/*
 * An XML document type.
 * Localname: objectWorkTypeWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one objectWorkTypeWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ObjectWorkTypeWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectWorkTypeWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "objectWorkTypeWrap");
    
    
    /**
     * Gets the "objectWorkTypeWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectWorkTypeWrap" element
     */
    @Inject(optional=true) public void setObjectWorkTypeWrap(edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
    {
        generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectWorkTypeWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectWorkTypeWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class ObjectWorkTypeWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectWorkTypeWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTWORKTYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "objectWorkType");
        
        
        /**
         * Gets a List of "objectWorkType" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType> getObjectWorkTypeList()
        {
            final class ObjectWorkTypeList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType get(int i)
                    { return ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType set(int i, edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType o)
                {
                    edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.setObjectWorkTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType o)
                    { ObjectWorkTypeWrapImpl.this.insertNewObjectWorkType(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.removeObjectWorkType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ObjectWorkTypeWrapImpl.this.sizeOfObjectWorkTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObjectWorkTypeList();
            }
        }
        
        /**
         * Gets array of all "objectWorkType" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType[] getObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType>();
                get_store().find_all_element_users(OBJECTWORKTYPE$0, targetList);
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType[] result = new edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "objectWorkType" element
         */
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType getObjectWorkTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType)get_store().find_element_user(OBJECTWORKTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "objectWorkType" element
         */
        public int sizeOfObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTWORKTYPE$0);
            }
        }
        
        /**
         * Sets array of all "objectWorkType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType[] objectWorkTypeArray)
        {
            check_orphaned();
            arraySetterHelper(objectWorkTypeArray, OBJECTWORKTYPE$0);
        }
        
        /**
         * Sets ith "objectWorkType" element
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(int i, edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType objectWorkType)
        {
            generatedSetterHelperImpl(objectWorkType, OBJECTWORKTYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectWorkType" element
         */
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType insertNewObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType)get_store().insert_element_user(OBJECTWORKTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectWorkType" element
         */
        public edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType addNewObjectWorkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType)get_store().add_element_user(OBJECTWORKTYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "objectWorkType" element
         */
        public void removeObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTWORKTYPE$0, i);
            }
        }
    }
}
