//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 12:46:18 PM EST 
//


package xml.us.patent.application.v43;

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
    "textOrDocumentIdOrRelPassage"
})
@XmlRootElement(name = "patcit")
public class Patcit {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "num")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String num;
    @XmlAttribute(name = "dnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dnum;
    @XmlAttribute(name = "dnum-type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dnumType;
    @XmlAttribute(name = "file")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "url")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String url;
    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "document-id", required = true, type = DocumentId.class),
        @XmlElement(name = "rel-passage", required = true, type = RelPassage.class)
    })
    protected List<Object> textOrDocumentIdOrRelPassage;

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
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the dnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnum() {
        return dnum;
    }

    /**
     * Sets the value of the dnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnum(String value) {
        this.dnum = value;
    }

    /**
     * Gets the value of the dnumType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnumType() {
        return dnumType;
    }

    /**
     * Sets the value of the dnumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnumType(String value) {
        this.dnumType = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the textOrDocumentIdOrRelPassage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrDocumentIdOrRelPassage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrDocumentIdOrRelPassage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link DocumentId }
     * {@link RelPassage }
     * 
     * 
     */
    public List<Object> getTextOrDocumentIdOrRelPassage() {
        if (textOrDocumentIdOrRelPassage == null) {
            textOrDocumentIdOrRelPassage = new ArrayList<Object>();
        }
        return this.textOrDocumentIdOrRelPassage;
    }

}
