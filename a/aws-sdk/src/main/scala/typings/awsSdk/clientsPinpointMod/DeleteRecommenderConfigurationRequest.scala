package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommenderConfigurationRequest extends StObject {
  
  /**
    * The unique identifier for the recommender model configuration. This identifier is displayed as the Recommender ID on the Amazon Pinpoint console.
    */
  var RecommenderId: string
}
object DeleteRecommenderConfigurationRequest {
  
  inline def apply(RecommenderId: string): DeleteRecommenderConfigurationRequest = {
    val __obj = js.Dynamic.literal(RecommenderId = RecommenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommenderConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRecommenderConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setRecommenderId(value: string): Self = StObject.set(x, "RecommenderId", value.asInstanceOf[js.Any])
  }
}
