package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var `type`: WhileStatement
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
