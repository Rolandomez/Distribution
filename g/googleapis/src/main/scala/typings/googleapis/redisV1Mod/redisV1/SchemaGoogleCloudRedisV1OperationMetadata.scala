package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRedisV1OperationMetadata extends StObject {
  
  /**
    * API version.
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies if cancellation was requested for the operation.
    */
  var cancelRequested: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Creation timestamp.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End timestamp.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operation status details.
    */
  var statusDetail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operation target.
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operation verb.
    */
  var verb: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRedisV1OperationMetadata {
  
  inline def apply(): SchemaGoogleCloudRedisV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1OperationMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRedisV1OperationMetadata](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    inline def setCancelRequestedNull: Self = StObject.set(x, "cancelRequested", null)
    
    inline def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStatusDetail(value: String): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailNull: Self = StObject.set(x, "statusDetail", null)
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbNull: Self = StObject.set(x, "verb", null)
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
