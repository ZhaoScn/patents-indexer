//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:50 PM EST 
//


package xml.us.patent.application.v41;

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
    "address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText"
})
@XmlRootElement(name = "address")
public class Address {

    @XmlElements({
        @XmlElement(name = "address-1", required = true, type = Address1 .class),
        @XmlElement(name = "address-2", required = true, type = Address2 .class),
        @XmlElement(name = "address-3", required = true, type = Address3 .class),
        @XmlElement(name = "mailcode", required = true, type = Mailcode.class),
        @XmlElement(name = "pobox", required = true, type = Pobox.class),
        @XmlElement(name = "room", required = true, type = Room.class),
        @XmlElement(name = "address-floor", required = true, type = AddressFloor.class),
        @XmlElement(name = "building", required = true, type = Building.class),
        @XmlElement(name = "street", required = true, type = Street.class),
        @XmlElement(name = "city", required = true, type = City.class),
        @XmlElement(name = "county", required = true, type = County.class),
        @XmlElement(name = "state", required = true, type = State.class),
        @XmlElement(name = "postcode", required = true, type = Postcode.class),
        @XmlElement(name = "country", required = true, type = Country.class),
        @XmlElement(name = "text", required = true, type = Text.class)
    })
    protected List<Object> address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText;

    /**
     * Gets the value of the address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address1 }
     * {@link Address2 }
     * {@link Address3 }
     * {@link Mailcode }
     * {@link Pobox }
     * {@link Room }
     * {@link AddressFloor }
     * {@link Building }
     * {@link Street }
     * {@link City }
     * {@link County }
     * {@link State }
     * {@link Postcode }
     * {@link Country }
     * {@link Text }
     * 
     * 
     */
    public List<Object> getAddress1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText() {
        if (address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText == null) {
            address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText = new ArrayList<Object>();
        }
        return this.address1OrAddress2OrAddress3OrMailcodeOrPoboxOrRoomOrAddressFloorOrBuildingOrStreetOrCityOrCountyOrStateOrPostcodeOrCountryOrText;
    }

}
