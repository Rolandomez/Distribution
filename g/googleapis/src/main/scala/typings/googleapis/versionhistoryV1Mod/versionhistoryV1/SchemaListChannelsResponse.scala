package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListChannelsResponse extends StObject {
  
  /**
    * The list of channels.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListChannelsResponse {
  
  inline def apply(): SchemaListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListChannelsResponse]
  }
  
  extension [Self <: SchemaListChannelsResponse](x: Self) {
    
    inline def setChannels(value: js.Array[SchemaChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaChannel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
