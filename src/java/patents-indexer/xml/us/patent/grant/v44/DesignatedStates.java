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
    "countryOrRegion"
})
@XmlRootElement(name = "designated-states")
public class DesignatedStates {

    @XmlElements({
        @XmlElement(name = "country", type = Country.class),
        @XmlElement(name = "region", type = Region.class)
    })
    protected List<Object> countryOrRegion;

    /**
     * Gets the value of the countryOrRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOrRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOrRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * {@link Region }
     * 
     * 
     */
    public List<Object> getCountryOrRegion() {
        if (countryOrRegion == null) {
            countryOrRegion = new ArrayList<Object>();
        }
        return this.countryOrRegion;
    }

}
