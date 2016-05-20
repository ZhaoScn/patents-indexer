//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:48:42 PM EST 
//


package xml.us.patent.application.v40_040908;

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
    "depositary",
    "bioAccno",
    "date",
    "term",
    "dtext"
})
@XmlRootElement(name = "bio-deposit")
public class BioDeposit {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "num", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String num;
    @XmlAttribute(name = "url")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String url;
    @XmlAttribute(name = "dnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dnum;
    @XmlElement(required = true)
    protected String depositary;
    @XmlElement(name = "bio-accno", required = true)
    protected String bioAccno;
    protected Date date;
    protected String term;
    protected Dtext dtext;

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
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the dnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnum() {
        return dnum;
    }

    /**
     * Sets the value of the dnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnum(String value) {
        this.dnum = value;
    }

    /**
     * Gets the value of the depositary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositary() {
        return depositary;
    }

    /**
     * Sets the value of the depositary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositary(String value) {
        this.depositary = value;
    }

    /**
     * Gets the value of the bioAccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBioAccno() {
        return bioAccno;
    }

    /**
     * Sets the value of the bioAccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBioAccno(String value) {
        this.bioAccno = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the dtext property.
     * 
     * @return
     *     possible object is
     *     {@link Dtext }
     *     
     */
    public Dtext getDtext() {
        return dtext;
    }

    /**
     * Sets the value of the dtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dtext }
     *     
     */
    public void setDtext(Dtext value) {
        this.dtext = value;
    }

}
