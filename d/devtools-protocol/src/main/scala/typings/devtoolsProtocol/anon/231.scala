package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.ActivateTargetRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `231` extends StObject {
  
  var paramsType: js.Array[ActivateTargetRequest]
  
  var returnType: Unit
}
object `231` {
  
  inline def apply(paramsType: js.Array[ActivateTargetRequest], returnType: Unit): `231` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`231`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `231`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ActivateTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ActivateTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
