//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 12:46:59 AM EST 
//


package xml.us.patent.grant.vST32_024;

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
    "pdatOrHIL"
})
@XmlRootElement(name = "DULINE")
public class DULINE {

    @XmlElements({
        @XmlElement(name = "PDAT", type = PDAT.class),
        @XmlElement(name = "HIL", type = HIL.class)
    })
    protected List<Object> pdatOrHIL;

    /**
     * Gets the value of the pdatOrHIL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdatOrHIL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDATOrHIL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDAT }
     * {@link HIL }
     * 
     * 
     */
    public List<Object> getPDATOrHIL() {
        if (pdatOrHIL == null) {
            pdatOrHIL = new ArrayList<Object>();
        }
        return this.pdatOrHIL;
    }

}