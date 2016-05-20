//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 10:47:01 PM EST 
//


package xml.us.patent.grant.v43;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "edition",
    "mainClassification",
    "furtherClassification",
    "additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode",
    "text"
})
@XmlRootElement(name = "classification-ipc")
public class ClassificationIpc {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(required = true)
    protected Edition edition;
    @XmlElement(name = "main-classification", required = true)
    protected String mainClassification;
    @XmlElement(name = "further-classification")
    protected List<FurtherClassification> furtherClassification;
    @XmlElements({
        @XmlElement(name = "additional-info", type = AdditionalInfo.class),
        @XmlElement(name = "linked-indexing-code-group", type = LinkedIndexingCodeGroup.class),
        @XmlElement(name = "unlinked-indexing-code", type = UnlinkedIndexingCode.class)
    })
    protected List<Object> additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode;
    protected Text text;

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
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link Edition }
     *     
     */
    public Edition getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Edition }
     *     
     */
    public void setEdition(Edition value) {
        this.edition = value;
    }

    /**
     * Gets the value of the mainClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainClassification() {
        return mainClassification;
    }

    /**
     * Sets the value of the mainClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainClassification(String value) {
        this.mainClassification = value;
    }

    /**
     * Gets the value of the furtherClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the furtherClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFurtherClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FurtherClassification }
     * 
     * 
     */
    public List<FurtherClassification> getFurtherClassification() {
        if (furtherClassification == null) {
            furtherClassification = new ArrayList<FurtherClassification>();
        }
        return this.furtherClassification;
    }

    /**
     * Gets the value of the additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * {@link LinkedIndexingCodeGroup }
     * {@link UnlinkedIndexingCode }
     * 
     * 
     */
    public List<Object> getAdditionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode() {
        if (additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode == null) {
            additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode = new ArrayList<Object>();
        }
        return this.additionalInfoOrLinkedIndexingCodeGroupOrUnlinkedIndexingCode;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

}
