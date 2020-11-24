package typings.uirouterAngularjs.mod

import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.commonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "find")
@js.native
object find extends js.Object {
  
  def apply[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def apply[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
}
