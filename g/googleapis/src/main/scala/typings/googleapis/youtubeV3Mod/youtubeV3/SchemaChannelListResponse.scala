package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelListResponse extends StObject {
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String | Null] = js.undefined
  
  var items: js.UndefOr[js.Array[SchemaChannel]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#channelListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * General pagination information.
    */
  var pageInfo: js.UndefOr[SchemaPageInfo] = js.undefined
  
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: js.UndefOr[String | Null] = js.undefined
  
  var tokenPagination: js.UndefOr[SchemaTokenPagination] = js.undefined
  
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelListResponse {
  
  inline def apply(): SchemaChannelListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelListResponse]
  }
  
  extension [Self <: SchemaChannelListResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setItems(value: js.Array[SchemaChannel]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaChannel*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPageInfo(value: SchemaPageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    inline def setPrevPageTokenNull: Self = StObject.set(x, "prevPageToken", null)
    
    inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
    
    inline def setTokenPagination(value: SchemaTokenPagination): Self = StObject.set(x, "tokenPagination", value.asInstanceOf[js.Any])
    
    inline def setTokenPaginationUndefined: Self = StObject.set(x, "tokenPagination", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdNull: Self = StObject.set(x, "visitorId", null)
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
