package typings.coreDecorators.mod

import typings.std.Console
import typings.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-decorators", "time")
@js.native
object time extends js.Object {
  
  def apply(label: String): MethodDecorator = js.native
  def apply(label: String, console: Console): MethodDecorator = js.native
}
