//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classificationIpc",
    "classificationUs",
    "titleOfInvention",
    "botanic",
    "citation"
})
@XmlRootElement(name = "technical-information")
public class TechnicalInformation {

    @XmlAttribute(name = "st32-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String st32Name;
    @XmlElement(name = "classification-ipc", required = true)
    protected ClassificationIpc classificationIpc;
    @XmlElement(name = "classification-us", required = true)
    protected ClassificationUs classificationUs;
    @XmlElement(name = "title-of-invention", required = true)
    protected TitleOfInvention titleOfInvention;
    protected Botanic botanic;
    protected List<Citation> citation;

    /**
     * Gets the value of the st32Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt32Name() {
        if (st32Name == null) {
            return "B500";
        } else {
            return st32Name;
        }
    }

    /**
     * Sets the value of the st32Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt32Name(String value) {
        this.st32Name = value;
    }

    /**
     * Gets the value of the classificationIpc property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationIpc }
     *     
     */
    public ClassificationIpc getClassificationIpc() {
        return classificationIpc;
    }

    /**
     * Sets the value of the classificationIpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationIpc }
     *     
     */
    public void setClassificationIpc(ClassificationIpc value) {
        this.classificationIpc = value;
    }

    /**
     * Gets the value of the classificationUs property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationUs }
     *     
     */
    public ClassificationUs getClassificationUs() {
        return classificationUs;
    }

    /**
     * Sets the value of the classificationUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationUs }
     *     
     */
    public void setClassificationUs(ClassificationUs value) {
        this.classificationUs = value;
    }

    /**
     * Gets the value of the titleOfInvention property.
     * 
     * @return
     *     possible object is
     *     {@link TitleOfInvention }
     *     
     */
    public TitleOfInvention getTitleOfInvention() {
        return titleOfInvention;
    }

    /**
     * Sets the value of the titleOfInvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleOfInvention }
     *     
     */
    public void setTitleOfInvention(TitleOfInvention value) {
        this.titleOfInvention = value;
    }

    /**
     * Gets the value of the botanic property.
     * 
     * @return
     *     possible object is
     *     {@link Botanic }
     *     
     */
    public Botanic getBotanic() {
        return botanic;
    }

    /**
     * Sets the value of the botanic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Botanic }
     *     
     */
    public void setBotanic(Botanic value) {
        this.botanic = value;
    }

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citation }
     * 
     * 
     */
    public List<Citation> getCitation() {
        if (citation == null) {
            citation = new ArrayList<Citation>();
        }
        return this.citation;
    }

}
