package typings.unsplashJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collections extends StObject {
  
  var collections: String
}
object Collections {
  
  inline def apply(collections: String): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: String): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
  }
}
