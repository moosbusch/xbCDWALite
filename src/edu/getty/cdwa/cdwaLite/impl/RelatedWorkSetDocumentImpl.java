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
 * A document containing one relatedWorkSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class RelatedWorkSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedWorkSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDWORKSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedWorkSet");
    
    
    /**
     * Gets the "relatedWorkSet" element
     */
    public edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet getRelatedWorkSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet target = null;
            target = (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet)get_store().find_element_user(RELATEDWORKSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relatedWorkSet" element
     */
    @Inject(optional=true) public void setRelatedWorkSet(edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet relatedWorkSet)
    {
        generatedSetterHelperImpl(relatedWorkSet, RELATEDWORKSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedWorkSet" element
     */
    public edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet addNewRelatedWorkSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet target = null;
            target = (edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet)get_store().add_element_user(RELATEDWORKSET$0);
            return target;
        }
    }
    /**
     * An XML relatedWorkSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class RelatedWorkSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument.RelatedWorkSet
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedWorkSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKRELATEDWORK$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "linkRelatedWork");
        private static final javax.xml.namespace.QName RELATEDWORKRELTYPE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "relatedWorkRelType");
        private static final javax.xml.namespace.QName LABELRELATEDWORK$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "labelRelatedWork");
        private static final javax.xml.namespace.QName LOCRELATEDWORK$6 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "locRelatedWork");
        
        
        /**
         * Gets a List of "linkRelatedWork" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork> getLinkRelatedWorkList()
        {
            final class LinkRelatedWorkList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork get(int i)
                    { return RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork set(int i, edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork o)
                {
                    edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork old = RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLinkRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork o)
                    { RelatedWorkSetImpl.this.insertNewLinkRelatedWork(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork old = RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLinkRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLinkRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LinkRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "linkRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[] getLinkRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork>();
                get_store().find_all_element_users(LINKRELATEDWORK$0, targetList);
                edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[] result = new edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "linkRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork getLinkRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork)get_store().find_element_user(LINKRELATEDWORK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "linkRelatedWork" element
         */
        public int sizeOfLinkRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRELATEDWORK$0);
            }
        }
        
        /**
         * Sets array of all "linkRelatedWork" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLinkRelatedWorkArray(edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork[] linkRelatedWorkArray)
        {
            check_orphaned();
            arraySetterHelper(linkRelatedWorkArray, LINKRELATEDWORK$0);
        }
        
        /**
         * Sets ith "linkRelatedWork" element
         */
        @Inject(optional=true) public void setLinkRelatedWorkArray(int i, edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork linkRelatedWork)
        {
            generatedSetterHelperImpl(linkRelatedWork, LINKRELATEDWORK$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork insertNewLinkRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork)get_store().insert_element_user(LINKRELATEDWORK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork addNewLinkRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument.LinkRelatedWork)get_store().add_element_user(LINKRELATEDWORK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "linkRelatedWork" element
         */
        public void removeLinkRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRELATEDWORK$0, i);
            }
        }
        
        /**
         * Gets the "relatedWorkRelType" element
         */
        public java.lang.String getRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relatedWorkRelType" element
         */
        public org.apache.xmlbeans.XmlString xgetRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "relatedWorkRelType" element
         */
        public boolean isSetRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKRELTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "relatedWorkRelType" element
         */
        @Inject(optional=true) public void setRelatedWorkRelType(java.lang.String relatedWorkRelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDWORKRELTYPE$2);
                }
                target.setStringValue(relatedWorkRelType);
            }
        }
        
        /**
         * Sets (as xml) the "relatedWorkRelType" element
         */
        public void xsetRelatedWorkRelType(org.apache.xmlbeans.XmlString relatedWorkRelType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDWORKRELTYPE$2);
                }
                target.set(relatedWorkRelType);
            }
        }
        
        /**
         * Unsets the "relatedWorkRelType" element
         */
        public void unsetRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKRELTYPE$2, 0);
            }
        }
        
        /**
         * Gets a List of "labelRelatedWork" elements
         */
        public java.util.List<java.lang.String> getLabelRelatedWorkList()
        {
            final class LabelRelatedWorkList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLabelRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { RelatedWorkSetImpl.this.insertLabelRelatedWork(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLabelRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLabelRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getLabelRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(LABELRELATEDWORK$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "labelRelatedWork" element
         */
        public java.lang.String getLabelRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDWORK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "labelRelatedWork" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetLabelRelatedWorkList()
        {
            final class LabelRelatedWorkList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return RelatedWorkSetImpl.this.xgetLabelRelatedWorkArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = RelatedWorkSetImpl.this.xgetLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.xsetLabelRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { RelatedWorkSetImpl.this.insertNewLabelRelatedWork(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = RelatedWorkSetImpl.this.xgetLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLabelRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLabelRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetLabelRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(LABELRELATEDWORK$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "labelRelatedWork" element
         */
        public org.apache.xmlbeans.XmlString xgetLabelRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDWORK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "labelRelatedWork" element
         */
        public int sizeOfLabelRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELRELATEDWORK$4);
            }
        }
        
        /**
         * Sets array of all "labelRelatedWork" element
         */
        @Inject(optional=true) public void setLabelRelatedWorkArray(java.lang.String[] labelRelatedWorkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(labelRelatedWorkArray, LABELRELATEDWORK$4);
            }
        }
        
        /**
         * Sets ith "labelRelatedWork" element
         */
        @Inject(optional=true) public void setLabelRelatedWorkArray(int i, java.lang.String labelRelatedWork)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELRELATEDWORK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(labelRelatedWork);
            }
        }
        
        /**
         * Sets (as xml) array of all "labelRelatedWork" element
         */
        public void xsetLabelRelatedWorkArray(org.apache.xmlbeans.XmlString[]labelRelatedWorkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(labelRelatedWorkArray, LABELRELATEDWORK$4);
            }
        }
        
        /**
         * Sets (as xml) ith "labelRelatedWork" element
         */
        public void xsetLabelRelatedWorkArray(int i, org.apache.xmlbeans.XmlString labelRelatedWork)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELRELATEDWORK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(labelRelatedWork);
            }
        }
        
        /**
         * Inserts the value as the ith "labelRelatedWork" element
         */
        public void insertLabelRelatedWork(int i, java.lang.String labelRelatedWork)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LABELRELATEDWORK$4, i);
                target.setStringValue(labelRelatedWork);
            }
        }
        
        /**
         * Appends the value as the last "labelRelatedWork" element
         */
        public void addLabelRelatedWork(java.lang.String labelRelatedWork)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELRELATEDWORK$4);
                target.setStringValue(labelRelatedWork);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedWork" element
         */
        public org.apache.xmlbeans.XmlString insertNewLabelRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LABELRELATEDWORK$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedWork" element
         */
        public org.apache.xmlbeans.XmlString addNewLabelRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELRELATEDWORK$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "labelRelatedWork" element
         */
        public void removeLabelRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELRELATEDWORK$4, i);
            }
        }
        
        /**
         * Gets a List of "locRelatedWork" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork> getLocRelatedWorkList()
        {
            final class LocRelatedWorkList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork get(int i)
                    { return RelatedWorkSetImpl.this.getLocRelatedWorkArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork set(int i, edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork o)
                {
                    edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork old = RelatedWorkSetImpl.this.getLocRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLocRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork o)
                    { RelatedWorkSetImpl.this.insertNewLocRelatedWork(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork old = RelatedWorkSetImpl.this.getLocRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLocRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLocRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LocRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "locRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[] getLocRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork>();
                get_store().find_all_element_users(LOCRELATEDWORK$6, targetList);
                edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[] result = new edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "locRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork)get_store().find_element_user(LOCRELATEDWORK$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "locRelatedWork" element
         */
        public int sizeOfLocRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCRELATEDWORK$6);
            }
        }
        
        /**
         * Sets array of all "locRelatedWork" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLocRelatedWorkArray(edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork[] locRelatedWorkArray)
        {
            check_orphaned();
            arraySetterHelper(locRelatedWorkArray, LOCRELATEDWORK$6);
        }
        
        /**
         * Sets ith "locRelatedWork" element
         */
        @Inject(optional=true) public void setLocRelatedWorkArray(int i, edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork locRelatedWork)
        {
            generatedSetterHelperImpl(locRelatedWork, LOCRELATEDWORK$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "locRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork insertNewLocRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork)get_store().insert_element_user(LOCRELATEDWORK$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "locRelatedWork" element
         */
        public edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument.LocRelatedWork)get_store().add_element_user(LOCRELATEDWORK$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "locRelatedWork" element
         */
        public void removeLocRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCRELATEDWORK$6, i);
            }
        }
    }
}
