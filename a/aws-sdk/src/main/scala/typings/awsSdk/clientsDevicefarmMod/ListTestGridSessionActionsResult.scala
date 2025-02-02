package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridSessionActionsResult extends StObject {
  
  /**
    * The action taken by the session.
    */
  var actions: js.UndefOr[TestGridSessionActions] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTestGridSessionActionsResult {
  
  inline def apply(): ListTestGridSessionActionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionActionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTestGridSessionActionsResult] (val x: Self) extends AnyVal {
    
    inline def setActions(value: TestGridSessionActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: TestGridSessionAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
