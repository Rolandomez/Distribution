package typings.emberObject.mod

import typings.emberObject.typesMod.UnwrapComputedPropertyGetters
import typings.emberObject.typesMod.UnwrapComputedPropertySetters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object", "setProperties")
@js.native
object setProperties extends js.Object {
  
  def apply[T, K /* <: /* keyof T */ String */](obj: T, hash: Pick[T | UnwrapComputedPropertySetters[T], K]): Pick[UnwrapComputedPropertyGetters[T], K] = js.native
}
