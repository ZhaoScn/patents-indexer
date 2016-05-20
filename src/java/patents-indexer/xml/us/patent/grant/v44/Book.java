//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 01:02:03 PM EST 
//


package xml.us.patent.grant.v44;

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
    "textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno"
})
@XmlRootElement(name = "book")
public class Book {

    @XmlElements({
        @XmlElement(name = "text", required = true, type = Text.class),
        @XmlElement(name = "author", required = true, type = Author.class),
        @XmlElement(name = "book-title", required = true, type = BookTitle.class),
        @XmlElement(name = "conference", required = true, type = Conference.class),
        @XmlElement(name = "subtitle", required = true, type = Subtitle.class),
        @XmlElement(name = "subname", required = true, type = Subname.class),
        @XmlElement(name = "edition", required = true, type = Edition.class),
        @XmlElement(name = "imprint", required = true, type = Imprint.class),
        @XmlElement(name = "descrip", required = true, type = Descrip.class),
        @XmlElement(name = "series", required = true, type = Series.class),
        @XmlElement(name = "absno", required = true, type = Absno.class),
        @XmlElement(name = "location", required = true, type = Location.class),
        @XmlElement(name = "isbn", required = true, type = Isbn.class),
        @XmlElement(name = "pubid", required = true, type = Pubid.class),
        @XmlElement(name = "vid", required = true, type = Vid.class),
        @XmlElement(name = "bookno", required = true, type = Bookno.class),
        @XmlElement(name = "notes", required = true, type = Notes.class),
        @XmlElement(name = "class", required = true, type = Class.class),
        @XmlElement(name = "keyword", required = true, type = Keyword.class),
        @XmlElement(name = "cpyrt", required = true, type = Cpyrt.class),
        @XmlElement(name = "refno", required = true, type = Refno.class)
    })
    protected List<Object> textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno;

    /**
     * Gets the value of the textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * {@link Author }
     * {@link BookTitle }
     * {@link Conference }
     * {@link Subtitle }
     * {@link Subname }
     * {@link Edition }
     * {@link Imprint }
     * {@link Descrip }
     * {@link Series }
     * {@link Absno }
     * {@link Location }
     * {@link Isbn }
     * {@link Pubid }
     * {@link Vid }
     * {@link Bookno }
     * {@link Notes }
     * {@link Class }
     * {@link Keyword }
     * {@link Cpyrt }
     * {@link Refno }
     * 
     * 
     */
    public List<Object> getTextOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno() {
        if (textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno == null) {
            textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno = new ArrayList<Object>();
        }
        return this.textOrAuthorOrBookTitleOrConferenceOrSubtitleOrSubnameOrEditionOrImprintOrDescripOrSeriesOrAbsnoOrLocationOrIsbnOrPubidOrVidOrBooknoOrNotesOrClazzOrKeywordOrCpyrtOrRefno;
    }

}
