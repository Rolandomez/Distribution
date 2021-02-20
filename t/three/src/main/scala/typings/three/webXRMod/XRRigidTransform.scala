package typings.three.webXRMod

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXR", "XRRigidTransform")
@js.native
class XRRigidTransform protected () extends StObject {
  def this(matrix: Float32Array) = this()
  def this(matrix: DOMPointInit) = this()
  def this(matrix: Float32Array, direction: DOMPointInit) = this()
  def this(matrix: DOMPointInit, direction: DOMPointInit) = this()
  
  var inverse: XRRigidTransform = js.native
  
  var matrix: Float32Array = js.native
  
  var orientation: DOMPointReadOnly = js.native
  
  var position: DOMPointReadOnly = js.native
}
