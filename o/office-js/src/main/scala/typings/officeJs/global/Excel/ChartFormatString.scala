package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the substring in chart related objects that contains text, like ChartTitle object, ChartAxisTitle object, etc.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartFormatString")
@js.native
class ChartFormatString ()
  extends StObject
     with typings.officeJs.Excel.ChartFormatString {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
