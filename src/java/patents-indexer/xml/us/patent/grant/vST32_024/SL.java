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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "li"
})
@XmlRootElement(name = "SL")
public class SL {

    @XmlAttribute(name = "COMPACT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compact;
    @XmlAttribute(name = "LEVEL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String level;
    @XmlElement(name = "LI", required = true)
    protected List<LI> li;

    /**
     * Gets the value of the compact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPACT() {
        return compact;
    }

    /**
     * Sets the value of the compact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPACT(String value) {
        this.compact = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEVEL() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEVEL(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the li property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the li property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LI }
     * 
     * 
     */
    public List<LI> getLI() {
        if (li == null) {
            li = new ArrayList<LI>();
        }
        return this.li;
    }

}
