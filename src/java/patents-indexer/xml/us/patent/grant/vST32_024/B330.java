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
    "ctry"
})
@XmlRootElement(name = "B330")
public class B330 {

    @XmlElement(name = "CTRY", required = true)
    protected CTRY ctry;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link CTRY }
     *     
     */
    public CTRY getCTRY() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTRY }
     *     
     */
    public void setCTRY(CTRY value) {
        this.ctry = value;
    }

}
