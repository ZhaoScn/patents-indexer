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
    "btext"
})
@XmlRootElement(name = "DRWDESC")
public class DRWDESC {

    @XmlElement(name = "BTEXT", required = true)
    protected BTEXT btext;

    /**
     * Gets the value of the btext property.
     * 
     * @return
     *     possible object is
     *     {@link BTEXT }
     *     
     */
    public BTEXT getBTEXT() {
        return btext;
    }

    /**
     * Sets the value of the btext property.
     * 
     * @param value
     *     allowed object is
     *     {@link BTEXT }
     *     
     */
    public void setBTEXT(BTEXT value) {
        this.btext = value;
    }

}
