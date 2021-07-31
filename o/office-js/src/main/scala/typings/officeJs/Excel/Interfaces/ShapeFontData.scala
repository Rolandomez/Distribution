package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ShapeFontUnderlineStyle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashHeavy
import typings.officeJs.officeJsStrings.DashLong
import typings.officeJs.officeJsStrings.DashLongHeavy
import typings.officeJs.officeJsStrings.DotDash
import typings.officeJs.officeJsStrings.DotDashHeavy
import typings.officeJs.officeJsStrings.DotDotDash
import typings.officeJs.officeJsStrings.DotDotDashHeavy
import typings.officeJs.officeJsStrings.Dotted
import typings.officeJs.officeJsStrings.DottedHeavy
import typings.officeJs.officeJsStrings.Heavy
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.Wavy
import typings.officeJs.officeJsStrings.WavyDouble
import typings.officeJs.officeJsStrings.WavyHeavy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shapeFont.toJSON()`. */
trait ShapeFontData extends StObject {
  
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representation of the text color (e.g., "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents font name (e.g., "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Represents font size in points (e.g., 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    ShapeFontUnderlineStyle | None | Single | typings.officeJs.officeJsStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
  ] = js.undefined
}
object ShapeFontData {
  
  @scala.inline
  def apply(): ShapeFontData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFontData]
  }
  
  @scala.inline
  implicit class ShapeFontDataMutableBuilder[Self <: ShapeFontData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUnderline(
      value: ShapeFontUnderlineStyle | None | Single | typings.officeJs.officeJsStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
