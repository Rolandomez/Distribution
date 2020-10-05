package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.anon.TypeofDomEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DomEvent")
@js.native
object DomEvent extends js.Object {
  trait _PropagableEvent extends js.Object
  
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def disableClickPropagation(el: HTMLElement): TypeofDomEvent = js.native
  def disableScrollPropagation(el: HTMLElement): TypeofDomEvent = js.native
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  def getWheelDelta(ev: Event): Double = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def preventDefault(ev: Event): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def stop(ev: PropagableEvent): TypeofDomEvent = js.native
  def stopPropagation(ev: PropagableEvent): TypeofDomEvent = js.native
  type EventHandlerFn = js.Function1[/* event */ Event, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.leaflet.mod.LeafletMouseEvent
    - typings.leaflet.mod.LeafletKeyboardEvent
    - typings.leaflet.mod.LeafletEvent
    - typings.std.Event
  */
  type PropagableEvent = _PropagableEvent | Event
}

