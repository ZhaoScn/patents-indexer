//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:49:43 PM EST 
//


package xml.us.patent.application.v40_040415;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
@XmlType(name = "")
@XmlRootElement(name = "doc-page")
public class DocPage {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "he", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String he;
    @XmlAttribute(name = "wi", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String wi;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "alt")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alt;
    @XmlAttribute(name = "pp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pp;
    @XmlAttribute(name = "ppf")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ppf;
    @XmlAttribute(name = "ppl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ppl;
    @XmlAttribute(name = "file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String color;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;

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
     * Gets the value of the he property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHe() {
        return he;
    }

    /**
     * Sets the value of the he property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHe(String value) {
        this.he = value;
    }

    /**
     * Gets the value of the wi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWi() {
        return wi;
    }

    /**
     * Sets the value of the wi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWi(String value) {
        this.wi = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the pp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPp() {
        return pp;
    }

    /**
     * Sets the value of the pp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPp(String value) {
        this.pp = value;
    }

    /**
     * Gets the value of the ppf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpf() {
        return ppf;
    }

    /**
     * Sets the value of the ppf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpf(String value) {
        this.ppf = value;
    }

    /**
     * Gets the value of the ppl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpl() {
        return ppl;
    }

    /**
     * Sets the value of the ppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpl(String value) {
        this.ppl = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

}
