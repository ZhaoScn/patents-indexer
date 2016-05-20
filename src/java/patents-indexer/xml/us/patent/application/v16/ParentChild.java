//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

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
    "child",
    "parent",
    "parentStatus",
    "parentPatent"
})
@XmlRootElement(name = "parent-child")
public class ParentChild {

    @XmlElement(required = true)
    protected Child child;
    @XmlElement(required = true)
    protected Parent parent;
    @XmlElement(name = "parent-status", required = true)
    protected String parentStatus;
    @XmlElement(name = "parent-patent")
    protected ParentPatent parentPatent;

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link Child }
     *     
     */
    public Child getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link Child }
     *     
     */
    public void setChild(Child value) {
        this.child = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStatus() {
        return parentStatus;
    }

    /**
     * Sets the value of the parentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStatus(String value) {
        this.parentStatus = value;
    }

    /**
     * Gets the value of the parentPatent property.
     * 
     * @return
     *     possible object is
     *     {@link ParentPatent }
     *     
     */
    public ParentPatent getParentPatent() {
        return parentPatent;
    }

    /**
     * Sets the value of the parentPatent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentPatent }
     *     
     */
    public void setParentPatent(ParentPatent value) {
        this.parentPatent = value;
    }

}