package typings.ionicCore.stencilPublicRuntimeMod

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[T] extends js.Object {
  
  def emit(): CustomEvent[T] = js.native
  def emit(data: T): CustomEvent[T] = js.native
}
