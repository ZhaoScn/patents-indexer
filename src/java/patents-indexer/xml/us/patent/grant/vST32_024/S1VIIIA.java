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
    "nam"
})
@XmlRootElement(name = "S-1-VIII-A")
public class S1VIIIA {

    @XmlElement(name = "NAM", required = true)
    protected NAM nam;

    /**
     * Gets the value of the nam property.
     * 
     * @return
     *     possible object is
     *     {@link NAM }
     *     
     */
    public NAM getNAM() {
        return nam;
    }

    /**
     * Sets the value of the nam property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAM }
     *     
     */
    public void setNAM(NAM value) {
        this.nam = value;
    }

}
