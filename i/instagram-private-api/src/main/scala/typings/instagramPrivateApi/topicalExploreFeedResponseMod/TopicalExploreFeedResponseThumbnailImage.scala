package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseThumbnailImage extends StObject {
  
  var image_versions2: TopicalExploreFeedResponseImageVersions2
  
  var preview: String
}
object TopicalExploreFeedResponseThumbnailImage {
  
  inline def apply(image_versions2: TopicalExploreFeedResponseImageVersions2, preview: String): TopicalExploreFeedResponseThumbnailImage = {
    val __obj = js.Dynamic.literal(image_versions2 = image_versions2.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseThumbnailImage]
  }
  
  extension [Self <: TopicalExploreFeedResponseThumbnailImage](x: Self) {
    
    inline def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
