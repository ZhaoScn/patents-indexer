//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:26 PM EST 
//


package xml.us.patent.grant.v42;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentIdOrNplcit"
})
@XmlRootElement(name = "corresponding-docs")
public class CorrespondingDocs {

    @XmlElements({
        @XmlElement(name = "document-id", type = DocumentId.class),
        @XmlElement(name = "nplcit", type = Nplcit.class)
    })
    protected List<Object> documentIdOrNplcit;

    /**
     * Gets the value of the documentIdOrNplcit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentIdOrNplcit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentIdOrNplcit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentId }
     * {@link Nplcit }
     * 
     * 
     */
    public List<Object> getDocumentIdOrNplcit() {
        if (documentIdOrNplcit == null) {
            documentIdOrNplcit = new ArrayList<Object>();
        }
        return this.documentIdOrNplcit;
    }

}
