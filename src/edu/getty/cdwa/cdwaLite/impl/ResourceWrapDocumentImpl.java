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
 * A document containing one resourceWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ResourceWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceWrap");
    
    
    /**
     * Gets the "resourceWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap getResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap)get_store().find_element_user(RESOURCEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceWrap" element
     */
    @Inject(optional=true) public void setResourceWrap(edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap resourceWrap)
    {
        generatedSetterHelperImpl(resourceWrap, RESOURCEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceWrap" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap addNewResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap)get_store().add_element_user(RESOURCEWRAP$0);
            return target;
        }
    }
    /**
     * An XML resourceWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class ResourceWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCESET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceSet");
        
        
        /**
         * Gets a List of "resourceSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet> getResourceSetList()
        {
            final class ResourceSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet get(int i)
                    { return ResourceWrapImpl.this.getResourceSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet set(int i, edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet old = ResourceWrapImpl.this.getResourceSetArray(i);
                    ResourceWrapImpl.this.setResourceSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet o)
                    { ResourceWrapImpl.this.insertNewResourceSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet old = ResourceWrapImpl.this.getResourceSetArray(i);
                    ResourceWrapImpl.this.removeResourceSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceWrapImpl.this.sizeOfResourceSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceSetList();
            }
        }
        
        /**
         * Gets array of all "resourceSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet[] getResourceSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet>();
                get_store().find_all_element_users(RESOURCESET$0, targetList);
                edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet[] result = new edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceSet" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet getResourceSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet)get_store().find_element_user(RESOURCESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceSet" element
         */
        public int sizeOfResourceSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCESET$0);
            }
        }
        
        /**
         * Sets array of all "resourceSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceSetArray(edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet[] resourceSetArray)
        {
            check_orphaned();
            arraySetterHelper(resourceSetArray, RESOURCESET$0);
        }
        
        /**
         * Sets ith "resourceSet" element
         */
        @Inject(optional=true) public void setResourceSetArray(int i, edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet resourceSet)
        {
            generatedSetterHelperImpl(resourceSet, RESOURCESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSet" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet insertNewResourceSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet)get_store().insert_element_user(RESOURCESET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSet" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet addNewResourceSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet)get_store().add_element_user(RESOURCESET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceSet" element
         */
        public void removeResourceSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCESET$0, i);
            }
        }
    }
}
