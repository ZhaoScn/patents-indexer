//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:28 PM EST 
//


package xml.us.patent.application.v42;

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
@XmlRootElement(name = "img")
public class Img {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "he", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String he;
    @XmlAttribute(name = "wi", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String wi;
    @XmlAttribute(name = "file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "alt")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alt;
    @XmlAttribute(name = "img-content")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imgContent;
    @XmlAttribute(name = "img-format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imgFormat;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "inline")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inline;

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
     * Gets the value of the imgContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgContent() {
        if (imgContent == null) {
            return "drawing";
        } else {
            return imgContent;
        }
    }

    /**
     * Sets the value of the imgContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgContent(String value) {
        this.imgContent = value;
    }

    /**
     * Gets the value of the imgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFormat() {
        return imgFormat;
    }

    /**
     * Sets the value of the imgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFormat(String value) {
        this.imgFormat = value;
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

    /**
     * Gets the value of the inline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInline() {
        if (inline == null) {
            return "no";
        } else {
            return inline;
        }
    }

    /**
     * Sets the value of the inline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInline(String value) {
        this.inline = value;
    }

}
