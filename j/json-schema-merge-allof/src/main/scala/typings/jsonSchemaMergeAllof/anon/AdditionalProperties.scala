package typings.jsonSchemaMergeAllof.anon

import typings.jsonSchemaMergeAllof.mod.JSONSchema
import typings.jsonSchemaMergeAllof.mod.MergeChildSchemas
import typings.jsonSchemaMergeAllof.mod.MergeSchemas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalProperties extends js.Object {
  
  def additionalProperties[T /* <: JSONSchema */](schemas: js.Array[T]): T = js.native
  @JSName("additionalProperties")
  var additionalProperties_Original: MergeSchemas = js.native
  
  def patternProperties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
  @JSName("patternProperties")
  var patternProperties_Original: MergeChildSchemas = js.native
  
  def properties[T /* <: JSONSchema */](schemas: js.Array[T], childSchemaName: String): T = js.native
  @JSName("properties")
  var properties_Original: MergeChildSchemas = js.native
}
