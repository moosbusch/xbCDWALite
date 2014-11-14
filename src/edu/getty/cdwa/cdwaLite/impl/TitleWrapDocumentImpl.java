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
 * A document containing one titleWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class TitleWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TitleWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLEWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "titleWrap");
    
    
    /**
     * Gets the "titleWrap" element
     */
    public edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap getTitleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap)get_store().find_element_user(TITLEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "titleWrap" element
     */
    public void setTitleWrap(edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap titleWrap)
    {
        generatedSetterHelperImpl(titleWrap, TITLEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "titleWrap" element
     */
    public edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap addNewTitleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap)get_store().add_element_user(TITLEWRAP$0);
            return target;
        }
    }
    /**
     * An XML titleWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class TitleWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap
    {
        private static final long serialVersionUID = 1L;
        
        public TitleWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLESET$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "titleSet");
        
        
        /**
         * Gets a List of "titleSet" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet> getTitleSetList()
        {
            final class TitleSetList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet get(int i)
                    { return TitleWrapImpl.this.getTitleSetArray(i); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet set(int i, edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet o)
                {
                    edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet old = TitleWrapImpl.this.getTitleSetArray(i);
                    TitleWrapImpl.this.setTitleSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet o)
                    { TitleWrapImpl.this.insertNewTitleSet(i).set(o); }
                
                @Override
                public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet old = TitleWrapImpl.this.getTitleSetArray(i);
                    TitleWrapImpl.this.removeTitleSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return TitleWrapImpl.this.sizeOfTitleSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TitleSetList();
            }
        }
        
        /**
         * Gets array of all "titleSet" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet[] getTitleSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet>();
                get_store().find_all_element_users(TITLESET$0, targetList);
                edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet[] result = new edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "titleSet" element
         */
        public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet getTitleSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet)get_store().find_element_user(TITLESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "titleSet" element
         */
        public int sizeOfTitleSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLESET$0);
            }
        }
        
        /**
         * Sets array of all "titleSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTitleSetArray(edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet[] titleSetArray)
        {
            check_orphaned();
            arraySetterHelper(titleSetArray, TITLESET$0);
        }
        
        /**
         * Sets ith "titleSet" element
         */
        public void setTitleSetArray(int i, edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet titleSet)
        {
            generatedSetterHelperImpl(titleSet, TITLESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "titleSet" element
         */
        public edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet insertNewTitleSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet target = null;
                target = (edu.getty.cdwa.cdwaLite.TitleSetDocument.TitleSet)get_store().insert_element_user(TITLESET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "titleSet" element
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
         * Removes the ith "titleSet" element
         */
        public void removeTitleSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLESET$0, i);
            }
        }
    }
}
