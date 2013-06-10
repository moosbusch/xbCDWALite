/*

 *
 */
package org.moosbusch.museum.cdwaLite.inject;

import com.google.inject.Provides;
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
import org.moosbusch.museum.inject.XmlModule;

/**
 *
 * @author moosbusch
 */
public interface CDWALiteModule extends XmlModule {

    @Provides
    public AdministrativeMetadataDocument.AdministrativeMetadata createAdministrativeMetadata();

    @Provides
    public ResourceWrapDocument.ResourceWrap createResourceWrap();

    @Provides
    public DescriptiveMetadataDocument.DescriptiveMetadata createDescriptiveMetadata();

    @Provides
    public StyleWrapDocument.StyleWrap createStyleWrap();

    @Provides
    public TitleWrapDocument.TitleWrap createTitleWrap();

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument();

    @Provides
    public AttributionQualifierCreatorDocument createAttributionQualifierCreatorDocument();

    @Provides
    public CdwaliteDocument createCdwaliteDocument();

    @Provides
    public CdwaliteWrapDocument createCdwaliteWrapDocument();

    @Provides
    public CdwaliteWrap createCdwaliteWrap();

    @Provides
    public Cdwalite createCdwalite();

    @Provides
    public ClassificationDocument createClassificationDocument();

    @Provides
    public ClassWrapDocument createClassWrapDocument();

    @Provides
    public ClassWrap createClassWrap();

    @Provides
    public CultureDocument createCultureDocument();

    @Provides
    public CultureWrapDocument createCultureWrapDocument();

    @Provides
    public CultureWrap createCultureWrap();

    @Provides
    public Culture createCulture();

    @Provides
    public DateQualifierDocument createDateQualifierDocument();

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument();

    @Provides
    public DescriptiveNoteDocument createDescriptiveNoteDocument();

    @Provides
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument();

    @Provides
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument();

    @Provides
    public DescriptiveNoteWrap createDescriptiveNoteWrap();

    @Provides
    public DisplayCreationDateDocument createDisplayCreationDateDocument();

    @Provides
    public DisplayCreatorDocument createDisplayCreatorDocument();

    @Provides
    public DisplayEditionDocument createDisplayEditionDocument();

    @Provides
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument();

    @Provides
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument();

    @Provides
    public DisplayStateDocument createDisplayStateDocument();

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument();

    @Provides
    public DisplayStateEditionWrap createDisplayStateEditionWrap();

    @Provides
    public EarliestDateDocument createEarliestDateDocument();

    @Provides
    public ExtentCreatorDocument createExtentCreatorDocument();

    @Provides
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument();

    @Provides
    public ExtentMeasurementsDocument createExtentMeasurementsDocument();

    @Provides
    public ExtentSubjectDocument createExtentSubjectDocument();

    @Provides
    public FormatMeasurementsDocument createFormatMeasurementsDocument();

    @Provides
    public GenderCreatorDocument createGenderCreatorDocument();

    @Provides
    public IndentifierAttribute createIndentifierAttribute();

    @Provides
    public IndexingCreatorSetDocument createIndexingCreatorSetDocument();

    @Provides
    public IndexingCreatorWrapDocument createIndexingCreatorWrapDocument();

    @Provides
    public IndexingCreatorWrap createIndexingCreatorWrap();

    @Provides
    public IndexingDatesSetDocument createIndexingDatesSetDocument();

    @Provides
    public IndexingDatesWrapDocument createIndexingDatesWrapDocument();

    @Provides
    public IndexingDatesWrap createIndexingDatesWrap();

    @Provides
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument();

    @Provides
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument();

    @Provides
    public IndexingMaterialsTechWrap createIndexingMaterialsTechWrap();

    @Provides
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument();

    @Provides
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument();

    @Provides
    public IndexingMeasurementsWrap createIndexingMeasurementsWrap();

    @Provides
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument();

    @Provides
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument();

    @Provides
    public IndexingSubjectWrap createIndexingSubjectWrap();

    @Provides
    public InscriptionsDocument createInscriptionsDocument();

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument();

    @Provides
    public InscriptionsWrap createInscriptionsWrap();

    @Provides
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument();

    @Provides
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument();

    @Provides
    public LangAttribute createLangAttribute();

    @Provides
    public LangtermsourceAttribute createLangtermsourceAttribute();

    @Provides
    public LatestDateDocument createLatestDateDocument();

    @Provides
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument();

    @Provides
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument();

    @Provides
    public LinkResourceDocument createLinkResourceDocument();

    @Provides
    public LinkschemeAttribute createLinkschemeAttribute();

    @Provides
    public LocationNameDocument createLocationNameDocument();

