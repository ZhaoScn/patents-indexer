//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:07:43 PM EST 
//


package xml.us.patent.grant.v30;

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
    "textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno"
})
@XmlRootElement(name = "online")
public class Online {

    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "author", required = true, type = Author.class),
        @XmlElement(name = "online-title", required = true, type = OnlineTitle.class),
        @XmlElement(name = "hosttitle", required = true, type = Hosttitle.class),
        @XmlElement(name = "subname", required = true, type = Subname.class),
        @XmlElement(name = "edition", required = true, type = Edition.class),
        @XmlElement(name = "serial", required = true, type = Serial.class),
        @XmlElement(name = "book", required = true, type = Book.class),
        @XmlElement(name = "imprint", required = true, type = Imprint.class),
        @XmlElement(name = "pubdate", required = true, type = Pubdate.class),
        @XmlElement(name = "history", required = true, type = History.class),
        @XmlElement(name = "series", required = true, type = Series.class),
        @XmlElement(name = "hostno", required = true, type = Hostno.class),
        @XmlElement(name = "location", required = true, type = Location.class),
        @XmlElement(name = "notes", required = true, type = Notes.class),
        @XmlElement(name = "avail", required = true, type = Avail.class),
        @XmlElement(name = "class", required = true, type = Class.class),
        @XmlElement(name = "keyword", required = true, type = Keyword.class),
        @XmlElement(name = "cpyrt", required = true, type = Cpyrt.class),
        @XmlElement(name = "issn", required = true, type = Issn.class),
        @XmlElement(name = "isbn", required = true, type = Isbn.class),
        @XmlElement(name = "datecit", required = true, type = Datecit.class),
        @XmlElement(name = "srchterm", required = true, type = Srchterm.class),
        @XmlElement(name = "srchdate", required = true, type = Srchdate.class),
        @XmlElement(name = "refno", required = true, type = Refno.class)
    })
    protected List<Object> textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno;

    /**
     * Gets the value of the textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Author }
     * {@link OnlineTitle }
     * {@link Hosttitle }
     * {@link Subname }
     * {@link Edition }
     * {@link Serial }
     * {@link Book }
     * {@link Imprint }
     * {@link Pubdate }
     * {@link History }
     * {@link Series }
     * {@link Hostno }
     * {@link Location }
     * {@link Notes }
     * {@link Avail }
     * {@link Class }
     * {@link Keyword }
     * {@link Cpyrt }
     * {@link Issn }
     * {@link Isbn }
     * {@link Datecit }
     * {@link Srchterm }
     * {@link Srchdate }
     * {@link Refno }
     * 
     * 
     */
    public List<Object> getTextOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno() {
        if (textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno == null) {
            textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno = new ArrayList<Object>();
        }
        return this.textOrAuthorOrOnlineTitleOrHosttitleOrSubnameOrEditionOrSerialOrBookOrImprintOrPubdateOrHistoryOrSeriesOrHostnoOrLocationOrNotesOrAvailOrClazzOrKeywordOrCpyrtOrIssnOrIsbnOrDatecitOrSrchtermOrSrchdateOrRefno;
    }

}
