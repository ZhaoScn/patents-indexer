//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "continuationOfOrContinuationInPartOfOrContinuingReissueOf"
})
@XmlRootElement(name = "continuations")
public class Continuations {

    @XmlAttribute(name = "st32-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String st32Name;
    @XmlAttribute(name = "inid-code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inidCode;
    @XmlElements({
        @XmlElement(name = "continuation-of", required = true, type = ContinuationOf.class),
        @XmlElement(name = "continuation-in-part-of", required = true, type = ContinuationInPartOf.class),
        @XmlElement(name = "continuing-reissue-of", required = true, type = ContinuingReissueOf.class)
    })
    protected List<Object> continuationOfOrContinuationInPartOfOrContinuingReissueOf;

    /**
     * Gets the value of the st32Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt32Name() {
        if (st32Name == null) {
            return "B630";
        } else {
            return st32Name;
        }
    }

    /**
     * Sets the value of the st32Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt32Name(String value) {
        this.st32Name = value;
    }

    /**
     * Gets the value of the inidCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInidCode() {
        return inidCode;
    }

    /**
     * Sets the value of the inidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInidCode(String value) {
        this.inidCode = value;
    }

    /**
     * Gets the value of the continuationOfOrContinuationInPartOfOrContinuingReissueOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuationOfOrContinuationInPartOfOrContinuingReissueOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuationOfOrContinuationInPartOfOrContinuingReissueOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuationOf }
     * {@link ContinuationInPartOf }
     * {@link ContinuingReissueOf }
     * 
     * 
     */
    public List<Object> getContinuationOfOrContinuationInPartOfOrContinuingReissueOf() {
        if (continuationOfOrContinuationInPartOfOrContinuingReissueOf == null) {
            continuationOfOrContinuationInPartOfOrContinuingReissueOf = new ArrayList<Object>();
        }
        return this.continuationOfOrContinuationInPartOfOrContinuingReissueOf;
    }

}
