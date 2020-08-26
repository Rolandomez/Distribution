package typings.formatjsIntlUtils.resolveLocaleMod

import typings.formatjsIntlUtils.typesMod.LocaleData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/src/resolve-locale", "unpackData")
@js.native
object unpackData extends js.Object {
  def apply[T /* <: Record[String, _] */](locale: String, localeData: LocaleData[T]): T = js.native
  def apply[T /* <: Record[String, _] */](
    locale: String,
    localeData: LocaleData[T],
    /** By default shallow merge the dictionaries. */
  reducer: js.Function2[/* all */ T, /* d */ T, T]
  ): T = js.native
}

