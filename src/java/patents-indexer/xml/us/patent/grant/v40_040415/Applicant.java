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
    "addressbook",
    "nationality",
    "residence",
    "usRights",
    "designatedStates",
    "designatedStatesAsInventor"
})
@XmlRootElement(name = "applicant")
public class Applicant {

    @XmlAttribute(name = "sequence", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlAttribute(name = "app-type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String appType;
    @XmlAttribute(name = "designation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String designation;
    @XmlElement(required = true)
    protected List<Addressbook> addressbook;
    @XmlElement(required = true)
    protected Nationality nationality;
    @XmlElement(required = true)
    protected Residence residence;
    @XmlElement(name = "us-rights")
    protected List<UsRights> usRights;
    @XmlElement(name = "designated-states")
    protected DesignatedStates designatedStates;
    @XmlElement(name = "designated-states-as-inventor")
    protected DesignatedStatesAsInventor designatedStatesAsInventor;

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
     * Gets the value of the appType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppType() {
        return appType;
    }

    /**
     * Sets the value of the appType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppType(String value) {
        this.appType = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Gets the value of the addressbook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressbook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressbook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Addressbook }
     * 
     * 
     */
    public List<Addressbook> getAddressbook() {
        if (addressbook == null) {
            addressbook = new ArrayList<Addressbook>();
        }
        return this.addressbook;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Nationality }
     *     
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nationality }
     *     
     */
    public void setNationality(Nationality value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link Residence }
     *     
     */
    public Residence getResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Residence }
     *     
     */
    public void setResidence(Residence value) {
        this.residence = value;
    }

    /**
     * Gets the value of the usRights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usRights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsRights }
     * 
     * 
     */
    public List<UsRights> getUsRights() {
        if (usRights == null) {
            usRights = new ArrayList<UsRights>();
        }
        return this.usRights;
    }

    /**
     * Gets the value of the designatedStates property.
     * 
     * @return
     *     possible object is
     *     {@link DesignatedStates }
     *     
     */
    public DesignatedStates getDesignatedStates() {
        return designatedStates;
    }

    /**
     * Sets the value of the designatedStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignatedStates }
     *     
     */
    public void setDesignatedStates(DesignatedStates value) {
        this.designatedStates = value;
    }

    /**
     * Gets the value of the designatedStatesAsInventor property.
     * 
     * @return
     *     possible object is
     *     {@link DesignatedStatesAsInventor }
     *     
     */
    public DesignatedStatesAsInventor getDesignatedStatesAsInventor() {
        return designatedStatesAsInventor;
    }

    /**
     * Sets the value of the designatedStatesAsInventor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignatedStatesAsInventor }
     *     
     */
    public void setDesignatedStatesAsInventor(DesignatedStatesAsInventor value) {
        this.designatedStatesAsInventor = value;
    }

}
