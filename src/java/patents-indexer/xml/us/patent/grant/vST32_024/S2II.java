//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 12:46:59 AM EST 
//


package xml.us.patent.grant.vST32_024;

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
    "s2IIMT",
    "s2IIA"
})
@XmlRootElement(name = "S-2-II")
public class S2II {

    @XmlElement(name = "S-2-II-MT", required = true)
    protected S2IIMT s2IIMT;
    @XmlElement(name = "S-2-II-A")
    protected S2IIA s2IIA;

    /**
     * Gets the value of the s2IIMT property.
     * 
     * @return
     *     possible object is
     *     {@link S2IIMT }
     *     
     */
    public S2IIMT getS2IIMT() {
        return s2IIMT;
    }

    /**
     * Sets the value of the s2IIMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IIMT }
     *     
     */
    public void setS2IIMT(S2IIMT value) {
        this.s2IIMT = value;
    }

    /**
     * Gets the value of the s2IIA property.
     * 
     * @return
     *     possible object is
     *     {@link S2IIA }
     *     
     */
    public S2IIA getS2IIA() {
        return s2IIA;
    }

    /**
     * Sets the value of the s2IIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IIA }
     *     
     */
    public void setS2IIA(S2IIA value) {
        this.s2IIA = value;
    }

}
