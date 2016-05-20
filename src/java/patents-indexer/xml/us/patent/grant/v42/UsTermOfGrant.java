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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent"
})
@XmlRootElement(name = "us-term-of-grant")
public class UsTermOfGrant {

    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "length-of-grant", required = true, type = LengthOfGrant.class),
        @XmlElement(name = "us-term-extension", required = true, type = UsTermExtension.class),
        @XmlElement(name = "disclaimer", required = true, type = Disclaimer.class),
        @XmlElement(name = "lapse-of-patent", required = true, type = LapseOfPatent.class)
    })
    protected List<Object> textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent;

    /**
     * Gets the value of the textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link LengthOfGrant }
     * {@link UsTermExtension }
     * {@link Disclaimer }
     * {@link LapseOfPatent }
     * 
     * 
     */
    public List<Object> getTextOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent() {
        if (textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent == null) {
            textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent = new ArrayList<Object>();
        }
        return this.textOrLengthOfGrantOrUsTermExtensionOrDisclaimerOrLapseOfPatent;
    }

}
