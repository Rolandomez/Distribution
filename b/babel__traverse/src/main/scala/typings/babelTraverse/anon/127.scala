package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSSymbolKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var `type`: TSSymbolKeyword
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `127`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSSymbolKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
