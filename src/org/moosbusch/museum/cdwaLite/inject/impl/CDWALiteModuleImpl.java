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
package org.moosbusch.museum.cdwaLite.inject.impl;

import com.google.inject.Provides;
import edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument;
import edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument.AdministrativeMetadata;
import edu.getty.cdwa.cdwaLite.AttributionQualifierCreatorDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.ClassWrapDocument;
import edu.getty.cdwa.cdwaLite.ClassificationDocument;
import edu.getty.cdwa.cdwaLite.CultureDocument;
import edu.getty.cdwa.cdwaLite.CultureWrapDocument;
import edu.getty.cdwa.cdwaLite.DateQualifierDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument.DescriptiveMetadata;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument;
import edu.getty.cdwa.cdwaLite.DisplayCreationDateDocument;
import edu.getty.cdwa.cdwaLite.DisplayCreatorDocument;
import edu.getty.cdwa.cdwaLite.DisplayEditionDocument;
import edu.getty.cdwa.cdwaLite.DisplayMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.DisplayMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.DisplayStateDocument;
import edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument;
import edu.getty.cdwa.cdwaLite.EarliestDateDocument;
import edu.getty.cdwa.cdwaLite.ExtentCreatorDocument;
import edu.getty.cdwa.cdwaLite.ExtentMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.ExtentMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.ExtentSubjectDocument;
import edu.getty.cdwa.cdwaLite.FormatMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.GenderCreatorDocument;
import edu.getty.cdwa.cdwaLite.IndentifierAttribute;
import edu.getty.cdwa.cdwaLite.IndexingCreatorSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument;
import edu.getty.cdwa.cdwaLite.InscriptionsDocument;
import edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument;
import edu.getty.cdwa.cdwaLite.LabelRelatedResourceDocument;
import edu.getty.cdwa.cdwaLite.LabelRelatedWorkDocument;
import edu.getty.cdwa.cdwaLite.LangAttribute;
import edu.getty.cdwa.cdwaLite.LangtermsourceAttribute;
import edu.getty.cdwa.cdwaLite.LatestDateDocument;
import edu.getty.cdwa.cdwaLite.LinkRelatedResourceDocument;
import edu.getty.cdwa.cdwaLite.LinkRelatedWorkDocument;
import edu.getty.cdwa.cdwaLite.LinkResourceDocument;
import edu.getty.cdwa.cdwaLite.LinkschemeAttribute;
import edu.getty.cdwa.cdwaLite.LocIDAttribute;
import edu.getty.cdwa.cdwaLite.LocIDtypeAttribute;
import edu.getty.cdwa.cdwaLite.LocRelatedWorkDocument;
import edu.getty.cdwa.cdwaLite.LocationNameDocument;
import edu.getty.cdwa.cdwaLite.LocationSetDocument;
import edu.getty.cdwa.cdwaLite.LocationWrapDocument;
import edu.getty.cdwa.cdwaLite.MeasurementsSetDocument;
import edu.getty.cdwa.cdwaLite.NameCreatorDocument;
import edu.getty.cdwa.cdwaLite.NameCreatorSetDocument;
import edu.getty.cdwa.cdwaLite.NationalityCreatorDocument;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument;
import edu.getty.cdwa.cdwaLite.PrefAttribute;
import edu.getty.cdwa.cdwaLite.QualifierMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.RecordIDDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoIDDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoLinkDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument;
import edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument;
import edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument;
import edu.getty.cdwa.cdwaLite.RecordRelIDDocument;
import edu.getty.cdwa.cdwaLite.RecordSourceDocument;
import edu.getty.cdwa.cdwaLite.RecordTypeDocument;
import edu.getty.cdwa.cdwaLite.RecordWrapDocument;
import edu.getty.cdwa.cdwaLite.RelatedResourceRelTypeDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorkRelTypeDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument;
import edu.getty.cdwa.cdwaLite.ResourceIDDocument;
import edu.getty.cdwa.cdwaLite.ResourceMetadataLocDocument;
import edu.getty.cdwa.cdwaLite.ResourceRelTypeDocument;
import edu.getty.cdwa.cdwaLite.ResourceSetDocument;
import edu.getty.cdwa.cdwaLite.ResourceSourceDocument;
import edu.getty.cdwa.cdwaLite.ResourceTypeDocument;
import edu.getty.cdwa.cdwaLite.ResourceViewDateDocument;
import edu.getty.cdwa.cdwaLite.ResourceViewDescriptionDocument;
import edu.getty.cdwa.cdwaLite.ResourceViewSubjectTermDocument;
import edu.getty.cdwa.cdwaLite.ResourceViewTypeDocument;
import edu.getty.cdwa.cdwaLite.ResourceWrapDocument;
import edu.getty.cdwa.cdwaLite.ResourceWrapDocument.ResourceWrap;
import edu.getty.cdwa.cdwaLite.RightsResourceDocument;
import edu.getty.cdwa.cdwaLite.RightsWorkDocument;
import edu.getty.cdwa.cdwaLite.RoleCreatorDocument;
import edu.getty.cdwa.cdwaLite.ScaleMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.ShapeMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.SourceDescriptiveNoteDocument;
import edu.getty.cdwa.cdwaLite.SourceMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.SourceNameCreatorDocument;
import edu.getty.cdwa.cdwaLite.SourceStateEditionDocument;
import edu.getty.cdwa.cdwaLite.SourceTitleDocument;
import edu.getty.cdwa.cdwaLite.StyleDocument;
import edu.getty.cdwa.cdwaLite.StyleWrapDocument;
import edu.getty.cdwa.cdwaLite.StyleWrapDocument.StyleWrap;
import edu.getty.cdwa.cdwaLite.SubjectTermDocument;
import edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.TermsourceAttribute;
import edu.getty.cdwa.cdwaLite.TermsourceIDAttribute;
import edu.getty.cdwa.cdwaLite.TitleDocument;
import edu.getty.cdwa.cdwaLite.TitleSetDocument;
import edu.getty.cdwa.cdwaLite.TitleWrapDocument;
import edu.getty.cdwa.cdwaLite.TitleWrapDocument.TitleWrap;
import edu.getty.cdwa.cdwaLite.TypeAttribute;
import edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument;
import edu.getty.cdwa.cdwaLite.WorkIDDocument;
import org.moosbusch.museum.cdwaLite.document.Document;
import org.moosbusch.museum.cdwaLite.document.impl.DocumentImpl;
import org.moosbusch.museum.cdwaLite.inject.spi.AbstractCDWALiteModule;

