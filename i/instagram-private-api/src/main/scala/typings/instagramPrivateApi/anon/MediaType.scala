package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL
import typings.instagramPrivateApi.instagramPrivateApiStrings.PHOTO
import typings.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType extends StObject {
  
  var mediaId: String
  
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.undefined
}
object MediaType {
  
  inline def apply(mediaId: String): MediaType = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
  
  extension [Self <: MediaType](x: Self) {
    
    inline def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: PHOTO | VIDEO | CAROUSEL): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
  }
}
