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
    "s2VIIA",
    "s2VIIB"
})
@XmlRootElement(name = "S-2-VII")
public class S2VII {

    @XmlElement(name = "S-2-VII-A")
    protected S2VIIA s2VIIA;
    @XmlElement(name = "S-2-VII-B")
    protected S2VIIB s2VIIB;

    /**
     * Gets the value of the s2VIIA property.
     * 
     * @return
     *     possible object is
     *     {@link S2VIIA }
     *     
     */
    public S2VIIA getS2VIIA() {
        return s2VIIA;
    }

    /**
     * Sets the value of the s2VIIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2VIIA }
     *     
     */
    public void setS2VIIA(S2VIIA value) {
        this.s2VIIA = value;
    }

    /**
     * Gets the value of the s2VIIB property.
     * 
     * @return
     *     possible object is
     *     {@link S2VIIB }
     *     
     */
    public S2VIIB getS2VIIB() {
        return s2VIIB;
    }

    /**
     * Sets the value of the s2VIIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2VIIB }
     *     
     */
    public void setS2VIIB(S2VIIB value) {
        this.s2VIIB = value;
    }

}
