package typings.webpack.mod

import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableInfoInterface extends StObject {
  
  var declaredScope: ScopeInfo
  
  var freeName: String | `true`
  
  var tagInfo: js.UndefOr[TagInfo] = js.undefined
}
object VariableInfoInterface {
  
  inline def apply(declaredScope: ScopeInfo, freeName: String | `true`): VariableInfoInterface = {
    val __obj = js.Dynamic.literal(declaredScope = declaredScope.asInstanceOf[js.Any], freeName = freeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableInfoInterface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableInfoInterface] (val x: Self) extends AnyVal {
    
    inline def setDeclaredScope(value: ScopeInfo): Self = StObject.set(x, "declaredScope", value.asInstanceOf[js.Any])
    
    inline def setFreeName(value: String | `true`): Self = StObject.set(x, "freeName", value.asInstanceOf[js.Any])
    
    inline def setTagInfo(value: TagInfo): Self = StObject.set(x, "tagInfo", value.asInstanceOf[js.Any])
    
    inline def setTagInfoUndefined: Self = StObject.set(x, "tagInfo", js.undefined)
  }
}
