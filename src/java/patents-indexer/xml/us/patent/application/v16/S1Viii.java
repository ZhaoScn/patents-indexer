//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

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
    "s1ViiiA",
    "s1ViiiB",
    "s1ViiiC"
})
@XmlRootElement(name = "s-1-viii")
public class S1Viii {

    @XmlElement(name = "s-1-viii-a", required = true)
    protected S1ViiiA s1ViiiA;
    @XmlElement(name = "s-1-viii-b", required = true)
    protected String s1ViiiB;
    @XmlElement(name = "s-1-viii-c", required = true)
    protected String s1ViiiC;

    /**
     * Gets the value of the s1ViiiA property.
     * 
     * @return
     *     possible object is
     *     {@link S1ViiiA }
     *     
     */
    public S1ViiiA getS1ViiiA() {
        return s1ViiiA;
    }

    /**
     * Sets the value of the s1ViiiA property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1ViiiA }
     *     
     */
    public void setS1ViiiA(S1ViiiA value) {
        this.s1ViiiA = value;
    }

    /**
     * Gets the value of the s1ViiiB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1ViiiB() {
        return s1ViiiB;
    }

    /**
     * Sets the value of the s1ViiiB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1ViiiB(String value) {
        this.s1ViiiB = value;
    }

    /**
     * Gets the value of the s1ViiiC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1ViiiC() {
        return s1ViiiC;
    }

    /**
     * Sets the value of the s1ViiiC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1ViiiC(String value) {
        this.s1ViiiC = value;
    }

}
