package typings.typedoc

import typings.typedoc.anon.PickTypeOperatorTypetype
import typings.typedoc.modelsMod.TypeOperatorType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/type-operator", JSImport.Namespace)
@js.native
object serializersTypesTypeOperatorMod extends js.Object {
  
  @js.native
  class TypeOperatorTypeSerializer () extends TypeSerializerComponent[TypeOperatorType] {
    
    def toObject(`type`: TypeOperatorType, obj: PickTypeOperatorTypetype): typings.typedoc.schemaMod.TypeOperatorType = js.native
  }
}
