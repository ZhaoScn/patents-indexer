//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:10 PM EST 
//


package xml.us.patent.grant.v40_040415;

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
    "applicant"
})
@XmlRootElement(name = "applicants")
public class Applicants {

    @XmlElement(required = true)
    protected List<Applicant> applicant;

    /**
     * Gets the value of the applicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Applicant }
     * 
     * 
     */
    public List<Applicant> getApplicant() {
        if (applicant == null) {
            applicant = new ArrayList<Applicant>();
        }
        return this.applicant;
    }

}