/**
 *
 * @author moosbusch
 */
public class CDWALiteModuleImpl extends AbstractCDWALiteModule {

    @Override
    protected void configureImpl() {
    }

    @Provides
    @Override
    public Document<? extends CDWALiteObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    @Override
    public AdministrativeMetadata createAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadata.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceWrap createResourceWrap() {
        ResourceWrap result = ResourceWrap.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadata createDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadata.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public StyleWrap createStyleWrap() {
        StyleWrap result = StyleWrap.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TitleWrap createTitleWrap() {
        TitleWrap result = TitleWrap.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public InscriptionsDocument createInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LangAttribute createLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LangtermsourceAttribute createLangtermsourceAttribute() {
        LangtermsourceAttribute result = LangtermsourceAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LatestDateDocument createLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkResourceDocument createLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkschemeAttribute createLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocationNameDocument createLocationNameDocument() {
        LocationNameDocument result = LocationNameDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocationSetDocument createLocationSetDocument() {
        LocationSetDocument result = LocationSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocationWrapDocument createLocationWrapDocument() {
        LocationWrapDocument result = LocationWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDAttribute createLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDtypeAttribute createLocIDtypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocRelatedWorkDocument createLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MeasurementsSetDocument createMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NameCreatorDocument createNameCreatorDocument() {
        NameCreatorDocument result = NameCreatorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NameCreatorSetDocument createNameCreatorSetDocument() {
        NameCreatorSetDocument result = NameCreatorSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NationalityCreatorDocument createNationalityCreatorDocument() {
        NationalityCreatorDocument result = NationalityCreatorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument createObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public QualifierMeasurementsDocument createQualifierMeasurementsDocument() {
        QualifierMeasurementsDocument result = QualifierMeasurementsDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RecordIDDocument createRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoIDDocument createRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoLinkDocument createRecordInfoLinkDocument() {
        RecordInfoLinkDocument result = RecordInfoLinkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoWrapDocument createRecordInfoWrapDocument() {
        RecordInfoWrapDocument result = RecordInfoWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataDateDocument createRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataLocDocument createRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordRelIDDocument createRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordSourceDocument createRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordTypeDocument createRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkSetDocument createRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceIDDocument createResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceMetadataLocDocument createResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceRelTypeDocument createResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSetDocument createResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSourceDocument createResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceTypeDocument createResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDateDocument createResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewTypeDocument createResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsResourceDocument createRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsWorkDocument createRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RoleCreatorDocument createRoleCreatorDocument() {
        RoleCreatorDocument result = RoleCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ScaleMeasurementsDocument createScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ShapeMeasurementsDocument createShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameCreatorDocument createSourceNameCreatorDocument() {
        SourceNameCreatorDocument result = SourceNameCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceStateEditionDocument createSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceTitleDocument createSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleWrapDocument createStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SubjectTermDocument createSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermMaterialsTechDocument createTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermsourceAttribute createTermsourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermsourceIDAttribute createTermsourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleSetDocument createTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public VitalDatesCreatorDocument createVitalDatesCreatorDocument() {
        VitalDatesCreatorDocument result = VitalDatesCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public WorkIDDocument createWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AttributionQualifierCreatorDocument createAttributionQualifierCreatorDocument() {
        AttributionQualifierCreatorDocument result = AttributionQualifierCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CdwaliteDocument createCdwaliteDocument() {
        CdwaliteDocument result = CdwaliteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CdwaliteWrapDocument createCdwaliteWrapDocument() {
        CdwaliteWrapDocument result = CdwaliteWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CdwaliteWrapDocument.CdwaliteWrap createCdwaliteWrap() {
        CdwaliteWrapDocument.CdwaliteWrap result = CdwaliteWrapDocument.CdwaliteWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CdwaliteDocument.Cdwalite createCdwalite() {
        CdwaliteDocument.Cdwalite result = CdwaliteDocument.Cdwalite.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationDocument createClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassWrapDocument createClassWrapDocument() {
        ClassWrapDocument result = ClassWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassWrapDocument.ClassWrap createClassWrap() {
        ClassWrapDocument.ClassWrap result = ClassWrapDocument.ClassWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureDocument createCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrapDocument createCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrapDocument.CultureWrap createCultureWrap() {
        CultureWrapDocument.CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureDocument.Culture createCulture() {
        CultureDocument.Culture result = CultureDocument.Culture.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DateQualifierDocument createDateQualifierDocument() {
        DateQualifierDocument result = DateQualifierDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteDocument createDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument.DescriptiveNoteWrap createDescriptiveNoteWrap() {
        DescriptiveNoteWrapDocument.DescriptiveNoteWrap result =
                DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationDateDocument createDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreatorDocument createDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEditionDocument createDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateDocument createDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result =
                DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EarliestDateDocument createEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentCreatorDocument createExtentCreatorDocument() {
        ExtentCreatorDocument result = ExtentCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMeasurementsDocument createExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentSubjectDocument createExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public FormatMeasurementsDocument createFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public GenderCreatorDocument createGenderCreatorDocument() {
        GenderCreatorDocument result = GenderCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndentifierAttribute createIndentifierAttribute() {
        IndentifierAttribute result = IndentifierAttribute.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingCreatorSetDocument createIndexingCreatorSetDocument() {
        IndexingCreatorSetDocument result = IndexingCreatorSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingCreatorWrapDocument createIndexingCreatorWrapDocument() {
        IndexingCreatorWrapDocument result = IndexingCreatorWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingCreatorWrapDocument.IndexingCreatorWrap createIndexingCreatorWrap() {
        IndexingCreatorWrapDocument.IndexingCreatorWrap result =
                IndexingCreatorWrapDocument.IndexingCreatorWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingDatesSetDocument createIndexingDatesSetDocument() {
        IndexingDatesSetDocument result = IndexingDatesSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingDatesWrapDocument createIndexingDatesWrapDocument() {
        IndexingDatesWrapDocument result = IndexingDatesWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingDatesWrapDocument.IndexingDatesWrap createIndexingDatesWrap() {
        IndexingDatesWrapDocument.IndexingDatesWrap result =
                IndexingDatesWrapDocument.IndexingDatesWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap createIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap result =
                IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap createIndexingMeasurementsWrap() {
        IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap result =
                IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument.IndexingSubjectWrap createIndexingSubjectWrap() {
        IndexingSubjectWrapDocument.IndexingSubjectWrap result =
                IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result =
                InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LocationWrapDocument.LocationWrap createLocationWrap() {
        LocationWrapDocument.LocationWrap result =
                LocationWrapDocument.LocationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument.ObjectWorkType createObjectWorkType() {
        ObjectWorkTypeDocument.ObjectWorkType result =
                ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoWrapDocument.RecordInfoWrap createRecordInfoWrap() {
        RecordInfoWrapDocument.RecordInfoWrap result =
                RecordInfoWrapDocument.RecordInfoWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result =
                RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();

        return result;
    }
}