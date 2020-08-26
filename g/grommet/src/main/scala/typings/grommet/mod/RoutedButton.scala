package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.buttonMod.ButtonProps
import typings.grommet.routedButtonMod.RoutedButtonProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "RoutedButton")
@js.native
class RoutedButton protected ()
  extends Component[RoutedButtonProps with ButtonProps, ComponentState, js.Any] {
  def this(props: RoutedButtonProps with ButtonProps) = this()
  def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
}

@JSImport("grommet/es6", "RoutedButton")
@js.native
object RoutedButton extends TopLevel[ComponentClass[RoutedButtonProps with ButtonProps, ComponentState]]

