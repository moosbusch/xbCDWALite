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
package io.github.moosbusch.museum.inject.cdwaLite;

import edu.getty.cdwa.cdwaLite.AdministrativeMetadataDocument;
import edu.getty.cdwa.cdwaLite.AttributionQualifierCreatorDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteDocument.Cdwalite;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument;
import edu.getty.cdwa.cdwaLite.CdwaliteWrapDocument.CdwaliteWrap;
import edu.getty.cdwa.cdwaLite.ClassWrapDocument;
import edu.getty.cdwa.cdwaLite.ClassWrapDocument.ClassWrap;
import edu.getty.cdwa.cdwaLite.ClassificationDocument;
import edu.getty.cdwa.cdwaLite.CultureDocument;
import edu.getty.cdwa.cdwaLite.CultureDocument.Culture;
import edu.getty.cdwa.cdwaLite.CultureWrapDocument;
import edu.getty.cdwa.cdwaLite.CultureWrapDocument.CultureWrap;
import edu.getty.cdwa.cdwaLite.DateQualifierDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveMetadataDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteSetDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument;
import edu.getty.cdwa.cdwaLite.DescriptiveNoteWrapDocument.DescriptiveNoteWrap;
import edu.getty.cdwa.cdwaLite.DisplayCreationDateDocument;
import edu.getty.cdwa.cdwaLite.DisplayCreatorDocument;
import edu.getty.cdwa.cdwaLite.DisplayEditionDocument;
import edu.getty.cdwa.cdwaLite.DisplayMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.DisplayMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.DisplayStateDocument;
import edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument;
import edu.getty.cdwa.cdwaLite.DisplayStateEditionWrapDocument.DisplayStateEditionWrap;
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
import edu.getty.cdwa.cdwaLite.IndexingCreatorWrapDocument.IndexingCreatorWrap;
import edu.getty.cdwa.cdwaLite.IndexingDatesSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingDatesWrapDocument.IndexingDatesWrap;
import edu.getty.cdwa.cdwaLite.IndexingMaterialsTechSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap;
import edu.getty.cdwa.cdwaLite.IndexingMeasurementsSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap;
import edu.getty.cdwa.cdwaLite.IndexingSubjectSetDocument;
import edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument;
import edu.getty.cdwa.cdwaLite.IndexingSubjectWrapDocument.IndexingSubjectWrap;
import edu.getty.cdwa.cdwaLite.InscriptionsDocument;
import edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument;
import edu.getty.cdwa.cdwaLite.InscriptionsWrapDocument.InscriptionsWrap;
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
import edu.getty.cdwa.cdwaLite.LocationWrapDocument.LocationWrap;
import edu.getty.cdwa.cdwaLite.MeasurementsSetDocument;
import edu.getty.cdwa.cdwaLite.NameCreatorDocument;
import edu.getty.cdwa.cdwaLite.NameCreatorSetDocument;
import edu.getty.cdwa.cdwaLite.NationalityCreatorDocument;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeDocument.ObjectWorkType;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument;
import edu.getty.cdwa.cdwaLite.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap;
import edu.getty.cdwa.cdwaLite.PrefAttribute;
import edu.getty.cdwa.cdwaLite.QualifierMeasurementsDocument;
import edu.getty.cdwa.cdwaLite.RecordIDDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoIDDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoLinkDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument;
import edu.getty.cdwa.cdwaLite.RecordInfoWrapDocument.RecordInfoWrap;
import edu.getty.cdwa.cdwaLite.RecordMetadataDateDocument;
import edu.getty.cdwa.cdwaLite.RecordMetadataLocDocument;
import edu.getty.cdwa.cdwaLite.RecordRelIDDocument;
import edu.getty.cdwa.cdwaLite.RecordSourceDocument;
import edu.getty.cdwa.cdwaLite.RecordTypeDocument;
import edu.getty.cdwa.cdwaLite.RecordWrapDocument;
import edu.getty.cdwa.cdwaLite.RecordWrapDocument.RecordWrap;
import edu.getty.cdwa.cdwaLite.RelatedResourceRelTypeDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorkRelTypeDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorkSetDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument;
import edu.getty.cdwa.cdwaLite.RelatedWorksWrapDocument.RelatedWorksWrap;
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
import edu.getty.cdwa.cdwaLite.SubjectTermDocument;
import edu.getty.cdwa.cdwaLite.TermMaterialsTechDocument;
import edu.getty.cdwa.cdwaLite.TermsourceAttribute;
import edu.getty.cdwa.cdwaLite.TermsourceIDAttribute;
import edu.getty.cdwa.cdwaLite.TitleDocument;
import edu.getty.cdwa.cdwaLite.TitleSetDocument;
import edu.getty.cdwa.cdwaLite.TitleWrapDocument;
import edu.getty.cdwa.cdwaLite.TypeAttribute;
import edu.getty.cdwa.cdwaLite.VitalDatesCreatorDocument;
import edu.getty.cdwa.cdwaLite.WorkIDDocument;
import io.github.moosbusch.museum.inject.MuseumXmlModule;

