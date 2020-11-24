package typings.jsforce.analyticsMod

import typings.jsforce.connectionMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/api/analytics", "ReportInstance")
@js.native
class ReportInstance protected () extends js.Object {
  def this(report: Report, id: String) = this()
  
  def retrieve(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
}
