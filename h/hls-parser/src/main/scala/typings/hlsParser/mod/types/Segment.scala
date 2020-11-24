package typings.hlsParser.mod.types

import typings.hlsParser.anon.Byterange
import typings.hlsParser.mod.Data
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "types.Segment")
@js.native
class Segment protected () extends Data {
  def this(properties: Byterange) = this()
  
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.native
  
  var dateRange: DateRange = js.native
  
  var discontinuity: js.UndefOr[Boolean] = js.native
  
  var discontinuitySequence: Double = js.native
  
  var duration: Double = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var map: js.UndefOr[MediaInitializationSection] = js.native
  
  var mediaSequenceNumber: Double = js.native
  
  var programDateTime: js.UndefOr[Date] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var uri: String = js.native
}
