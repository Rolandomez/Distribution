package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SpotLight")
@js.native
open class SpotLight protected ()
  extends typings.babylonjs.legacyLegacyMod.SpotLight {
  /**
    * Creates a SpotLight object in the scene. A spot light is a simply light oriented cone.
    * It can cast shadows.
    * Documentation : https://doc.babylonjs.com/features/featuresDeepDive/lights/lights_introduction
    * @param name The light friendly name
    * @param position The position of the spot light in the scene
    * @param direction The direction of the light in the scene
    * @param angle The cone angle of the light in Radians
    * @param exponent The light decay speed with the distance from the emission spot
    * @param scene The scene the lights belongs to
    */
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    direction: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    angle: Double,
    exponent: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object SpotLight {
  
  @JSImport("babylonjs", "SpotLight")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "SpotLight._IsProceduralTexture")
  @js.native
  def _IsProceduralTexture: Any = js.native
  inline def _IsProceduralTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsProceduralTexture")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SpotLight._IsTexture")
  @js.native
  def _IsTexture: Any = js.native
  inline def _IsTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsTexture")(x.asInstanceOf[js.Any])
}
