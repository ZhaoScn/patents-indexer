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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "us-chemistry")
public class UsChemistry {

    @XmlAttribute(name = "idref", required = true)
    @XmlIDREF
    protected Object idref;
    @XmlAttribute(name = "cdx-file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cdxFile;
    @XmlAttribute(name = "mol-file", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String molFile;

    /**
     * Gets the value of the idref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdref() {
        return idref;
    }

    /**
     * Sets the value of the idref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdref(Object value) {
        this.idref = value;
    }

    /**
     * Gets the value of the cdxFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdxFile() {
        return cdxFile;
    }

    /**
     * Sets the value of the cdxFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdxFile(String value) {
        this.cdxFile = value;
    }

    /**
     * Gets the value of the molFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMolFile() {
        return molFile;
    }

    /**
     * Sets the value of the molFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMolFile(String value) {
        this.molFile = value;
    }

}
