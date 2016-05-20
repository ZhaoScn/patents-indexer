//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:43 PM EST 
//


package xml.us.patent.grant.v30;

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
    "nplcitOrCategoryOrRelevantClaims"
})
@XmlRootElement(name = "cited-others")
public class CitedOthers {

    @XmlElements({
        @XmlElement(name = "nplcit", required = true, type = Nplcit.class),
        @XmlElement(name = "category", required = true, type = Category.class),
        @XmlElement(name = "relevant-claims", required = true, type = RelevantClaims.class)
    })
    protected List<Object> nplcitOrCategoryOrRelevantClaims;

    /**
     * Gets the value of the nplcitOrCategoryOrRelevantClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nplcitOrCategoryOrRelevantClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNplcitOrCategoryOrRelevantClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nplcit }
     * {@link Category }
     * {@link RelevantClaims }
     * 
     * 
     */
    public List<Object> getNplcitOrCategoryOrRelevantClaims() {
        if (nplcitOrCategoryOrRelevantClaims == null) {
            nplcitOrCategoryOrRelevantClaims = new ArrayList<Object>();
        }
        return this.nplcitOrCategoryOrRelevantClaims;
    }

}
