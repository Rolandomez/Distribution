package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1Progress extends StObject {
  
  /**
    * The amount of work that has been completed. Note that this may be greater than work_estimated.
    */
  var workCompleted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An estimate of how much work needs to be performed. May be zero if the work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1Progress {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Progress]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1Progress](x: Self) {
    
    inline def setWorkCompleted(value: String): Self = StObject.set(x, "workCompleted", value.asInstanceOf[js.Any])
    
    inline def setWorkCompletedNull: Self = StObject.set(x, "workCompleted", null)
    
    inline def setWorkCompletedUndefined: Self = StObject.set(x, "workCompleted", js.undefined)
    
    inline def setWorkEstimated(value: String): Self = StObject.set(x, "workEstimated", value.asInstanceOf[js.Any])
    
    inline def setWorkEstimatedNull: Self = StObject.set(x, "workEstimated", null)
    
    inline def setWorkEstimatedUndefined: Self = StObject.set(x, "workEstimated", js.undefined)
  }
}
