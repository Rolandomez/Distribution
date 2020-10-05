package typings.three

import typings.std.WebGLRenderingContext
import typings.three.anon.Ambient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLLights", JSImport.Namespace)
@js.native
object webGLLightsMod extends js.Object {
  @js.native
  class WebGLLights protected () extends js.Object {
    def this(gl: WebGLRenderingContext, properties: js.Any, info: js.Any) = this()
    var state: Ambient = js.native
    def get(light: js.Any): js.Any = js.native
    def setup(lights: js.Any, shadows: js.Any, camera: js.Any): Unit = js.native
  }
  
}