    @Provides
    public LocationSetDocument createLocationSetDocument();

    @Provides
    public LocationWrapDocument createLocationWrapDocument();

    @Provides
    public LocationWrap createLocationWrap();

    @Provides
    public LocIDAttribute createLocIDAttribute();

    @Provides
    public LocIDtypeAttribute createLocIDtypeAttribute();

    @Provides
    public LocRelatedWorkDocument createLocRelatedWorkDocument();

    @Provides
    public MeasurementsSetDocument createMeasurementsSetDocument();

    @Provides
    public NameCreatorDocument createNameCreatorDocument();

    @Provides
    public NameCreatorSetDocument createNameCreatorSetDocument();

    @Provides
    public NationalityCreatorDocument createNationalityCreatorDocument();

    @Provides
    public ObjectWorkTypeDocument createObjectWorkTypeDocument();

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument();

    @Provides
    public ObjectWorkTypeWrap createObjectWorkTypeWrap();

    @Provides
    public ObjectWorkType createObjectWorkType();

    @Provides
    public PrefAttribute createPrefAttribute();

    @Provides
    public QualifierMeasurementsDocument createQualifierMeasurementsDocument();

    @Provides
    public RecordIDDocument createRecordIDDocument();

    @Provides
    public RecordInfoIDDocument createRecordInfoIDDocument();

    @Provides
    public RecordInfoLinkDocument createRecordInfoLinkDocument();

    @Provides
    public RecordInfoWrapDocument createRecordInfoWrapDocument();

    @Provides
    public RecordInfoWrap createRecordInfoWrap();

    @Provides
    public RecordMetadataDateDocument createRecordMetadataDateDocument();

    @Provides
    public RecordMetadataLocDocument createRecordMetadataLocDocument();

    @Provides
    public RecordRelIDDocument createRecordRelIDDocument();

    @Provides
    public RecordSourceDocument createRecordSourceDocument();

    @Provides
    public RecordTypeDocument createRecordTypeDocument();

    @Provides
    public RecordWrapDocument createRecordWrapDocument();

    @Provides
    public RecordWrap createRecordWrap();

    @Provides
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument();

    @Provides
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument();

    @Provides
    public RelatedWorkSetDocument createRelatedWorkSetDocument();

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument();

    @Provides
    public RelatedWorksWrap createRelatedWorksWrap();

    @Provides
    public ResourceIDDocument createResourceIDDocument();

    @Provides
    public ResourceMetadataLocDocument createResourceMetadataLocDocument();

    @Provides
    public ResourceRelTypeDocument createResourceRelTypeDocument();

    @Provides
    public ResourceSetDocument createResourceSetDocument();

    @Provides
    public ResourceSourceDocument createResourceSourceDocument();

    @Provides
    public ResourceTypeDocument createResourceTypeDocument();

    @Provides
    public ResourceViewDateDocument createResourceViewDateDocument();

    @Provides
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument();

    @Provides
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument();

    @Provides
    public ResourceViewTypeDocument createResourceViewTypeDocument();

    @Provides
    public ResourceWrapDocument createResourceWrapDocument();

    @Provides
    public RightsResourceDocument createRightsResourceDocument();

    @Provides
    public RightsWorkDocument createRightsWorkDocument();

    @Provides
    public RoleCreatorDocument createRoleCreatorDocument();

    @Provides
    public ScaleMeasurementsDocument createScaleMeasurementsDocument();

    @Provides
    public ShapeMeasurementsDocument createShapeMeasurementsDocument();

    @Provides
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument();

    @Provides
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument();

    @Provides
    public SourceNameCreatorDocument createSourceNameCreatorDocument();

    @Provides
    public SourceStateEditionDocument createSourceStateEditionDocument();

    @Provides
    public SourceTitleDocument createSourceTitleDocument();

    @Provides
    public StyleDocument createStyleDocument();

    @Provides
    public StyleWrapDocument createStyleWrapDocument();

    @Provides
    public SubjectTermDocument createSubjectTermDocument();

    @Provides
    public TermMaterialsTechDocument createTermMaterialsTechDocument();

    @Provides
    public TermsourceAttribute createTermsourceAttribute();

    @Provides
    public TermsourceIDAttribute createTermsourceIDAttribute();

    @Provides
    public TitleDocument createTitleDocument();

    @Provides
    public TitleSetDocument createTitleSetDocument();

    @Provides
    public TitleWrapDocument createTitleWrapDocument();

    @Provides
    public TypeAttribute createTypeAttribute();

    @Provides
    public VitalDatesCreatorDocument createVitalDatesCreatorDocument();

    @Provides
    public WorkIDDocument createWorkIDDocument();
}