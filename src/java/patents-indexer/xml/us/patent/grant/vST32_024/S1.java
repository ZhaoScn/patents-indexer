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
    "s1III",
    "s1IV",
    "s1V",
    "s1VIII",
    "s1IX"
})
@XmlRootElement(name = "S-1")
public class S1 {

    @XmlElement(name = "S-1-III", required = true)
    protected S1III s1III;
    @XmlElement(name = "S-1-IV")
    protected S1IV s1IV;
    @XmlElement(name = "S-1-V")
    protected S1V s1V;
    @XmlElement(name = "S-1-VIII")
    protected S1VIII s1VIII;
    @XmlElement(name = "S-1-IX")
    protected S1IX s1IX;

    /**
     * Gets the value of the s1III property.
     * 
     * @return
     *     possible object is
     *     {@link S1III }
     *     
     */
    public S1III getS1III() {
        return s1III;
    }

    /**
     * Sets the value of the s1III property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1III }
     *     
     */
    public void setS1III(S1III value) {
        this.s1III = value;
    }

    /**
     * Gets the value of the s1IV property.
     * 
     * @return
     *     possible object is
     *     {@link S1IV }
     *     
     */
    public S1IV getS1IV() {
        return s1IV;
    }

    /**
     * Sets the value of the s1IV property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1IV }
     *     
     */
    public void setS1IV(S1IV value) {
        this.s1IV = value;
    }

    /**
     * Gets the value of the s1V property.
     * 
     * @return
     *     possible object is
     *     {@link S1V }
     *     
     */
    public S1V getS1V() {
        return s1V;
    }

    /**
     * Sets the value of the s1V property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1V }
     *     
     */
    public void setS1V(S1V value) {
        this.s1V = value;
    }

    /**
     * Gets the value of the s1VIII property.
     * 
     * @return
     *     possible object is
     *     {@link S1VIII }
     *     
     */
    public S1VIII getS1VIII() {
        return s1VIII;
    }

    /**
     * Sets the value of the s1VIII property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1VIII }
     *     
     */
    public void setS1VIII(S1VIII value) {
        this.s1VIII = value;
    }

    /**
     * Gets the value of the s1IX property.
     * 
     * @return
     *     possible object is
     *     {@link S1IX }
     *     
     */
    public S1IX getS1IX() {
        return s1IX;
    }

    /**
     * Sets the value of the s1IX property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1IX }
     *     
     */
    public void setS1IX(S1IX value) {
        this.s1IX = value;
    }

}
