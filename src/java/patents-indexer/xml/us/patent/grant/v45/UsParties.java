//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:01:40 PM EST 
//


package xml.us.patent.grant.v45;

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
    "usApplicants",
    "inventors",
    "agents"
})
@XmlRootElement(name = "us-parties")
public class UsParties {

    @XmlElement(name = "us-applicants", required = true)
    protected UsApplicants usApplicants;
    @XmlElement(required = true)
    protected Inventors inventors;
    protected Agents agents;

    /**
     * Gets the value of the usApplicants property.
     * 
     * @return
     *     possible object is
     *     {@link UsApplicants }
     *     
     */
    public UsApplicants getUsApplicants() {
        return usApplicants;
    }

    /**
     * Sets the value of the usApplicants property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsApplicants }
     *     
     */
    public void setUsApplicants(UsApplicants value) {
        this.usApplicants = value;
    }

    /**
     * Gets the value of the inventors property.
     * 
     * @return
     *     possible object is
     *     {@link Inventors }
     *     
     */
    public Inventors getInventors() {
        return inventors;
    }

    /**
     * Sets the value of the inventors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventors }
     *     
     */
    public void setInventors(Inventors value) {
        this.inventors = value;
    }

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link Agents }
     *     
     */
    public Agents getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agents }
     *     
     */
    public void setAgents(Agents value) {
        this.agents = value;
    }

}