/**
 *
 * @author moosbusch
 */
public interface CDWALiteModule extends MuseumXmlModule {

    public AdministrativeMetadataDocument.AdministrativeMetadata createCdwaLiteAdministrativeMetadata();

    public ResourceWrapDocument.ResourceWrap createCdwaLiteResourceWrap();

    public DescriptiveMetadataDocument.DescriptiveMetadata createCdwaLiteDescriptiveMetadata();

    public StyleWrapDocument.StyleWrap createCdwaLiteStyleWrap();

    public TitleWrapDocument.TitleWrap createCdwaLiteTitleWrap();

    public AdministrativeMetadataDocument createCdwaLiteAdministrativeMetadataDocument();

    public AttributionQualifierCreatorDocument createCdwaLiteAttributionQualifierCreatorDocument();

    public CdwaliteDocument createCdwaLiteCdwaliteDocument();

    public CdwaliteWrapDocument createCdwaLiteCdwaliteWrapDocument();

    public CdwaliteWrap createCdwaLiteCdwaliteWrap();

    public Cdwalite createCdwaLiteCdwalite();

    public ClassificationDocument createCdwaLiteClassificationDocument();

    public ClassWrapDocument createCdwaLiteClassWrapDocument();

    public ClassWrap createCdwaLiteClassWrap();

    public CultureDocument createCdwaLiteCultureDocument();

    public CultureWrapDocument createCdwaLiteCultureWrapDocument();

    public CultureWrap createCdwaLiteCultureWrap();

    public Culture createCdwaLiteCulture();

    public DateQualifierDocument createCdwaLiteDateQualifierDocument();

    public DescriptiveMetadataDocument createCdwaLiteDescriptiveMetadataDocument();

    public DescriptiveNoteDocument createCdwaLiteDescriptiveNoteDocument();

    public DescriptiveNoteSetDocument createCdwaLiteDescriptiveNoteSetDocument();

    public DescriptiveNoteWrapDocument createCdwaLiteDescriptiveNoteWrapDocument();

    public DescriptiveNoteWrap createCdwaLiteDescriptiveNoteWrap();

    public DisplayCreationDateDocument createCdwaLiteDisplayCreationDateDocument();

    public DisplayCreatorDocument createCdwaLiteDisplayCreatorDocument();

    public DisplayEditionDocument createCdwaLiteDisplayEditionDocument();

    public DisplayMaterialsTechDocument createCdwaLiteDisplayMaterialsTechDocument();

    public DisplayMeasurementsDocument createCdwaLiteDisplayMeasurementsDocument();

    public DisplayStateDocument createCdwaLiteDisplayStateDocument();

    public DisplayStateEditionWrapDocument createCdwaLiteDisplayStateEditionWrapDocument();

    public DisplayStateEditionWrap createCdwaLiteDisplayStateEditionWrap();

    public EarliestDateDocument createCdwaLiteEarliestDateDocument();

    public ExtentCreatorDocument createCdwaLiteExtentCreatorDocument();

    public ExtentMaterialsTechDocument createCdwaLiteExtentMaterialsTechDocument();

    public ExtentMeasurementsDocument createCdwaLiteExtentMeasurementsDocument();

    public ExtentSubjectDocument createCdwaLiteExtentSubjectDocument();

    public FormatMeasurementsDocument createCdwaLiteFormatMeasurementsDocument();

    public GenderCreatorDocument createCdwaLiteGenderCreatorDocument();

    public IndentifierAttribute createCdwaLiteIndentifierAttribute();

    public IndexingCreatorSetDocument createCdwaLiteIndexingCreatorSetDocument();

    public IndexingCreatorWrapDocument createCdwaLiteIndexingCreatorWrapDocument();

