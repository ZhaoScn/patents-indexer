//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:49:43 PM EST 
//


package xml.us.patent.application.v40_040415;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentCorrected",
    "typeOfCorrection",
    "text"
})
@XmlRootElement(name = "correction")
public class Correction {

    @XmlElement(name = "document-corrected", required = true)
    protected DocumentCorrected documentCorrected;
    @XmlElement(name = "type-of-correction", required = true)
    protected String typeOfCorrection;
    protected Text text;

    /**
     * Gets the value of the documentCorrected property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCorrected }
     *     
     */
    public DocumentCorrected getDocumentCorrected() {
        return documentCorrected;
    }

    /**
     * Sets the value of the documentCorrected property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCorrected }
     *     
     */
    public void setDocumentCorrected(DocumentCorrected value) {
        this.documentCorrected = value;
    }

    /**
     * Gets the value of the typeOfCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCorrection() {
        return typeOfCorrection;
    }

    /**
     * Sets the value of the typeOfCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCorrection(String value) {
        this.typeOfCorrection = value;
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
