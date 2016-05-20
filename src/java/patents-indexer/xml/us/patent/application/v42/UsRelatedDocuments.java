//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:28 PM EST 
//


package xml.us.patent.application.v42;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication"
})
@XmlRootElement(name = "us-related-documents")
public class UsRelatedDocuments {

    @XmlElements({
        @XmlElement(name = "addition", required = true, type = Addition.class),
        @XmlElement(name = "division", required = true, type = Division.class),
        @XmlElement(name = "continuation", required = true, type = Continuation.class),
        @XmlElement(name = "continuation-in-part", required = true, type = ContinuationInPart.class),
        @XmlElement(name = "continuing-reissue", required = true, type = ContinuingReissue.class),
        @XmlElement(name = "reissue", required = true, type = Reissue.class),
        @XmlElement(name = "us-divisional-reissue", required = true, type = UsDivisionalReissue.class),
        @XmlElement(name = "reexamination", required = true, type = Reexamination.class),
        @XmlElement(name = "us-reexamination-reissue-merger", required = true, type = UsReexaminationReissueMerger.class),
        @XmlElement(name = "substitution", required = true, type = Substitution.class),
        @XmlElement(name = "us-provisional-application", required = true, type = UsProvisionalApplication.class),
        @XmlElement(name = "utility-model-basis", required = true, type = UtilityModelBasis.class),
        @XmlElement(name = "correction", required = true, type = Correction.class),
        @XmlElement(name = "related-publication", required = true, type = RelatedPublication.class)
    })
    protected List<Object> additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication;

    /**
     * Gets the value of the additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addition }
     * {@link Division }
     * {@link Continuation }
     * {@link ContinuationInPart }
     * {@link ContinuingReissue }
     * {@link Reissue }
     * {@link UsDivisionalReissue }
     * {@link Reexamination }
     * {@link UsReexaminationReissueMerger }
     * {@link Substitution }
     * {@link UsProvisionalApplication }
     * {@link UtilityModelBasis }
     * {@link Correction }
     * {@link RelatedPublication }
     * 
     * 
     */
    public List<Object> getAdditionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication() {
        if (additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication == null) {
            additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication = new ArrayList<Object>();
        }
        return this.additionOrDivisionOrContinuationOrContinuationInPartOrContinuingReissueOrReissueOrUsDivisionalReissueOrReexaminationOrUsReexaminationReissueMergerOrSubstitutionOrUsProvisionalApplicationOrUtilityModelBasisOrCorrectionOrRelatedPublication;
    }

}
