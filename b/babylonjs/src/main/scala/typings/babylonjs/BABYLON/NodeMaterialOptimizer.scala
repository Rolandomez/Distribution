package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMaterialOptimizer extends StObject {
  
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit
}
object NodeMaterialOptimizer {
  
  inline def apply(optimize: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Unit): NodeMaterialOptimizer = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction2(optimize))
    __obj.asInstanceOf[NodeMaterialOptimizer]
  }
  
  extension [Self <: NodeMaterialOptimizer](x: Self) {
    
    inline def setOptimize(value: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Unit): Self = StObject.set(x, "optimize", js.Any.fromFunction2(value))
  }
}
