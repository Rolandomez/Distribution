package typings.antdMobile

import typings.antdMobile.anon.Label
import typings.antdMobile.anon.ListViewPrefixCls
import typings.antdMobile.listViewPropsTypeMod.ListViewPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Namespace)
@js.native
object indexedMod extends js.Object {
  
  @js.native
  trait MIndexedList
    extends Component[MIndexedListProps, js.Any, js.Any] {
    
    var indexedListRef: js.Any = js.native
  }
  
  @js.native
  trait MIndexedListProps extends ListViewPropsType {
    
    var delayActivityIndicator: js.UndefOr[ReactNode] = js.native
    
    var delayTime: js.UndefOr[Double] = js.native
    
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var quickSearchBarTop: js.UndefOr[Label] = js.native
  }
  
  @js.native
  class default () extends MIndexedList
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: ListViewPrefixCls = js.native
  }
}
