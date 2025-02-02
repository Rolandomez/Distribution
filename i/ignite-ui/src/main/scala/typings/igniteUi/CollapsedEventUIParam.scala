package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsedEventUIParam extends StObject {
  
  /**
    * Used to get a reference the igSplitButton.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object CollapsedEventUIParam {
  
  inline def apply(): CollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollapsedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
