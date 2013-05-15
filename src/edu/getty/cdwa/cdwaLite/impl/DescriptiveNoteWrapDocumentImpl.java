/*
 * An XML document type.
 * Localname: descriptiveNoteWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;
/**
 * A document containing one descriptiveNoteWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DescriptiveNoteWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveNoteWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVENOTEWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNoteWrap");
    
    
    /**
     * Gets the "descriptiveNoteWrap" element
     */
    public edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().find_element_user(DESCRIPTIVENOTEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveNoteWrap" element
     */
    public void setDescriptiveNoteWrap(edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap)
    {
        generatedSetterHelperImpl(descriptiveNoteWrap, DESCRIPTIVENOTEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveNoteWrap" element
     */
    public edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().add_element_user(DESCRIPTIVENOTEWRAP$0);
            return target;
        }
    }
    /**
     * An XML descriptiveNoteWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class DescriptiveNoteWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveNoteWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVENOTESET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNoteSet");
        
        
        /**
         * Gets a List of "descriptiveNoteSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet> getDescriptiveNoteSetList()
        {
            final class DescriptiveNoteSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet get(int i)
                    { return DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet set(int i, edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet o)
                {
                    edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet old = DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i);
                    DescriptiveNoteWrapImpl.this.setDescriptiveNoteSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet o)
                    { DescriptiveNoteWrapImpl.this.insertNewDescriptiveNoteSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet old = DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i);
                    DescriptiveNoteWrapImpl.this.removeDescriptiveNoteSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DescriptiveNoteWrapImpl.this.sizeOfDescriptiveNoteSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DescriptiveNoteSetList();
            }
        }
        
        /**
         * Gets array of all "descriptiveNoteSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[] getDescriptiveNoteSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet>();
                get_store().find_all_element_users(DESCRIPTIVENOTESET$0, targetList);
                edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[] result = new edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "descriptiveNoteSet" element
         */
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().find_element_user(DESCRIPTIVENOTESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "descriptiveNoteSet" element
         */
        public int sizeOfDescriptiveNoteSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTESET$0);
            }
        }
        
        /**
         * Sets array of all "descriptiveNoteSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDescriptiveNoteSetArray(edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet[] descriptiveNoteSetArray)
        {
            check_orphaned();
            arraySetterHelper(descriptiveNoteSetArray, DESCRIPTIVENOTESET$0);
        }
        
        /**
         * Sets ith "descriptiveNoteSet" element
         */
        public void setDescriptiveNoteSetArray(int i, edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet)
        {
            generatedSetterHelperImpl(descriptiveNoteSet, DESCRIPTIVENOTESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteSet" element
         */
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet insertNewDescriptiveNoteSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().insert_element_user(DESCRIPTIVENOTESET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "descriptiveNoteSet" element
         */
        public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().add_element_user(DESCRIPTIVENOTESET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "descriptiveNoteSet" element
         */
        public void removeDescriptiveNoteSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTESET$0, i);
            }
        }
    }
}
