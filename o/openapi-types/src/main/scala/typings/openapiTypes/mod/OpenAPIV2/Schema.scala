package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.SchemaObject
  - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
*/
trait Schema extends StObject
object Schema {
  
  inline def ReferenceObject($ref: String): typings.openapiTypes.mod.OpenAPIV2.ReferenceObject = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.ReferenceObject]
  }
  
  inline def SchemaObject(): typings.openapiTypes.mod.OpenAPIV2.SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.SchemaObject]
  }
}
