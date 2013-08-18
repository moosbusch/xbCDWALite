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
 * A document containing one locationSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LocationSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocationSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locationSet");
    
    
    /**
     * Gets the "locationSet" element
     */
    public edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet getLocationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet target = null;
            target = (edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet)get_store().find_element_user(LOCATIONSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locationSet" element
     */
    @Inject(optional=true) public void setLocationSet(edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet locationSet)
    {
        generatedSetterHelperImpl(locationSet, LOCATIONSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locationSet" element
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
     * An XML locationSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class LocationSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LocationSetDocument.LocationSet
    {
        private static final long serialVersionUID = 1L;
        
        public LocationSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATIONNAME$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locationName");
        private static final javax.xml.namespace.QName WORKID$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "workID");
        
        
        /**
         * Gets the "locationName" element
         */
        public edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName getLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName)get_store().find_element_user(LOCATIONNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "locationName" element
         */
        @Inject(optional=true) public void setLocationName(edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName locationName)
        {
            generatedSetterHelperImpl(locationName, LOCATIONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "locationName" element
         */
        public edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName addNewLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName target = null;
                target = (edu.getty.cdwa.cdwaLite.LocationNameDocument.LocationName)get_store().add_element_user(LOCATIONNAME$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "workID" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID> getWorkIDList()
        {
            final class WorkIDList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID get(int i)
                    { return LocationSetImpl.this.getWorkIDArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID set(int i, edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID o)
                {
                    edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID old = LocationSetImpl.this.getWorkIDArray(i);
                    LocationSetImpl.this.setWorkIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID o)
                    { LocationSetImpl.this.insertNewWorkID(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID old = LocationSetImpl.this.getWorkIDArray(i);
                    LocationSetImpl.this.removeWorkID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LocationSetImpl.this.sizeOfWorkIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new WorkIDList();
            }
        }
        
        /**
         * Gets array of all "workID" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID[] getWorkIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID>();
                get_store().find_all_element_users(WORKID$2, targetList);
                edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID[] result = new edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "workID" element
         */
        public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID getWorkIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID target = null;
                target = (edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID)get_store().find_element_user(WORKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "workID" element
         */
        public int sizeOfWorkIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKID$2);
            }
        }
        
        /**
         * Sets array of all "workID" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setWorkIDArray(edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID[] workIDArray)
        {
            check_orphaned();
            arraySetterHelper(workIDArray, WORKID$2);
        }
        
        /**
         * Sets ith "workID" element
         */
        @Inject(optional=true) public void setWorkIDArray(int i, edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID workID)
        {
            generatedSetterHelperImpl(workID, WORKID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "workID" element
         */
        public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID insertNewWorkID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID target = null;
                target = (edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID)get_store().insert_element_user(WORKID$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "workID" element
         */
        public edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID addNewWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID target = null;
                target = (edu.getty.cdwa.cdwaLite.WorkIDDocument.WorkID)get_store().add_element_user(WORKID$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "workID" element
         */
        public void removeWorkID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKID$2, i);
            }
        }
    }
}
