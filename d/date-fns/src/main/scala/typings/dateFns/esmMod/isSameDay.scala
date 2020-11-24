package typings.dateFns.esmMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "isSameDay")
@js.native
object isSameDay extends js.Object {
  
  def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
  def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
}
