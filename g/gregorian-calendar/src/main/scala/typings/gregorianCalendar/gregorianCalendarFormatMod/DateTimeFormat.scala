package typings.gregorianCalendar.gregorianCalendarFormatMod

import typings.gregorianCalendar.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormat extends js.Object {
  
  var Style: DateTimeStyle = js.native
  
  /**
    * format an instance of GregorianCalendar according to pattern
    */
  def format(calendar: typings.gregorianCalendar.mod.^): String = js.native
  
  /**
    * get a predefine GregorianCalendarFormat instance
    */
  def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle): DateTimeFormat = js.native
  def getDateTimeInstance(dateStyle: DateTimeStyle, timeStyle: DateTimeStyle, locale: js.Object): DateTimeFormat = js.native
  
  /**
    * parse a dateString to an instance of GregorianCalendar according to pattern, it's better to specify calendarLocale, such as
    *  `df.parse('2013-11-12', {locale: require('gregorian-calendar/lib/locale/zh_CN'}));`
    */
  def parse(dateString: String, hasLocale: Locale): typings.gregorianCalendar.mod.^ = js.native
}
