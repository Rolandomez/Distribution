package typings.nodePgMigrate.anon

import typings.nodePgMigrate.functionsTypesMod.CreateFunctionFn
import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateFunctionFn extends StObject {
  
  def reverse(
    functionName: typings.nodePgMigrate.generalTypesMod.Name,
    functionParams: js.Array[FunctionParam],
    functionOptions: FunctionOptions with DropOptions,
    definition: Value
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateFunctionFn = js.native
}
