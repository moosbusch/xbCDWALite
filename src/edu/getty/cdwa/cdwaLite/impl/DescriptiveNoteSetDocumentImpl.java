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
 * A document containing one descriptiveNoteSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class DescriptiveNoteSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveNoteSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVENOTESET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNoteSet");
    
    
    /**
     * Gets the "descriptiveNoteSet" element
     */
    public edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
            target = (edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().find_element_user(DESCRIPTIVENOTESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveNoteSet" element
     */
    public void setDescriptiveNoteSet(edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet)
    {
        generatedSetterHelperImpl(descriptiveNoteSet, DESCRIPTIVENOTESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveNoteSet" element
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
     * An XML descriptiveNoteSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class DescriptiveNoteSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument.DescriptiveNoteSet
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveNoteSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVENOTE$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "descriptiveNote");
        private static final javax.xml.namespace.QName SOURCEDESCRIPTIVENOTE$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceDescriptiveNote");
        
        
        /**
         * Gets the "descriptiveNote" element
         */
        public java.lang.String getDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "descriptiveNote" element
         */
        public org.apache.xmlbeans.XmlString xgetDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "descriptiveNote" element
         */
        public boolean isSetDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTE$0) != 0;
            }
        }
        
        /**
         * Sets the "descriptiveNote" element
         */
        public void setDescriptiveNote(java.lang.String descriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIVENOTE$0);
                }
                target.setStringValue(descriptiveNote);
            }
        }
        
        /**
         * Sets (as xml) the "descriptiveNote" element
         */
        public void xsetDescriptiveNote(org.apache.xmlbeans.XmlString descriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIVENOTE$0);
                }
                target.set(descriptiveNote);
            }
        }
        
        /**
         * Unsets the "descriptiveNote" element
         */
        public void unsetDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTE$0, 0);
            }
        }
        
        /**
         * Gets a List of "sourceDescriptiveNote" elements
         */
        public java.util.List<java.lang.String> getSourceDescriptiveNoteList()
        {
            final class SourceDescriptiveNoteList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.setSourceDescriptiveNoteArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { DescriptiveNoteSetImpl.this.insertSourceDescriptiveNote(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.removeSourceDescriptiveNote(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DescriptiveNoteSetImpl.this.sizeOfSourceDescriptiveNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceDescriptiveNoteList();
            }
        }
        
        /**
         * Gets array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSourceDescriptiveNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCEDESCRIPTIVENOTE$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceDescriptiveNote" element
         */
        public java.lang.String getSourceDescriptiveNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "sourceDescriptiveNote" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSourceDescriptiveNoteList()
        {
            final class SourceDescriptiveNoteList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return DescriptiveNoteSetImpl.this.xgetSourceDescriptiveNoteArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = DescriptiveNoteSetImpl.this.xgetSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.xsetSourceDescriptiveNoteArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { DescriptiveNoteSetImpl.this.insertNewSourceDescriptiveNote(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = DescriptiveNoteSetImpl.this.xgetSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.removeSourceDescriptiveNote(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DescriptiveNoteSetImpl.this.sizeOfSourceDescriptiveNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceDescriptiveNoteList();
            }
        }
        
        /**
         * Gets array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetSourceDescriptiveNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCEDESCRIPTIVENOTE$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceDescriptiveNote" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceDescriptiveNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceDescriptiveNote" element
         */
        public int sizeOfSourceDescriptiveNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEDESCRIPTIVENOTE$2);
            }
        }
        
        /**
         * Sets array of all "sourceDescriptiveNote" element
         */
        public void setSourceDescriptiveNoteArray(java.lang.String[] sourceDescriptiveNoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceDescriptiveNoteArray, SOURCEDESCRIPTIVENOTE$2);
            }
        }
        
        /**
         * Sets ith "sourceDescriptiveNote" element
         */
        public void setSourceDescriptiveNoteArray(int i, java.lang.String sourceDescriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceDescriptiveNote);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceDescriptiveNote" element
         */
        public void xsetSourceDescriptiveNoteArray(org.apache.xmlbeans.XmlString[]sourceDescriptiveNoteArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceDescriptiveNoteArray, SOURCEDESCRIPTIVENOTE$2);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceDescriptiveNote" element
         */
        public void xsetSourceDescriptiveNoteArray(int i, org.apache.xmlbeans.XmlString sourceDescriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceDescriptiveNote);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceDescriptiveNote" element
         */
        public void insertSourceDescriptiveNote(int i, java.lang.String sourceDescriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                target.setStringValue(sourceDescriptiveNote);
            }
        }
        
        /**
         * Appends the value as the last "sourceDescriptiveNote" element
         */
        public void addSourceDescriptiveNote(java.lang.String sourceDescriptiveNote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$2);
                target.setStringValue(sourceDescriptiveNote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceDescriptiveNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceDescriptiveNote" element
         */
        public void removeSourceDescriptiveNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEDESCRIPTIVENOTE$2, i);
            }
        }
    }
}
