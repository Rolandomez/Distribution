package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders

import typings.storybookComponents.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align_
  extends StObject
     with DocCommand {
  
  var contents: Doc
  
  var n: Double | String | Type
  
  var `type`: typings.storybookComponents.storybookComponentsStrings.align
}
object Align_ {
  
  inline def apply(contents: Doc, n: Double | String | Type): Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("align")
    __obj.asInstanceOf[Align_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Align_] (val x: Self) extends AnyVal {
    
    inline def setContents(value: Doc): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: Any*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setN(value: Double | String | Type): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.storybookComponents.storybookComponentsStrings.align): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
