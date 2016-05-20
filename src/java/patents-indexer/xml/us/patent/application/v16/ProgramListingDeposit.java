//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

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
    "heading",
    "number",
    "programListing"
})
@XmlRootElement(name = "program-listing-deposit")
public class ProgramListingDeposit {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "maximum-page-count")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maximumPageCount;
    protected Heading heading;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(name = "program-listing", required = true)
    protected ProgramListing programListing;

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
     * Gets the value of the maximumPageCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumPageCount() {
        if (maximumPageCount == null) {
            return "10";
        } else {
            return maximumPageCount;
        }
    }

    /**
     * Sets the value of the maximumPageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumPageCount(String value) {
        this.maximumPageCount = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Heading }
     *     
     */
    public Heading getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heading }
     *     
     */
    public void setHeading(Heading value) {
        this.heading = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the programListing property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramListing }
     *     
     */
    public ProgramListing getProgramListing() {
        return programListing;
    }

    /**
     * Sets the value of the programListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramListing }
     *     
     */
    public void setProgramListing(ProgramListing value) {
        this.programListing = value;
    }

}
