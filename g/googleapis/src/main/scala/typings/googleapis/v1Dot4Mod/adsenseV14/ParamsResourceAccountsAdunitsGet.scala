package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdunitsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account to which the ad client belongs.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client for which to get the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad unit to retrieve.
    */
  var adUnitId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdunitsGet {
  
  inline def apply(): ParamsResourceAccountsAdunitsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsGet]
  }
  
  extension [Self <: ParamsResourceAccountsAdunitsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
  }
}
