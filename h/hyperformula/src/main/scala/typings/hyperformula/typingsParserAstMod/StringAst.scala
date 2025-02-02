package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.STRING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: STRING
  
  var value: String
}
object StringAst {
  
  inline def apply(`type`: STRING, value: String): StringAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: STRING): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
