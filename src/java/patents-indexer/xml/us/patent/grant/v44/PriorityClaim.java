//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:03 PM EST 
//


package xml.us.patent.grant.v44;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
    "country",
    "docNumber",
    "date",
    "officeOfFiling",
    "priorityDocRequestedOrPriorityDocAttached"
})
@XmlRootElement(name = "priority-claim")
public class PriorityClaim {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "sequence", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlAttribute(name = "kind", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kind;
    @XmlElement(required = true)
    protected Country country;
    @XmlElement(name = "doc-number")
    protected String docNumber;
    @XmlElement(required = true)
    protected Date date;
    @XmlElement(name = "office-of-filing")
    protected OfficeOfFiling officeOfFiling;
    @XmlElements({
        @XmlElement(name = "priority-doc-requested", type = PriorityDocRequested.class),
        @XmlElement(name = "priority-doc-attached", type = PriorityDocAttached.class)
    })
    protected List<Object> priorityDocRequestedOrPriorityDocAttached;

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
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
     * Gets the value of the officeOfFiling property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeOfFiling }
     *     
     */
    public OfficeOfFiling getOfficeOfFiling() {
        return officeOfFiling;
    }

    /**
     * Sets the value of the officeOfFiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeOfFiling }
     *     
     */
    public void setOfficeOfFiling(OfficeOfFiling value) {
        this.officeOfFiling = value;
    }

    /**
     * Gets the value of the priorityDocRequestedOrPriorityDocAttached property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityDocRequestedOrPriorityDocAttached property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityDocRequestedOrPriorityDocAttached().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityDocRequested }
     * {@link PriorityDocAttached }
     * 
     * 
     */
    public List<Object> getPriorityDocRequestedOrPriorityDocAttached() {
        if (priorityDocRequestedOrPriorityDocAttached == null) {
            priorityDocRequestedOrPriorityDocAttached = new ArrayList<Object>();
        }
        return this.priorityDocRequestedOrPriorityDocAttached;
    }

}
