package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing an embedded drawing. An InlineDrawing can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineDrawing cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineDrawing
  extends StObject
     with Element {
  
  def getAltDescription(): String
  
  def getAltTitle(): String
  
  def setAltDescription(description: String): InlineDrawing
  
  def setAltTitle(title: String): InlineDrawing
}
object InlineDrawing {
  
  inline def apply(
    asBody: () => Body,
    asDate: () => Date,
    asEquation: () => Equation,
    asEquationFunction: () => EquationFunction,
    asEquationFunctionArgumentSeparator: () => EquationFunctionArgumentSeparator,
    asEquationSymbol: () => EquationSymbol,
    asFooterSection: () => FooterSection,
    asFootnote: () => Footnote,
    asFootnoteSection: () => FootnoteSection,
    asHeaderSection: () => HeaderSection,
    asHorizontalRule: () => HorizontalRule,
    asInlineDrawing: () => InlineDrawing,
    asInlineImage: () => InlineImage,
    asListItem: () => ListItem,
    asPageBreak: () => PageBreak,
    asParagraph: () => Paragraph,
    asPerson: () => Person,
    asRichLink: () => RichLink,
    asTable: () => Table,
    asTableCell: () => TableCell,
    asTableOfContents: () => TableOfContents,
    asTableRow: () => TableRow,
    asText: () => Text,
    copy: () => Element,
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAttributes: () => Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => Element,
    removeFromParent: () => Element,
    setAltDescription: String => InlineDrawing,
    setAltTitle: String => InlineDrawing,
    setAttributes: Any => Element
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal(asBody = js.Any.fromFunction0(asBody), asDate = js.Any.fromFunction0(asDate), asEquation = js.Any.fromFunction0(asEquation), asEquationFunction = js.Any.fromFunction0(asEquationFunction), asEquationFunctionArgumentSeparator = js.Any.fromFunction0(asEquationFunctionArgumentSeparator), asEquationSymbol = js.Any.fromFunction0(asEquationSymbol), asFooterSection = js.Any.fromFunction0(asFooterSection), asFootnote = js.Any.fromFunction0(asFootnote), asFootnoteSection = js.Any.fromFunction0(asFootnoteSection), asHeaderSection = js.Any.fromFunction0(asHeaderSection), asHorizontalRule = js.Any.fromFunction0(asHorizontalRule), asInlineDrawing = js.Any.fromFunction0(asInlineDrawing), asInlineImage = js.Any.fromFunction0(asInlineImage), asListItem = js.Any.fromFunction0(asListItem), asPageBreak = js.Any.fromFunction0(asPageBreak), asParagraph = js.Any.fromFunction0(asParagraph), asPerson = js.Any.fromFunction0(asPerson), asRichLink = js.Any.fromFunction0(asRichLink), asTable = js.Any.fromFunction0(asTable), asTableCell = js.Any.fromFunction0(asTableCell), asTableOfContents = js.Any.fromFunction0(asTableOfContents), asTableRow = js.Any.fromFunction0(asTableRow), asText = js.Any.fromFunction0(asText), copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes))
    __obj.asInstanceOf[InlineDrawing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineDrawing] (val x: Self) extends AnyVal {
    
    inline def setGetAltDescription(value: () => String): Self = StObject.set(x, "getAltDescription", js.Any.fromFunction0(value))
    
    inline def setGetAltTitle(value: () => String): Self = StObject.set(x, "getAltTitle", js.Any.fromFunction0(value))
    
    inline def setSetAltDescription(value: String => InlineDrawing): Self = StObject.set(x, "setAltDescription", js.Any.fromFunction1(value))
    
    inline def setSetAltTitle(value: String => InlineDrawing): Self = StObject.set(x, "setAltTitle", js.Any.fromFunction1(value))
  }
}
