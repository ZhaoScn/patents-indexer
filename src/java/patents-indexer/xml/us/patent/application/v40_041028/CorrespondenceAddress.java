//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:47:42 PM EST 
//


package xml.us.patent.application.v40_041028;

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
    "customerNumberOrAddressbook"
})
@XmlRootElement(name = "correspondence-address")
public class CorrespondenceAddress {

    @XmlElements({
        @XmlElement(name = "customer-number", required = true, type = CustomerNumber.class),
        @XmlElement(name = "addressbook", required = true, type = Addressbook.class)
    })
    protected List<Object> customerNumberOrAddressbook;

    /**
     * Gets the value of the customerNumberOrAddressbook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerNumberOrAddressbook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerNumberOrAddressbook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerNumber }
     * {@link Addressbook }
     * 
     * 
     */
    public List<Object> getCustomerNumberOrAddressbook() {
        if (customerNumberOrAddressbook == null) {
            customerNumberOrAddressbook = new ArrayList<Object>();
        }
        return this.customerNumberOrAddressbook;
    }

}
