//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 12:46:59 AM EST 
//


package xml.us.patent.grant.vST32_024;

import java.util.ArrayList;
import java.util.List;
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
    "b746",
    "b747",
    "b748US"
})
@XmlRootElement(name = "B745")
public class B745 {

    @XmlElement(name = "B746", required = true)
    protected B746 b746;
    @XmlElement(name = "B747")
    protected List<B747> b747;
    @XmlElement(name = "B748US", required = true)
    protected B748US b748US;

    /**
     * Gets the value of the b746 property.
     * 
     * @return
     *     possible object is
     *     {@link B746 }
     *     
     */
    public B746 getB746() {
        return b746;
    }

    /**
     * Sets the value of the b746 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B746 }
     *     
     */
    public void setB746(B746 value) {
        this.b746 = value;
    }

    /**
     * Gets the value of the b747 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b747 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB747().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B747 }
     * 
     * 
     */
    public List<B747> getB747() {
        if (b747 == null) {
            b747 = new ArrayList<B747>();
        }
        return this.b747;
    }

    /**
     * Gets the value of the b748US property.
     * 
     * @return
     *     possible object is
     *     {@link B748US }
     *     
     */
    public B748US getB748US() {
        return b748US;
    }

    /**
     * Sets the value of the b748US property.
     * 
     * @param value
     *     allowed object is
     *     {@link B748US }
     *     
     */
    public void setB748US(B748US value) {
        this.b748US = value;
    }

}
