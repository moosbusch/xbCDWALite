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
package edu.getty.cdwa.cdwaLite;


/**
 * A document containing one resourceSet(@http://www.getty.edu/CDWA/CDWALite) element.
 *
 * This is a complex type.
 */
public interface ResourceSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("resourceseta1cddoctype");
    
    /**
     * Gets the "resourceSet" element
     */
    edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet getResourceSet();
    
    /**
     * Sets the "resourceSet" element
     */
    void setResourceSet(edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet resourceSet);
    
    /**
     * Appends and returns a new empty "resourceSet" element
     */
    edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet addNewResourceSet();
    
    /**
     * An XML resourceSet(@http://www.getty.edu/CDWA/CDWALite).
     *
     * This is a complex type.
     */
    public interface ResourceSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F643FAF4399D1206A04583D585DB128").resolveHandle("resourceset17edelemtype");
        
        /**
         * Gets the "linkResource" element
         */
        edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource getLinkResource();
        
        /**
         * True if has "linkResource" element
         */
        boolean isSetLinkResource();
        
        /**
         * Sets the "linkResource" element
         */
        void setLinkResource(edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource linkResource);
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        edu.getty.cdwa.cdwaLite.LinkResourceDocument.LinkResource addNewLinkResource();
        
        /**
         * Unsets the "linkResource" element
         */
        void unsetLinkResource();
        
        /**
         * Gets the "resourceID" element
         */
        edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID getResourceID();
        
        /**
         * True if has "resourceID" element
         */
        boolean isSetResourceID();
        
        /**
         * Sets the "resourceID" element
         */
        void setResourceID(edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID resourceID);
        
        /**
         * Appends and returns a new empty "resourceID" element
         */
        edu.getty.cdwa.cdwaLite.ResourceIDDocument.ResourceID addNewResourceID();
        
        /**
         * Unsets the "resourceID" element
         */
        void unsetResourceID();
        
        /**
         * Gets a List of "resourceRelType" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType> getResourceRelTypeList();
        
        /**
         * Gets array of all "resourceRelType" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[] getResourceRelTypeArray();
        
        /**
         * Gets ith "resourceRelType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType getResourceRelTypeArray(int i);
        
        /**
         * Returns number of "resourceRelType" element
         */
        int sizeOfResourceRelTypeArray();
        
        /**
         * Sets array of all "resourceRelType" element
         */
        void setResourceRelTypeArray(edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType[] resourceRelTypeArray);
        
        /**
         * Sets ith "resourceRelType" element
         */
        void setResourceRelTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType resourceRelType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType insertNewResourceRelType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument.ResourceRelType addNewResourceRelType();
        
        /**
         * Removes the ith "resourceRelType" element
         */
        void removeResourceRelType(int i);
        
        /**
         * Gets a List of "resourceType" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType> getResourceTypeList();
        
        /**
         * Gets array of all "resourceType" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[] getResourceTypeArray();
        
        /**
         * Gets ith "resourceType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType getResourceTypeArray(int i);
        
        /**
         * Returns number of "resourceType" element
         */
        int sizeOfResourceTypeArray();
        
        /**
         * Sets array of all "resourceType" element
         */
        void setResourceTypeArray(edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType[] resourceTypeArray);
        
        /**
         * Sets ith "resourceType" element
         */
        void setResourceTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType resourceType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType insertNewResourceType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceTypeDocument.ResourceType addNewResourceType();
        
        /**
         * Removes the ith "resourceType" element
         */
        void removeResourceType(int i);
        
        /**
         * Gets a List of "rightsResource" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource> getRightsResourceList();
        
        /**
         * Gets array of all "rightsResource" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[] getRightsResourceArray();
        
        /**
         * Gets ith "rightsResource" element
         */
        edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource getRightsResourceArray(int i);
        
        /**
         * Returns number of "rightsResource" element
         */
        int sizeOfRightsResourceArray();
        
        /**
         * Sets array of all "rightsResource" element
         */
        void setRightsResourceArray(edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource[] rightsResourceArray);
        
        /**
         * Sets ith "rightsResource" element
         */
        void setRightsResourceArray(int i, edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource rightsResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
         */
        edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource insertNewRightsResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsResource" element
         */
        edu.getty.cdwa.cdwaLite.RightsResourceDocument.RightsResource addNewRightsResource();
        
        /**
         * Removes the ith "rightsResource" element
         */
        void removeRightsResource(int i);
        
        /**
         * Gets the "resourceViewDescription" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription getResourceViewDescription();
        
        /**
         * True if has "resourceViewDescription" element
         */
        boolean isSetResourceViewDescription();
        
        /**
         * Sets the "resourceViewDescription" element
         */
        void setResourceViewDescription(edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription resourceViewDescription);
        
        /**
         * Appends and returns a new empty "resourceViewDescription" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument.ResourceViewDescription addNewResourceViewDescription();
        
        /**
         * Unsets the "resourceViewDescription" element
         */
        void unsetResourceViewDescription();
        
        /**
         * Gets a List of "resourceViewType" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType> getResourceViewTypeList();
        
        /**
         * Gets array of all "resourceViewType" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[] getResourceViewTypeArray();
        
        /**
         * Gets ith "resourceViewType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType getResourceViewTypeArray(int i);
        
        /**
         * Returns number of "resourceViewType" element
         */
        int sizeOfResourceViewTypeArray();
        
        /**
         * Sets array of all "resourceViewType" element
         */
        void setResourceViewTypeArray(edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType[] resourceViewTypeArray);
        
        /**
         * Sets ith "resourceViewType" element
         */
        void setResourceViewTypeArray(int i, edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType resourceViewType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType insertNewResourceViewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewType" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument.ResourceViewType addNewResourceViewType();
        
        /**
         * Removes the ith "resourceViewType" element
         */
        void removeResourceViewType(int i);
        
        /**
         * Gets a List of "resourceViewSubjectTerm" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> getResourceViewSubjectTermList();
        
        /**
         * Gets array of all "resourceViewSubjectTerm" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] getResourceViewSubjectTermArray();
        
        /**
         * Gets ith "resourceViewSubjectTerm" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm getResourceViewSubjectTermArray(int i);
        
        /**
         * Returns number of "resourceViewSubjectTerm" element
         */
        int sizeOfResourceViewSubjectTermArray();
        
        /**
         * Sets array of all "resourceViewSubjectTerm" element
         */
        void setResourceViewSubjectTermArray(edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] resourceViewSubjectTermArray);
        
        /**
         * Sets ith "resourceViewSubjectTerm" element
         */
        void setResourceViewSubjectTermArray(int i, edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm resourceViewSubjectTerm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewSubjectTerm" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm insertNewResourceViewSubjectTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewSubjectTerm" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm addNewResourceViewSubjectTerm();
        
        /**
         * Removes the ith "resourceViewSubjectTerm" element
         */
        void removeResourceViewSubjectTerm(int i);
        
        /**
         * Gets the "resourceViewDate" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate getResourceViewDate();
        
        /**
         * True if has "resourceViewDate" element
         */
        boolean isSetResourceViewDate();
        
        /**
         * Sets the "resourceViewDate" element
         */
        void setResourceViewDate(edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate resourceViewDate);
        
        /**
         * Appends and returns a new empty "resourceViewDate" element
         */
        edu.getty.cdwa.cdwaLite.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate();
        
        /**
         * Unsets the "resourceViewDate" element
         */
        void unsetResourceViewDate();
        
        /**
         * Gets a List of "resourceSource" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource> getResourceSourceList();
        
        /**
         * Gets array of all "resourceSource" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[] getResourceSourceArray();
        
        /**
         * Gets ith "resourceSource" element
         */
        edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource getResourceSourceArray(int i);
        
        /**
         * Returns number of "resourceSource" element
         */
        int sizeOfResourceSourceArray();
        
        /**
         * Sets array of all "resourceSource" element
         */
        void setResourceSourceArray(edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource[] resourceSourceArray);
        
        /**
         * Sets ith "resourceSource" element
         */
        void setResourceSourceArray(int i, edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource resourceSource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
         */
        edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource insertNewResourceSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSource" element
         */
        edu.getty.cdwa.cdwaLite.ResourceSourceDocument.ResourceSource addNewResourceSource();
        
        /**
         * Removes the ith "resourceSource" element
         */
        void removeResourceSource(int i);
        
        /**
         * Gets a List of "linkRelatedResource" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource> getLinkRelatedResourceList();
        
        /**
         * Gets array of all "linkRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[] getLinkRelatedResourceArray();
        
        /**
         * Gets ith "linkRelatedResource" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResourceArray(int i);
        
        /**
         * Returns number of "linkRelatedResource" element
         */
        int sizeOfLinkRelatedResourceArray();
        
        /**
         * Sets array of all "linkRelatedResource" element
         */
        void setLinkRelatedResourceArray(edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource[] linkRelatedResourceArray);
        
        /**
         * Sets ith "linkRelatedResource" element
         */
        void setLinkRelatedResourceArray(int i, edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedResource" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource insertNewLinkRelatedResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedResource" element
         */
        edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource();
        
        /**
         * Removes the ith "linkRelatedResource" element
         */
        void removeLinkRelatedResource(int i);
        
        /**
         * Gets a List of "resourceMetadataLoc" elements
         */
        java.util.List<edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc> getResourceMetadataLocList();
        
        /**
         * Gets array of all "resourceMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[] getResourceMetadataLocArray();
        
        /**
         * Gets ith "resourceMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc getResourceMetadataLocArray(int i);
        
        /**
         * Returns number of "resourceMetadataLoc" element
         */
        int sizeOfResourceMetadataLocArray();
        
        /**
         * Sets array of all "resourceMetadataLoc" element
         */
        void setResourceMetadataLocArray(edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc[] resourceMetadataLocArray);
        
        /**
         * Sets ith "resourceMetadataLoc" element
         */
        void setResourceMetadataLocArray(int i, edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc resourceMetadataLoc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc insertNewResourceMetadataLoc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMetadataLoc" element
         */
        edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument.ResourceMetadataLoc addNewResourceMetadataLoc();
        
        /**
         * Removes the ith "resourceMetadataLoc" element
         */
        void removeResourceMetadataLoc(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet newInstance() {
              return (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.getty.cdwa.cdwaLite.ResourceSetDocument.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument newInstance() {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static edu.getty.cdwa.cdwaLite.ResourceSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.getty.cdwa.cdwaLite.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
