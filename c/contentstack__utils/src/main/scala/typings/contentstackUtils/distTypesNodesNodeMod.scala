package typings.contentstackUtils

import typings.contentstackUtils.distTypesGqlMod.AnyNode
import typings.contentstackUtils.distTypesModelsMetadataModelMod.Attributes
import typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodesNodeMod {
  
  @JSImport("@contentstack/utils/dist/types/nodes/node", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Node
       with AnyNode
       with typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode {
    
    /* CompleteClass */
    var attrs: Attributes = js.native
    
    /* CompleteClass */
    var children: js.Array[typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode] = js.native
    
    /* CompleteClass */
    var `type`: NodeType = js.native
  }
  
  trait Node extends StObject {
    
    var attrs: Attributes
    
    var children: js.Array[typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode]
    
    var `type`: NodeType
  }
  object Node {
    
    inline def apply(
      attrs: Attributes,
      children: js.Array[typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode],
      `type`: NodeType
    ): Node = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: typings.contentstackUtils.distTypesJsonToHtmlMod.AnyNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
