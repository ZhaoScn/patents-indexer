//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:04:30 PM EST 
//


package xml.us.patent.grant.v40_041028;

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
    "pkcs7"
})
@XmlRootElement(name = "enhanced-signature")
public class EnhancedSignature {

    @XmlElement(required = true)
    protected Pkcs7 pkcs7;

    /**
     * Gets the value of the pkcs7 property.
     * 
     * @return
     *     possible object is
     *     {@link Pkcs7 }
     *     
     */
    public Pkcs7 getPkcs7() {
        return pkcs7;
    }

    /**
     * Sets the value of the pkcs7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pkcs7 }
     *     
     */
    public void setPkcs7(Pkcs7 value) {
        this.pkcs7 = value;
    }

}
