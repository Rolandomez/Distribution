package typings.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityType[T]
  extends BaseType[T]
     with Type[T] {
  
  val kind: typings.astTypes.astTypesStrings.IdentityType = js.native
  
  val value: T = js.native
}
