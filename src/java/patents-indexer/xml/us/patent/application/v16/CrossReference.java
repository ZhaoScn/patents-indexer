//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "cross-reference")
public class CrossReference {

    @XmlAttribute(name = "hytime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hytime;
    @XmlAttribute(name = "target", required = true)
    @XmlIDREF
    protected List<Object> target;
    @XmlValue
    protected String value;

    /**
     * Gets the value of the hytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHytime() {
        if (hytime == null) {
            return "hylink";
        } else {
            return hytime;
        }
    }

    /**
     * Sets the value of the hytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHytime(String value) {
        this.hytime = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTarget() {
        if (target == null) {
            target = new ArrayList<Object>();
        }
        return this.target;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getvalue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setvalue(String value) {
        this.value = value;
    }

}
