package typings.fastGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob", "sync")
@js.native
object sync extends js.Object {
  
  def apply(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Array[String] = js.native
  def apply(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Array[typings.fastGlob.typesMod.Entry] = js.native
  def apply(source: typings.fastGlob.typesMod.Pattern): js.Array[String] = js.native
  def apply(
    source: typings.fastGlob.typesMod.Pattern,
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Array[typings.fastGlob.typesMod.Entry] = js.native
}
