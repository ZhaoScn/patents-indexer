//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b310",
    "b320",
    "b330"
})
@XmlRootElement(name = "B300")
public class B300 {

    @XmlAttribute(name = "INID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inid;
    @XmlElement(name = "B310", required = true)
    protected B310 b310;
    @XmlElement(name = "B320", required = true)
    protected B320 b320;
    @XmlElement(name = "B330", required = true)
    protected B330 b330;

    /**
     * Gets the value of the inid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINID() {
        if (inid == null) {
            return "[30]";
        } else {
            return inid;
        }
    }

    /**
     * Sets the value of the inid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINID(String value) {
        this.inid = value;
    }

    /**
     * Gets the value of the b310 property.
     * 
     * @return
     *     possible object is
     *     {@link B310 }
     *     
     */
    public B310 getB310() {
        return b310;
    }

    /**
     * Sets the value of the b310 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B310 }
     *     
     */
    public void setB310(B310 value) {
        this.b310 = value;
    }

    /**
     * Gets the value of the b320 property.
     * 
     * @return
     *     possible object is
     *     {@link B320 }
     *     
     */
    public B320 getB320() {
        return b320;
    }

    /**
     * Sets the value of the b320 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B320 }
     *     
     */
    public void setB320(B320 value) {
        this.b320 = value;
    }

    /**
     * Gets the value of the b330 property.
     * 
     * @return
     *     possible object is
     *     {@link B330 }
     *     
     */
    public B330 getB330() {
        return b330;
    }

    /**
     * Sets the value of the b330 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B330 }
     *     
     */
    public void setB330(B330 value) {
        this.b330 = value;
    }

}