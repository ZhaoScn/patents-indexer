//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:01:40 PM EST 
//


package xml.us.patent.grant.v45;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "img"
})
@XmlRootElement(name = "us-math")
public class UsMath {

    @XmlAttribute(name = "idrefs", required = true)
    @XmlIDREF
    protected List<Object> idrefs;
    @XmlAttribute(name = "nb-file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nbFile;
    protected Img img;

    /**
     * Gets the value of the idrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getIdrefs() {
        if (idrefs == null) {
            idrefs = new ArrayList<Object>();
        }
        return this.idrefs;
    }

    /**
     * Gets the value of the nbFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbFile() {
        return nbFile;
    }

    /**
     * Sets the value of the nbFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbFile(String value) {
        this.nbFile = value;
    }

    /**
     * Gets the value of the img property.
     * 
     * @return
     *     possible object is
     *     {@link Img }
     *     
     */
    public Img getImg() {
        return img;
    }

    /**
     * Sets the value of the img property.
     * 
     * @param value
     *     allowed object is
     *     {@link Img }
     *     
     */
    public void setImg(Img value) {
        this.img = value;
    }

}
