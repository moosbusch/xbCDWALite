/*
 * An XML document type.
 * Localname: locationWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.LocationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one locationWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LocationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locationWrap");
    
    
    /**
     * Gets the "locationWrap" element
     */
    public edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap getLocationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap)get_store().find_element_user(LOCATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locationWrap" element
     */
    @Inject(optional=true) public void setLocationWrap(edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap locationWrap)
    {
        generatedSetterHelperImpl(locationWrap, LOCATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationWrap" element
     */
    public edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap addNewLocationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap)get_store().add_element_user(LOCATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML locationWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class LocationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public LocationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONSET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locationSet");
        
        
        /**
         * Gets a List of "locationSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet> getLocationSetList()
        {
            final class LocationSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet get(int i)
                    { return LocationWrapImpl.this.getLocationSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet set(int i, edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet o)
                {
                    edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet old = LocationWrapImpl.this.getLocationSetArray(i);
                    LocationWrapImpl.this.setLocationSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet o)
                    { LocationWrapImpl.this.insertNewLocationSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet old = LocationWrapImpl.this.getLocationSetArray(i);
                    LocationWrapImpl.this.removeLocationSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LocationWrapImpl.this.sizeOfLocationSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LocationSetList();
            }
        }
        
        /**
         * Gets array of all "locationSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet[] getLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet>();
                get_store().find_all_element_users(LOCATIONSET$0, targetList);
                edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet[] result = new edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "locationSet" element
         */
        public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet getLocationSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet)get_store().find_element_user(LOCATIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "locationSet" element
         */
        public int sizeOfLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCATIONSET$0);
            }
        }
        
        /**
         * Sets array of all "locationSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLocationSetArray(edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet[] locationSetArray)
        {
            check_orphaned();
            arraySetterHelper(locationSetArray, LOCATIONSET$0);
        }
        
        /**
         * Sets ith "locationSet" element
         */
        @Inject(optional=true) public void setLocationSetArray(int i, edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet locationSet)
        {
            generatedSetterHelperImpl(locationSet, LOCATIONSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "locationSet" element
         */
        public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet insertNewLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet)get_store().insert_element_user(LOCATIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "locationSet" element
         */
        public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet addNewLocationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet)get_store().add_element_user(LOCATIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "locationSet" element
         */
        public void removeLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCATIONSET$0, i);
            }
        }
    }
}
