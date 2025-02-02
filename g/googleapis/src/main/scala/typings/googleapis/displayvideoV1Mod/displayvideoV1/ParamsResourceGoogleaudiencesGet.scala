package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGoogleaudiencesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the advertiser that has access to the fetched Google audience.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the Google audience to fetch.
    */
  var googleAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the partner that has access to the fetched Google audience.
    */
  var partnerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGoogleaudiencesGet {
  
  inline def apply(): ParamsResourceGoogleaudiencesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGoogleaudiencesGet]
  }
  
  extension [Self <: ParamsResourceGoogleaudiencesGet](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setGoogleAudienceId(value: String): Self = StObject.set(x, "googleAudienceId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAudienceIdUndefined: Self = StObject.set(x, "googleAudienceId", js.undefined)
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
