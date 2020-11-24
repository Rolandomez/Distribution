package typings.rrule

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rrule/dist/esm/src/datewithzone", JSImport.Namespace)
@js.native
object datewithzoneMod extends js.Object {
  
  @js.native
  class DateWithZone protected () extends js.Object {
    def this(date: Date) = this()
    def this(date: Date, tzid: String) = this()
    
    var date: Date = js.native
    
    def getTime(): Double = js.native
    
    /* private */ def isUTC: js.Any = js.native
    
    def rezonedDate(): Date = js.native
    
    var tzid: js.UndefOr[String | Null] = js.native
  }
}
