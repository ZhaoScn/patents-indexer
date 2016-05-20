//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:06:01 PM EST 
//


package xml.us.patent.grant.v40_040927;

import java.util.ArrayList;
import java.util.List;
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
    "mainLinkedIndexingCode",
    "subLinkedIndexingCode"
})
@XmlRootElement(name = "linked-indexing-code-group")
public class LinkedIndexingCodeGroup {

    @XmlElement(name = "main-linked-indexing-code", required = true)
    protected String mainLinkedIndexingCode;
    @XmlElement(name = "sub-linked-indexing-code", required = true)
    protected List<SubLinkedIndexingCode> subLinkedIndexingCode;

    /**
     * Gets the value of the mainLinkedIndexingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainLinkedIndexingCode() {
        return mainLinkedIndexingCode;
    }

    /**
     * Sets the value of the mainLinkedIndexingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainLinkedIndexingCode(String value) {
        this.mainLinkedIndexingCode = value;
    }

    /**
     * Gets the value of the subLinkedIndexingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLinkedIndexingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLinkedIndexingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLinkedIndexingCode }
     * 
     * 
     */
    public List<SubLinkedIndexingCode> getSubLinkedIndexingCode() {
        if (subLinkedIndexingCode == null) {
            subLinkedIndexingCode = new ArrayList<SubLinkedIndexingCode>();
        }
        return this.subLinkedIndexingCode;
    }

}
