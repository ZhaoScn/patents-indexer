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
    "partyus"
})
@XmlRootElement(name = "B747")
public class B747 {

    @XmlElement(name = "PARTY-US", required = true)
    protected PARTYUS partyus;

    /**
     * Gets the value of the partyus property.
     * 
     * @return
     *     possible object is
     *     {@link PARTYUS }
     *     
     */
    public PARTYUS getPARTYUS() {
        return partyus;
    }

    /**
     * Sets the value of the partyus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTYUS }
     *     
     */
    public void setPARTYUS(PARTYUS value) {
        this.partyus = value;
    }

}
