package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "searchNumbers")
@js.native
object searchNumbers extends js.Object {
  
  def apply(text: String): IterableIterator[NumberFoundLegacy] = js.native
  def apply(text: String, options: DefaultCountry): IterableIterator[NumberFound] = js.native
  def apply(text: String, options: CountryCode): IterableIterator[NumberFoundLegacy] = js.native
}
