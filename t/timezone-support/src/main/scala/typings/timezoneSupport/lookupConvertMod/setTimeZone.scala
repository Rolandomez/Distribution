package typings.timezoneSupport.lookupConvertMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezone-support/dist/lookup-convert", "setTimeZone")
@js.native
object setTimeZone extends js.Object {
  
  def apply(time: Date, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo): Time = js.native
  def apply(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
}
