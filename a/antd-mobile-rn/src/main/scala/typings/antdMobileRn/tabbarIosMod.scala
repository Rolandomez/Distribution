package typings.antdMobileRn

import typings.antdMobileRn.anon.BarTintColor
import typings.antdMobileRn.tabBarPropsTypeMod.TabBarProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile-rn/lib/tab-bar/tabbar.ios", JSImport.Namespace)
@js.native
object tabbarIosMod extends js.Object {
  
  @js.native
  trait TabBar
    extends Component[TabBarProps, js.Any, js.Any]
  
  @js.native
  class default () extends TabBar
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Item: js.Any = js.native
    
    var defaultProps: BarTintColor = js.native
  }
}
