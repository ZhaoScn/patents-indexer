//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 10:47:01 PM EST 
//


package xml.us.patent.grant.v43;

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
    "usProvisionalApplicationStatus"
})
@XmlRootElement(name = "us-provisional-application")
public class UsProvisionalApplication {

    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElement(name = "us-provisional-application-status")
    protected String usProvisionalApplicationStatus;

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
     * Gets the value of the usProvisionalApplicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsProvisionalApplicationStatus() {
        return usProvisionalApplicationStatus;
    }

    /**
     * Sets the value of the usProvisionalApplicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsProvisionalApplicationStatus(String value) {
        this.usProvisionalApplicationStatus = value;
    }

}
