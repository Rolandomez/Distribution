package typings.babylonjs.mod

import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ThinRenderTargetTexture")
@js.native
open class ThinRenderTargetTexture protected ()
  extends typings.babylonjs.legacyLegacyMod.ThinRenderTargetTexture {
  /**
    * Instantiates a new ThinRenderTargetTexture.
    * Tiny helper class to wrap a RenderTargetWrapper in a texture.
    * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache and to hold on the associated RTT
    * @param engine Define the internalTexture to wrap
    * @param size Define the size of the RTT to create
    * @param options Define rendertarget options
    */
  def this(
    engine: typings.babylonjs.enginesThinEngineMod.ThinEngine,
    size: TextureSize,
    options: RenderTargetCreationOptions
  ) = this()
}
