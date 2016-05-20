//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:06:01 PM EST 
//


package xml.us.patent.grant.v40_040927;

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
    "nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText"
})
@XmlRootElement(name = "addressbook")
public class Addressbook {

    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
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
        @XmlElement(name = "synonym", required = true, type = Synonym.class),
        @XmlElement(name = "registered-number", required = true, type = RegisteredNumber.class),
        @XmlElement(name = "address", required = true, type = Address.class),
        @XmlElement(name = "phone", required = true, type = Phone.class),
        @XmlElement(name = "fax", required = true, type = Fax.class),
        @XmlElement(name = "email", required = true, type = Email.class),
        @XmlElement(name = "url", required = true, type = Url.class),
        @XmlElement(name = "ead", required = true, type = Ead.class),
        @XmlElement(name = "dtext", required = true, type = Dtext.class),
        @XmlElement(name = "text", required = true, type = Text.class)
    })
    protected List<Object> nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText;

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
     * Gets the value of the nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText().add(newItem);
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
     * {@link RegisteredNumber }
     * {@link Address }
     * {@link Phone }
     * {@link Fax }
     * {@link Email }
     * {@link Url }
     * {@link Ead }
     * {@link Dtext }
     * {@link Text }
     * 
     * 
     */
    public List<Object> getNameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText() {
        if (nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText == null) {
            nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText = new ArrayList<Object>();
        }
        return this.nameOrPrefixOrLastNameOrOrgnameOrFirstNameOrMiddleNameOrSuffixOrIidOrRoleOrDepartmentOrSynonymOrRegisteredNumberOrAddressOrPhoneOrFaxOrEmailOrUrlOrEadOrDtextOrText;
    }

}
