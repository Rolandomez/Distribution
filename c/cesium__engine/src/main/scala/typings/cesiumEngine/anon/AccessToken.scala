package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Resource
import typings.cesiumEngine.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessToken extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var scene: Scene
  
  var server: js.UndefOr[String | Resource] = js.undefined
}
object AccessToken {
  
  inline def apply(scene: Scene): AccessToken = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setServer(value: String | Resource): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
