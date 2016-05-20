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
    "biologicalDeposit",
    "headingOrParagraphOrSection"
})
@XmlRootElement(name = "detailed-description")
public class DetailedDescription {

    @XmlAttribute(name = "st32-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String st32Name;
    @XmlElement(name = "biological-deposit")
    protected List<BiologicalDeposit> biologicalDeposit;
    @XmlElements({
        @XmlElement(name = "heading", required = true, type = Heading.class),
        @XmlElement(name = "paragraph", required = true, type = Paragraph.class),
        @XmlElement(name = "section", required = true, type = Section.class)
    })
    protected List<Object> headingOrParagraphOrSection;

    /**
     * Gets the value of the st32Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt32Name() {
        if (st32Name == null) {
            return "DETDESC";
        } else {
            return st32Name;
        }
    }

    /**
     * Sets the value of the st32Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt32Name(String value) {
        this.st32Name = value;
    }

    /**
     * Gets the value of the biologicalDeposit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biologicalDeposit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiologicalDeposit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiologicalDeposit }
     * 
     * 
     */
    public List<BiologicalDeposit> getBiologicalDeposit() {
        if (biologicalDeposit == null) {
            biologicalDeposit = new ArrayList<BiologicalDeposit>();
        }
        return this.biologicalDeposit;
    }

    /**
     * Gets the value of the headingOrParagraphOrSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headingOrParagraphOrSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadingOrParagraphOrSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Heading }
     * {@link Paragraph }
     * {@link Section }
     * 
     * 
     */
    public List<Object> getHeadingOrParagraphOrSection() {
        if (headingOrParagraphOrSection == null) {
            headingOrParagraphOrSection = new ArrayList<Object>();
        }
        return this.headingOrParagraphOrSection;
    }

}
