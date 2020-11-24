package typings.plottable.mod.Utils

import typings.plottable.componentMod.Component
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Utils.Translator")
@js.native
class Translator protected ()
  extends typings.plottable.utilsMod.Translator {
  def this(_rootElement: HTMLElement) = this()
}
/* static members */
@JSImport("plottable", "Utils.Translator")
@js.native
object Translator extends js.Object {
  
  /**
    * Is the event's target part of the given component's DOM tree?
    */
  def isEventInside(component: Component, e: Event): Boolean = js.native
}
