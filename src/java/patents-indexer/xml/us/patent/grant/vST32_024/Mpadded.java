//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 12:46:59 AM EST 
//


package xml.us.patent.grant.vST32_024;

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
@XmlRootElement(name = "mpadded")
public class Mpadded {

    @XmlAttribute(name = "width")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String width;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String height;
    @XmlAttribute(name = "depth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String depth;
    @XmlAttribute(name = "lspace")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lspace;
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
        @XmlElement(name = "list", type = xml.us.patent.grant.vST32_024.List.class),
        @XmlElement(name = "matrix", type = Matrix.class),
        @XmlElement(name = "matrixrow", type = Matrixrow.class),
        @XmlElement(name = "set", type = Set.class),
        @XmlElement(name = "vector", type = Vector.class),
        @XmlElement(name = "semantics", type = Semantics.class)
    })
    protected java.util.List<Object> miOrMnOrMoOrMtextOrMsOrMspaceOrMprescriptsOrNoneOrMrowOrMfracOrMsqrtOrMrootOrMstyleOrMerrorOrMpaddedOrMphantomOrMfencedOrMsubOrMsupOrMsubsupOrMunderOrMoverOrMunderoverOrMmultiscriptsOrMtableOrMtrOrMtdOrMaligngroupOrMalignmarkOrMactionOrCiOrCnOrApplyOrFnOrLambdaOrRelnOrIntervalOrListOrMatrixOrMatrixrowOrSetOrVectorOrSemantics;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * Gets the value of the lspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLspace() {
        return lspace;
    }

    /**
     * Sets the value of the lspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLspace(String value) {
        this.lspace = value;
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
     * {@link xml.us.patent.grant.vST32_024.List }
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
