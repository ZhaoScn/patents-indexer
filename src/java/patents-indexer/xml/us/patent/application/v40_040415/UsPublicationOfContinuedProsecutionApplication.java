//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:49:43 PM EST 
//


package xml.us.patent.application.v40_040415;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "us-publication-of-continued-prosecution-application")
public class UsPublicationOfContinuedProsecutionApplication {

    @XmlAttribute(name = "cpa-text")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cpaText;

    /**
     * Gets the value of the cpaText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpaText() {
        if (cpaText == null) {
            return "This is a publication of a continued prosecution application (CPA) filed under 37 CFR 1.53(d).";
        } else {
            return cpaText;
        }
    }

    /**
     * Sets the value of the cpaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpaText(String value) {
        this.cpaText = value;
    }

}
