//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

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
    "nam",
    "adr",
    "residence",
    "dtxt",
    "rctry",
    "nctry"
})
@XmlRootElement(name = "PARTY-US")
public class PARTYUS {

    @XmlElement(name = "NAM", required = true)
    protected NAM nam;
    @XmlElement(name = "ADR")
    protected ADR adr;
    @XmlElement(name = "RESIDENCE")
    protected RESIDENCE residence;
    @XmlElement(name = "DTXT")
    protected DTXT dtxt;
    @XmlElement(name = "RCTRY")
    protected RCTRY rctry;
    @XmlElement(name = "NCTRY")
    protected NCTRY nctry;

    /**
     * Gets the value of the nam property.
     * 
     * @return
     *     possible object is
     *     {@link NAM }
     *     
     */
    public NAM getNAM() {
        return nam;
    }

    /**
     * Sets the value of the nam property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAM }
     *     
     */
    public void setNAM(NAM value) {
        this.nam = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link ADR }
     *     
     */
    public ADR getADR() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADR }
     *     
     */
    public void setADR(ADR value) {
        this.adr = value;
    }

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link RESIDENCE }
     *     
     */
    public RESIDENCE getRESIDENCE() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESIDENCE }
     *     
     */
    public void setRESIDENCE(RESIDENCE value) {
        this.residence = value;
    }

    /**
     * Gets the value of the dtxt property.
     * 
     * @return
     *     possible object is
     *     {@link DTXT }
     *     
     */
    public DTXT getDTXT() {
        return dtxt;
    }

    /**
     * Sets the value of the dtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTXT }
     *     
     */
    public void setDTXT(DTXT value) {
        this.dtxt = value;
    }

    /**
     * Gets the value of the rctry property.
     * 
     * @return
     *     possible object is
     *     {@link RCTRY }
     *     
     */
    public RCTRY getRCTRY() {
        return rctry;
    }

    /**
     * Sets the value of the rctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RCTRY }
     *     
     */
    public void setRCTRY(RCTRY value) {
        this.rctry = value;
    }

    /**
     * Gets the value of the nctry property.
     * 
     * @return
     *     possible object is
     *     {@link NCTRY }
     *     
     */
    public NCTRY getNCTRY() {
        return nctry;
    }

    /**
     * Sets the value of the nctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCTRY }
     *     
     */
    public void setNCTRY(NCTRY value) {
        this.nctry = value;
    }

}
