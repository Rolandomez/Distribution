package typings.blueprintjsCore.portalMod

import typings.blueprintjsCore.anon.ValidationMapIPortalConte
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
class Portal ()
  extends Component[IPortalProps, IPortalState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MPortal(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPortal(prevProps: IPortalProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPortal(): Unit = js.native
  
  @JSName("context")
  var context_Portal: IPortalContext = js.native
  
  var createContainerElement: js.Any = js.native
  
  var portalElement: js.Any = js.native
  
  var unstableRenderNoPortal: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/portal/portal", "Portal")
@js.native
object Portal extends js.Object {
  
  var contextTypes: ValidationMapIPortalConte = js.native
  
  var defaultProps: IPortalProps = js.native
  
  var displayName: String = js.native
}
