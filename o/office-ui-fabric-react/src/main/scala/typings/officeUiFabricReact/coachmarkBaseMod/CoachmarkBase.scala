package typings.officeUiFabricReact.coachmarkBaseMod

import typings.officeUiFabricReact.anon.PartialICoachmarkProps
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typings.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
class CoachmarkBase protected ()
  extends Component[ICoachmarkProps, ICoachmarkState, js.Any]
     with ICoachmark {
  def this(props: ICoachmarkProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCoachmarkBase(newProps: ICoachmarkProps): Unit = js.native
  
  var _addListeners: js.Any = js.native
  
  var _addProximityHandler: js.Any = js.native
  
  var _ariaAlertContainer: js.Any = js.native
  
  var _async: js.Any = js.native
  
  val _beakDirection: js.Any = js.native
  
  var _childrenContainer: js.Any = js.native
  
  var _dismissOnLostFocus: js.Any = js.native
  
  /**
    * The cached HTMLElement reference to the Entity Inner Host
    * element.
    */
  var _entityHost: js.Any = js.native
  
  var _entityInnerHostElement: js.Any = js.native
  
  var _events: js.Any = js.native
  
  var _getBounds: js.Any = js.native
  
  var _isInsideElement: js.Any = js.native
  
  var _onFocusHandler: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onPositioned: js.Any = js.native
  
  var _openCoachmark: js.Any = js.native
  
  var _positioningContainer: js.Any = js.native
  
  var _setBeakPosition: js.Any = js.native
  
  var _setTargetElementRect: js.Any = js.native
  
  /**
    * The target element the mouse would be in
    * proximity to
    */
  var _targetElementRect: js.Any = js.native
  
  var _translateAnimationContainer: js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MCoachmarkBase(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCoachmarkBase(prevProps: ICoachmarkProps, prevState: ICoachmarkState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCoachmarkBase(): Unit = js.native
  
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: Event): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCoachmarkBase(newProps: ICoachmarkProps, newState: ICoachmarkState): Boolean = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
object CoachmarkBase extends js.Object {
  
  var defaultProps: PartialICoachmarkProps = js.native
}
