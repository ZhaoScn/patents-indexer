//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 10:47:01 PM EST 
//


package xml.us.patent.grant.v43;

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
    "textOrReceivedOrAcceptedOrRevisedOrMisc"
})
@XmlRootElement(name = "history")
public class History {

    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "received", required = true, type = Received.class),
        @XmlElement(name = "accepted", required = true, type = Accepted.class),
        @XmlElement(name = "revised", required = true, type = Revised.class),
        @XmlElement(name = "misc", required = true, type = Misc.class)
    })
    protected List<Object> textOrReceivedOrAcceptedOrRevisedOrMisc;

    /**
     * Gets the value of the textOrReceivedOrAcceptedOrRevisedOrMisc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrReceivedOrAcceptedOrRevisedOrMisc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrReceivedOrAcceptedOrRevisedOrMisc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Received }
     * {@link Accepted }
     * {@link Revised }
     * {@link Misc }
     * 
     * 
     */
    public List<Object> getTextOrReceivedOrAcceptedOrRevisedOrMisc() {
        if (textOrReceivedOrAcceptedOrRevisedOrMisc == null) {
            textOrReceivedOrAcceptedOrRevisedOrMisc = new ArrayList<Object>();
        }
        return this.textOrReceivedOrAcceptedOrRevisedOrMisc;
    }

}
