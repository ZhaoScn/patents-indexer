//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:10 PM EST 
//


package xml.us.patent.grant.v40_040415;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "date",
    "bulletinGazette"
})
@XmlRootElement(name = "unexamined-without-grant")
public class UnexaminedWithoutGrant {

    @XmlElement(required = true)
    protected Date date;
    @XmlElement(name = "bulletin-gazette", required = true)
    protected BulletinGazette bulletinGazette;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the bulletinGazette property.
     * 
     * @return
     *     possible object is
     *     {@link BulletinGazette }
     *     
     */
    public BulletinGazette getBulletinGazette() {
        return bulletinGazette;
    }

    /**
     * Sets the value of the bulletinGazette property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulletinGazette }
     *     
     */
    public void setBulletinGazette(BulletinGazette value) {
        this.bulletinGazette = value;
    }

}
