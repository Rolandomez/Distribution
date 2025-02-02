package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBigQueryConfig extends StObject {
  
  /**
    * When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery. Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription's backlog.
    */
  var dropUnknownFields: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. An output-only field that indicates whether or not the subscription can receive messages.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the table to which to write data, of the form {projectId\}.{datasetId\}.{tableId\}
    */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When true, use the topic's schema as the columns to write to in BigQuery, if it exists.
    */
  var useTopicSchema: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
    */
  var writeMetadata: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaBigQueryConfig {
  
  inline def apply(): SchemaBigQueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryConfig]
  }
  
  extension [Self <: SchemaBigQueryConfig](x: Self) {
    
    inline def setDropUnknownFields(value: Boolean): Self = StObject.set(x, "dropUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setDropUnknownFieldsNull: Self = StObject.set(x, "dropUnknownFields", null)
    
    inline def setDropUnknownFieldsUndefined: Self = StObject.set(x, "dropUnknownFields", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setUseTopicSchema(value: Boolean): Self = StObject.set(x, "useTopicSchema", value.asInstanceOf[js.Any])
    
    inline def setUseTopicSchemaNull: Self = StObject.set(x, "useTopicSchema", null)
    
    inline def setUseTopicSchemaUndefined: Self = StObject.set(x, "useTopicSchema", js.undefined)
    
    inline def setWriteMetadata(value: Boolean): Self = StObject.set(x, "writeMetadata", value.asInstanceOf[js.Any])
    
    inline def setWriteMetadataNull: Self = StObject.set(x, "writeMetadata", null)
    
    inline def setWriteMetadataUndefined: Self = StObject.set(x, "writeMetadata", js.undefined)
  }
}
