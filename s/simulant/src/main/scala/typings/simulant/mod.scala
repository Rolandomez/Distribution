package typings.simulant

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  def apply(eventName: String): Event = js.native
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  def apply(eventName: String, payload: StringDictionary[js.Any]): Event = js.native
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  def apply(window: Window, eventName: String): Event = js.native
  @JSImport("simulant", JSImport.Namespace)
  @js.native
  def apply(window: Window, eventName: String, payload: StringDictionary[js.Any]): Event = js.native
  
  @JSImport("simulant", "fire")
  @js.native
  def fire(el: Node, e: String): Unit = js.native
  @JSImport("simulant", "fire")
  @js.native
  def fire(el: Node, e: String, payload: StringDictionary[js.Any]): Unit = js.native
  @JSImport("simulant", "fire")
  @js.native
  def fire(el: Node, e: Event): Unit = js.native
}
