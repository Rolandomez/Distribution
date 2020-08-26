package typings.ionic.ailmentsBaseMod

import typings.ionic.definitionsMod.IAilment
import typings.ionic.definitionsMod.IAilmentRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments/base", "AilmentRegistry")
@js.native
class AilmentRegistry () extends IAilmentRegistry {
  var _ailments: js.Array[IAilment] = js.native
  @JSName("ailments")
  def ailments_MAilmentRegistry: js.Array[IAilment] = js.native
}

