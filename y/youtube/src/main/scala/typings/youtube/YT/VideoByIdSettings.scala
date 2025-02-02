package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoByIdSettings
  extends StObject
     with VideoOrPlaylistSettings {
  
  /**
    * Video ID.
    */
  var videoId: String
}
object VideoByIdSettings {
  
  inline def apply(videoId: String): VideoByIdSettings = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByIdSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoByIdSettings] (val x: Self) extends AnyVal {
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
