/*

 *
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

    public CDWALiteModuleImpl(CDWALiteObjectFactory objFactory) {
        super(objFactory);
    }

    @Override
    protected void configureImpl() {
    }

    @Provides
    @Override
    public Document<? extends CDWALiteObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    public AdministrativeMetadata createAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadata.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceWrap createResourceWrap() {
        ResourceWrap result = ResourceWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveMetadata createDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadata.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public StyleWrap createStyleWrap() {
        StyleWrap result = StyleWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TitleWrap createTitleWrap() {
        TitleWrap result = TitleWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public InscriptionsDocument createInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LangAttribute createLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LangtermsourceAttribute createLangtermsourceAttribute() {
        LangtermsourceAttribute result = LangtermsourceAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LatestDateDocument createLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LinkResourceDocument createLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LinkschemeAttribute createLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocationNameDocument createLocationNameDocument() {
        LocationNameDocument result = LocationNameDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocationSetDocument createLocationSetDocument() {
        LocationSetDocument result = LocationSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocationWrapDocument createLocationWrapDocument() {
        LocationWrapDocument result = LocationWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocIDAttribute createLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocIDtypeAttribute createLocIDtypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocRelatedWorkDocument createLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public MeasurementsSetDocument createMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public NameCreatorDocument createNameCreatorDocument() {
        NameCreatorDocument result = NameCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public NameCreatorSetDocument createNameCreatorSetDocument() {
        NameCreatorSetDocument result = NameCreatorSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public NationalityCreatorDocument createNationalityCreatorDocument() {
        NationalityCreatorDocument result = NationalityCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeDocument createObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public QualifierMeasurementsDocument createQualifierMeasurementsDocument() {
        QualifierMeasurementsDocument result = QualifierMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordIDDocument createRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordInfoIDDocument createRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordInfoLinkDocument createRecordInfoLinkDocument() {
        RecordInfoLinkDocument result = RecordInfoLinkDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordInfoWrapDocument createRecordInfoWrapDocument() {
        RecordInfoWrapDocument result = RecordInfoWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordMetadataDateDocument createRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordMetadataLocDocument createRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordRelIDDocument createRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordSourceDocument createRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordTypeDocument createRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RelatedWorkSetDocument createRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceIDDocument createResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceMetadataLocDocument createResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceRelTypeDocument createResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceSetDocument createResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceSourceDocument createResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceTypeDocument createResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceViewDateDocument createResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceViewTypeDocument createResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RightsResourceDocument createRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RightsWorkDocument createRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RoleCreatorDocument createRoleCreatorDocument() {
        RoleCreatorDocument result = RoleCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ScaleMeasurementsDocument createScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ShapeMeasurementsDocument createShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SourceNameCreatorDocument createSourceNameCreatorDocument() {
        SourceNameCreatorDocument result = SourceNameCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SourceStateEditionDocument createSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SourceTitleDocument createSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public StyleWrapDocument createStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public SubjectTermDocument createSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TermMaterialsTechDocument createTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TermsourceAttribute createTermsourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TermsourceIDAttribute createTermsourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TitleSetDocument createTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public VitalDatesCreatorDocument createVitalDatesCreatorDocument() {
        VitalDatesCreatorDocument result = VitalDatesCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public WorkIDDocument createWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public AttributionQualifierCreatorDocument createAttributionQualifierCreatorDocument() {
        AttributionQualifierCreatorDocument result = AttributionQualifierCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CdwaliteDocument createCdwaliteDocument() {
        CdwaliteDocument result = CdwaliteDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CdwaliteWrapDocument createCdwaliteWrapDocument() {
        CdwaliteWrapDocument result = CdwaliteWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CdwaliteWrapDocument.CdwaliteWrap createCdwaliteWrap() {
        CdwaliteWrapDocument.CdwaliteWrap result = CdwaliteWrapDocument.CdwaliteWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CdwaliteDocument.Cdwalite createCdwalite() {
        CdwaliteDocument.Cdwalite result = CdwaliteDocument.Cdwalite.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ClassificationDocument createClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ClassWrapDocument createClassWrapDocument() {
        ClassWrapDocument result = ClassWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ClassWrapDocument.ClassWrap createClassWrap() {
        ClassWrapDocument.ClassWrap result = ClassWrapDocument.ClassWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CultureDocument createCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CultureWrapDocument createCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CultureWrapDocument.CultureWrap createCultureWrap() {
        CultureWrapDocument.CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public CultureDocument.Culture createCulture() {
        CultureDocument.Culture result = CultureDocument.Culture.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DateQualifierDocument createDateQualifierDocument() {
        DateQualifierDocument result = DateQualifierDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveNoteDocument createDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DescriptiveNoteWrapDocument.DescriptiveNoteWrap createDescriptiveNoteWrap() {
        DescriptiveNoteWrapDocument.DescriptiveNoteWrap result =
                DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayCreationDateDocument createDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayCreatorDocument createDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayEditionDocument createDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayStateDocument createDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrapDocument.DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrapDocument.DisplayStateEditionWrap result =
                DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public EarliestDateDocument createEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ExtentCreatorDocument createExtentCreatorDocument() {
        ExtentCreatorDocument result = ExtentCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ExtentMeasurementsDocument createExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ExtentSubjectDocument createExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public FormatMeasurementsDocument createFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public GenderCreatorDocument createGenderCreatorDocument() {
        GenderCreatorDocument result = GenderCreatorDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndentifierAttribute createIndentifierAttribute() {
        IndentifierAttribute result = IndentifierAttribute.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingCreatorSetDocument createIndexingCreatorSetDocument() {
        IndexingCreatorSetDocument result = IndexingCreatorSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingCreatorWrapDocument createIndexingCreatorWrapDocument() {
        IndexingCreatorWrapDocument result = IndexingCreatorWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingCreatorWrapDocument.IndexingCreatorWrap createIndexingCreatorWrap() {
        IndexingCreatorWrapDocument.IndexingCreatorWrap result =
                IndexingCreatorWrapDocument.IndexingCreatorWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingDatesSetDocument createIndexingDatesSetDocument() {
        IndexingDatesSetDocument result = IndexingDatesSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingDatesWrapDocument createIndexingDatesWrapDocument() {
        IndexingDatesWrapDocument result = IndexingDatesWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingDatesWrapDocument.IndexingDatesWrap createIndexingDatesWrap() {
        IndexingDatesWrapDocument.IndexingDatesWrap result =
                IndexingDatesWrapDocument.IndexingDatesWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap createIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap result =
                IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap createIndexingMeasurementsWrap() {
        IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap result =
                IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public IndexingSubjectWrapDocument.IndexingSubjectWrap createIndexingSubjectWrap() {
        IndexingSubjectWrapDocument.IndexingSubjectWrap result =
                IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument.InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrapDocument.InscriptionsWrap result =
                InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public LocationWrapDocument.LocationWrap createLocationWrap() {
        LocationWrapDocument.LocationWrap result =
                LocationWrapDocument.LocationWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap result =
                ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeDocument.ObjectWorkType createObjectWorkType() {
        ObjectWorkTypeDocument.ObjectWorkType result =
                ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordInfoWrapDocument.RecordInfoWrap createRecordInfoWrap() {
        RecordInfoWrapDocument.RecordInfoWrap result =
                RecordInfoWrapDocument.RecordInfoWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RecordWrapDocument.RecordWrap createRecordWrap() {
        RecordWrapDocument.RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument.RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrapDocument.RelatedWorksWrap result =
                RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
        getObjectFactory().injectChildMembers(result);
        return result;
    }
}