package typings.hlsParser.mod.types

import typings.hlsParser.anon.Uri
import typings.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "types.MediaInitializationSection")
@js.native
class MediaInitializationSection protected () extends js.Object {
  def this(properties: Uri) = this()
  
  var byterange: js.UndefOr[Byterange] = js.native
  
  var uri: String = js.native
}
