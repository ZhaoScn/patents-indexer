//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:48:08 PM EST 
//


package xml.us.patent.application.v40_040927;

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
    "gazetteReference"
})
@XmlRootElement(name = "pct-or-regional-publishing-data")
public class PctOrRegionalPublishingData {

    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElement(name = "gazette-reference")
    protected GazetteReference gazetteReference;

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
     * Gets the value of the gazetteReference property.
     * 
     * @return
     *     possible object is
     *     {@link GazetteReference }
     *     
     */
    public GazetteReference getGazetteReference() {
        return gazetteReference;
    }

    /**
     * Sets the value of the gazetteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link GazetteReference }
     *     
     */
    public void setGazetteReference(GazetteReference value) {
        this.gazetteReference = value;
    }

}
