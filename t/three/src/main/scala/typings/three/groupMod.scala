package typings.three

import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/Group", JSImport.Namespace)
@js.native
object groupMod extends js.Object {
  @js.native
  class Group () extends Object3D {
    val isGroup: `true` = js.native
    @JSName("type")
    var type_Group: typings.three.threeStrings.Group = js.native
  }
  
}

