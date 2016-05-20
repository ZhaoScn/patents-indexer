//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:45:57 PM EST 
//


package xml.us.patent.application.v44;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentId",
    "us371C124DateOrUs371C12Date"
})
@XmlRootElement(name = "pct-or-regional-filing-data")
public class PctOrRegionalFilingData {

    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElements({
        @XmlElement(name = "us-371c124-date", required = true, type = Us371C124Date.class),
        @XmlElement(name = "us-371c12-date", required = true, type = Us371C12Date.class)
    })
    protected List<Object> us371C124DateOrUs371C12Date;

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
     * Gets the value of the us371C124DateOrUs371C12Date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the us371C124DateOrUs371C12Date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUs371C124DateOrUs371C12Date().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Us371C124Date }
     * {@link Us371C12Date }
     * 
     * 
     */
    public List<Object> getUs371C124DateOrUs371C12Date() {
        if (us371C124DateOrUs371C12Date == null) {
            us371C124DateOrUs371C12Date = new ArrayList<Object>();
        }
        return this.us371C124DateOrUs371C12Date;
    }

}
