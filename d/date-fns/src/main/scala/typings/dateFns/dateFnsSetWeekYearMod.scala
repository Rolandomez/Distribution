package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/setWeekYear", JSImport.Namespace)
@js.native
object dateFnsSetWeekYearMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def apply(date: Double, weekYear: Double): Date = js.native
    def apply(date: Double, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
    def apply(date: Date, weekYear: Double): Date = js.native
    def apply(date: Date, weekYear: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Date = js.native
  }
}
