//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:26 PM EST 
//


package xml.us.patent.grant.v42;

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
    "nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonym",
    "registeredNumber"
})
@XmlRootElement(name = "deceased-inventor")
public class DeceasedInventor {

    @XmlAttribute(name = "sequence")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
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
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

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

}
