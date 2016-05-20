//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:44 PM EST 
//


package xml.us.patent.grant.v41;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ipcVersionIndicator",
    "classificationLevel",
    "section",
    "clazz",
    "subclass",
    "mainGroup",
    "subgroup",
    "symbolPosition",
    "classificationValue",
    "actionDate",
    "generatingOffice",
    "classificationStatus",
    "classificationDataSource"
})
@XmlRootElement(name = "classification-ipcr")
public class ClassificationIpcr {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "sequence")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlElement(name = "ipc-version-indicator", required = true)
    protected IpcVersionIndicator ipcVersionIndicator;
    @XmlElement(name = "classification-level")
    protected String classificationLevel;
    @XmlElement(required = true)
    protected String section;
    @XmlElement(name = "class", required = true)
    protected Class clazz;
    @XmlElement(required = true)
    protected String subclass;
    @XmlElement(name = "main-group")
    protected String mainGroup;
    protected String subgroup;
    @XmlElement(name = "symbol-position")
    protected String symbolPosition;
    @XmlElement(name = "classification-value")
    protected String classificationValue;
    @XmlElement(name = "action-date")
    protected ActionDate actionDate;
    @XmlElement(name = "generating-office")
    protected GeneratingOffice generatingOffice;
    @XmlElement(name = "classification-status")
    protected String classificationStatus;
    @XmlElement(name = "classification-data-source")
    protected String classificationDataSource;

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the ipcVersionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IpcVersionIndicator }
     *     
     */
    public IpcVersionIndicator getIpcVersionIndicator() {
        return ipcVersionIndicator;
    }

    /**
     * Sets the value of the ipcVersionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpcVersionIndicator }
     *     
     */
    public void setIpcVersionIndicator(IpcVersionIndicator value) {
        this.ipcVersionIndicator = value;
    }

    /**
     * Gets the value of the classificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationLevel() {
        return classificationLevel;
    }

    /**
     * Sets the value of the classificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationLevel(String value) {
        this.classificationLevel = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     */
    public void setClazz(Class value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the subclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubclass() {
        return subclass;
    }

    /**
     * Sets the value of the subclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubclass(String value) {
        this.subclass = value;
    }

    /**
     * Gets the value of the mainGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainGroup() {
        return mainGroup;
    }

    /**
     * Sets the value of the mainGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainGroup(String value) {
        this.mainGroup = value;
    }

    /**
     * Gets the value of the subgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubgroup() {
        return subgroup;
    }

    /**
     * Sets the value of the subgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubgroup(String value) {
        this.subgroup = value;
    }

    /**
     * Gets the value of the symbolPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolPosition() {
        return symbolPosition;
    }

    /**
     * Sets the value of the symbolPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolPosition(String value) {
        this.symbolPosition = value;
    }

    /**
     * Gets the value of the classificationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationValue() {
        return classificationValue;
    }

    /**
     * Sets the value of the classificationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationValue(String value) {
        this.classificationValue = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDate }
     *     
     */
    public ActionDate getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDate }
     *     
     */
    public void setActionDate(ActionDate value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the generatingOffice property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratingOffice }
     *     
     */
    public GeneratingOffice getGeneratingOffice() {
        return generatingOffice;
    }

    /**
     * Sets the value of the generatingOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratingOffice }
     *     
     */
    public void setGeneratingOffice(GeneratingOffice value) {
        this.generatingOffice = value;
    }

    /**
     * Gets the value of the classificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationStatus() {
        return classificationStatus;
    }

    /**
     * Sets the value of the classificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationStatus(String value) {
        this.classificationStatus = value;
    }

    /**
     * Gets the value of the classificationDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationDataSource() {
        return classificationDataSource;
    }

    /**
     * Sets the value of the classificationDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationDataSource(String value) {
        this.classificationDataSource = value;
    }

}
