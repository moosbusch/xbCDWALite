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
 * A document containing one displayStateEditionWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DisplayStateEditionWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayStateEditionWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYSTATEEDITIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayStateEditionWrap");
    
    
    /**
     * Gets the "displayStateEditionWrap" element
     */
    public edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().find_element_user(DISPLAYSTATEEDITIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "displayStateEditionWrap" element
     */
    @Inject(optional=true) public void setDisplayStateEditionWrap(edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap)
    {
        generatedSetterHelperImpl(displayStateEditionWrap, DISPLAYSTATEEDITIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "displayStateEditionWrap" element
     */
    public edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().add_element_user(DISPLAYSTATEEDITIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML displayStateEditionWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class DisplayStateEditionWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DisplayStateEditionWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYSTATE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayState");
        private static final javax.xml.namespace.QName DISPLAYEDITION$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "displayEdition");
        private static final javax.xml.namespace.QName SOURCESTATEEDITION$4 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceStateEdition");
        
        
        /**
         * Gets a List of "displayState" elements
         */
        public java.util.List<java.lang.String> getDisplayStateList()
        {
            final class DisplayStateList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return DisplayStateEditionWrapImpl.this.getDisplayStateArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.setDisplayStateArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { DisplayStateEditionWrapImpl.this.insertDisplayState(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayState(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayStateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayStateList();
            }
        }
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getDisplayStateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DISPLAYSTATE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "displayState" element
         */
        public java.lang.String getDisplayStateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSTATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "displayState" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetDisplayStateList()
        {
            final class DisplayStateList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return DisplayStateEditionWrapImpl.this.xgetDisplayStateArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.xsetDisplayStateArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { DisplayStateEditionWrapImpl.this.insertNewDisplayState(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayState(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayStateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayStateList();
            }
        }
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetDisplayStateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DISPLAYSTATE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "displayState" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayStateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYSTATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "displayState" element
         */
        public int sizeOfDisplayStateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYSTATE$0);
            }
        }
        
        /**
         * Sets array of all "displayState" element
         */
        @Inject(optional=true) public void setDisplayStateArray(java.lang.String[] displayStateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(displayStateArray, DISPLAYSTATE$0);
            }
        }
        
        /**
         * Sets ith "displayState" element
         */
        @Inject(optional=true) public void setDisplayStateArray(int i, java.lang.String displayState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYSTATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(displayState);
            }
        }
        
        /**
         * Sets (as xml) array of all "displayState" element
         */
        public void xsetDisplayStateArray(org.apache.xmlbeans.XmlString[]displayStateArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(displayStateArray, DISPLAYSTATE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "displayState" element
         */
        public void xsetDisplayStateArray(int i, org.apache.xmlbeans.XmlString displayState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYSTATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(displayState);
            }
        }
        
        /**
         * Inserts the value as the ith "displayState" element
         */
        public void insertDisplayState(int i, java.lang.String displayState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DISPLAYSTATE$0, i);
                target.setStringValue(displayState);
            }
        }
        
        /**
         * Appends the value as the last "displayState" element
         */
        public void addDisplayState(java.lang.String displayState)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYSTATE$0);
                target.setStringValue(displayState);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayState" element
         */
        public org.apache.xmlbeans.XmlString insertNewDisplayState(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DISPLAYSTATE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayState" element
         */
        public org.apache.xmlbeans.XmlString addNewDisplayState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYSTATE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "displayState" element
         */
        public void removeDisplayState(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYSTATE$0, i);
            }
        }
        
        /**
         * Gets a List of "displayEdition" elements
         */
        public java.util.List<java.lang.String> getDisplayEditionList()
        {
            final class DisplayEditionList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.setDisplayEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { DisplayStateEditionWrapImpl.this.insertDisplayEdition(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayEditionList();
            }
        }
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getDisplayEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DISPLAYEDITION$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "displayEdition" element
         */
        public java.lang.String getDisplayEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYEDITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "displayEdition" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetDisplayEditionList()
        {
            final class DisplayEditionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return DisplayStateEditionWrapImpl.this.xgetDisplayEditionArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.xsetDisplayEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { DisplayStateEditionWrapImpl.this.insertNewDisplayEdition(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayEditionList();
            }
        }
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetDisplayEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DISPLAYEDITION$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "displayEdition" element
         */
        public org.apache.xmlbeans.XmlString xgetDisplayEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYEDITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "displayEdition" element
         */
        public int sizeOfDisplayEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYEDITION$2);
            }
        }
        
        /**
         * Sets array of all "displayEdition" element
         */
        @Inject(optional=true) public void setDisplayEditionArray(java.lang.String[] displayEditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(displayEditionArray, DISPLAYEDITION$2);
            }
        }
        
        /**
         * Sets ith "displayEdition" element
         */
        @Inject(optional=true) public void setDisplayEditionArray(int i, java.lang.String displayEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISPLAYEDITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(displayEdition);
            }
        }
        
        /**
         * Sets (as xml) array of all "displayEdition" element
         */
        public void xsetDisplayEditionArray(org.apache.xmlbeans.XmlString[]displayEditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(displayEditionArray, DISPLAYEDITION$2);
            }
        }
        
        /**
         * Sets (as xml) ith "displayEdition" element
         */
        public void xsetDisplayEditionArray(int i, org.apache.xmlbeans.XmlString displayEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISPLAYEDITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(displayEdition);
            }
        }
        
        /**
         * Inserts the value as the ith "displayEdition" element
         */
        public void insertDisplayEdition(int i, java.lang.String displayEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DISPLAYEDITION$2, i);
                target.setStringValue(displayEdition);
            }
        }
        
        /**
         * Appends the value as the last "displayEdition" element
         */
        public void addDisplayEdition(java.lang.String displayEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISPLAYEDITION$2);
                target.setStringValue(displayEdition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEdition" element
         */
        public org.apache.xmlbeans.XmlString insertNewDisplayEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DISPLAYEDITION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEdition" element
         */
        public org.apache.xmlbeans.XmlString addNewDisplayEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISPLAYEDITION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "displayEdition" element
         */
        public void removeDisplayEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYEDITION$2, i);
            }
        }
        
        /**
         * Gets a List of "sourceStateEdition" elements
         */
        public java.util.List<java.lang.String> getSourceStateEditionList()
        {
            final class SourceStateEditionList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.setSourceStateEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { DisplayStateEditionWrapImpl.this.insertSourceStateEdition(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeSourceStateEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfSourceStateEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceStateEditionList();
            }
        }
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSourceStateEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCESTATEEDITION$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceStateEdition" element
         */
        public java.lang.String getSourceStateEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTATEEDITION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "sourceStateEdition" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSourceStateEditionList()
        {
            final class SourceStateEditionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return DisplayStateEditionWrapImpl.this.xgetSourceStateEditionArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.xsetSourceStateEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { DisplayStateEditionWrapImpl.this.insertNewSourceStateEdition(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = DisplayStateEditionWrapImpl.this.xgetSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeSourceStateEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfSourceStateEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceStateEditionList();
            }
        }
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetSourceStateEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCESTATEEDITION$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceStateEdition" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceStateEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTATEEDITION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceStateEdition" element
         */
        public int sizeOfSourceStateEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCESTATEEDITION$4);
            }
        }
        
        /**
         * Sets array of all "sourceStateEdition" element
         */
        @Inject(optional=true) public void setSourceStateEditionArray(java.lang.String[] sourceStateEditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceStateEditionArray, SOURCESTATEEDITION$4);
            }
        }
        
        /**
         * Sets ith "sourceStateEdition" element
         */
        @Inject(optional=true) public void setSourceStateEditionArray(int i, java.lang.String sourceStateEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTATEEDITION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceStateEdition);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceStateEdition" element
         */
        public void xsetSourceStateEditionArray(org.apache.xmlbeans.XmlString[]sourceStateEditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceStateEditionArray, SOURCESTATEEDITION$4);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceStateEdition" element
         */
        public void xsetSourceStateEditionArray(int i, org.apache.xmlbeans.XmlString sourceStateEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTATEEDITION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceStateEdition);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceStateEdition" element
         */
        public void insertSourceStateEdition(int i, java.lang.String sourceStateEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCESTATEEDITION$4, i);
                target.setStringValue(sourceStateEdition);
            }
        }
        
        /**
         * Appends the value as the last "sourceStateEdition" element
         */
        public void addSourceStateEdition(java.lang.String sourceStateEdition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESTATEEDITION$4);
                target.setStringValue(sourceStateEdition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceStateEdition" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceStateEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCESTATEEDITION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceStateEdition" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceStateEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESTATEEDITION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceStateEdition" element
         */
        public void removeSourceStateEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCESTATEEDITION$4, i);
            }
        }
    }
}
