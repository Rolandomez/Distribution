package typings.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType[T]
  extends BaseType[T]
     with Type[T] {
  
  val fields: js.Array[FieldType[_]] = js.native
  
  val kind: typings.astTypes.astTypesStrings.ObjectType = js.native
}