    public IndexingCreatorWrap createCdwaLiteIndexingCreatorWrap();

    public IndexingDatesSetDocument createCdwaLiteIndexingDatesSetDocument();

    public IndexingDatesWrapDocument createCdwaLiteIndexingDatesWrapDocument();

    public IndexingDatesWrap createCdwaLiteIndexingDatesWrap();

    public IndexingMaterialsTechSetDocument createCdwaLiteIndexingMaterialsTechSetDocument();

    public IndexingMaterialsTechWrapDocument createCdwaLiteIndexingMaterialsTechWrapDocument();

    public IndexingMaterialsTechWrap createCdwaLiteIndexingMaterialsTechWrap();

    public IndexingMeasurementsSetDocument createCdwaLiteIndexingMeasurementsSetDocument();

    public IndexingMeasurementsWrapDocument createCdwaLiteIndexingMeasurementsWrapDocument();

    public IndexingMeasurementsWrap createCdwaLiteIndexingMeasurementsWrap();

    public IndexingSubjectSetDocument createCdwaLiteIndexingSubjectSetDocument();

    public IndexingSubjectWrapDocument createCdwaLiteIndexingSubjectWrapDocument();

    public IndexingSubjectWrap createCdwaLiteIndexingSubjectWrap();

    public InscriptionsDocument createCdwaLiteInscriptionsDocument();

    public InscriptionsWrapDocument createCdwaLiteInscriptionsWrapDocument();

    public InscriptionsWrap createCdwaLiteInscriptionsWrap();

    public LabelRelatedResourceDocument createCdwaLiteLabelRelatedResourceDocument();

    public LabelRelatedWorkDocument createCdwaLiteLabelRelatedWorkDocument();

    public LangAttribute createCdwaLiteLangAttribute();

    public LangtermsourceAttribute createCdwaLiteLangtermsourceAttribute();

    public LatestDateDocument createCdwaLiteLatestDateDocument();

    public LinkRelatedResourceDocument createCdwaLiteLinkRelatedResourceDocument();

    public LinkRelatedWorkDocument createCdwaLiteLinkRelatedWorkDocument();

    public LinkResourceDocument createCdwaLiteLinkResourceDocument();

    public LinkschemeAttribute createCdwaLiteLinkschemeAttribute();

    public LocationNameDocument createCdwaLiteLocationNameDocument();

    public LocationSetDocument createCdwaLiteLocationSetDocument();

    public LocationWrapDocument createCdwaLiteLocationWrapDocument();

    public LocationWrap createCdwaLiteLocationWrap();

    public LocIDAttribute createCdwaLiteLocIDAttribute();

    public LocIDtypeAttribute createCdwaLiteLocIDtypeAttribute();

    public LocRelatedWorkDocument createCdwaLiteLocRelatedWorkDocument();

    public MeasurementsSetDocument createCdwaLiteMeasurementsSetDocument();

    public NameCreatorDocument createCdwaLiteNameCreatorDocument();

    public NameCreatorSetDocument createCdwaLiteNameCreatorSetDocument();

    public NationalityCreatorDocument createCdwaLiteNationalityCreatorDocument();

    public ObjectWorkTypeDocument createCdwaLiteObjectWorkTypeDocument();

    public ObjectWorkTypeWrapDocument createCdwaLiteObjectWorkTypeWrapDocument();

    public ObjectWorkTypeWrap createCdwaLiteObjectWorkTypeWrap();

    public ObjectWorkType createCdwaLiteObjectWorkType();

    public PrefAttribute createCdwaLitePrefAttribute();

    public QualifierMeasurementsDocument createCdwaLiteQualifierMeasurementsDocument();

    public RecordIDDocument createCdwaLiteRecordIDDocument();

    public RecordInfoIDDocument createCdwaLiteRecordInfoIDDocument();

    public RecordInfoLinkDocument createCdwaLiteRecordInfoLinkDocument();

    public RecordInfoWrapDocument createCdwaLiteRecordInfoWrapDocument();

    public RecordInfoWrap createCdwaLiteRecordInfoWrap();

    public RecordMetadataDateDocument createCdwaLiteRecordMetadataDateDocument();

    public RecordMetadataLocDocument createCdwaLiteRecordMetadataLocDocument();

    public RecordRelIDDocument createCdwaLiteRecordRelIDDocument();

