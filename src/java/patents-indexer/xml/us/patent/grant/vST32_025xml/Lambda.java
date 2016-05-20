//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction"
})
@XmlRootElement(name = "lambda")
public class Lambda {

    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String style;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "other")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String other;
    @XmlElements({
        @XmlElement(name = "ci", type = Ci.class),
        @XmlElement(name = "cn", type = Cn.class),
        @XmlElement(name = "apply", type = Apply.class),
        @XmlElement(name = "reln", type = Reln.class),
        @XmlElement(name = "lambda", type = Lambda.class),
        @XmlElement(name = "condition", type = Condition.class),
        @XmlElement(name = "declare", type = Declare.class),
        @XmlElement(name = "sep", type = Sep.class),
        @XmlElement(name = "semantics", type = Semantics.class),
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "annotation-xml", type = AnnotationXml.class),
        @XmlElement(name = "interval", type = Interval.class),
        @XmlElement(name = "list", type = xml.us.patent.grant.vST32_025xml.List.class),
        @XmlElement(name = "matrix", type = Matrix.class),
        @XmlElement(name = "matrixrow", type = Matrixrow.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "vector", type = Vector.class),
        @XmlElement(name = "lowlimit", type = Lowlimit.class),
        @XmlElement(name = "uplimit", type = Uplimit.class),
        @XmlElement(name = "bvar", type = Bvar.class),
        @XmlElement(name = "degree", type = Degree.class),
        @XmlElement(name = "logbase", type = Logbase.class),
        @XmlElement(name = "inverse", type = Inverse.class),
        @XmlElement(name = "ident", type = Ident.class),
        @XmlElement(name = "abs", type = Abs.class),
        @XmlElement(name = "conjugate", type = Conjugate.class),
        @XmlElement(name = "exp", type = Exp.class),
        @XmlElement(name = "factorial", type = Factorial.class),
        @XmlElement(name = "not", type = Not.class),
        @XmlElement(name = "ln", type = Ln.class),
        @XmlElement(name = "sin", type = Sin.class),
        @XmlElement(name = "cos", type = Cos.class),
        @XmlElement(name = "tan", type = Tan.class),
        @XmlElement(name = "sec", type = Sec.class),
        @XmlElement(name = "csc", type = Csc.class),
        @XmlElement(name = "cot", type = Cot.class),
        @XmlElement(name = "sinh", type = Sinh.class),
        @XmlElement(name = "cosh", type = Cosh.class),
        @XmlElement(name = "tanh", type = Tanh.class),
        @XmlElement(name = "sech", type = Sech.class),
        @XmlElement(name = "csch", type = Csch.class),
        @XmlElement(name = "coth", type = Coth.class),
        @XmlElement(name = "arcsin", type = Arcsin.class),
        @XmlElement(name = "arccos", type = Arccos.class),
        @XmlElement(name = "arctan", type = Arctan.class),
        @XmlElement(name = "determinant", type = Determinant.class),
        @XmlElement(name = "transpose", type = Transpose.class),
        @XmlElement(name = "quotient", type = Quotient.class),
        @XmlElement(name = "divide", type = Divide.class),
        @XmlElement(name = "power", type = Power.class),
        @XmlElement(name = "rem", type = Rem.class),
        @XmlElement(name = "implies", type = Implies.class),
        @XmlElement(name = "setdiff", type = Setdiff.class),
        @XmlElement(name = "fn", type = Fn.class),
        @XmlElement(name = "compose", type = Compose.class),
        @XmlElement(name = "plus", type = Plus.class),
        @XmlElement(name = "times", type = Times.class),
        @XmlElement(name = "max", type = Max.class),
        @XmlElement(name = "min", type = Min.class),
        @XmlElement(name = "gcd", type = Gcd.class),
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "xor", type = Xor.class),
        @XmlElement(name = "union", type = Union.class),
        @XmlElement(name = "intersect", type = Intersect.class),
        @XmlElement(name = "mean", type = Mean.class),
        @XmlElement(name = "sdev", type = Sdev.class),
        @XmlElement(name = "variance", type = Variance.class),
        @XmlElement(name = "median", type = Median.class),
        @XmlElement(name = "mode", type = Mode.class),
        @XmlElement(name = "selector", type = Selector.class),
        @XmlElement(name = "root", type = Root.class),
        @XmlElement(name = "minus", type = Minus.class),
        @XmlElement(name = "log", type = Log.class),
        @XmlElement(name = "int", type = Int.class),
        @XmlElement(name = "diff", type = Diff.class),
        @XmlElement(name = "partialdiff", type = Partialdiff.class),
        @XmlElement(name = "sum", type = Sum.class),
        @XmlElement(name = "product", type = Product.class),
        @XmlElement(name = "limit", type = Limit.class),
        @XmlElement(name = "moment", type = Moment.class),
        @XmlElement(name = "exists", type = Exists.class),
        @XmlElement(name = "forall", type = Forall.class),
        @XmlElement(name = "neq", type = Neq.class),
        @XmlElement(name = "in", type = In.class),
        @XmlElement(name = "notin", type = Notin.class),
        @XmlElement(name = "notsubset", type = Notsubset.class),
        @XmlElement(name = "notprsubset", type = Notprsubset.class),
        @XmlElement(name = "tendsto", type = Tendsto.class),
        @XmlElement(name = "eq", type = Eq.class),
        @XmlElement(name = "leq", type = Leq.class),
        @XmlElement(name = "lt", type = Lt.class),
        @XmlElement(name = "geq", type = Geq.class),
        @XmlElement(name = "gt", type = Gt.class),
        @XmlElement(name = "subset", type = Subset.class),
        @XmlElement(name = "prsubset", type = Prsubset.class),
        @XmlElement(name = "mi", type = Mi.class),
        @XmlElement(name = "mn", type = Mn.class),
        @XmlElement(name = "mo", type = Mo.class),
        @XmlElement(name = "mtext", type = Mtext.class),
        @XmlElement(name = "ms", type = Ms.class),
        @XmlElement(name = "mspace", type = Mspace.class),
        @XmlElement(name = "mrow", type = Mrow.class),
        @XmlElement(name = "mfrac", type = Mfrac.class),
        @XmlElement(name = "msqrt", type = Msqrt.class),
        @XmlElement(name = "mroot", type = Mroot.class),
        @XmlElement(name = "mstyle", type = Mstyle.class),
        @XmlElement(name = "merror", type = Merror.class),
        @XmlElement(name = "mpadded", type = Mpadded.class),
        @XmlElement(name = "mphantom", type = Mphantom.class),
        @XmlElement(name = "mfenced", type = Mfenced.class),
        @XmlElement(name = "msub", type = Msub.class),
        @XmlElement(name = "msup", type = Msup.class),
        @XmlElement(name = "msubsup", type = Msubsup.class),
        @XmlElement(name = "munder", type = Munder.class),
        @XmlElement(name = "mover", type = Mover.class),
        @XmlElement(name = "munderover", type = Munderover.class),
        @XmlElement(name = "mmultiscripts", type = Mmultiscripts.class),
        @XmlElement(name = "mtable", type = Mtable.class),
        @XmlElement(name = "mtr", type = Mtr.class),
        @XmlElement(name = "mtd", type = Mtd.class),
        @XmlElement(name = "maligngroup", type = Maligngroup.class),
        @XmlElement(name = "malignmark", type = Malignmark.class),
        @XmlElement(name = "maction", type = Maction.class)
    })
    protected java.util.List<Object> ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ci }
     * {@link Cn }
     * {@link Apply }
     * {@link Reln }
     * {@link Lambda }
     * {@link Condition }
     * {@link Declare }
     * {@link Sep }
     * {@link Semantics }
     * {@link Annotation }
     * {@link AnnotationXml }
     * {@link Interval }
     * {@link xml.us.patent.grant.vST32_025xml.List }
     * {@link Matrix }
     * {@link Matrixrow }
     * {@link Set }
     * {@link Vector }
     * {@link Lowlimit }
     * {@link Uplimit }
     * {@link Bvar }
     * {@link Degree }
     * {@link Logbase }
     * {@link Inverse }
     * {@link Ident }
     * {@link Abs }
     * {@link Conjugate }
     * {@link Exp }
     * {@link Factorial }
     * {@link Not }
     * {@link Ln }
     * {@link Sin }
     * {@link Cos }
     * {@link Tan }
     * {@link Sec }
     * {@link Csc }
     * {@link Cot }
     * {@link Sinh }
     * {@link Cosh }
     * {@link Tanh }
     * {@link Sech }
     * {@link Csch }
     * {@link Coth }
     * {@link Arcsin }
     * {@link Arccos }
     * {@link Arctan }
     * {@link Determinant }
     * {@link Transpose }
     * {@link Quotient }
     * {@link Divide }
     * {@link Power }
     * {@link Rem }
     * {@link Implies }
     * {@link Setdiff }
     * {@link Fn }
     * {@link Compose }
     * {@link Plus }
     * {@link Times }
     * {@link Max }
     * {@link Min }
     * {@link Gcd }
     * {@link And }
     * {@link Or }
     * {@link Xor }
     * {@link Union }
     * {@link Intersect }
     * {@link Mean }
     * {@link Sdev }
     * {@link Variance }
     * {@link Median }
     * {@link Mode }
     * {@link Selector }
     * {@link Root }
     * {@link Minus }
     * {@link Log }
     * {@link Int }
     * {@link Diff }
     * {@link Partialdiff }
     * {@link Sum }
     * {@link Product }
     * {@link Limit }
     * {@link Moment }
     * {@link Exists }
     * {@link Forall }
     * {@link Neq }
     * {@link In }
     * {@link Notin }
     * {@link Notsubset }
     * {@link Notprsubset }
     * {@link Tendsto }
     * {@link Eq }
     * {@link Leq }
     * {@link Lt }
     * {@link Geq }
     * {@link Gt }
     * {@link Subset }
     * {@link Prsubset }
     * {@link Mi }
     * {@link Mn }
     * {@link Mo }
     * {@link Mtext }
     * {@link Ms }
     * {@link Mspace }
     * {@link Mrow }
     * {@link Mfrac }
     * {@link Msqrt }
     * {@link Mroot }
     * {@link Mstyle }
     * {@link Merror }
     * {@link Mpadded }
     * {@link Mphantom }
     * {@link Mfenced }
     * {@link Msub }
     * {@link Msup }
     * {@link Msubsup }
     * {@link Munder }
     * {@link Mover }
     * {@link Munderover }
     * {@link Mmultiscripts }
     * {@link Mtable }
     * {@link Mtr }
     * {@link Mtd }
     * {@link Maligngroup }
     * {@link Malignmark }
     * {@link Maction }
     * 
     * 
     */
    public java.util.List<Object> getCiOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction() {
        if (ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction == null) {
            ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction = new ArrayList<Object>();
        }
        return this.ciOrCnOrApplyOrRelnOrLambdaOrConditionOrDeclareOrSepOrSemanticsOrAnnotationOrAnnotationXmlOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrLowlimitOrUplimitOrBvarOrDegreeOrLogbaseOrInverseOrIdentOrAbsOrConjugateOrExpOrFactorialOrNotOrLnOrSinOrCosOrTanOrSecOrCscOrCotOrSinhOrCoshOrTanhOrSechOrCschOrCothOrArcsinOrArccosOrArctanOrDeterminantOrTransposeOrQuotientOrDivideOrPowerOrRemOrImpliesOrSetdiffOrFnOrComposeOrPlusOrTimesOrMaxOrMinOrGcdOrAndOrOrOrXorOrUnionOrIntersectOrMeanOrSdevOrVarianceOrMedianOrModeOrSelectorOrRootOrMinusOrLogOrIntOrDiffOrPartialdiffOrSumOrProductOrLimitOrMomentOrExistsOrForallOrNeqOrInOrNotinOrNotsubsetOrNotprsubsetOrTendstoOrEqOrLeqOrLtOrGeqOrGtOrSubsetOrPrsubsetOrMiOrMnOrMoOrMtextOrMsOrMspaceOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMaction;
    }

}
