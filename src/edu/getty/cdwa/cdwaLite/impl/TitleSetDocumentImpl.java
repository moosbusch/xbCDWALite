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
package edu.getty.cdwa.cdwaLite.impl;  
/**
 * A document containing one titleSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class TitleSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TitleSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLESET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "titleSet");
    
    
    /**
     * Gets the "titleSet" element
     */
    public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet getTitleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet target = null;
            target = (edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet)get_store().find_element_user(TITLESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "titleSet" element
     */
    public void setTitleSet(edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet titleSet)
    {
        generatedSetterHelperImpl(titleSet, TITLESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "titleSet" element
     */
    public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet addNewTitleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet target = null;
            target = (edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet)get_store().add_element_user(TITLESET$0);
            return target;
        }
    }
    /**
     * An XML titleSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class TitleSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet
    {
        private static final long serialVersionUID = 1L;
        
        public TitleSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "title");
        private static final javax.xml.namespace.QName SOURCETITLE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceTitle");
        
        
        /**
         * Gets the "title" element
         */
        public edu.getty.cdwa.cdwaLite.TitleDocument.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleDocument.Title target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(edu.getty.cdwa.cdwaLite.TitleDocument.Title title)
        {
            generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public edu.getty.cdwa.cdwaLite.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleDocument.Title target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "sourceTitle" elements
         */
        public java.util.List<java.lang.String> getSourceTitleList()
        {
            final class SourceTitleList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return TitleSetImpl.this.getSourceTitleArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = TitleSetImpl.this.getSourceTitleArray(i);
                    TitleSetImpl.this.setSourceTitleArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { TitleSetImpl.this.insertSourceTitle(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = TitleSetImpl.this.getSourceTitleArray(i);
                    TitleSetImpl.this.removeSourceTitle(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return TitleSetImpl.this.sizeOfSourceTitleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceTitleList();
            }
        }
        
        /**
         * Gets array of all "sourceTitle" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSourceTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCETITLE$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceTitle" element
         */
        public java.lang.String getSourceTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "sourceTitle" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSourceTitleList()
        {
            final class SourceTitleList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return TitleSetImpl.this.xgetSourceTitleArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = TitleSetImpl.this.xgetSourceTitleArray(i);
                    TitleSetImpl.this.xsetSourceTitleArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { TitleSetImpl.this.insertNewSourceTitle(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = TitleSetImpl.this.xgetSourceTitleArray(i);
                    TitleSetImpl.this.removeSourceTitle(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return TitleSetImpl.this.sizeOfSourceTitleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceTitleList();
            }
        }
        
        /**
         * Gets array of all "sourceTitle" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetSourceTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCETITLE$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceTitle" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceTitle" element
         */
        public int sizeOfSourceTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCETITLE$2);
            }
        }
        
        /**
         * Sets array of all "sourceTitle" element
         */
        public void setSourceTitleArray(java.lang.String[] sourceTitleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceTitleArray, SOURCETITLE$2);
            }
        }
        
        /**
         * Sets ith "sourceTitle" element
         */
        public void setSourceTitleArray(int i, java.lang.String sourceTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceTitle);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceTitle" element
         */
        public void xsetSourceTitleArray(org.apache.xmlbeans.XmlString[]sourceTitleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceTitleArray, SOURCETITLE$2);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceTitle" element
         */
        public void xsetSourceTitleArray(int i, org.apache.xmlbeans.XmlString sourceTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceTitle);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceTitle" element
         */
        public void insertSourceTitle(int i, java.lang.String sourceTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCETITLE$2, i);
                target.setStringValue(sourceTitle);
            }
        }
        
        /**
         * Appends the value as the last "sourceTitle" element
         */
        public void addSourceTitle(java.lang.String sourceTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETITLE$2);
                target.setStringValue(sourceTitle);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceTitle" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCETITLE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceTitle" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCETITLE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceTitle" element
         */
        public void removeSourceTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCETITLE$2, i);
            }
        }
    }
}
