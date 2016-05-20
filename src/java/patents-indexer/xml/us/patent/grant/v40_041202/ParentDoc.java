//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:03:04 PM EST 
//


package xml.us.patent.grant.v40_041202;

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
    "parentStatus",
    "parentGrantDocument",
    "parentPctDocument"
})
@XmlRootElement(name = "parent-doc")
public class ParentDoc {

    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElement(name = "parent-status")
    protected String parentStatus;
    @XmlElement(name = "parent-grant-document")
    protected ParentGrantDocument parentGrantDocument;
    @XmlElement(name = "parent-pct-document")
    protected ParentPctDocument parentPctDocument;

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
     * Gets the value of the parentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStatus() {
        return parentStatus;
    }

    /**
     * Sets the value of the parentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStatus(String value) {
        this.parentStatus = value;
    }

    /**
     * Gets the value of the parentGrantDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGrantDocument }
     *     
     */
    public ParentGrantDocument getParentGrantDocument() {
        return parentGrantDocument;
    }

    /**
     * Sets the value of the parentGrantDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGrantDocument }
     *     
     */
    public void setParentGrantDocument(ParentGrantDocument value) {
        this.parentGrantDocument = value;
    }

    /**
     * Gets the value of the parentPctDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ParentPctDocument }
     *     
     */
    public ParentPctDocument getParentPctDocument() {
        return parentPctDocument;
    }

    /**
     * Sets the value of the parentPctDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentPctDocument }
     *     
     */
    public void setParentPctDocument(ParentPctDocument value) {
        this.parentPctDocument = value;
    }

}
