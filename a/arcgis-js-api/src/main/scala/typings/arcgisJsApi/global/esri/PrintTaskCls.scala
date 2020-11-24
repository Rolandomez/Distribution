package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PrintTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PrintTask")
@js.native
/**
  * The PrintTask generates a printer-ready version of the map using an [Export Web Map Task](https://developers.arcgis.com/rest/services-reference/export-web-map-task.htm) available with ArGIS Server 10.1 and later.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html)
  */
class PrintTaskCls ()
  extends typings.arcgisJsApi.esri.PrintTask {
  def this(properties: PrintTaskProperties) = this()
}
