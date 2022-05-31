package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Ratio
import typings.babylonjs.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiviewRenderTarget")
@js.native
class MultiviewRenderTarget protected ()
  extends StObject
     with typings.babylonjs.BABYLON.MultiviewRenderTarget {
  /**
    * Creates a multiview render target
    * @param scene scene used with the render target
    * @param size the size of the render target (used for each view)
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, size: Double) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, size: Ratio) = this()
  def this(scene: typings.babylonjs.BABYLON.Scene, size: Width) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
