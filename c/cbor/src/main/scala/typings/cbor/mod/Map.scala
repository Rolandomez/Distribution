package typings.cbor.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cbor", "Map")
@js.native
class Map protected () extends CborMap {
  def this(iterable: Iterable[js.Tuple2[_, _]]) = this()
}
