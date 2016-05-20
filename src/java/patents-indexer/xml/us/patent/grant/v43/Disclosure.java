//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.29 at 10:47:01 PM EST 
//


package xml.us.patent.grant.v43;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP"
})
@XmlRootElement(name = "disclosure")
public class Disclosure {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "tech-problem", type = TechProblem.class),
        @XmlElement(name = "tech-solution", type = TechSolution.class),
        @XmlElement(name = "advantageous-effects", type = AdvantageousEffects.class),
        @XmlElement(name = "heading", type = Heading.class),
        @XmlElement(name = "p", type = P.class)
    })
    protected List<Object> techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechProblem }
     * {@link TechSolution }
     * {@link AdvantageousEffects }
     * {@link Heading }
     * {@link P }
     * 
     * 
     */
    public List<Object> getTechProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP() {
        if (techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP == null) {
            techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP = new ArrayList<Object>();
        }
        return this.techProblemOrTechSolutionOrAdvantageousEffectsOrHeadingOrP;
    }

}
