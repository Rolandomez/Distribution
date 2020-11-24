package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm/isSameWeek", JSImport.Namespace)
@js.native
object esmIsSameWeekMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(dateLeft: Double, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Double, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Double, options: WeekStartsOn): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Double, dateRight: Date, options: WeekStartsOn): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Double, options: WeekStartsOn): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date, options: typings.dateFns.anon.Locale): Boolean = js.native
    def apply(dateLeft: Date, dateRight: Date, options: WeekStartsOn): Boolean = js.native
  }
}
