package typings.googlemaps.google.maps.drawing

import typings.googlemaps.google.maps.MVCObject
import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManager extends MVCObject {
  
  def getDrawingMode(): OverlayType = js.native
  
  def getMap(): Map[Element] = js.native
  
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: OverlayType): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: DrawingManagerOptions): Unit = js.native
}
