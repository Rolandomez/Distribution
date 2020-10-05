package typings.antd.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antd.anon.PartialBasicProps
import typings.antd.anon.WeakValidationMapBasicPro
import typings.antd.layoutLayoutMod.BasicProps
import typings.antd.siderMod.SiderProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Layout")
@js.native
class Layout protected ()
  extends Component[BasicProps, ComponentState, js.Any] {
  def this(props: BasicProps) = this()
  def this(props: BasicProps, context: js.Any) = this()
}

@JSImport("antd", "Layout")
@js.native
object Layout
  extends Instantiable1[/* props */ BasicProps, Component[BasicProps, ComponentState, js.Any]]
     with Instantiable2[
      /* props */ BasicProps, 
      /* context */ js.Any, 
      Component[BasicProps, ComponentState, js.Any]
    ] {
  var Content: ComponentClass[BasicProps, ComponentState] = js.native
  var Footer: ComponentClass[BasicProps, ComponentState] = js.native
  var Header: ComponentClass[BasicProps, ComponentState] = js.native
  var Sider: ComponentClass[SiderProps, ComponentState] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialBasicProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[BasicProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[BasicProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMapBasicPro] = js.native
}

