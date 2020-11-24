package typings.nodePgMigrate.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.typesTypesMod.CreateTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateTypeFn extends js.Object {
  
  def reverse(
    typeName: typings.nodePgMigrate.generalTypesMod.Name,
    values: (js.Array[Value] | StringDictionary[typings.nodePgMigrate.generalTypesMod.Type]) with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateTypeFn = js.native
}
