package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDisksCreatesnapshot
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the persistent disk to snapshot.
    */
  var disk: js.UndefOr[String] = js.undefined
  
  /**
    * [Input Only] Whether to attempt an application consistent snapshot by informing the OS to prepare for the snapshot process.
    */
  var guestFlush: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSnapshot] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceDisksCreatesnapshot {
  
  inline def apply(): ParamsResourceDisksCreatesnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDisksCreatesnapshot]
  }
  
  extension [Self <: ParamsResourceDisksCreatesnapshot](x: Self) {
    
    inline def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    inline def setGuestFlush(value: Boolean): Self = StObject.set(x, "guestFlush", value.asInstanceOf[js.Any])
    
    inline def setGuestFlushUndefined: Self = StObject.set(x, "guestFlush", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaSnapshot): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
