//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:43 PM EST 
//


package xml.us.patent.grant.v30;

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
    "numberOfDrawingSheets",
    "numberOfFigures",
    "figureToPublish"
})
@XmlRootElement(name = "figures")
public class Figures {

    @XmlElement(name = "number-of-drawing-sheets", required = true)
    protected String numberOfDrawingSheets;
    @XmlElement(name = "number-of-figures", required = true)
    protected String numberOfFigures;
    @XmlElement(name = "figure-to-publish")
    protected FigureToPublish figureToPublish;

    /**
     * Gets the value of the numberOfDrawingSheets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfDrawingSheets() {
        return numberOfDrawingSheets;
    }

    /**
     * Sets the value of the numberOfDrawingSheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfDrawingSheets(String value) {
        this.numberOfDrawingSheets = value;
    }

    /**
     * Gets the value of the numberOfFigures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfFigures() {
        return numberOfFigures;
    }

    /**
     * Sets the value of the numberOfFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfFigures(String value) {
        this.numberOfFigures = value;
    }

    /**
     * Gets the value of the figureToPublish property.
     * 
     * @return
     *     possible object is
     *     {@link FigureToPublish }
     *     
     */
    public FigureToPublish getFigureToPublish() {
        return figureToPublish;
    }

    /**
     * Sets the value of the figureToPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link FigureToPublish }
     *     
     */
    public void setFigureToPublish(FigureToPublish value) {
        this.figureToPublish = value;
    }

}
