package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOpResultObject extends StObject {
  
  /**
    * Number of documents deleted.
    */
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of documents inserted.
    */
  var insertedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Inserted document generated Id's, hash key is the index of the originating operation.
    */
  var insertedIds: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Number of documents matched for update.
    */
  var matchedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Number of documents modified.
    */
  var modifiedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The command result object.
    */
  var result: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Number of documents upserted.
    */
  var upsertedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Upserted document generated Id's, hash key is the index of the originating operation.
    */
  var upsertedIds: js.UndefOr[js.Any] = js.undefined
}
object BulkWriteOpResultObject {
  
  inline def apply(): BulkWriteOpResultObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkWriteOpResultObject]
  }
  
  extension [Self <: BulkWriteOpResultObject](x: Self) {
    
    inline def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    inline def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    inline def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedCountUndefined: Self = StObject.set(x, "insertedCount", js.undefined)
    
    inline def setInsertedIds(value: js.Any): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    inline def setInsertedIdsUndefined: Self = StObject.set(x, "insertedIds", js.undefined)
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setMatchedCountUndefined: Self = StObject.set(x, "matchedCount", js.undefined)
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCountUndefined: Self = StObject.set(x, "modifiedCount", js.undefined)
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCountUndefined: Self = StObject.set(x, "upsertedCount", js.undefined)
    
    inline def setUpsertedIds(value: js.Any): Self = StObject.set(x, "upsertedIds", value.asInstanceOf[js.Any])
    
    inline def setUpsertedIdsUndefined: Self = StObject.set(x, "upsertedIds", js.undefined)
  }
}
