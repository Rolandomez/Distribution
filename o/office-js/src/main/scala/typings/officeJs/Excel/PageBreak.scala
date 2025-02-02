package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.PageBreakData
import typings.officeJs.Excel.Interfaces.PageBreakLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageBreak
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the column index for the page break.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val columnIndex: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageBreak: RequestContext = js.native
  
  /**
    * Deletes a page break object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the first cell after the page break.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def getCellAfterBreak(): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageBreak = js.native
  def load(options: PageBreakLoadOptions): PageBreak = js.native
  def load(propertyNamesAndPaths: Expand): PageBreak = js.native
  def load(propertyNames: String): PageBreak = js.native
  def load(propertyNames: js.Array[String]): PageBreak = js.native
  
  /**
    * Specifies the row index for the page break.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val rowIndex: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PageBreak object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageBreakData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageBreakData = js.native
}
