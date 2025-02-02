package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosInventoryResponse extends StObject {
  
  /**
    * Required. The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Global Trade Item Number.
    */
  var gtin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A unique identifier for the item.
    */
  var itemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#posInventoryResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The current price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Required. The available quantity of the item.
    */
  var quantity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The identifier of the merchant's store. Either a `storeCode` inserted via the API or the code of the store in Google My Business.
    */
  var storeCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The CLDR territory code for the item.
    */
  var targetCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The inventory timestamp, in ISO 8601 format.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaPosInventoryResponse {
  
  inline def apply(): SchemaPosInventoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosInventoryResponse]
  }
  
  extension [Self <: SchemaPosInventoryResponse](x: Self) {
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinNull: Self = StObject.set(x, "gtin", null)
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeNull: Self = StObject.set(x, "storeCode", null)
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryNull: Self = StObject.set(x, "targetCountry", null)
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
