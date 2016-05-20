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
    "miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics"
})
@XmlRootElement(name = "mtable")
public class Mtable {

    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "rowalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowalign;
    @XmlAttribute(name = "columnalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnalign;
    @XmlAttribute(name = "groupalign")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupalign;
    @XmlAttribute(name = "alignmentscope")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alignmentscope;
    @XmlAttribute(name = "rowspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowspacing;
    @XmlAttribute(name = "columnspacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnspacing;
    @XmlAttribute(name = "rowlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String rowlines;
    @XmlAttribute(name = "columnlines")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String columnlines;
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "framespacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String framespacing;
    @XmlAttribute(name = "equalrows")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String equalrows;
    @XmlAttribute(name = "equalcolumns")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String equalcolumns;
    @XmlAttribute(name = "displaystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displaystyle;
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
        @XmlElement(name = "mi", type = Mi.class),
        @XmlElement(name = "mn", type = Mn.class),
        @XmlElement(name = "mo", type = Mo.class),
        @XmlElement(name = "mtext", type = Mtext.class),
        @XmlElement(name = "ms", type = Ms.class),
        @XmlElement(name = "mspace", type = Mspace.class),
        @XmlElement(name = "mprescripts", type = Mprescripts.class),
        @XmlElement(name = "none", type = None.class),
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
        @XmlElement(name = "maction", type = Maction.class),
        @XmlElement(name = "ci", type = Ci.class),
        @XmlElement(name = "cn", type = Cn.class),
        @XmlElement(name = "apply", type = Apply.class),
        @XmlElement(name = "fn", type = Fn.class),
        @XmlElement(name = "lambda", type = Lambda.class),
        @XmlElement(name = "reln", type = Reln.class),
        @XmlElement(name = "interval", type = Interval.class),
        @XmlElement(name = "list", type = xml.us.patent.grant.vST32_025xml.List.class),
        @XmlElement(name = "matrix", type = Matrix.class),
        @XmlElement(name = "matrixrow", type = Matrixrow.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "vector", type = Vector.class),
        @XmlElement(name = "semantics", type = Semantics.class)
    })
    protected java.util.List<Object> miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics;

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the rowalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowalign() {
        return rowalign;
    }

    /**
     * Sets the value of the rowalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowalign(String value) {
        this.rowalign = value;
    }

    /**
     * Gets the value of the columnalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnalign() {
        return columnalign;
    }

    /**
     * Sets the value of the columnalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnalign(String value) {
        this.columnalign = value;
    }

    /**
     * Gets the value of the groupalign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupalign() {
        return groupalign;
    }

    /**
     * Sets the value of the groupalign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupalign(String value) {
        this.groupalign = value;
    }

    /**
     * Gets the value of the alignmentscope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignmentscope() {
        return alignmentscope;
    }

    /**
     * Sets the value of the alignmentscope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignmentscope(String value) {
        this.alignmentscope = value;
    }

    /**
     * Gets the value of the rowspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowspacing() {
        return rowspacing;
    }

    /**
     * Sets the value of the rowspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowspacing(String value) {
        this.rowspacing = value;
    }

    /**
     * Gets the value of the columnspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnspacing() {
        return columnspacing;
    }

    /**
     * Sets the value of the columnspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnspacing(String value) {
        this.columnspacing = value;
    }

    /**
     * Gets the value of the rowlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowlines() {
        return rowlines;
    }

    /**
     * Sets the value of the rowlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowlines(String value) {
        this.rowlines = value;
    }

    /**
     * Gets the value of the columnlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnlines() {
        return columnlines;
    }

    /**
     * Sets the value of the columnlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnlines(String value) {
        this.columnlines = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the framespacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramespacing() {
        return framespacing;
    }

    /**
     * Sets the value of the framespacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramespacing(String value) {
        this.framespacing = value;
    }

    /**
     * Gets the value of the equalrows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualrows() {
        return equalrows;
    }

    /**
     * Sets the value of the equalrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualrows(String value) {
        this.equalrows = value;
    }

    /**
     * Gets the value of the equalcolumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualcolumns() {
        return equalcolumns;
    }

    /**
     * Sets the value of the equalcolumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualcolumns(String value) {
        this.equalcolumns = value;
    }

    /**
     * Gets the value of the displaystyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaystyle() {
        return displaystyle;
    }

    /**
     * Sets the value of the displaystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaystyle(String value) {
        this.displaystyle = value;
    }

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
     * Gets the value of the miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mi }
     * {@link Mn }
     * {@link Mo }
     * {@link Mtext }
     * {@link Ms }
     * {@link Mspace }
     * {@link Mprescripts }
     * {@link None }
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
     * {@link Ci }
     * {@link Cn }
     * {@link Apply }
     * {@link Fn }
     * {@link Lambda }
     * {@link Reln }
     * {@link Interval }
     * {@link xml.us.patent.grant.vST32_025xml.List }
     * {@link Matrix }
     * {@link Matrixrow }
     * {@link Set }
     * {@link Vector }
     * {@link Semantics }
     * 
     * 
     */
    public java.util.List<Object> getMiOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics() {
        if (miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics == null) {
            miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics = new ArrayList<Object>();
        }
        return this.miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics;
    }

}
