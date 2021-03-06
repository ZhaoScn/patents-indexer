//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.09 at 05:13:01 PM EST 
//


package xml.us.patent.grant.vST32_025xml;

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
    "ncit",
    "citedbyexaminerOrCITEDBYOTHER"
})
@XmlRootElement(name = "B562")
public class B562 {

    @XmlElement(name = "NCIT", required = true)
    protected NCIT ncit;
    @XmlElements({
        @XmlElement(name = "CITED-BY-EXAMINER", type = CITEDBYEXAMINER.class),
        @XmlElement(name = "CITED-BY-OTHER", type = CITEDBYOTHER.class)
    })
    protected List<Object> citedbyexaminerOrCITEDBYOTHER;

    /**
     * Gets the value of the ncit property.
     * 
     * @return
     *     possible object is
     *     {@link NCIT }
     *     
     */
    public NCIT getNCIT() {
        return ncit;
    }

    /**
     * Sets the value of the ncit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCIT }
     *     
     */
    public void setNCIT(NCIT value) {
        this.ncit = value;
    }

    /**
     * Gets the value of the citedbyexaminerOrCITEDBYOTHER property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citedbyexaminerOrCITEDBYOTHER property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCITEDBYEXAMINEROrCITEDBYOTHER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITEDBYEXAMINER }
     * {@link CITEDBYOTHER }
     * 
     * 
     */
    public List<Object> getCITEDBYEXAMINEROrCITEDBYOTHER() {
        if (citedbyexaminerOrCITEDBYOTHER == null) {
            citedbyexaminerOrCITEDBYOTHER = new ArrayList<Object>();
        }
        return this.citedbyexaminerOrCITEDBYOTHER;
    }

}
