//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:10 PM EST 
//


package xml.us.patent.grant.v40_040415;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "li"
})
@XmlRootElement(name = "ol")
public class Ol {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "compact")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compact;
    @XmlAttribute(name = "ol-style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String olStyle;
    @XmlElement(required = true)
    protected List<Li> li;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the compact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompact() {
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
    public void setCompact(String value) {
        this.compact = value;
    }

    /**
     * Gets the value of the olStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlStyle() {
        return olStyle;
    }

    /**
     * Sets the value of the olStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlStyle(String value) {
        this.olStyle = value;
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
     *    getLi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Li }
     * 
     * 
     */
    public List<Li> getLi() {
        if (li == null) {
            li = new ArrayList<Li>();
        }
        return this.li;
    }

}
