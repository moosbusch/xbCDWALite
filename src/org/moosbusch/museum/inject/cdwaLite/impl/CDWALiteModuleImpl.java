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
package org.moosbusch.museum.inject.cdwaLite.impl;

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
import org.moosbusch.museum.document.cdwaLite.Document;
import org.moosbusch.museum.document.cdwaLite.impl.DocumentImpl;
import org.moosbusch.museum.inject.cdwaLite.spi.AbstractCDWALiteModule;

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
    public AdministrativeMetadata createCdwaLiteAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadata.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public ResourceWrap createCdwaLiteResourceWrap() {
        ResourceWrap result = ResourceWrap.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public DescriptiveMetadata createCdwaLiteDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadata.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public StyleWrap createCdwaLiteStyleWrap() {
        StyleWrap result = StyleWrap.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public TitleWrap createCdwaLiteTitleWrap() {
        TitleWrap result = TitleWrap.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public IndexingSubjectWrapDocument createCdwaLiteIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public InscriptionsDocument createCdwaLiteInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public InscriptionsWrapDocument createCdwaLiteInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LabelRelatedResourceDocument createCdwaLiteLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LabelRelatedWorkDocument createCdwaLiteLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LangAttribute createCdwaLiteLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LangtermsourceAttribute createCdwaLiteLangtermsourceAttribute() {
        LangtermsourceAttribute result = LangtermsourceAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LatestDateDocument createCdwaLiteLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LinkRelatedResourceDocument createCdwaLiteLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LinkRelatedWorkDocument createCdwaLiteLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LinkResourceDocument createCdwaLiteLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LinkschemeAttribute createCdwaLiteLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocationNameDocument createCdwaLiteLocationNameDocument() {
        LocationNameDocument result = LocationNameDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocationSetDocument createCdwaLiteLocationSetDocument() {
        LocationSetDocument result = LocationSetDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocationWrapDocument createCdwaLiteLocationWrapDocument() {
        LocationWrapDocument result = LocationWrapDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocIDAttribute createCdwaLiteLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocIDtypeAttribute createCdwaLiteLocIDtypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public LocRelatedWorkDocument createCdwaLiteLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public MeasurementsSetDocument createCdwaLiteMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public NameCreatorDocument createCdwaLiteNameCreatorDocument() {
        NameCreatorDocument result = NameCreatorDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public NameCreatorSetDocument createCdwaLiteNameCreatorSetDocument() {
        NameCreatorSetDocument result = NameCreatorSetDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public NationalityCreatorDocument createCdwaLiteNationalityCreatorDocument() {
        NationalityCreatorDocument result = NationalityCreatorDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeDocument createCdwaLiteObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createCdwaLiteObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public PrefAttribute createCdwaLitePrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public QualifierMeasurementsDocument createCdwaLiteQualifierMeasurementsDocument() {
        QualifierMeasurementsDocument result = QualifierMeasurementsDocument.Factory.newInstance();
        return result;
    }


    @Provides
    @Override
    public RecordIDDocument createCdwaLiteRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordInfoIDDocument createCdwaLiteRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordInfoLinkDocument createCdwaLiteRecordInfoLinkDocument() {
        RecordInfoLinkDocument result = RecordInfoLinkDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordInfoWrapDocument createCdwaLiteRecordInfoWrapDocument() {
        RecordInfoWrapDocument result = RecordInfoWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordMetadataDateDocument createCdwaLiteRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordMetadataLocDocument createCdwaLiteRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordRelIDDocument createCdwaLiteRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordSourceDocument createCdwaLiteRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordTypeDocument createCdwaLiteRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordWrapDocument createCdwaLiteRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedResourceRelTypeDocument createCdwaLiteRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorkRelTypeDocument createCdwaLiteRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorkSetDocument createCdwaLiteRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorksWrapDocument createCdwaLiteRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceIDDocument createCdwaLiteResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceMetadataLocDocument createCdwaLiteResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceRelTypeDocument createCdwaLiteResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceSetDocument createCdwaLiteResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceSourceDocument createCdwaLiteResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceTypeDocument createCdwaLiteResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceViewDateDocument createCdwaLiteResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceViewDescriptionDocument createCdwaLiteResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceViewSubjectTermDocument createCdwaLiteResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceViewTypeDocument createCdwaLiteResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ResourceWrapDocument createCdwaLiteResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsResourceDocument createCdwaLiteRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RightsWorkDocument createCdwaLiteRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RoleCreatorDocument createCdwaLiteRoleCreatorDocument() {
        RoleCreatorDocument result = RoleCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ScaleMeasurementsDocument createCdwaLiteScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ShapeMeasurementsDocument createCdwaLiteShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceDescriptiveNoteDocument createCdwaLiteSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceMaterialsTechDocument createCdwaLiteSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceNameCreatorDocument createCdwaLiteSourceNameCreatorDocument() {
        SourceNameCreatorDocument result = SourceNameCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceStateEditionDocument createCdwaLiteSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SourceTitleDocument createCdwaLiteSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StyleDocument createCdwaLiteStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public StyleWrapDocument createCdwaLiteStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public SubjectTermDocument createCdwaLiteSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TermMaterialsTechDocument createCdwaLiteTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TermsourceAttribute createCdwaLiteTermsourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TermsourceIDAttribute createCdwaLiteTermsourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleDocument createCdwaLiteTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleSetDocument createCdwaLiteTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleSetDocument.TitleSet createCdwaLiteTitleSet() {
        TitleSetDocument.TitleSet result = TitleSetDocument.TitleSet.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleDocument.Title createCdwaLiteTitle() {
        TitleDocument.Title result = TitleDocument.Title.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TitleWrapDocument createCdwaLiteTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public TypeAttribute createCdwaLiteTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public VitalDatesCreatorDocument createCdwaLiteVitalDatesCreatorDocument() {
        VitalDatesCreatorDocument result = VitalDatesCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public WorkIDDocument createCdwaLiteWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AdministrativeMetadataDocument createCdwaLiteAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public AttributionQualifierCreatorDocument createCdwaLiteAttributionQualifierCreatorDocument() {
        AttributionQualifierCreatorDocument result = AttributionQualifierCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CdwaliteDocument createCdwaLiteCdwaliteDocument() {
        CdwaliteDocument result = CdwaliteDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CdwaliteWrapDocument createCdwaLiteCdwaliteWrapDocument() {
        CdwaliteWrapDocument result = CdwaliteWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CdwaliteWrapDocument.CdwaliteWrap createCdwaLiteCdwaliteWrap() {
        CdwaliteWrapDocument.CdwaliteWrap result = CdwaliteWrapDocument.CdwaliteWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CdwaliteDocument.Cdwalite createCdwaLiteCdwalite() {
        CdwaliteDocument.Cdwalite result = CdwaliteDocument.Cdwalite.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassificationDocument createCdwaLiteClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassWrapDocument createCdwaLiteClassWrapDocument() {
        ClassWrapDocument result = ClassWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ClassWrapDocument.ClassWrap createCdwaLiteClassWrap() {
        ClassWrapDocument.ClassWrap result = ClassWrapDocument.ClassWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CultureDocument createCdwaLiteCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CultureWrapDocument createCdwaLiteCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CultureWrapDocument.CultureWrap createCdwaLiteCultureWrap() {
        CultureWrapDocument.CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public CultureDocument.Culture createCdwaLiteCulture() {
        CultureDocument.Culture result = CultureDocument.Culture.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DateQualifierDocument createCdwaLiteDateQualifierDocument() {
        DateQualifierDocument result = DateQualifierDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveMetadataDocument createCdwaLiteDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveNoteDocument createCdwaLiteDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveNoteSetDocument createCdwaLiteDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveNoteWrapDocument createCdwaLiteDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DescriptiveNoteWrapDocument.DescriptiveNoteWrap createCdwaLiteDescriptiveNoteWrap() {
        DescriptiveNoteWrapDocument.DescriptiveNoteWrap result
                = DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayCreationDateDocument createCdwaLiteDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayCreatorDocument createCdwaLiteDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayEditionDocument createCdwaLiteDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayMaterialsTechDocument createCdwaLiteDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayMeasurementsDocument createCdwaLiteDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayStateDocument createCdwaLiteDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayStateEditionWrapDocument createCdwaLiteDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createCdwaLiteDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result
                = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public EarliestDateDocument createCdwaLiteEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentCreatorDocument createCdwaLiteExtentCreatorDocument() {
        ExtentCreatorDocument result = ExtentCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentMaterialsTechDocument createCdwaLiteExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentMeasurementsDocument createCdwaLiteExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ExtentSubjectDocument createCdwaLiteExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public FormatMeasurementsDocument createCdwaLiteFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public GenderCreatorDocument createCdwaLiteGenderCreatorDocument() {
        GenderCreatorDocument result = GenderCreatorDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndentifierAttribute createCdwaLiteIndentifierAttribute() {
        IndentifierAttribute result = IndentifierAttribute.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingCreatorSetDocument createCdwaLiteIndexingCreatorSetDocument() {
        IndexingCreatorSetDocument result = IndexingCreatorSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingCreatorWrapDocument createCdwaLiteIndexingCreatorWrapDocument() {
        IndexingCreatorWrapDocument result = IndexingCreatorWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingCreatorWrapDocument.IndexingCreatorWrap createCdwaLiteIndexingCreatorWrap() {
        IndexingCreatorWrapDocument.IndexingCreatorWrap result
                = IndexingCreatorWrapDocument.IndexingCreatorWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingDatesSetDocument createCdwaLiteIndexingDatesSetDocument() {
        IndexingDatesSetDocument result = IndexingDatesSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingDatesWrapDocument createCdwaLiteIndexingDatesWrapDocument() {
        IndexingDatesWrapDocument result = IndexingDatesWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingDatesWrapDocument.IndexingDatesWrap createCdwaLiteIndexingDatesWrap() {
        IndexingDatesWrapDocument.IndexingDatesWrap result
                = IndexingDatesWrapDocument.IndexingDatesWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createCdwaLiteIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createCdwaLiteIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap createCdwaLiteIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap result
                = IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMeasurementsSetDocument createCdwaLiteIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createCdwaLiteIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap createCdwaLiteIndexingMeasurementsWrap() {
        IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap result
                = IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingSubjectSetDocument createCdwaLiteIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingSubjectWrapDocument.IndexingSubjectWrap createCdwaLiteIndexingSubjectWrap() {
        IndexingSubjectWrapDocument.IndexingSubjectWrap result
                = IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createCdwaLiteInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result
                = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public LocationWrapDocument.LocationWrap createCdwaLiteLocationWrap() {
        LocationWrapDocument.LocationWrap result
                = LocationWrapDocument.LocationWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createCdwaLiteObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result
                = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public ObjectWorkTypeDocument.ObjectWorkType createCdwaLiteObjectWorkType() {
        ObjectWorkTypeDocument.ObjectWorkType result
                = ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordInfoWrapDocument.RecordInfoWrap createCdwaLiteRecordInfoWrap() {
        RecordInfoWrapDocument.RecordInfoWrap result
                = RecordInfoWrapDocument.RecordInfoWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createCdwaLiteRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createCdwaLiteRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result
                = RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();

        return result;
    }


    @Provides
    @Override
    public IndexingCreatorSetDocument.IndexingCreatorSet createCdwaLiteIndexingCreatorSet() {
        return IndexingCreatorSetDocument.IndexingCreatorSet.Factory.newInstance();
    }


    @Provides
    @Override
    public NameCreatorSetDocument.NameCreatorSet createCdwaLiteNameCreatorSet() {
        return NameCreatorSetDocument.NameCreatorSet.Factory.newInstance();
    }


    @Provides
    @Override
    public NameCreatorDocument.NameCreator createCdwaLiteNameCreator() {
        return NameCreatorDocument.NameCreator.Factory.newInstance();
    }


    @Provides
    @Override
    public RoleCreatorDocument.RoleCreator createCdwaLiteRoleCreator() {
        return RoleCreatorDocument.RoleCreator.Factory.newInstance();
    }


    @Provides
    @Override
    public IndexingDatesSetDocument.IndexingDatesSet createCdwaLiteIndexingDatesSet() {
        return IndexingDatesSetDocument.IndexingDatesSet.Factory.newInstance();
    }


    @Provides
    @Override
    public EarliestDateDocument.EarliestDate createCdwaLiteEarliestDate() {
        return EarliestDateDocument.EarliestDate.Factory.newInstance();
    }


    @Provides
    @Override
    public LatestDateDocument.LatestDate createCdwaLiteLatestDateDate() {
        return LatestDateDocument.LatestDate.Factory.newInstance();
    }


    @Provides
    @Override
    public LocationSetDocument.LocationSet createCdwaLiteLocationSet() {
        return LocationSetDocument.LocationSet.Factory.newInstance();
    }


    @Provides
    @Override
    public LocationNameDocument.LocationName createCdwaLiteLocationName() {
        return LocationNameDocument.LocationName.Factory.newInstance();
    }
}