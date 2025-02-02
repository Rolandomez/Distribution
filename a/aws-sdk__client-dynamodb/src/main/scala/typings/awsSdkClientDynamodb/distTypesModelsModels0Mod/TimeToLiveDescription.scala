package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToLiveDescription extends StObject {
  
  /**
    * <p> The name of the TTL attribute for items in the table.</p>
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The TTL status for the table.</p>
    */
  var TimeToLiveStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TimeToLiveStatus | String] = js.undefined
}
object TimeToLiveDescription {
  
  inline def apply(): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeToLiveDescription] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setTimeToLiveStatus(value: TimeToLiveStatus | String): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
  }
}
