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
    "pdat"
})
@XmlRootElement(name = "S213")
public class S213 {

    @XmlElement(name = "PDAT", required = true)
    protected PDAT pdat;

    /**
     * Gets the value of the pdat property.
     * 
     * @return
     *     possible object is
     *     {@link PDAT }
     *     
     */
    public PDAT getPDAT() {
        return pdat;
    }

    /**
     * Sets the value of the pdat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDAT }
     *     
     */
    public void setPDAT(PDAT value) {
        this.pdat = value;
    }

}
