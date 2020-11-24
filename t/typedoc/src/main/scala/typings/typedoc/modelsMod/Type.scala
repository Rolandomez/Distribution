package typings.typedoc.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "Type")
@js.native
abstract class Type ()
  extends typings.typedoc.modelsTypesMod.Type
/* static members */
@JSImport("typedoc/dist/lib/models", "Type")
@js.native
object Type extends js.Object {
  
  def isTypeListEqual(
    a: js.Array[typings.typedoc.typesAbstractMod.Type],
    b: js.Array[typings.typedoc.typesAbstractMod.Type]
  ): Boolean = js.native
  
  def isTypeListSimilar(
    a: js.Array[typings.typedoc.typesAbstractMod.Type],
    b: js.Array[typings.typedoc.typesAbstractMod.Type]
  ): Boolean = js.native
}
