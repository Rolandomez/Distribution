package typings.googleapis.cloudfunctionsV1beta2Mod.cloudfunctionsV1beta2

import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapisCommon.apiMod.GlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with GlobalOptions {
  
  var version: v1beta2
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(version = "v1beta2")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setVersion(value: v1beta2): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
