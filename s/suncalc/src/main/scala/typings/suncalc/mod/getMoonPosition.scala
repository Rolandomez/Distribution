package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("suncalc", "getMoonPosition")
@js.native
object getMoonPosition extends js.Object {
  
  def apply(timeAndDate: Date, latitude: Double, longitude: Double): GetMoonPositionResult = js.native
}
