package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInstallsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The Android ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product represented by the install, e.g. "app:com.google.android.gm".
    */
  var installId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceInstallsDelete {
  
  inline def apply(): ParamsResourceInstallsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstallsDelete]
  }
  
  extension [Self <: ParamsResourceInstallsDelete](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    inline def setInstallId(value: String): Self = StObject.set(x, "installId", value.asInstanceOf[js.Any])
    
    inline def setInstallIdUndefined: Self = StObject.set(x, "installId", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
