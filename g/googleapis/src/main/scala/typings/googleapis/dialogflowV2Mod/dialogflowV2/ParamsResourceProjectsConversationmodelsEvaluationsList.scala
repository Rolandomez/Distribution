package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationmodelsEvaluationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Maximum number of evaluations to return in a single page. By default 100 and at most 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The next_page_token value returned from a previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The conversation model resource name. Format: `projects//conversationModels/`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationmodelsEvaluationsList {
  
  inline def apply(): ParamsResourceProjectsConversationmodelsEvaluationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationmodelsEvaluationsList]
  }
  
  extension [Self <: ParamsResourceProjectsConversationmodelsEvaluationsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
