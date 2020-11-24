package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typings.babylonjs.legacyMod.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, `type`: Double) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: js.UndefOr[scala.Nothing],
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
}
/* static members */
@JSImport("babylonjs", "DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
}
