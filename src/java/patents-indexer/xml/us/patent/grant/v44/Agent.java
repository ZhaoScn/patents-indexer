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
    "addressbook"
})
@XmlRootElement(name = "agent")
public class Agent {

    @XmlAttribute(name = "sequence", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlAttribute(name = "rep-type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String repType;
    @XmlElement(required = true)
    protected List<Addressbook> addressbook;

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
     * Gets the value of the repType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepType() {
        return repType;
    }

    /**
     * Sets the value of the repType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepType(String value) {
        this.repType = value;
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

}
