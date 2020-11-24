package typings.flatpickr.datesMod

import typings.flatpickr.anon.Config
import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.localeMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flatpickr/dist/utils/dates", "createDateParser")
@js.native
object createDateParser extends js.Object {
  
  def apply(hasConfigL10n: Config): js.Function4[
    /* date */ Date | String | Double, 
    /* givenFormat */ js.UndefOr[String], 
    /* timeless */ js.UndefOr[Boolean], 
    /* customLocale */ js.UndefOr[Locale], 
    js.UndefOr[Date]
  ] = js.native
}
