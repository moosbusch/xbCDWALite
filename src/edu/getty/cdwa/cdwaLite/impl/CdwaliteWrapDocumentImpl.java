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
 * A document containing one cdwaliteWrap(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public class CdwaliteWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument
{
    private static final long serialVersionUID = 1L;

    public CdwaliteWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName CDWALITEWRAP$0 =
        new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "cdwaliteWrap");


    /**
     * Gets the "cdwaliteWrap" element
     */
    public edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap getCdwaliteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap)get_store().find_element_user(CDWALITEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "cdwaliteWrap" element
     */
    @Inject(optional=true) public void setCdwaliteWrap(edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap cdwaliteWrap)
    {
        generatedSetterHelperImpl(cdwaliteWrap, CDWALITEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "cdwaliteWrap" element
     */
    public edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap addNewCdwaliteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap target = null;
            target = (edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap)get_store().add_element_user(CDWALITEWRAP$0);
            return target;
        }
    }
    /**
     * An XML cdwaliteWrap(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public static class CdwaliteWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap
    {
        private static final long serialVersionUID = 1L;

        public CdwaliteWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName CDWALITE$0 =
            new javax.xml.namespace.QName("http://www.getty.edu/CDWA/CDWALite", "cdwalite");


        /**
         * Gets a List of "cdwalite" elements
         */
        public java.util.List<edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite> getCdwaliteList()
        {
            final class CdwaliteList extends java.util.AbstractList<edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite>
            {
                @Override
                public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite get(int i)
                    { return CdwaliteWrapImpl.this.getCdwaliteArray(i); }

                @Override
                public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite set(int i, edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite o)
                {
                    edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite old = CdwaliteWrapImpl.this.getCdwaliteArray(i);
                    CdwaliteWrapImpl.this.setCdwaliteArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite o)
                    { CdwaliteWrapImpl.this.insertNewCdwalite(i).set(o); }

                @Override
                public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite remove(int i)
                {
                    edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite old = CdwaliteWrapImpl.this.getCdwaliteArray(i);
                    CdwaliteWrapImpl.this.removeCdwalite(i);
                    return old;
                }

                @Override
                public int size()
                    { return CdwaliteWrapImpl.this.sizeOfCdwaliteArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new CdwaliteList();
            }
        }

        /**
         * Gets array of all "cdwalite" elements
         * @deprecated
         */
        @Deprecated
        public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite[] getCdwaliteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite> targetList = new java.util.ArrayList<edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite>();
                get_store().find_all_element_users(CDWALITE$0, targetList);
                edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite[] result = new edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "cdwalite" element
         */
        public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite getCdwaliteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite target = null;
                target = (edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite)get_store().find_element_user(CDWALITE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "cdwalite" element
         */
        public int sizeOfCdwaliteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CDWALITE$0);
            }
        }

        /**
         * Sets array of all "cdwalite" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setCdwaliteArray(edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite[] cdwaliteArray)
        {
            check_orphaned();
            arraySetterHelper(cdwaliteArray, CDWALITE$0);
        }

        /**
         * Sets ith "cdwalite" element
         */
        @Inject(optional=true) public void setCdwaliteArray(int i, edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite cdwalite)
        {
            generatedSetterHelperImpl(cdwalite, CDWALITE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "cdwalite" element
         */
        public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite insertNewCdwalite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite target = null;
                target = (edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite)get_store().insert_element_user(CDWALITE$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "cdwalite" element
         */
        public edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite addNewCdwalite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite target = null;
                target = (edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite)get_store().add_element_user(CDWALITE$0);
                return target;
            }
        }

        /**
         * Removes the ith "cdwalite" element
         */
        public void removeCdwalite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CDWALITE$0, i);
            }
        }
    }
}
