package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientApiVersions extends StObject {
  
  /**
    * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
    */
  var apiVersion: js.UndefOr[typings.awsSdk.clientsLightsailMod.apiVersion] = js.undefined
}
object ClientApiVersions {
  
  inline def apply(): ClientApiVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientApiVersions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
  }
}
