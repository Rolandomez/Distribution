package typings.bizcharts.mod

import typings.bizcharts.anon.PreInteractions
import typings.bizcharts.libComponentsViewMod.default
import typings.bizcharts.libInterfaceMod.IViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bizcharts", "View")
@js.native
open class View protected () extends default {
  def this(props: IViewProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: IViewProps, context: Any) = this()
}
/* static members */
object View {
  
  @JSImport("bizcharts", "View")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts", "View.defaultProps")
  @js.native
  def defaultProps: PreInteractions = js.native
  inline def defaultProps_=(x: PreInteractions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
