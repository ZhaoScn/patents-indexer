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
    "s2IXA",
    "s2IXB",
    "s2IXC",
    "s2IXD"
})
@XmlRootElement(name = "S-2-IX")
public class S2IX {

    @XmlElement(name = "S-2-IX-A")
    protected S2IXA s2IXA;
    @XmlElement(name = "S-2-IX-B")
    protected S2IXB s2IXB;
    @XmlElement(name = "S-2-IX-C")
    protected S2IXC s2IXC;
    @XmlElement(name = "S-2-IX-D")
    protected S2IXD s2IXD;

    /**
     * Gets the value of the s2IXA property.
     * 
     * @return
     *     possible object is
     *     {@link S2IXA }
     *     
     */
    public S2IXA getS2IXA() {
        return s2IXA;
    }

    /**
     * Sets the value of the s2IXA property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IXA }
     *     
     */
    public void setS2IXA(S2IXA value) {
        this.s2IXA = value;
    }

    /**
     * Gets the value of the s2IXB property.
     * 
     * @return
     *     possible object is
     *     {@link S2IXB }
     *     
     */
    public S2IXB getS2IXB() {
        return s2IXB;
    }

    /**
     * Sets the value of the s2IXB property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IXB }
     *     
     */
    public void setS2IXB(S2IXB value) {
        this.s2IXB = value;
    }

    /**
     * Gets the value of the s2IXC property.
     * 
     * @return
     *     possible object is
     *     {@link S2IXC }
     *     
     */
    public S2IXC getS2IXC() {
        return s2IXC;
    }

    /**
     * Sets the value of the s2IXC property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IXC }
     *     
     */
    public void setS2IXC(S2IXC value) {
        this.s2IXC = value;
    }

    /**
     * Gets the value of the s2IXD property.
     * 
     * @return
     *     possible object is
     *     {@link S2IXD }
     *     
     */
    public S2IXD getS2IXD() {
        return s2IXD;
    }

    /**
     * Sets the value of the s2IXD property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2IXD }
     *     
     */
    public void setS2IXD(S2IXD value) {
        this.s2IXD = value;
    }

}
