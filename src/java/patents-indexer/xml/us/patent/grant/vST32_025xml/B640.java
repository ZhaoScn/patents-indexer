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
    "parentus"
})
@XmlRootElement(name = "B640")
public class B640 {

    @XmlAttribute(name = "INID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inid;
    @XmlElement(name = "PARENT-US", required = true)
    protected PARENTUS parentus;

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
            return "[64]";
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
     * Gets the value of the parentus property.
     * 
     * @return
     *     possible object is
     *     {@link PARENTUS }
     *     
     */
    public PARENTUS getPARENTUS() {
        return parentus;
    }

    /**
     * Sets the value of the parentus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARENTUS }
     *     
     */
    public void setPARENTUS(PARENTUS value) {
        this.parentus = value;
    }

}
