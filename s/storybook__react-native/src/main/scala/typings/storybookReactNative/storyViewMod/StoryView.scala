package typings.storybookReactNative.storyViewMod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryView
  extends Component[Props, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MStoryView(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MStoryView(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MStoryView(): Unit = js.native
  
  def forceReRender(): Unit = js.native
  
  def renderHelp(): Element = js.native
  
  def renderOnDeviceUIHelp(): Element = js.native
}
