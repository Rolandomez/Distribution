package typings.typeorm

import typings.typeorm.relationIdRelationIdAttributeMod.RelationIdAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationIdRelationIdLoadResultMod {
  
  trait RelationIdLoadResult extends StObject {
    
    var relationIdAttribute: RelationIdAttribute
    
    var results: js.Array[js.Any]
  }
  object RelationIdLoadResult {
    
    inline def apply(relationIdAttribute: RelationIdAttribute, results: js.Array[js.Any]): RelationIdLoadResult = {
      val __obj = js.Dynamic.literal(relationIdAttribute = relationIdAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelationIdLoadResult]
    }
    
    extension [Self <: RelationIdLoadResult](x: Self) {
      
      inline def setRelationIdAttribute(value: RelationIdAttribute): Self = StObject.set(x, "relationIdAttribute", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: js.Any*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
}
