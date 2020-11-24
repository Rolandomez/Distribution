package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTag extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  val DownloadURL: String = js.native
  
  @JSName("Excel.SmartTag_typekey")
  var ExcelDotSmartTag_typekey: SmartTag = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Properties(Index: String): CustomProperty = js.native
  def Properties(Index: Double): CustomProperty = js.native
  @JSName("Properties")
  val Properties_Original: CustomProperties = js.native
  
  def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  @JSName("Range")
  val Range_Original: Range = js.native
  
  def SmartTagActions(Index: js.Any): SmartTagAction = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  
  val XML: String = js.native
  
  val _Default: String = js.native
}
