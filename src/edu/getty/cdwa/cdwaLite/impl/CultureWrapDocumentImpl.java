/*
 * An XML document type.
 * Localname: cultureWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.CultureWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one cultureWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class CultureWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CultureWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CultureWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CULTUREWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "cultureWrap");
    
    
    /**
     * Gets the "cultureWrap" element
     */
    public edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap getCultureWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap)get_store().find_element_user(CULTUREWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cultureWrap" element
     */
    public void setCultureWrap(edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap cultureWrap)
    {
        generatedSetterHelperImpl(cultureWrap, CULTUREWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cultureWrap" element
     */
    public edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap addNewCultureWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap)get_store().add_element_user(CULTUREWRAP$0);
            return target;
        }
    }
    /**
     * An XML cultureWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class CultureWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap
    {
        private static final long serialVersionUID = 1L;
        
        public CultureWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CULTURE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "culture");
        
        
        /**
         * Gets a List of "culture" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.CultureDocument.Culture> getCultureList()
        {
            final class CultureList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.CultureDocument.Culture>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.CultureDocument.Culture get(int i)
                    { return CultureWrapImpl.this.getCultureArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.CultureDocument.Culture set(int i, edu.getty.cdwa.cdwaLite.CultureDocument.Culture o)
                {
                    edu.getty.cdwa.cdwaLite.CultureDocument.Culture old = CultureWrapImpl.this.getCultureArray(i);
                    CultureWrapImpl.this.setCultureArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.CultureDocument.Culture o)
                    { CultureWrapImpl.this.insertNewCulture(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.CultureDocument.Culture remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.CultureDocument.Culture old = CultureWrapImpl.this.getCultureArray(i);
                    CultureWrapImpl.this.removeCulture(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return CultureWrapImpl.this.sizeOfCultureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CultureList();
            }
        }
        
        /**
         * Gets array of all "culture" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.CultureDocument.Culture[] getCultureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.CultureDocument.Culture> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.CultureDocument.Culture>();
                get_store().find_all_element_users(CULTURE$0, targetList);
                edu.getty.cdwa.cdwaLite.CultureDocument.Culture[] result = new edu.getty.cdwa.cdwaLite.CultureDocument.Culture[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "culture" element
         */
        public edu.getty.cdwa.cdwaLite.CultureDocument.Culture getCultureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CultureDocument.Culture target = null;
                target = (edu.getty.cdwa.cdwaLite.CultureDocument.Culture)get_store().find_element_user(CULTURE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "culture" element
         */
        public int sizeOfCultureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CULTURE$0);
            }
        }
        
        /**
         * Sets array of all "culture" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCultureArray(edu.getty.cdwa.cdwaLite.CultureDocument.Culture[] cultureArray)
        {
            check_orphaned();
            arraySetterHelper(cultureArray, CULTURE$0);
        }
        
        /**
         * Sets ith "culture" element
         */
        public void setCultureArray(int i, edu.getty.cdwa.cdwaLite.CultureDocument.Culture culture)
        {
            generatedSetterHelperImpl(culture, CULTURE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "culture" element
         */
        public edu.getty.cdwa.cdwaLite.CultureDocument.Culture insertNewCulture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CultureDocument.Culture target = null;
                target = (edu.getty.cdwa.cdwaLite.CultureDocument.Culture)get_store().insert_element_user(CULTURE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "culture" element
         */
        public edu.getty.cdwa.cdwaLite.CultureDocument.Culture addNewCulture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CultureDocument.Culture target = null;
                target = (edu.getty.cdwa.cdwaLite.CultureDocument.Culture)get_store().add_element_user(CULTURE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "culture" element
         */
        public void removeCulture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CULTURE$0, i);
            }
        }
    }
}
