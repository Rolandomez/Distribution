package typings.antDesignReactNative.portalHostMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalHost
  extends Component[PortalHostProps, js.Object, js.Any] {
  
  var _manager: js.UndefOr[typings.antDesignReactNative.portalManagerMod.default] = js.native
  
  def _mount(children: ReactNode): Double = js.native
  def _mount(children: ReactNode, _key: Double): Double = js.native
  
  var _nextKey: Double = js.native
  
  var _queue: js.Array[Operation] = js.native
  
  def _setManager(): Unit = js.native
  def _setManager(manager: js.Any): Unit = js.native
  
  def _unmount(key: Double): Unit = js.native
  
  def _update(key: Double, children: ReactNode): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MPortalHost(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortalHost(): Unit = js.native
}
