package typings.typedoc

import typings.typedoc.anon.PickIntersectionTypetype
import typings.typedoc.modelsMod.IntersectionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/intersection", JSImport.Namespace)
@js.native
object typesIntersectionMod extends js.Object {
  
  @js.native
  class IntersectionTypeSerializer () extends TypeSerializerComponent[IntersectionType] {
    
    def toObject(`type`: IntersectionType, obj: PickIntersectionTypetype): typings.typedoc.schemaMod.IntersectionType = js.native
  }
}
