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
    "b210",
    "b211US",
    "b220",
    "b221US",
    "b222US"
})
@XmlRootElement(name = "B200")
public class B200 {

    @XmlElement(name = "B210", required = true)
    protected B210 b210;
    @XmlElement(name = "B211US", required = true)
    protected B211US b211US;
    @XmlElement(name = "B220", required = true)
    protected B220 b220;
    @XmlElement(name = "B221US")
    protected B221US b221US;
    @XmlElement(name = "B222US")
    protected B222US b222US;

    /**
     * Gets the value of the b210 property.
     * 
     * @return
     *     possible object is
     *     {@link B210 }
     *     
     */
    public B210 getB210() {
        return b210;
    }

    /**
     * Sets the value of the b210 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B210 }
     *     
     */
    public void setB210(B210 value) {
        this.b210 = value;
    }

    /**
     * Gets the value of the b211US property.
     * 
     * @return
     *     possible object is
     *     {@link B211US }
     *     
     */
    public B211US getB211US() {
        return b211US;
    }

    /**
     * Sets the value of the b211US property.
     * 
     * @param value
     *     allowed object is
     *     {@link B211US }
     *     
     */
    public void setB211US(B211US value) {
        this.b211US = value;
    }

    /**
     * Gets the value of the b220 property.
     * 
     * @return
     *     possible object is
     *     {@link B220 }
     *     
     */
    public B220 getB220() {
        return b220;
    }

    /**
     * Sets the value of the b220 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B220 }
     *     
     */
    public void setB220(B220 value) {
        this.b220 = value;
    }

    /**
     * Gets the value of the b221US property.
     * 
     * @return
     *     possible object is
     *     {@link B221US }
     *     
     */
    public B221US getB221US() {
        return b221US;
    }

    /**
     * Sets the value of the b221US property.
     * 
     * @param value
     *     allowed object is
     *     {@link B221US }
     *     
     */
    public void setB221US(B221US value) {
        this.b221US = value;
    }

    /**
     * Gets the value of the b222US property.
     * 
     * @return
     *     possible object is
     *     {@link B222US }
     *     
     */
    public B222US getB222US() {
        return b222US;
    }

    /**
     * Sets the value of the b222US property.
     * 
     * @param value
     *     allowed object is
     *     {@link B222US }
     *     
     */
    public void setB222US(B222US value) {
        this.b222US = value;
    }

}
