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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b511",
    "b512",
    "b516"
})
@XmlRootElement(name = "B510")
public class B510 {

    @XmlAttribute(name = "INID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inid;
    @XmlElement(name = "B511", required = true)
    protected B511 b511;
    @XmlElement(name = "B512")
    protected List<B512> b512;
    @XmlElement(name = "B516", required = true)
    protected B516 b516;

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
            return "[51]";
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
     * Gets the value of the b511 property.
     * 
     * @return
     *     possible object is
     *     {@link B511 }
     *     
     */
    public B511 getB511() {
        return b511;
    }

    /**
     * Sets the value of the b511 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B511 }
     *     
     */
    public void setB511(B511 value) {
        this.b511 = value;
    }

    /**
     * Gets the value of the b512 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b512 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB512().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link B512 }
     * 
     * 
     */
    public List<B512> getB512() {
        if (b512 == null) {
            b512 = new ArrayList<B512>();
        }
        return this.b512;
    }

    /**
     * Gets the value of the b516 property.
     * 
     * @return
     *     possible object is
     *     {@link B516 }
     *     
     */
    public B516 getB516() {
        return b516;
    }

    /**
     * Sets the value of the b516 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B516 }
     *     
     */
    public void setB516(B516 value) {
        this.b516 = value;
    }

}
