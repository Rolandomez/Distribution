package typings.ol

import typings.ol.pluggableMapMod.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Map", JSImport.Namespace)
@js.native
object olMapMod extends js.Object {
  
  @js.native
  trait Map
    extends typings.ol.pluggableMapMod.default
  
  @js.native
  class default protected () extends Map {
    def this(options: MapOptions) = this()
  }
}
