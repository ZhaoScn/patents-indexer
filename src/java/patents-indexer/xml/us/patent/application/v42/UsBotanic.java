//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:28 PM EST 
//


package xml.us.patent.application.v42;

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
    "latinName",
    "variety"
})
@XmlRootElement(name = "us-botanic")
public class UsBotanic {

    @XmlElement(name = "latin-name", required = true)
    protected String latinName;
    @XmlElement(required = true)
    protected String variety;

    /**
     * Gets the value of the latinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatinName() {
        return latinName;
    }

    /**
     * Sets the value of the latinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatinName(String value) {
        this.latinName = value;
    }

    /**
     * Gets the value of the variety property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariety() {
        return variety;
    }

    /**
     * Sets the value of the variety property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariety(String value) {
        this.variety = value;
    }

}
