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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym",
    "registeredNumber",
    "phone",
    "fax",
    "email",
    "electronicSignature"
})
@XmlRootElement(name = "authorized-officer")
public class AuthorizedOfficer {

    @XmlElements({
        @XmlElement(name = "name", required = true, type = Name.class),
        @XmlElement(name = "prefix", required = true, type = Prefix.class),
        @XmlElement(name = "last-name", required = true, type = LastName.class),
        @XmlElement(name = "orgname", required = true, type = Orgname.class),
        @XmlElement(name = "first-name", required = true, type = FirstName.class),
        @XmlElement(name = "middle-name", required = true, type = MiddleName.class),
        @XmlElement(name = "suffix", required = true, type = Suffix.class),
        @XmlElement(name = "iid", required = true, type = Iid.class),
        @XmlElement(name = "role", required = true, type = Role.class),
        @XmlElement(name = "department", required = true, type = Department.class),
        @XmlElement(name = "synonym", required = true, type = Synonym.class)
    })
    protected List<Object> nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym;
    @XmlElement(name = "registered-number")
    protected RegisteredNumber registeredNumber;
    protected Phone phone;
    protected Fax fax;
    protected Email email;
    @XmlElement(name = "electronic-signature")
    protected ElectronicSignature electronicSignature;

    /**
     * Gets the value of the nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * {@link Prefix }
     * {@link LastName }
     * {@link Orgname }
     * {@link FirstName }
     * {@link MiddleName }
     * {@link Suffix }
     * {@link Iid }
     * {@link Role }
     * {@link Department }
     * {@link Synonym }
     * 
     * 
     */
    public List<Object> getNameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym() {
        if (nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym == null) {
            nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym = new ArrayList<Object>();
        }
        return this.nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym;
    }

    /**
     * Gets the value of the registeredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredNumber }
     *     
     */
    public RegisteredNumber getRegisteredNumber() {
        return registeredNumber;
    }

    /**
     * Sets the value of the registeredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredNumber }
     *     
     */
    public void setRegisteredNumber(RegisteredNumber value) {
        this.registeredNumber = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link Fax }
     *     
     */
    public Fax getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fax }
     *     
     */
    public void setFax(Fax value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the electronicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicSignature }
     *     
     */
    public ElectronicSignature getElectronicSignature() {
        return electronicSignature;
    }

    /**
     * Sets the value of the electronicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicSignature }
     *     
     */
    public void setElectronicSignature(ElectronicSignature value) {
        this.electronicSignature = value;
    }

}
