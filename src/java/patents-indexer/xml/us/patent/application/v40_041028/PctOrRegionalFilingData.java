//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:47:42 PM EST 
//


package xml.us.patent.application.v40_041028;

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
    "documentId",
    "us371C124Date"
})
@XmlRootElement(name = "pct-or-regional-filing-data")
public class PctOrRegionalFilingData {

    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElement(name = "us-371c124-date")
    protected Us371C124Date us371C124Date;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentId }
     *     
     */
    public DocumentId getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentId }
     *     
     */
    public void setDocumentId(DocumentId value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the us371C124Date property.
     * 
     * @return
     *     possible object is
     *     {@link Us371C124Date }
     *     
     */
    public Us371C124Date getUs371C124Date() {
        return us371C124Date;
    }

    /**
     * Sets the value of the us371C124Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Us371C124Date }
     *     
     */
    public void setUs371C124Date(Us371C124Date value) {
        this.us371C124Date = value;
    }

}
