package typings.reactSpinners

import typings.react.mod.Component
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-spinners/ClimbingBoxLoader", JSImport.Namespace)
@js.native
object climbingBoxLoaderMod extends js.Object {
  
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    
    var container: StyleFunction = js.native
    
    var hill: StyleFunction = js.native
    
    var style: StyleFunction = js.native
    
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: LoaderSizeProps = js.native
  }
}
