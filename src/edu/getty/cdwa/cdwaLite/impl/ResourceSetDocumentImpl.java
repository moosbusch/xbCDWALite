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
 * A document containing one resourceSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class ResourceSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceSet");
    
    
    /**
     * Gets the "resourceSet" element
     */
    public edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet getResourceSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet target = null;
            target = (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet)get_store().find_element_user(RESOURCESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceSet" element
     */
    @Inject(optional=true) public void setResourceSet(edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet resourceSet)
    {
        generatedSetterHelperImpl(resourceSet, RESOURCESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceSet" element
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
     * An XML resourceSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class ResourceSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKRESOURCE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkResource");
        private static final javax.xml.namespace.QName RESOURCEID$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceID");
        private static final javax.xml.namespace.QName RESOURCERELTYPE$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceRelType");
        private static final javax.xml.namespace.QName RESOURCETYPE$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceType");
        private static final javax.xml.namespace.QName RIGHTSRESOURCE$8 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "rightsResource");
        private static final javax.xml.namespace.QName RESOURCEVIEWDESCRIPTION$10 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceViewDescription");
        private static final javax.xml.namespace.QName RESOURCEVIEWTYPE$12 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceViewType");
        private static final javax.xml.namespace.QName RESOURCEVIEWSUBJECTTERM$14 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceViewSubjectTerm");
        private static final javax.xml.namespace.QName RESOURCEVIEWDATE$16 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceViewDate");
        private static final javax.xml.namespace.QName RESOURCESOURCE$18 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceSource");
        private static final javax.xml.namespace.QName LINKRELATEDRESOURCE$20 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkRelatedResource");
        private static final javax.xml.namespace.QName RESOURCEMETADATALOC$22 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "resourceMetadataLoc");
        
        
        /**
         * Gets the "linkResource" element
         */
        public edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource getLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource)get_store().find_element_user(LINKRESOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "linkResource" element
         */
        public boolean isSetLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRESOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "linkResource" element
         */
        @Inject(optional=true) public void setLinkResource(edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource linkResource)
        {
            generatedSetterHelperImpl(linkResource, LINKRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        public edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource addNewLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource)get_store().add_element_user(LINKRESOURCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "linkResource" element
         */
        public void unsetLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRESOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "resourceID" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID getResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID)get_store().find_element_user(RESOURCEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceID" element
         */
        public boolean isSetResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEID$2) != 0;
            }
        }
        
        /**
         * Sets the "resourceID" element
         */
        @Inject(optional=true) public void setResourceID(edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID resourceID)
        {
            generatedSetterHelperImpl(resourceID, RESOURCEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceID" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID addNewResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID)get_store().add_element_user(RESOURCEID$2);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceID" element
         */
        public void unsetResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEID$2, 0);
            }
        }
        
        /**
         * Gets a List of "resourceRelType" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType> getResourceRelTypeList()
        {
            final class ResourceRelTypeList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType get(int i)
                    { return ResourceSetImpl.this.getResourceRelTypeArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType set(int i, edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType old = ResourceSetImpl.this.getResourceRelTypeArray(i);
                    ResourceSetImpl.this.setResourceRelTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType o)
                    { ResourceSetImpl.this.insertNewResourceRelType(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType old = ResourceSetImpl.this.getResourceRelTypeArray(i);
                    ResourceSetImpl.this.removeResourceRelType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceRelTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceRelTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceRelType" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[] getResourceRelTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType>();
                get_store().find_all_element_users(RESOURCERELTYPE$4, targetList);
                edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[] result = new edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceRelType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType getResourceRelTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType)get_store().find_element_user(RESOURCERELTYPE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceRelType" element
         */
        public int sizeOfResourceRelTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCERELTYPE$4);
            }
        }
        
        /**
         * Sets array of all "resourceRelType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceRelTypeArray(edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[] resourceRelTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceRelTypeArray, RESOURCERELTYPE$4);
        }
        
        /**
         * Sets ith "resourceRelType" element
         */
        @Inject(optional=true) public void setResourceRelTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType resourceRelType)
        {
            generatedSetterHelperImpl(resourceRelType, RESOURCERELTYPE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType insertNewResourceRelType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType)get_store().insert_element_user(RESOURCERELTYPE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType addNewResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType)get_store().add_element_user(RESOURCERELTYPE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceRelType" element
         */
        public void removeResourceRelType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCERELTYPE$4, i);
            }
        }
        
        /**
         * Gets a List of "resourceType" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType> getResourceTypeList()
        {
            final class ResourceTypeList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType get(int i)
                    { return ResourceSetImpl.this.getResourceTypeArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType set(int i, edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType old = ResourceSetImpl.this.getResourceTypeArray(i);
                    ResourceSetImpl.this.setResourceTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType o)
                    { ResourceSetImpl.this.insertNewResourceType(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType old = ResourceSetImpl.this.getResourceTypeArray(i);
                    ResourceSetImpl.this.removeResourceType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceType" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[] getResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType>();
                get_store().find_all_element_users(RESOURCETYPE$6, targetList);
                edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[] result = new edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType getResourceTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceType" element
         */
        public int sizeOfResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCETYPE$6);
            }
        }
        
        /**
         * Sets array of all "resourceType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceTypeArray(edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[] resourceTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceTypeArray, RESOURCETYPE$6);
        }
        
        /**
         * Sets ith "resourceType" element
         */
        @Inject(optional=true) public void setResourceTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType resourceType)
        {
            generatedSetterHelperImpl(resourceType, RESOURCETYPE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType insertNewResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType)get_store().insert_element_user(RESOURCETYPE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType addNewResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType)get_store().add_element_user(RESOURCETYPE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceType" element
         */
        public void removeResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCETYPE$6, i);
            }
        }
        
        /**
         * Gets a List of "rightsResource" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource> getRightsResourceList()
        {
            final class RightsResourceList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource get(int i)
                    { return ResourceSetImpl.this.getRightsResourceArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource set(int i, edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource o)
                {
                    edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource old = ResourceSetImpl.this.getRightsResourceArray(i);
                    ResourceSetImpl.this.setRightsResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource o)
                    { ResourceSetImpl.this.insertNewRightsResource(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource old = ResourceSetImpl.this.getRightsResourceArray(i);
                    ResourceSetImpl.this.removeRightsResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfRightsResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RightsResourceList();
            }
        }
        
        /**
         * Gets array of all "rightsResource" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[] getRightsResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource>();
                get_store().find_all_element_users(RIGHTSRESOURCE$8, targetList);
                edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[] result = new edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "rightsResource" element
         */
        public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource getRightsResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource target = null;
                target = (edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource)get_store().find_element_user(RIGHTSRESOURCE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "rightsResource" element
         */
        public int sizeOfRightsResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RIGHTSRESOURCE$8);
            }
        }
        
        /**
         * Sets array of all "rightsResource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRightsResourceArray(edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[] rightsResourceArray)
        {
            check_orphaned();
            arraySetterHelper(rightsResourceArray, RIGHTSRESOURCE$8);
        }
        
        /**
         * Sets ith "rightsResource" element
         */
        @Inject(optional=true) public void setRightsResourceArray(int i, edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource rightsResource)
        {
            generatedSetterHelperImpl(rightsResource, RIGHTSRESOURCE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
         */
        public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource insertNewRightsResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource target = null;
                target = (edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource)get_store().insert_element_user(RIGHTSRESOURCE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsResource" element
         */
        public edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource addNewRightsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource target = null;
                target = (edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource)get_store().add_element_user(RIGHTSRESOURCE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "rightsResource" element
         */
        public void removeRightsResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RIGHTSRESOURCE$8, i);
            }
        }
        
        /**
         * Gets the "resourceViewDescription" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription getResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription)get_store().find_element_user(RESOURCEVIEWDESCRIPTION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceViewDescription" element
         */
        public boolean isSetResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWDESCRIPTION$10) != 0;
            }
        }
        
        /**
         * Sets the "resourceViewDescription" element
         */
        @Inject(optional=true) public void setResourceViewDescription(edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription resourceViewDescription)
        {
            generatedSetterHelperImpl(resourceViewDescription, RESOURCEVIEWDESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceViewDescription" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription addNewResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription)get_store().add_element_user(RESOURCEVIEWDESCRIPTION$10);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceViewDescription" element
         */
        public void unsetResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWDESCRIPTION$10, 0);
            }
        }
        
        /**
         * Gets a List of "resourceViewType" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType> getResourceViewTypeList()
        {
            final class ResourceViewTypeList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType get(int i)
                    { return ResourceSetImpl.this.getResourceViewTypeArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType set(int i, edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType old = ResourceSetImpl.this.getResourceViewTypeArray(i);
                    ResourceSetImpl.this.setResourceViewTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType o)
                    { ResourceSetImpl.this.insertNewResourceViewType(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType old = ResourceSetImpl.this.getResourceViewTypeArray(i);
                    ResourceSetImpl.this.removeResourceViewType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceViewTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceViewTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceViewType" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[] getResourceViewTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType>();
                get_store().find_all_element_users(RESOURCEVIEWTYPE$12, targetList);
                edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[] result = new edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceViewType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType getResourceViewTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType)get_store().find_element_user(RESOURCEVIEWTYPE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceViewType" element
         */
        public int sizeOfResourceViewTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWTYPE$12);
            }
        }
        
        /**
         * Sets array of all "resourceViewType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceViewTypeArray(edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[] resourceViewTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceViewTypeArray, RESOURCEVIEWTYPE$12);
        }
        
        /**
         * Sets ith "resourceViewType" element
         */
        @Inject(optional=true) public void setResourceViewTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType resourceViewType)
        {
            generatedSetterHelperImpl(resourceViewType, RESOURCEVIEWTYPE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType insertNewResourceViewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType)get_store().insert_element_user(RESOURCEVIEWTYPE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewType" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType addNewResourceViewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType)get_store().add_element_user(RESOURCEVIEWTYPE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceViewType" element
         */
        public void removeResourceViewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWTYPE$12, i);
            }
        }
        
        /**
         * Gets a List of "resourceViewSubjectTerm" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> getResourceViewSubjectTermList()
        {
            final class ResourceViewSubjectTermList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm get(int i)
                    { return ResourceSetImpl.this.getResourceViewSubjectTermArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm set(int i, edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm old = ResourceSetImpl.this.getResourceViewSubjectTermArray(i);
                    ResourceSetImpl.this.setResourceViewSubjectTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm o)
                    { ResourceSetImpl.this.insertNewResourceViewSubjectTerm(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm old = ResourceSetImpl.this.getResourceViewSubjectTermArray(i);
                    ResourceSetImpl.this.removeResourceViewSubjectTerm(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceViewSubjectTermArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceViewSubjectTermList();
            }
        }
        
        /**
         * Gets array of all "resourceViewSubjectTerm" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] getResourceViewSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm>();
                get_store().find_all_element_users(RESOURCEVIEWSUBJECTTERM$14, targetList);
                edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] result = new edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceViewSubjectTerm" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm getResourceViewSubjectTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().find_element_user(RESOURCEVIEWSUBJECTTERM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceViewSubjectTerm" element
         */
        public int sizeOfResourceViewSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWSUBJECTTERM$14);
            }
        }
        
        /**
         * Sets array of all "resourceViewSubjectTerm" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceViewSubjectTermArray(edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] resourceViewSubjectTermArray)
        {
            check_orphaned();
            arraySetterHelper(resourceViewSubjectTermArray, RESOURCEVIEWSUBJECTTERM$14);
        }
        
        /**
         * Sets ith "resourceViewSubjectTerm" element
         */
        @Inject(optional=true) public void setResourceViewSubjectTermArray(int i, edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm resourceViewSubjectTerm)
        {
            generatedSetterHelperImpl(resourceViewSubjectTerm, RESOURCEVIEWSUBJECTTERM$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewSubjectTerm" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm insertNewResourceViewSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().insert_element_user(RESOURCEVIEWSUBJECTTERM$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewSubjectTerm" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm addNewResourceViewSubjectTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().add_element_user(RESOURCEVIEWSUBJECTTERM$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceViewSubjectTerm" element
         */
        public void removeResourceViewSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWSUBJECTTERM$14, i);
            }
        }
        
        /**
         * Gets the "resourceViewDate" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate getResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate)get_store().find_element_user(RESOURCEVIEWDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceViewDate" element
         */
        public boolean isSetResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "resourceViewDate" element
         */
        @Inject(optional=true) public void setResourceViewDate(edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate resourceViewDate)
        {
            generatedSetterHelperImpl(resourceViewDate, RESOURCEVIEWDATE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceViewDate" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate)get_store().add_element_user(RESOURCEVIEWDATE$16);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceViewDate" element
         */
        public void unsetResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWDATE$16, 0);
            }
        }
        
        /**
         * Gets a List of "resourceSource" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource> getResourceSourceList()
        {
            final class ResourceSourceList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource get(int i)
                    { return ResourceSetImpl.this.getResourceSourceArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource set(int i, edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource old = ResourceSetImpl.this.getResourceSourceArray(i);
                    ResourceSetImpl.this.setResourceSourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource o)
                    { ResourceSetImpl.this.insertNewResourceSource(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource old = ResourceSetImpl.this.getResourceSourceArray(i);
                    ResourceSetImpl.this.removeResourceSource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceSourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceSourceList();
            }
        }
        
        /**
         * Gets array of all "resourceSource" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[] getResourceSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource>();
                get_store().find_all_element_users(RESOURCESOURCE$18, targetList);
                edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[] result = new edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceSource" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource getResourceSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource)get_store().find_element_user(RESOURCESOURCE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceSource" element
         */
        public int sizeOfResourceSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCESOURCE$18);
            }
        }
        
        /**
         * Sets array of all "resourceSource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceSourceArray(edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[] resourceSourceArray)
        {
            check_orphaned();
            arraySetterHelper(resourceSourceArray, RESOURCESOURCE$18);
        }
        
        /**
         * Sets ith "resourceSource" element
         */
        @Inject(optional=true) public void setResourceSourceArray(int i, edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource resourceSource)
        {
            generatedSetterHelperImpl(resourceSource, RESOURCESOURCE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource insertNewResourceSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource)get_store().insert_element_user(RESOURCESOURCE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSource" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource addNewResourceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource)get_store().add_element_user(RESOURCESOURCE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceSource" element
         */
        public void removeResourceSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCESOURCE$18, i);
            }
        }
        
        /**
         * Gets a List of "linkRelatedResource" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource> getLinkRelatedResourceList()
        {
            final class LinkRelatedResourceList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource get(int i)
                    { return ResourceSetImpl.this.getLinkRelatedResourceArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource set(int i, edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource o)
                {
                    edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource old = ResourceSetImpl.this.getLinkRelatedResourceArray(i);
                    ResourceSetImpl.this.setLinkRelatedResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource o)
                    { ResourceSetImpl.this.insertNewLinkRelatedResource(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource old = ResourceSetImpl.this.getLinkRelatedResourceArray(i);
                    ResourceSetImpl.this.removeLinkRelatedResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfLinkRelatedResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LinkRelatedResourceList();
            }
        }
        
        /**
         * Gets array of all "linkRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[] getLinkRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource>();
                get_store().find_all_element_users(LINKRELATEDRESOURCE$20, targetList);
                edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[] result = new edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "linkRelatedResource" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource)get_store().find_element_user(LINKRELATEDRESOURCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "linkRelatedResource" element
         */
        public int sizeOfLinkRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRELATEDRESOURCE$20);
            }
        }
        
        /**
         * Sets array of all "linkRelatedResource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLinkRelatedResourceArray(edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[] linkRelatedResourceArray)
        {
            check_orphaned();
            arraySetterHelper(linkRelatedResourceArray, LINKRELATEDRESOURCE$20);
        }
        
        /**
         * Sets ith "linkRelatedResource" element
         */
        @Inject(optional=true) public void setLinkRelatedResourceArray(int i, edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource)
        {
            generatedSetterHelperImpl(linkRelatedResource, LINKRELATEDRESOURCE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedResource" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource insertNewLinkRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource)get_store().insert_element_user(LINKRELATEDRESOURCE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedResource" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource)get_store().add_element_user(LINKRELATEDRESOURCE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "linkRelatedResource" element
         */
        public void removeLinkRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRELATEDRESOURCE$20, i);
            }
        }
        
        /**
         * Gets a List of "resourceMetadataLoc" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc> getResourceMetadataLocList()
        {
            final class ResourceMetadataLocList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc get(int i)
                    { return ResourceSetImpl.this.getResourceMetadataLocArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc set(int i, edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc o)
                {
                    edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc old = ResourceSetImpl.this.getResourceMetadataLocArray(i);
                    ResourceSetImpl.this.setResourceMetadataLocArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc o)
                    { ResourceSetImpl.this.insertNewResourceMetadataLoc(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc old = ResourceSetImpl.this.getResourceMetadataLocArray(i);
                    ResourceSetImpl.this.removeResourceMetadataLoc(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceMetadataLocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceMetadataLocList();
            }
        }
        
        /**
         * Gets array of all "resourceMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[] getResourceMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc>();
                get_store().find_all_element_users(RESOURCEMETADATALOC$22, targetList);
                edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[] result = new edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc getResourceMetadataLocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().find_element_user(RESOURCEMETADATALOC$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceMetadataLoc" element
         */
        public int sizeOfResourceMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEMETADATALOC$22);
            }
        }
        
        /**
         * Sets array of all "resourceMetadataLoc" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceMetadataLocArray(edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[] resourceMetadataLocArray)
        {
            check_orphaned();
            arraySetterHelper(resourceMetadataLocArray, RESOURCEMETADATALOC$22);
        }
        
        /**
         * Sets ith "resourceMetadataLoc" element
         */
        @Inject(optional=true) public void setResourceMetadataLocArray(int i, edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc resourceMetadataLoc)
        {
            generatedSetterHelperImpl(resourceMetadataLoc, RESOURCEMETADATALOC$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc insertNewResourceMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().insert_element_user(RESOURCEMETADATALOC$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMetadataLoc" element
         */
        public edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc addNewResourceMetadataLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().add_element_user(RESOURCEMETADATALOC$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceMetadataLoc" element
         */
        public void removeResourceMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEMETADATALOC$22, i);
            }
        }
    }
}
