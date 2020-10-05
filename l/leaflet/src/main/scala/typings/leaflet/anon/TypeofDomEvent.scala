package typings.leaflet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.DomEvent.EventHandlerFn
import typings.leaflet.mod.DomEvent.PropagableEvent
import typings.leaflet.mod.Point_
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDomEvent extends js.Object {
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableClickPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableScrollPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  def getWheelDelta(ev: Event): Double = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def preventDefault(ev: Event): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stop(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stopPropagation(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
}

