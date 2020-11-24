package typings.reactTagcloud

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.reactTagcloud.ReactTagCloud_.DefaultRendererFactory
import typings.reactTagcloud.ReactTagCloud_.TagCloudClass
import typings.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-tagcloud", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DefaultRenderer: DefaultRendererFactory = js.native
  
  @js.native
  class TagCloud protected ()
    extends Component[TagCloudProps, ComponentState, js.Any] {
    def this(props: TagCloudProps) = this()
    def this(props: TagCloudProps, context: js.Any) = this()
  }
  @js.native
  object TagCloud extends TopLevel[TagCloudClass]
}
