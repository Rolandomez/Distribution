package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCreativegroupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Creative group ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCreativegroupsGet {
  
  inline def apply(): ParamsResourceCreativegroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativegroupsGet]
  }
  
  extension [Self <: ParamsResourceCreativegroupsGet](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
