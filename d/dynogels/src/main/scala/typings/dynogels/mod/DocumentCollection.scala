package typings.dynogels.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentCollection extends StObject {
  
  var ConsumedCapacity: typings.dynogels.mod.ConsumedCapacity
  
  var Count: Double
  
  var Items: js.Array[Document]
  
  var LastEvaluatedKey: js.UndefOr[Any] = js.undefined
  
  var ScannedCount: Double
}
object DocumentCollection {
  
  inline def apply(ConsumedCapacity: ConsumedCapacity, Count: Double, Items: js.Array[Document], ScannedCount: Double): DocumentCollection = {
    val __obj = js.Dynamic.literal(ConsumedCapacity = ConsumedCapacity.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], ScannedCount = ScannedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentCollection] (val x: Self) extends AnyVal {
    
    inline def setConsumedCapacity(value: ConsumedCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Document]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Document*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setLastEvaluatedKey(value: Any): Self = StObject.set(x, "LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedKeyUndefined: Self = StObject.set(x, "LastEvaluatedKey", js.undefined)
    
    inline def setScannedCount(value: Double): Self = StObject.set(x, "ScannedCount", value.asInstanceOf[js.Any])
  }
}
