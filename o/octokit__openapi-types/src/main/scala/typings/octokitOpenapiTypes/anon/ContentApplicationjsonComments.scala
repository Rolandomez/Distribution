package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonComments extends StObject {
  
  var content: ApplicationjsonComments
}
object ContentApplicationjsonComments {
  
  inline def apply(content: ApplicationjsonComments): ContentApplicationjsonComments = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonComments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonComments] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonComments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
