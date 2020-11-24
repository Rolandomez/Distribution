package typings.typedoc

import typings.typedoc.anon.PickConditionalTypetypeTy
import typings.typedoc.modelsMod.ConditionalType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/conditional", JSImport.Namespace)
@js.native
object serializersTypesConditionalMod extends js.Object {
  
  @js.native
  class ConditionalTypeSerializer () extends TypeSerializerComponent[ConditionalType] {
    
    def toObject(conditional: ConditionalType, obj: PickConditionalTypetypeTy): typings.typedoc.schemaMod.ConditionalType = js.native
  }
}