    public RecordSourceDocument createCdwaLiteRecordSourceDocument();

    public RecordTypeDocument createCdwaLiteRecordTypeDocument();

    public RecordWrapDocument createCdwaLiteRecordWrapDocument();

    public RecordWrap createCdwaLiteRecordWrap();

    public RelatedResourceRelTypeDocument createCdwaLiteRelatedResourceRelTypeDocument();

    public RelatedWorkRelTypeDocument createCdwaLiteRelatedWorkRelTypeDocument();

    public RelatedWorkSetDocument createCdwaLiteRelatedWorkSetDocument();

    public RelatedWorksWrapDocument createCdwaLiteRelatedWorksWrapDocument();

    public RelatedWorksWrap createCdwaLiteRelatedWorksWrap();

    public ResourceIDDocument createCdwaLiteResourceIDDocument();

    public ResourceMetadataLocDocument createCdwaLiteResourceMetadataLocDocument();

    public ResourceRelTypeDocument createCdwaLiteResourceRelTypeDocument();

    public ResourceSetDocument createCdwaLiteResourceSetDocument();

    public ResourceSourceDocument createCdwaLiteResourceSourceDocument();

    public ResourceTypeDocument createCdwaLiteResourceTypeDocument();

    public ResourceViewDateDocument createCdwaLiteResourceViewDateDocument();

    public ResourceViewDescriptionDocument createCdwaLiteResourceViewDescriptionDocument();

    public ResourceViewSubjectTermDocument createCdwaLiteResourceViewSubjectTermDocument();

    public ResourceViewTypeDocument createCdwaLiteResourceViewTypeDocument();

    public ResourceWrapDocument createCdwaLiteResourceWrapDocument();

    public RightsResourceDocument createCdwaLiteRightsResourceDocument();

    public RightsWorkDocument createCdwaLiteRightsWorkDocument();

    public RoleCreatorDocument createCdwaLiteRoleCreatorDocument();

    public ScaleMeasurementsDocument createCdwaLiteScaleMeasurementsDocument();

    public ShapeMeasurementsDocument createCdwaLiteShapeMeasurementsDocument();

    public SourceDescriptiveNoteDocument createCdwaLiteSourceDescriptiveNoteDocument();

    public SourceMaterialsTechDocument createCdwaLiteSourceMaterialsTechDocument();

    public SourceNameCreatorDocument createCdwaLiteSourceNameCreatorDocument();

    public SourceStateEditionDocument createCdwaLiteSourceStateEditionDocument();

    public SourceTitleDocument createCdwaLiteSourceTitleDocument();

    public StyleDocument createCdwaLiteStyleDocument();

    public StyleWrapDocument createCdwaLiteStyleWrapDocument();

    public SubjectTermDocument createCdwaLiteSubjectTermDocument();

    public TermMaterialsTechDocument createCdwaLiteTermMaterialsTechDocument();

    public TermsourceAttribute createCdwaLiteTermsourceAttribute();

    public TermsourceIDAttribute createCdwaLiteTermsourceIDAttribute();

    public TitleDocument createCdwaLiteTitleDocument();

    public TitleWrapDocument createCdwaLiteTitleWrapDocument();

    public TypeAttribute createCdwaLiteTypeAttribute();

    public VitalDatesCreatorDocument createCdwaLiteVitalDatesCreatorDocument();

    public WorkIDDocument createCdwaLiteWorkIDDocument();

    public TitleSetDocument createCdwaLiteTitleSetDocument();

    public TitleSetDocument.TitleSet createCdwaLiteTitleSet();

    public TitleDocument.Title createCdwaLiteTitle();

    public IndexingCreatorSetDocument.IndexingCreatorSet createCdwaLiteIndexingCreatorSet();

    public NameCreatorSetDocument.NameCreatorSet createCdwaLiteNameCreatorSet();

    public NameCreatorDocument.NameCreator createCdwaLiteNameCreator();

    public RoleCreatorDocument.RoleCreator createCdwaLiteRoleCreator();

    public IndexingDatesSetDocument.IndexingDatesSet createCdwaLiteIndexingDatesSet();

    public EarliestDateDocument.EarliestDate createCdwaLiteEarliestDate();

    public LatestDateDocument.LatestDate createCdwaLiteLatestDateDate();

    public LocationSetDocument.LocationSet createCdwaLiteLocationSet();

    public LocationNameDocument.LocationName createCdwaLiteLocationName();
}