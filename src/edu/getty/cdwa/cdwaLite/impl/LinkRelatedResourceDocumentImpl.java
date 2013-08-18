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
 * A document containing one linkRelatedResource(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class LinkRelatedResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkRelatedResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKRELATEDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkRelatedResource");
    
    
    /**
     * Gets the "linkRelatedResource" element
     */
    public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource target = null;
            target = (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource)get_store().find_element_user(LINKRELATEDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkRelatedResource" element
     */
    @Inject(optional=true) public void setLinkRelatedResource(edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource)
    {
        generatedSetterHelperImpl(linkRelatedResource, LINKRELATEDRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linkRelatedResource" element
     */
    public edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource target = null;
            target = (edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource)get_store().add_element_user(LINKRELATEDRESOURCE$0);
            return target;
        }
    }
    /**
     * An XML linkRelatedResource(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class LinkRelatedResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource
    {
        private static final long serialVersionUID = 1L;
        
        public LinkRelatedResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RELATEDRESOURCERELTYPE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedResourceRelType");
        private static final javax.xml.namespace.QName LABELRELATEDRESOURCE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "labelRelatedResource");
        private static final javax.xml.namespace.QName LINKSCHEME$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkscheme");
        
        
        /**
         * Gets the "relatedResourceRelType" element
         */
        public java.lang.String getRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relatedResourceRelType" element
         */
        public org.apache.xmlbeans.XmlString xgetRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "relatedResourceRelType" element
         */
        public boolean isSetRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDRESOURCERELTYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "relatedResourceRelType" element
         */
        @Inject(optional=true) public void setRelatedResourceRelType(java.lang.String relatedResourceRelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDRESOURCERELTYPE$0);
                }
                target.setStringValue(relatedResourceRelType);
            }
        }
        
        /**
         * Sets (as xml) the "relatedResourceRelType" element
         */
        public void xsetRelatedResourceRelType(org.apache.xmlbeans.XmlString relatedResourceRelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDRESOURCERELTYPE$0);
                }
                target.set(relatedResourceRelType);
            }
        }
        
        /**
         * Unsets the "relatedResourceRelType" element
         */
        public void unsetRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDRESOURCERELTYPE$0, 0);
            }
        }
        
        /**
         * Gets a List of "labelRelatedResource" elements
         */
        public java.util.List<java.lang.String> getLabelRelatedResourceList()
        {
            final class LabelRelatedResourceList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.setLabelRelatedResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { LinkRelatedResourceImpl.this.insertLabelRelatedResource(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.removeLabelRelatedResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LinkRelatedResourceImpl.this.sizeOfLabelRelatedResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedResourceList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getLabelRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(LABELRELATEDRESOURCE$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "labelRelatedResource" element
         */
        public java.lang.String getLabelRelatedResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDRESOURCE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "labelRelatedResource" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetLabelRelatedResourceList()
        {
            final class LabelRelatedResourceList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return LinkRelatedResourceImpl.this.xgetLabelRelatedResourceArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = LinkRelatedResourceImpl.this.xgetLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.xsetLabelRelatedResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { LinkRelatedResourceImpl.this.insertNewLabelRelatedResource(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = LinkRelatedResourceImpl.this.xgetLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.removeLabelRelatedResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LinkRelatedResourceImpl.this.sizeOfLabelRelatedResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedResourceList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetLabelRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(LABELRELATEDRESOURCE$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "labelRelatedResource" element
         */
        public org.apache.xmlbeans.XmlString xgetLabelRelatedResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDRESOURCE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "labelRelatedResource" element
         */
        public int sizeOfLabelRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELRELATEDRESOURCE$2);
            }
        }
        
        /**
         * Sets array of all "labelRelatedResource" element
         */
        @Inject(optional=true) public void setLabelRelatedResourceArray(java.lang.String[] labelRelatedResourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(labelRelatedResourceArray, LABELRELATEDRESOURCE$2);
            }
        }
        
        /**
         * Sets ith "labelRelatedResource" element
         */
        @Inject(optional=true) public void setLabelRelatedResourceArray(int i, java.lang.String labelRelatedResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDRESOURCE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(labelRelatedResource);
            }
        }
        
        /**
         * Sets (as xml) array of all "labelRelatedResource" element
         */
        public void xsetLabelRelatedResourceArray(org.apache.xmlbeans.XmlString[]labelRelatedResourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(labelRelatedResourceArray, LABELRELATEDRESOURCE$2);
            }
        }
        
        /**
         * Sets (as xml) ith "labelRelatedResource" element
         */
        public void xsetLabelRelatedResourceArray(int i, org.apache.xmlbeans.XmlString labelRelatedResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDRESOURCE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(labelRelatedResource);
            }
        }
        
        /**
         * Inserts the value as the ith "labelRelatedResource" element
         */
        public void insertLabelRelatedResource(int i, java.lang.String labelRelatedResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LABELRELATEDRESOURCE$2, i);
                target.setStringValue(labelRelatedResource);
            }
        }
        
        /**
         * Appends the value as the last "labelRelatedResource" element
         */
        public void addLabelRelatedResource(java.lang.String labelRelatedResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELRELATEDRESOURCE$2);
                target.setStringValue(labelRelatedResource);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedResource" element
         */
        public org.apache.xmlbeans.XmlString insertNewLabelRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LABELRELATEDRESOURCE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedResource" element
         */
        public org.apache.xmlbeans.XmlString addNewLabelRelatedResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELRELATEDRESOURCE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "labelRelatedResource" element
         */
        public void removeLabelRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELRELATEDRESOURCE$2, i);
            }
        }
        
        /**
         * Gets the "linkscheme" attribute
         */
        public java.lang.String getLinkscheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "linkscheme" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLinkscheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$4);
                return target;
            }
        }
        
        /**
         * True if has "linkscheme" attribute
         */
        public boolean isSetLinkscheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LINKSCHEME$4) != null;
            }
        }
        
        /**
         * Sets the "linkscheme" attribute
         */
        @Inject(optional=true) public void setLinkscheme(java.lang.String linkscheme)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKSCHEME$4);
                }
                target.setStringValue(linkscheme);
            }
        }
        
        /**
         * Sets (as xml) the "linkscheme" attribute
         */
        public void xsetLinkscheme(org.apache.xmlbeans.XmlString linkscheme)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LINKSCHEME$4);
                }
                target.set(linkscheme);
            }
        }
        
        /**
         * Unsets the "linkscheme" attribute
         */
        public void unsetLinkscheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LINKSCHEME$4);
            }
        }
    }
}
