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
package io.github.moosbusch.museum.inject.cdwaLite.impl;

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
import io.github.moosbusch.museum.document.cdwaLite.CdwaLiteXmlDocument;
import io.github.moosbusch.museum.document.cdwaLite.impl.DefaultCDWALiteObjectFactory;
import io.github.moosbusch.museum.document.cdwaLite.impl.DefaultCdwaLiteXmlDocument;
import io.github.moosbusch.museum.inject.cdwaLite.CDWALiteModule;
import io.github.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;

/**
 *
 * @author moosbusch
 */
public class DefaultCDWALiteModule extends AbstractMuseumXmlModule
    implements CDWALiteModule {

    @Provides
    @Override
    public CdwaLiteXmlDocument<? extends DefaultCDWALiteObjectFactory> createDocument() {
        return new DefaultCdwaLiteXmlDocument();
    }

    @Provides
    @Override
    public AdministrativeMetadata createCdwaLiteAdministrativeMetadata() {
        return AdministrativeMetadata.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrap createCdwaLiteResourceWrap() {
        return ResourceWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadata createCdwaLiteDescriptiveMetadata() {
        return DescriptiveMetadata.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleWrap createCdwaLiteStyleWrap() {
        return StyleWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrap createCdwaLiteTitleWrap() {
        return TitleWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument createCdwaLiteIndexingSubjectWrapDocument() {
        return IndexingSubjectWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsDocument createCdwaLiteInscriptionsDocument() {
        return InscriptionsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createCdwaLiteInscriptionsWrapDocument() {
        return InscriptionsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedResourceDocument createCdwaLiteLabelRelatedResourceDocument() {
        return LabelRelatedResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedWorkDocument createCdwaLiteLabelRelatedWorkDocument() {
        return LabelRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LangAttribute createCdwaLiteLangAttribute() {
        return LangAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LangtermsourceAttribute createCdwaLiteLangtermsourceAttribute() {
        return LangtermsourceAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LatestDateDocument createCdwaLiteLatestDateDocument() {
        return LatestDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedResourceDocument createCdwaLiteLinkRelatedResourceDocument() {
        return LinkRelatedResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedWorkDocument createCdwaLiteLinkRelatedWorkDocument() {
        return LinkRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkResourceDocument createCdwaLiteLinkResourceDocument() {
        return LinkResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkschemeAttribute createCdwaLiteLinkschemeAttribute() {
        return LinkschemeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationNameDocument createCdwaLiteLocationNameDocument() {
        return LocationNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationSetDocument createCdwaLiteLocationSetDocument() {
        return LocationSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationWrapDocument createCdwaLiteLocationWrapDocument() {
        return LocationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocIDAttribute createCdwaLiteLocIDAttribute() {
        return LocIDAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LocIDtypeAttribute createCdwaLiteLocIDtypeAttribute() {
        return LocIDtypeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LocRelatedWorkDocument createCdwaLiteLocRelatedWorkDocument() {
        return LocRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasurementsSetDocument createCdwaLiteMeasurementsSetDocument() {
        return MeasurementsSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameCreatorDocument createCdwaLiteNameCreatorDocument() {
        return NameCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameCreatorSetDocument createCdwaLiteNameCreatorSetDocument() {
        return NameCreatorSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NationalityCreatorDocument createCdwaLiteNationalityCreatorDocument() {
        return NationalityCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument createCdwaLiteObjectWorkTypeDocument() {
        return ObjectWorkTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createCdwaLiteObjectWorkTypeWrapDocument() {
        return ObjectWorkTypeWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PrefAttribute createCdwaLitePrefAttribute() {
        return PrefAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public QualifierMeasurementsDocument createCdwaLiteQualifierMeasurementsDocument() {
        return QualifierMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordIDDocument createCdwaLiteRecordIDDocument() {
        return RecordIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoIDDocument createCdwaLiteRecordInfoIDDocument() {
        return RecordInfoIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoLinkDocument createCdwaLiteRecordInfoLinkDocument() {
        return RecordInfoLinkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoWrapDocument createCdwaLiteRecordInfoWrapDocument() {
        return RecordInfoWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataDateDocument createCdwaLiteRecordMetadataDateDocument() {
        return RecordMetadataDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataLocDocument createCdwaLiteRecordMetadataLocDocument() {
        return RecordMetadataLocDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordRelIDDocument createCdwaLiteRecordRelIDDocument() {
        return RecordRelIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordSourceDocument createCdwaLiteRecordSourceDocument() {
        return RecordSourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordTypeDocument createCdwaLiteRecordTypeDocument() {
        return RecordTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrapDocument createCdwaLiteRecordWrapDocument() {
        return RecordWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedResourceRelTypeDocument createCdwaLiteRelatedResourceRelTypeDocument() {
        return RelatedResourceRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkRelTypeDocument createCdwaLiteRelatedWorkRelTypeDocument() {
        return RelatedWorkRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkSetDocument createCdwaLiteRelatedWorkSetDocument() {
        return RelatedWorkSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createCdwaLiteRelatedWorksWrapDocument() {
        return RelatedWorksWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceIDDocument createCdwaLiteResourceIDDocument() {
        return ResourceIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceMetadataLocDocument createCdwaLiteResourceMetadataLocDocument() {
        return ResourceMetadataLocDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceRelTypeDocument createCdwaLiteResourceRelTypeDocument() {
        return ResourceRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSetDocument createCdwaLiteResourceSetDocument() {
        return ResourceSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSourceDocument createCdwaLiteResourceSourceDocument() {
        return ResourceSourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceTypeDocument createCdwaLiteResourceTypeDocument() {
        return ResourceTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDateDocument createCdwaLiteResourceViewDateDocument() {
        return ResourceViewDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDescriptionDocument createCdwaLiteResourceViewDescriptionDocument() {
        return ResourceViewDescriptionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewSubjectTermDocument createCdwaLiteResourceViewSubjectTermDocument() {
        return ResourceViewSubjectTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewTypeDocument createCdwaLiteResourceViewTypeDocument() {
        return ResourceViewTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrapDocument createCdwaLiteResourceWrapDocument() {
        return ResourceWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsResourceDocument createCdwaLiteRightsResourceDocument() {
        return RightsResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWorkDocument createCdwaLiteRightsWorkDocument() {
        return RightsWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RoleCreatorDocument createCdwaLiteRoleCreatorDocument() {
        return RoleCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ScaleMeasurementsDocument createCdwaLiteScaleMeasurementsDocument() {
        return ScaleMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ShapeMeasurementsDocument createCdwaLiteShapeMeasurementsDocument() {
        return ShapeMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceDescriptiveNoteDocument createCdwaLiteSourceDescriptiveNoteDocument() {
        return SourceDescriptiveNoteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceMaterialsTechDocument createCdwaLiteSourceMaterialsTechDocument() {
        return SourceMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceNameCreatorDocument createCdwaLiteSourceNameCreatorDocument() {
        return SourceNameCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceStateEditionDocument createCdwaLiteSourceStateEditionDocument() {
        return SourceStateEditionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceTitleDocument createCdwaLiteSourceTitleDocument() {
        return SourceTitleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleDocument createCdwaLiteStyleDocument() {
        return StyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleWrapDocument createCdwaLiteStyleWrapDocument() {
        return StyleWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectTermDocument createCdwaLiteSubjectTermDocument() {
        return SubjectTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TermMaterialsTechDocument createCdwaLiteTermMaterialsTechDocument() {
        return TermMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TermsourceAttribute createCdwaLiteTermsourceAttribute() {
        return TermsourceAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TermsourceIDAttribute createCdwaLiteTermsourceIDAttribute() {
        return TermsourceIDAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleDocument createCdwaLiteTitleDocument() {
        return TitleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleSetDocument createCdwaLiteTitleSetDocument() {
        return TitleSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleSetDocument.TitleSet createCdwaLiteTitleSet() {
        return TitleSetDocument.TitleSet.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleDocument.Title createCdwaLiteTitle() {
        return TitleDocument.Title.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrapDocument createCdwaLiteTitleWrapDocument() {
        return TitleWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TypeAttribute createCdwaLiteTypeAttribute() {
        return TypeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public VitalDatesCreatorDocument createCdwaLiteVitalDatesCreatorDocument() {
        return VitalDatesCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public WorkIDDocument createCdwaLiteWorkIDDocument() {
        return WorkIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createCdwaLiteAdministrativeMetadataDocument() {
        return AdministrativeMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AttributionQualifierCreatorDocument createCdwaLiteAttributionQualifierCreatorDocument() {
        return AttributionQualifierCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CdwaliteDocument createCdwaLiteCdwaliteDocument() {
        return CdwaliteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CdwaliteWrapDocument createCdwaLiteCdwaliteWrapDocument() {
        return CdwaliteWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CdwaliteWrapDocument.CdwaliteWrap createCdwaLiteCdwaliteWrap() {
        return CdwaliteWrapDocument.CdwaliteWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public CdwaliteDocument.Cdwalite createCdwaLiteCdwalite() {
        return CdwaliteDocument.Cdwalite.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationDocument createCdwaLiteClassificationDocument() {
        return ClassificationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassWrapDocument createCdwaLiteClassWrapDocument() {
        return ClassWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassWrapDocument.ClassWrap createCdwaLiteClassWrap() {
        return ClassWrapDocument.ClassWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureDocument createCdwaLiteCultureDocument() {
        return CultureDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureWrapDocument createCdwaLiteCultureWrapDocument() {
        return CultureWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureWrapDocument.CultureWrap createCdwaLiteCultureWrap() {
        return CultureWrapDocument.CultureWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureDocument.Culture createCdwaLiteCulture() {
        return CultureDocument.Culture.Factory.newInstance();
    }

    @Provides
    @Override
    public DateQualifierDocument createCdwaLiteDateQualifierDocument() {
        return DateQualifierDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createCdwaLiteDescriptiveMetadataDocument() {
        return DescriptiveMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteDocument createCdwaLiteDescriptiveNoteDocument() {
        return DescriptiveNoteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteSetDocument createCdwaLiteDescriptiveNoteSetDocument() {
        return DescriptiveNoteSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument createCdwaLiteDescriptiveNoteWrapDocument() {
        return DescriptiveNoteWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument.DescriptiveNoteWrap createCdwaLiteDescriptiveNoteWrap() {
        return DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreationDateDocument createCdwaLiteDisplayCreationDateDocument() {
        return DisplayCreationDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreatorDocument createCdwaLiteDisplayCreatorDocument() {
        return DisplayCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEditionDocument createCdwaLiteDisplayEditionDocument() {
        return DisplayEditionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMaterialsTechDocument createCdwaLiteDisplayMaterialsTechDocument() {
        return DisplayMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMeasurementsDocument createCdwaLiteDisplayMeasurementsDocument() {
        return DisplayMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateDocument createCdwaLiteDisplayStateDocument() {
        return DisplayStateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createCdwaLiteDisplayStateEditionWrapDocument() {
        return DisplayStateEditionWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createCdwaLiteDisplayStateEditionWrap() {
        return DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public EarliestDateDocument createCdwaLiteEarliestDateDocument() {
        return EarliestDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentCreatorDocument createCdwaLiteExtentCreatorDocument() {
        return ExtentCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMaterialsTechDocument createCdwaLiteExtentMaterialsTechDocument() {
        return ExtentMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMeasurementsDocument createCdwaLiteExtentMeasurementsDocument() {
        return ExtentMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentSubjectDocument createCdwaLiteExtentSubjectDocument() {
        return ExtentSubjectDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FormatMeasurementsDocument createCdwaLiteFormatMeasurementsDocument() {
        return FormatMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GenderCreatorDocument createCdwaLiteGenderCreatorDocument() {
        return GenderCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndentifierAttribute createCdwaLiteIndentifierAttribute() {
        return IndentifierAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingCreatorSetDocument createCdwaLiteIndexingCreatorSetDocument() {
        return IndexingCreatorSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingCreatorWrapDocument createCdwaLiteIndexingCreatorWrapDocument() {
        return IndexingCreatorWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingCreatorWrapDocument.IndexingCreatorWrap createCdwaLiteIndexingCreatorWrap() {
        return IndexingCreatorWrapDocument.IndexingCreatorWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingDatesSetDocument createCdwaLiteIndexingDatesSetDocument() {
        return IndexingDatesSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingDatesWrapDocument createCdwaLiteIndexingDatesWrapDocument() {
        return IndexingDatesWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingDatesWrapDocument.IndexingDatesWrap createCdwaLiteIndexingDatesWrap() {
        return IndexingDatesWrapDocument.IndexingDatesWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createCdwaLiteIndexingMaterialsTechSetDocument() {
        return IndexingMaterialsTechSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createCdwaLiteIndexingMaterialsTechWrapDocument() {
        return IndexingMaterialsTechWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap createCdwaLiteIndexingMaterialsTechWrap() {
        return IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsSetDocument createCdwaLiteIndexingMeasurementsSetDocument() {
        return IndexingMeasurementsSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createCdwaLiteIndexingMeasurementsWrapDocument() {
        return IndexingMeasurementsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap createCdwaLiteIndexingMeasurementsWrap() {
        return IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectSetDocument createCdwaLiteIndexingSubjectSetDocument() {
        return IndexingSubjectSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument.IndexingSubjectWrap createCdwaLiteIndexingSubjectWrap() {
        return IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument.InscriptionsWrap createCdwaLiteInscriptionsWrap() {
        return InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public LocationWrapDocument.LocationWrap createCdwaLiteLocationWrap() {
        return LocationWrapDocument.LocationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createCdwaLiteObjectWorkTypeWrap() {
        return ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument.ObjectWorkType createCdwaLiteObjectWorkType() {
        return ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoWrapDocument.RecordInfoWrap createCdwaLiteRecordInfoWrap() {
        return RecordInfoWrapDocument.RecordInfoWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrapDocument.RecordWrap createCdwaLiteRecordWrap() {
        return RecordWrapDocument.RecordWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument.RelatedWorksWrap createCdwaLiteRelatedWorksWrap() {
        return RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
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
