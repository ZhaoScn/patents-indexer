//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:03:04 PM EST 
//


package xml.us.patent.grant.v40_041202;

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
@XmlRootElement(name = "us-issued-on-continued-prosecution-application")
public class UsIssuedOnContinuedProsecutionApplication {

    @XmlAttribute(name = "grant-cpa-text")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String grantCpaText;

    /**
     * Gets the value of the grantCpaText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantCpaText() {
        if (grantCpaText == null) {
            return "This patent issued on a continued prosecution application (CPA) filed under 37 CFR 1.53(d), and is subject to the twenty year patent term provision of 35 U.S.C. 154(a)(2).";
        } else {
            return grantCpaText;
        }
    }

    /**
     * Sets the value of the grantCpaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantCpaText(String value) {
        this.grantCpaText = value;
    }

}
