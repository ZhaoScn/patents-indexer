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
    "dateOrPDAT"
})
@XmlRootElement(name = "S-2-X-G")
public class S2XG {

    @XmlElements({
        @XmlElement(name = "DATE", required = true, type = DATE.class),
        @XmlElement(name = "PDAT", required = true, type = PDAT.class)
    })
    protected List<Object> dateOrPDAT;

    /**
     * Gets the value of the dateOrPDAT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateOrPDAT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATEOrPDAT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DATE }
     * {@link PDAT }
     * 
     * 
     */
    public List<Object> getDATEOrPDAT() {
        if (dateOrPDAT == null) {
            dateOrPDAT = new ArrayList<Object>();
        }
        return this.dateOrPDAT;
    }

}
