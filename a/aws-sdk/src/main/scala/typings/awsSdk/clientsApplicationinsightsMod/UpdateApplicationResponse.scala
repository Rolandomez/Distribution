package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * Information about the application. 
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ApplicationInfo] = js.undefined
}
object UpdateApplicationResponse {
  
  inline def apply(): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInfo(value: ApplicationInfo): Self = StObject.set(x, "ApplicationInfo", value.asInstanceOf[js.Any])
    
    inline def setApplicationInfoUndefined: Self = StObject.set(x, "ApplicationInfo", js.undefined)
  }
}
