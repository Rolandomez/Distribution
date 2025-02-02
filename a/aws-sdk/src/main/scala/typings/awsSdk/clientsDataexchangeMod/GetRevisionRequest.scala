package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRevisionRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: _String
  
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: _String
}
object GetRevisionRequest {
  
  inline def apply(DataSetId: _String, RevisionId: _String): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRevisionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRevisionRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSetId(value: _String): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: _String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
