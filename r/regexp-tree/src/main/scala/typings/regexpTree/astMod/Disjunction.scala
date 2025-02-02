package typings.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disjunction
  extends StObject
     with Base[typings.regexpTree.regexpTreeStrings.Disjunction]
     with Expression {
  
  var left: Expression | Null
  
  var right: Expression | Null
}
object Disjunction {
  
  inline def apply(): Disjunction = {
    val __obj = js.Dynamic.literal(left = null, right = null)
    __obj.updateDynamic("type")("Disjunction")
    __obj.asInstanceOf[Disjunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disjunction] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
  }
}
