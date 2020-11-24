package typings.dateFns

import typings.dateFns.anon.NearestTo
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/roundToNearestMinutes", JSImport.Namespace)
@js.native
object dateFnsRoundToNearestMinutesMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double): Date = js.native
    def apply(date: Double, options: NearestTo): Date = js.native
    def apply(date: Date): Date = js.native
    def apply(date: Date, options: NearestTo): Date = js.native
  }
}
