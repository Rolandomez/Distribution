package typings.babylonjs.animationsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Animations/index", "RuntimeAnimation")
@js.native
class RuntimeAnimation protected ()
  extends typings.babylonjs.runtimeAnimationMod.RuntimeAnimation {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(
    target: js.Any,
    animation: typings.babylonjs.animationMod.Animation,
    scene: Scene,
    host: typings.babylonjs.animatableMod.Animatable
  ) = this()
}
