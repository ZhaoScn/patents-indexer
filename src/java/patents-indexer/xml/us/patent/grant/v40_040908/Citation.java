//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:06:28 PM EST 
//


package xml.us.patent.grant.v40_040908;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patcitOrNplcit",
    "correspondingDocs",
    "relPassage",
    "category",
    "relClaims",
    "classificationIpc",
    "classificationNational"
})
@XmlRootElement(name = "citation")
public class Citation {

    @XmlAttribute(name = "srep-phase")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String srepPhase;
    @XmlElements({
        @XmlElement(name = "patcit", required = true, type = Patcit.class),
        @XmlElement(name = "nplcit", required = true, type = Nplcit.class)
    })
    protected List<Object> patcitOrNplcit;
    @XmlElement(name = "corresponding-docs")
    protected List<CorrespondingDocs> correspondingDocs;
    @XmlElement(name = "rel-passage")
    protected List<RelPassage> relPassage;
    protected List<Category> category;
    @XmlElement(name = "rel-claims")
    protected List<RelClaims> relClaims;
    @XmlElement(name = "classification-ipc")
    protected ClassificationIpc classificationIpc;
    @XmlElement(name = "classification-national")
    protected ClassificationNational classificationNational;

    /**
     * Gets the value of the srepPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrepPhase() {
        return srepPhase;
    }

    /**
     * Sets the value of the srepPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrepPhase(String value) {
        this.srepPhase = value;
    }

    /**
     * Gets the value of the patcitOrNplcit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patcitOrNplcit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatcitOrNplcit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patcit }
     * {@link Nplcit }
     * 
     * 
     */
    public List<Object> getPatcitOrNplcit() {
        if (patcitOrNplcit == null) {
            patcitOrNplcit = new ArrayList<Object>();
        }
        return this.patcitOrNplcit;
    }

    /**
     * Gets the value of the correspondingDocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondingDocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespondingDocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespondingDocs }
     * 
     * 
     */
    public List<CorrespondingDocs> getCorrespondingDocs() {
        if (correspondingDocs == null) {
            correspondingDocs = new ArrayList<CorrespondingDocs>();
        }
        return this.correspondingDocs;
    }

    /**
     * Gets the value of the relPassage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relPassage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelPassage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelPassage }
     * 
     * 
     */
    public List<RelPassage> getRelPassage() {
        if (relPassage == null) {
            relPassage = new ArrayList<RelPassage>();
        }
        return this.relPassage;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getCategory() {
        if (category == null) {
            category = new ArrayList<Category>();
        }
        return this.category;
    }

    /**
     * Gets the value of the relClaims property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relClaims property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelClaims().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelClaims }
     * 
     * 
     */
    public List<RelClaims> getRelClaims() {
        if (relClaims == null) {
            relClaims = new ArrayList<RelClaims>();
        }
        return this.relClaims;
    }

    /**
     * Gets the value of the classificationIpc property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationIpc }
     *     
     */
    public ClassificationIpc getClassificationIpc() {
        return classificationIpc;
    }

    /**
     * Sets the value of the classificationIpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationIpc }
     *     
     */
    public void setClassificationIpc(ClassificationIpc value) {
        this.classificationIpc = value;
    }

    /**
     * Gets the value of the classificationNational property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNational }
     *     
     */
    public ClassificationNational getClassificationNational() {
        return classificationNational;
    }

    /**
     * Sets the value of the classificationNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNational }
     *     
     */
    public void setClassificationNational(ClassificationNational value) {
        this.classificationNational = value;
    }

}
