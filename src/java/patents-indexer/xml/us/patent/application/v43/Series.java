//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:18 PM EST 
//


package xml.us.patent.application.v43;

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
    "textOrMstOrMsnOrIssn"
})
@XmlRootElement(name = "series")
public class Series {

    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "mst", required = true, type = Mst.class),
        @XmlElement(name = "msn", required = true, type = Msn.class),
        @XmlElement(name = "issn", required = true, type = Issn.class)
    })
    protected List<Object> textOrMstOrMsnOrIssn;

    /**
     * Gets the value of the textOrMstOrMsnOrIssn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrMstOrMsnOrIssn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrMstOrMsnOrIssn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Mst }
     * {@link Msn }
     * {@link Issn }
     * 
     * 
     */
    public List<Object> getTextOrMstOrMsnOrIssn() {
        if (textOrMstOrMsnOrIssn == null) {
            textOrMstOrMsnOrIssn = new ArrayList<Object>();
        }
        return this.textOrMstOrMsnOrIssn;
    }

}
