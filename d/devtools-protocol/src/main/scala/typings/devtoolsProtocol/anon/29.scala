package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Audits.CheckContrastRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[CheckContrastRequest]]
  
  var returnType: Unit
}
object `29` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[CheckContrastRequest]], returnType: Unit): `29` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[CheckContrastRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[CheckContrastRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
