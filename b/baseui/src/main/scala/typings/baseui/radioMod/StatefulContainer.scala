package typings.baseui.radioMod

import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/radio", "StatefulContainer")
@js.native
class StatefulContainer ()
  extends Component[StatefulContainerProps, State, js.Any] {
  
  def onChange(e: ChangeEventHandler[HTMLInputElement]): Unit = js.native
  
  def stateReducer(`type`: String, e: SyntheticEvent[HTMLInputElement, Event]): Unit = js.native
}
