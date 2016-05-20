//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:04:30 PM EST 
//


package xml.us.patent.grant.v40_041028;

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
    "sertitle",
    "alttitle",
    "subname",
    "issue",
    "imprint",
    "pubdate",
    "descrip",
    "notes",
    "issn",
    "isbn",
    "pubid",
    "vid",
    "ino",
    "cpyrt"
})
@XmlRootElement(name = "serial")
public class Serial {

    @XmlElement(required = true)
    protected String sertitle;
    protected String alttitle;
    protected List<Subname> subname;
    protected String issue;
    protected Imprint imprint;
    protected Pubdate pubdate;
    protected Descrip descrip;
    protected Notes notes;
    protected Issn issn;
    protected Isbn isbn;
    protected Pubid pubid;
    protected Vid vid;
    protected String ino;
    protected Cpyrt cpyrt;

    /**
     * Gets the value of the sertitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertitle() {
        return sertitle;
    }

    /**
     * Sets the value of the sertitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertitle(String value) {
        this.sertitle = value;
    }

    /**
     * Gets the value of the alttitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlttitle() {
        return alttitle;
    }

    /**
     * Sets the value of the alttitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlttitle(String value) {
        this.alttitle = value;
    }

    /**
     * Gets the value of the subname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subname }
     * 
     * 
     */
    public List<Subname> getSubname() {
        if (subname == null) {
            subname = new ArrayList<Subname>();
        }
        return this.subname;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the imprint property.
     * 
     * @return
     *     possible object is
     *     {@link Imprint }
     *     
     */
    public Imprint getImprint() {
        return imprint;
    }

    /**
     * Sets the value of the imprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Imprint }
     *     
     */
    public void setImprint(Imprint value) {
        this.imprint = value;
    }

    /**
     * Gets the value of the pubdate property.
     * 
     * @return
     *     possible object is
     *     {@link Pubdate }
     *     
     */
    public Pubdate getPubdate() {
        return pubdate;
    }

    /**
     * Sets the value of the pubdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pubdate }
     *     
     */
    public void setPubdate(Pubdate value) {
        this.pubdate = value;
    }

    /**
     * Gets the value of the descrip property.
     * 
     * @return
     *     possible object is
     *     {@link Descrip }
     *     
     */
    public Descrip getDescrip() {
        return descrip;
    }

    /**
     * Sets the value of the descrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrip }
     *     
     */
    public void setDescrip(Descrip value) {
        this.descrip = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link Issn }
     *     
     */
    public Issn getIssn() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issn }
     *     
     */
    public void setIssn(Issn value) {
        this.issn = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link Isbn }
     *     
     */
    public Isbn getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Isbn }
     *     
     */
    public void setIsbn(Isbn value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the pubid property.
     * 
     * @return
     *     possible object is
     *     {@link Pubid }
     *     
     */
    public Pubid getPubid() {
        return pubid;
    }

    /**
     * Sets the value of the pubid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pubid }
     *     
     */
    public void setPubid(Pubid value) {
        this.pubid = value;
    }

    /**
     * Gets the value of the vid property.
     * 
     * @return
     *     possible object is
     *     {@link Vid }
     *     
     */
    public Vid getVid() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vid }
     *     
     */
    public void setVid(Vid value) {
        this.vid = value;
    }

    /**
     * Gets the value of the ino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIno() {
        return ino;
    }

    /**
     * Sets the value of the ino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIno(String value) {
        this.ino = value;
    }

    /**
     * Gets the value of the cpyrt property.
     * 
     * @return
     *     possible object is
     *     {@link Cpyrt }
     *     
     */
    public Cpyrt getCpyrt() {
        return cpyrt;
    }

    /**
     * Sets the value of the cpyrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cpyrt }
     *     
     */
    public void setCpyrt(Cpyrt value) {
        this.cpyrt = value;
    }

}
