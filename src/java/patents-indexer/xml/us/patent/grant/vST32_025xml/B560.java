//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b561OrB562"
})
@XmlRootElement(name = "B560")
public class B560 {

    @XmlAttribute(name = "INID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inid;
    @XmlElements({
        @XmlElement(name = "B561", required = true, type = B561 .class),
        @XmlElement(name = "B562", required = true, type = B562 .class)
    })
    protected List<Object> b561OrB562;

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
            return "[56]";
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
     * Gets the value of the b561OrB562 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b561OrB562 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB561OrB562().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B561 }
     * {@link B562 }
     * 
     * 
     */
    public List<Object> getB561OrB562() {
        if (b561OrB562 == null) {
            b561OrB562 = new ArrayList<Object>();
        }
        return this.b561OrB562;
    }

}
