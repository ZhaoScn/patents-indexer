//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:04:30 PM EST 
//


package xml.us.patent.grant.v40_041028;

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
    "basicSignatureOrEnhancedSignature"
})
@XmlRootElement(name = "electronic-signature")
public class ElectronicSignature {

    @XmlAttribute(name = "date", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String date;
    @XmlAttribute(name = "place-signed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String placeSigned;
    @XmlElements({
        @XmlElement(name = "basic-signature", required = true, type = BasicSignature.class),
        @XmlElement(name = "enhanced-signature", required = true, type = EnhancedSignature.class)
    })
    protected List<Object> basicSignatureOrEnhancedSignature;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the placeSigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceSigned() {
        return placeSigned;
    }

    /**
     * Sets the value of the placeSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceSigned(String value) {
        this.placeSigned = value;
    }

    /**
     * Gets the value of the basicSignatureOrEnhancedSignature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicSignatureOrEnhancedSignature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicSignatureOrEnhancedSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicSignature }
     * {@link EnhancedSignature }
     * 
     * 
     */
    public List<Object> getBasicSignatureOrEnhancedSignature() {
        if (basicSignatureOrEnhancedSignature == null) {
            basicSignatureOrEnhancedSignature = new ArrayList<Object>();
        }
        return this.basicSignatureOrEnhancedSignature;
    }

}
