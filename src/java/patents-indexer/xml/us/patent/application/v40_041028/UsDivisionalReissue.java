//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:47:42 PM EST 
//


package xml.us.patent.application.v40_041028;

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
    "usRelation"
})
@XmlRootElement(name = "us-divisional-reissue")
public class UsDivisionalReissue {

    @XmlElement(name = "us-relation", required = true)
    protected UsRelation usRelation;

    /**
     * Gets the value of the usRelation property.
     * 
     * @return
     *     possible object is
     *     {@link UsRelation }
     *     
     */
    public UsRelation getUsRelation() {
        return usRelation;
    }

    /**
     * Sets the value of the usRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsRelation }
     *     
     */
    public void setUsRelation(UsRelation value) {
        this.usRelation = value;
    }

}
