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
    "s2VIIIA",
    "s2VIIIB",
    "s2VIIIC"
})
@XmlRootElement(name = "S-2-VIII")
public class S2VIII {

    @XmlElement(name = "S-2-VIII-A")
    protected S2VIIIA s2VIIIA;
    @XmlElement(name = "S-2-VIII-B")
    protected S2VIIIB s2VIIIB;
    @XmlElement(name = "S-2-VIII-C")
    protected S2VIIIC s2VIIIC;

    /**
     * Gets the value of the s2VIIIA property.
     * 
     * @return
     *     possible object is
     *     {@link S2VIIIA }
     *     
     */
    public S2VIIIA getS2VIIIA() {
        return s2VIIIA;
    }

    /**
     * Sets the value of the s2VIIIA property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2VIIIA }
     *     
     */
    public void setS2VIIIA(S2VIIIA value) {
        this.s2VIIIA = value;
    }

    /**
     * Gets the value of the s2VIIIB property.
     * 
     * @return
     *     possible object is
     *     {@link S2VIIIB }
     *     
     */
    public S2VIIIB getS2VIIIB() {
        return s2VIIIB;
    }

    /**
     * Sets the value of the s2VIIIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2VIIIB }
     *     
     */
    public void setS2VIIIB(S2VIIIB value) {
        this.s2VIIIB = value;
    }

    /**
     * Gets the value of the s2VIIIC property.
     * 
     * @return
     *     possible object is
     *     {@link S2VIIIC }
     *     
     */
    public S2VIIIC getS2VIIIC() {
        return s2VIIIC;
    }

    /**
     * Sets the value of the s2VIIIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link S2VIIIC }
     *     
     */
    public void setS2VIIIC(S2VIIIC value) {
        this.s2VIIIC = value;
    }

}
