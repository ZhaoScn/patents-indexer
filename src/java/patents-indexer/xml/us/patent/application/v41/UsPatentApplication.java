//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:50 PM EST 
//


package xml.us.patent.application.v41;

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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims"
})
@XmlRootElement(name = "us-patent-application")
public class UsPatentApplication {

    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "dtd-version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dtdVersion;
    @XmlAttribute(name = "file")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "country", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "file-reference-id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String fileReferenceId;
    @XmlAttribute(name = "date-produced")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dateProduced;
    @XmlAttribute(name = "date-publ")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datePubl;
    @XmlElements({
        @XmlElement(name = "doc-page", required = true, type = DocPage.class),
        @XmlElement(name = "us-bibliographic-data-application", required = true, type = UsBibliographicDataApplication.class),
        @XmlElement(name = "abstract", required = true, type = Abstract.class),
        @XmlElement(name = "drawings", required = true, type = Drawings.class),
        @XmlElement(name = "description", required = true, type = Description.class),
        @XmlElement(name = "us-sequence-list-doc", required = true, type = UsSequenceListDoc.class),
        @XmlElement(name = "us-megatable-doc", required = true, type = UsMegatableDoc.class),
        @XmlElement(name = "table-external-doc", required = true, type = TableExternalDoc.class),
        @XmlElement(name = "us-chemistry", required = true, type = UsChemistry.class),
        @XmlElement(name = "us-math", required = true, type = UsMath.class),
        @XmlElement(name = "us-claim-statement", required = true, type = UsClaimStatement.class),
        @XmlElement(name = "claims", required = true, type = Claims.class)
    })
    protected List<Object> docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims;

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dtdVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtdVersion() {
        return dtdVersion;
    }

    /**
     * Sets the value of the dtdVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtdVersion(String value) {
        this.dtdVersion = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the fileReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReferenceId() {
        return fileReferenceId;
    }

    /**
     * Sets the value of the fileReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReferenceId(String value) {
        this.fileReferenceId = value;
    }

    /**
     * Gets the value of the dateProduced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateProduced() {
        return dateProduced;
    }

    /**
     * Sets the value of the dateProduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateProduced(String value) {
        this.dateProduced = value;
    }

    /**
     * Gets the value of the datePubl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePubl() {
        return datePubl;
    }

    /**
     * Sets the value of the datePubl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePubl(String value) {
        this.datePubl = value;
    }

    /**
     * Gets the value of the docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocPage }
     * {@link UsBibliographicDataApplication }
     * {@link Abstract }
     * {@link Drawings }
     * {@link Description }
     * {@link UsSequenceListDoc }
     * {@link UsMegatableDoc }
     * {@link TableExternalDoc }
     * {@link UsChemistry }
     * {@link UsMath }
     * {@link UsClaimStatement }
     * {@link Claims }
     * 
     * 
     */
    public List<Object> getDocPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims() {
        if (docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims == null) {
            docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims = new ArrayList<Object>();
        }
        return this.docPageOrUsBibliographicDataApplicationOrAbstractOrDrawingsOrDescriptionOrUsSequenceListDocOrUsMegatableDocOrTableExternalDocOrUsChemistryOrUsMathOrUsClaimStatementOrClaims;
    }

}