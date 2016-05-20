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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "tgroup"
})
@XmlRootElement(name = "table")
public class Table {

    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "colsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colsep;
    @XmlAttribute(name = "rowsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rowsep;
    @XmlAttribute(name = "pgwide")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pgwide;
    @XmlAttribute(name = "orient")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orient;
    @XmlAttribute(name = "tabstyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tabstyle;
    protected String title;
    @XmlElement(required = true)
    protected List<Tgroup> tgroup;

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the colsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsep() {
        return colsep;
    }

    /**
     * Sets the value of the colsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsep(String value) {
        this.colsep = value;
    }

    /**
     * Gets the value of the rowsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsep() {
        return rowsep;
    }

    /**
     * Sets the value of the rowsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsep(String value) {
        this.rowsep = value;
    }

    /**
     * Gets the value of the pgwide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgwide() {
        return pgwide;
    }

    /**
     * Sets the value of the pgwide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgwide(String value) {
        this.pgwide = value;
    }

    /**
     * Gets the value of the orient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrient() {
        return orient;
    }

    /**
     * Sets the value of the orient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrient(String value) {
        this.orient = value;
    }

    /**
     * Gets the value of the tabstyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabstyle() {
        return tabstyle;
    }

    /**
     * Sets the value of the tabstyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabstyle(String value) {
        this.tabstyle = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the tgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tgroup }
     * 
     * 
     */
    public List<Tgroup> getTgroup() {
        if (tgroup == null) {
            tgroup = new ArrayList<Tgroup>();
        }
        return this.tgroup;
    }

}
