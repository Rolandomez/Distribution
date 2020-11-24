package typings.jpm.FFAddonSDK

import typings.jpm.anon.Disabled
import typings.jpm.jpmStrings.click
import typings.jpm.jpmStrings.tab
import typings.jpm.jpmStrings.window
import typings.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionButton
  extends ActionButtonState
     with ToolbarItem {
  
  def click(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
  
  @JSName("once")
  def once_click(event: click, handler: js.Function1[/* state */ ActionButtonState, _]): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_click(event: click, handler: js.Function): Unit = js.native
  
  def state(target: ActionButton): ActionButtonState = js.native
  def state(target: ActionButton, state: Disabled): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: BrowserWindow): ActionButtonState = js.native
  def state(target: BrowserWindow, state: Disabled): ActionButtonState = js.native
  def state(target: Tab): ActionButtonState = js.native
  def state(target: Tab, state: Disabled): ActionButtonState = js.native
  @JSName("state")
  def state_tab(target: tab): ActionButtonState = js.native
  @JSName("state")
  def state_tab(target: tab, state: Disabled): ActionButtonState = js.native
  @JSName("state")
  def state_window(target: window): ActionButtonState = js.native
  @JSName("state")
  def state_window(target: window, state: Disabled): ActionButtonState = js.native
}
