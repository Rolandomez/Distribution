package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /**
    * @description A comment to accompany the deployment review
    * @example Ship it!
    */
  var comment: String
  
  /**
    * @description The list of environment ids to approve or reject
    * @example [
    *   161171787,
    *   161171795
    * ]
    */
  var environment_ids: js.Array[Double]
  
  /**
    * @description Whether to approve or reject deployment to the specified environments.
    * @example approved
    * @enum {string}
    */
  var state: approved | rejected
}
object Comment {
  
  inline def apply(comment: String, environment_ids: js.Array[Double], state: approved | rejected): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], environment_ids = environment_ids.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_ids(value: js.Array[Double]): Self = StObject.set(x, "environment_ids", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_idsVarargs(value: Double*): Self = StObject.set(x, "environment_ids", js.Array(value*))
    
    inline def setState(value: approved | rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
