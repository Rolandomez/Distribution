package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSVariableReferenceValue extends StObject {
  
  val fallback: CSSUnparsedValue | Null
  
  var variable: String
}
object CSSVariableReferenceValue {
  
  inline def apply(variable: String): CSSVariableReferenceValue = {
    val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any], fallback = null)
    __obj.asInstanceOf[CSSVariableReferenceValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSVariableReferenceValue] (val x: Self) extends AnyVal {
    
    inline def setFallback(value: CSSUnparsedValue): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
    
    inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
