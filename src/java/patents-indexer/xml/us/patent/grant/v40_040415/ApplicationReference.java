//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:10 PM EST 
//


package xml.us.patent.grant.v40_040415;

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
    "documentId"
})
@XmlRootElement(name = "application-reference")
public class ApplicationReference {

    @XmlAttribute(name = "appl-type", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String applType;
    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;

    /**
     * Gets the value of the applType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplType() {
        return applType;
    }

    /**
     * Sets the value of the applType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplType(String value) {
        this.applType = value;
    }

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

}
