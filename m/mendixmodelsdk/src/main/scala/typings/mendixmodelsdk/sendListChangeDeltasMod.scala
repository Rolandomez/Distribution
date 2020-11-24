package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/sendListChangeDeltas", JSImport.Namespace)
@js.native
object sendListChangeDeltasMod extends js.Object {
  
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}
