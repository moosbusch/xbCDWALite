/*
 * An XML document type.
 * Localname: inscriptionsWrap
 * Namespace: http://www.getty.edu/CDWA/CDWALite
 * Java type: edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument
 *
 * Automatically generated - do not modify.
 */
package edu.getty.cdwa.cdwaLite.impl;  import com.google.inject.Inject;
/**
 * A document containing one inscriptionsWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class InscriptionsWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public InscriptionsWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$0 = 
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "inscriptionsWrap");
    
    
    /**
     * Gets the "inscriptionsWrap" element
     */
    public edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inscriptionsWrap" element
     */
    @Inject(optional=true) public void setInscriptionsWrap(edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
    {
        generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inscriptionsWrap" element
     */
    public edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$0);
            return target;
        }
    }
    /**
     * An XML inscriptionsWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class InscriptionsWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap
    {
        private static final long serialVersionUID = 1L;
        
        public InscriptionsWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INSCRIPTIONS$0 = 
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "inscriptions");
        
        
        /**
         * Gets a List of "inscriptions" elements
         */
        public java.util.List<java.lang.String> getInscriptionsList()
        {
            final class InscriptionsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return InscriptionsWrapImpl.this.getInscriptionsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.setInscriptionsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { InscriptionsWrapImpl.this.insertInscriptions(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.removeInscriptions(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return InscriptionsWrapImpl.this.sizeOfInscriptionsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InscriptionsList();
            }
        }
        
        /**
         * Gets array of all "inscriptions" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(INSCRIPTIONS$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "inscriptions" element
         */
        public java.lang.String getInscriptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "inscriptions" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetInscriptionsList()
        {
            final class InscriptionsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return InscriptionsWrapImpl.this.xgetInscriptionsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = InscriptionsWrapImpl.this.xgetInscriptionsArray(i);
                    InscriptionsWrapImpl.this.xsetInscriptionsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { InscriptionsWrapImpl.this.insertNewInscriptions(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = InscriptionsWrapImpl.this.xgetInscriptionsArray(i);
                    InscriptionsWrapImpl.this.removeInscriptions(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return InscriptionsWrapImpl.this.sizeOfInscriptionsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InscriptionsList();
            }
        }
        
        /**
         * Gets array of all "inscriptions" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(INSCRIPTIONS$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "inscriptions" element
         */
        public org.apache.xmlbeans.XmlString xgetInscriptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "inscriptions" element
         */
        public int sizeOfInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONS$0);
            }
        }
        
        /**
         * Sets array of all "inscriptions" element
         */
        @Inject(optional=true) public void setInscriptionsArray(java.lang.String[] inscriptionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inscriptionsArray, INSCRIPTIONS$0);
            }
        }
        
        /**
         * Sets ith "inscriptions" element
         */
        @Inject(optional=true) public void setInscriptionsArray(int i, java.lang.String inscriptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(inscriptions);
            }
        }
        
        /**
         * Sets (as xml) array of all "inscriptions" element
         */
        public void xsetInscriptionsArray(org.apache.xmlbeans.XmlString[]inscriptionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inscriptionsArray, INSCRIPTIONS$0);
            }
        }
        
        /**
         * Sets (as xml) ith "inscriptions" element
         */
        public void xsetInscriptionsArray(int i, org.apache.xmlbeans.XmlString inscriptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(inscriptions);
            }
        }
        
        /**
         * Inserts the value as the ith "inscriptions" element
         */
        public void insertInscriptions(int i, java.lang.String inscriptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INSCRIPTIONS$0, i);
                target.setStringValue(inscriptions);
            }
        }
        
        /**
         * Appends the value as the last "inscriptions" element
         */
        public void addInscriptions(java.lang.String inscriptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSCRIPTIONS$0);
                target.setStringValue(inscriptions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "inscriptions" element
         */
        public org.apache.xmlbeans.XmlString insertNewInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(INSCRIPTIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "inscriptions" element
         */
        public org.apache.xmlbeans.XmlString addNewInscriptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSCRIPTIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "inscriptions" element
         */
        public void removeInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONS$0, i);
            }
        }
    }
}
