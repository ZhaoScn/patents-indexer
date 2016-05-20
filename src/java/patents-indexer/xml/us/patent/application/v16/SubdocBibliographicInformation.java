//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 07:08:34 PM EST 
//


package xml.us.patent.application.v16;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentId",
    "publicationFilingType",
    "domesticFilingData",
    "foreignPriorityData",
    "technicalInformation",
    "continuityData",
    "priorPublication",
    "inventors",
    "assignee",
    "correspondenceAddress",
    "internationalConventions",
    "appendixData"
})
@XmlRootElement(name = "subdoc-bibliographic-information")
public class SubdocBibliographicInformation {

    @XmlAttribute(name = "st32-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String st32Name;
    @XmlAttribute(name = "inid-code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inidCode;
    @XmlElement(name = "document-id", required = true)
    protected DocumentId documentId;
    @XmlElement(name = "publication-filing-type", required = true)
    protected PublicationFilingType publicationFilingType;
    @XmlElement(name = "domestic-filing-data", required = true)
    protected DomesticFilingData domesticFilingData;
    @XmlElement(name = "foreign-priority-data")
    protected List<ForeignPriorityData> foreignPriorityData;
    @XmlElement(name = "technical-information", required = true)
    protected TechnicalInformation technicalInformation;
    @XmlElement(name = "continuity-data")
    protected ContinuityData continuityData;
    @XmlElement(name = "prior-publication")
    protected PriorPublication priorPublication;
    @XmlElement(required = true)
    protected Inventors inventors;
    protected List<Assignee> assignee;
    @XmlElement(name = "correspondence-address")
    protected CorrespondenceAddress correspondenceAddress;
    @XmlElement(name = "international-conventions")
    protected List<InternationalConventions> internationalConventions;
    @XmlElement(name = "appendix-data")
    protected AppendixData appendixData;

    /**
     * Gets the value of the st32Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt32Name() {
        if (st32Name == null) {
            return "SDOBI";
        } else {
            return st32Name;
        }
    }

    /**
     * Sets the value of the st32Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt32Name(String value) {
        this.st32Name = value;
    }

    /**
     * Gets the value of the inidCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInidCode() {
        return inidCode;
    }

    /**
     * Sets the value of the inidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInidCode(String value) {
        this.inidCode = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentId }
     *     
     */
    public DocumentId getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentId }
     *     
     */
    public void setDocumentId(DocumentId value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the publicationFilingType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationFilingType }
     *     
     */
    public PublicationFilingType getPublicationFilingType() {
        return publicationFilingType;
    }

    /**
     * Sets the value of the publicationFilingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationFilingType }
     *     
     */
    public void setPublicationFilingType(PublicationFilingType value) {
        this.publicationFilingType = value;
    }

    /**
     * Gets the value of the domesticFilingData property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticFilingData }
     *     
     */
    public DomesticFilingData getDomesticFilingData() {
        return domesticFilingData;
    }

    /**
     * Sets the value of the domesticFilingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticFilingData }
     *     
     */
    public void setDomesticFilingData(DomesticFilingData value) {
        this.domesticFilingData = value;
    }

    /**
     * Gets the value of the foreignPriorityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignPriorityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignPriorityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignPriorityData }
     * 
     * 
     */
    public List<ForeignPriorityData> getForeignPriorityData() {
        if (foreignPriorityData == null) {
            foreignPriorityData = new ArrayList<ForeignPriorityData>();
        }
        return this.foreignPriorityData;
    }

    /**
     * Gets the value of the technicalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalInformation }
     *     
     */
    public TechnicalInformation getTechnicalInformation() {
        return technicalInformation;
    }

    /**
     * Sets the value of the technicalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalInformation }
     *     
     */
    public void setTechnicalInformation(TechnicalInformation value) {
        this.technicalInformation = value;
    }

    /**
     * Gets the value of the continuityData property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuityData }
     *     
     */
    public ContinuityData getContinuityData() {
        return continuityData;
    }

    /**
     * Sets the value of the continuityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuityData }
     *     
     */
    public void setContinuityData(ContinuityData value) {
        this.continuityData = value;
    }

    /**
     * Gets the value of the priorPublication property.
     * 
     * @return
     *     possible object is
     *     {@link PriorPublication }
     *     
     */
    public PriorPublication getPriorPublication() {
        return priorPublication;
    }

    /**
     * Sets the value of the priorPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorPublication }
     *     
     */
    public void setPriorPublication(PriorPublication value) {
        this.priorPublication = value;
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
     * Gets the value of the assignee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assignee }
     * 
     * 
     */
    public List<Assignee> getAssignee() {
        if (assignee == null) {
            assignee = new ArrayList<Assignee>();
        }
        return this.assignee;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceAddress }
     *     
     */
    public CorrespondenceAddress getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceAddress }
     *     
     */
    public void setCorrespondenceAddress(CorrespondenceAddress value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the internationalConventions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalConventions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalConventions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalConventions }
     * 
     * 
     */
    public List<InternationalConventions> getInternationalConventions() {
        if (internationalConventions == null) {
            internationalConventions = new ArrayList<InternationalConventions>();
        }
        return this.internationalConventions;
    }

    /**
     * Gets the value of the appendixData property.
     * 
     * @return
     *     possible object is
     *     {@link AppendixData }
     *     
     */
    public AppendixData getAppendixData() {
        return appendixData;
    }

    /**
     * Sets the value of the appendixData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppendixData }
     *     
     */
    public void setAppendixData(AppendixData value) {
        this.appendixData = value;
    }

}
