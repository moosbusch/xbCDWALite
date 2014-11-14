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
 * A document containing one nameCreatorSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class NameCreatorSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.NameCreatorSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameCreatorSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMECREATORSET$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nameCreatorSet");
    
    
    /**
     * Gets the "nameCreatorSet" element
     */
    public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet getNameCreatorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet target = null;
            target = (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet)get_store().find_element_user(NAMECREATORSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nameCreatorSet" element
     */
    public void setNameCreatorSet(edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet nameCreatorSet)
    {
        generatedSetterHelperImpl(nameCreatorSet, NAMECREATORSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nameCreatorSet" element
     */
    public edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet addNewNameCreatorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet target = null;
            target = (edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet)get_store().add_element_user(NAMECREATORSET$0);
            return target;
        }
    }
    /**
     * An XML nameCreatorSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class NameCreatorSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.NameCreatorSetDocument.NameCreatorSet
    {
        private static final long serialVersionUID = 1L;
        
        public NameCreatorSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMECREATOR$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "nameCreator");
        private static final javax.xml.namespace.QName SOURCENAMECREATOR$2 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "sourceNameCreator");
        
        
        /**
         * Gets the "nameCreator" element
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator getNameCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator)get_store().find_element_user(NAMECREATOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nameCreator" element
         */
        public void setNameCreator(edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator nameCreator)
        {
            generatedSetterHelperImpl(nameCreator, NAMECREATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "nameCreator" element
         */
        public edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator addNewNameCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator target = null;
                target = (edu.getty.cdwa.cdwaLite.NameCreatorDocument.NameCreator)get_store().add_element_user(NAMECREATOR$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "sourceNameCreator" elements
         */
        public java.util.List<java.lang.String> getSourceNameCreatorList()
        {
            final class SourceNameCreatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return NameCreatorSetImpl.this.getSourceNameCreatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = NameCreatorSetImpl.this.getSourceNameCreatorArray(i);
                    NameCreatorSetImpl.this.setSourceNameCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { NameCreatorSetImpl.this.insertSourceNameCreator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = NameCreatorSetImpl.this.getSourceNameCreatorArray(i);
                    NameCreatorSetImpl.this.removeSourceNameCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return NameCreatorSetImpl.this.sizeOfSourceNameCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceNameCreatorList();
            }
        }
        
        /**
         * Gets array of all "sourceNameCreator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSourceNameCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCENAMECREATOR$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "sourceNameCreator" element
         */
        public java.lang.String getSourceNameCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAMECREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "sourceNameCreator" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSourceNameCreatorList()
        {
            final class SourceNameCreatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return NameCreatorSetImpl.this.xgetSourceNameCreatorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = NameCreatorSetImpl.this.xgetSourceNameCreatorArray(i);
                    NameCreatorSetImpl.this.xsetSourceNameCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { NameCreatorSetImpl.this.insertNewSourceNameCreator(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = NameCreatorSetImpl.this.xgetSourceNameCreatorArray(i);
                    NameCreatorSetImpl.this.removeSourceNameCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return NameCreatorSetImpl.this.sizeOfSourceNameCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceNameCreatorList();
            }
        }
        
        /**
         * Gets array of all "sourceNameCreator" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetSourceNameCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SOURCENAMECREATOR$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "sourceNameCreator" element
         */
        public org.apache.xmlbeans.XmlString xgetSourceNameCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAMECREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceNameCreator" element
         */
        public int sizeOfSourceNameCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCENAMECREATOR$2);
            }
        }
        
        /**
         * Sets array of all "sourceNameCreator" element
         */
        public void setSourceNameCreatorArray(java.lang.String[] sourceNameCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceNameCreatorArray, SOURCENAMECREATOR$2);
            }
        }
        
        /**
         * Sets ith "sourceNameCreator" element
         */
        public void setSourceNameCreatorArray(int i, java.lang.String sourceNameCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAMECREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(sourceNameCreator);
            }
        }
        
        /**
         * Sets (as xml) array of all "sourceNameCreator" element
         */
        public void xsetSourceNameCreatorArray(org.apache.xmlbeans.XmlString[]sourceNameCreatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sourceNameCreatorArray, SOURCENAMECREATOR$2);
            }
        }
        
        /**
         * Sets (as xml) ith "sourceNameCreator" element
         */
        public void xsetSourceNameCreatorArray(int i, org.apache.xmlbeans.XmlString sourceNameCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAMECREATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sourceNameCreator);
            }
        }
        
        /**
         * Inserts the value as the ith "sourceNameCreator" element
         */
        public void insertSourceNameCreator(int i, java.lang.String sourceNameCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCENAMECREATOR$2, i);
                target.setStringValue(sourceNameCreator);
            }
        }
        
        /**
         * Appends the value as the last "sourceNameCreator" element
         */
        public void addSourceNameCreator(java.lang.String sourceNameCreator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCENAMECREATOR$2);
                target.setStringValue(sourceNameCreator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceNameCreator" element
         */
        public org.apache.xmlbeans.XmlString insertNewSourceNameCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SOURCENAMECREATOR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceNameCreator" element
         */
        public org.apache.xmlbeans.XmlString addNewSourceNameCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCENAMECREATOR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceNameCreator" element
         */
        public void removeSourceNameCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCENAMECREATOR$2, i);
            }
        }
    }
}
