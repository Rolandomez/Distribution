package typings.plottable

import typings.plottable.componentMod.Component
import typings.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
@js.native
object renderControllerMod extends js.Object {
  
  def flush(): Unit = js.native
  
  def registerToComputeLayout(component: Component): Unit = js.native
  
  def registerToComputeLayoutAndRender(component: Component): Unit = js.native
  
  def registerToRender(component: Component): Unit = js.native
  
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  
  /* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.immediate
    - typings.plottable.plottableStrings.animationFrame
    - typings.plottable.plottableStrings.timeout
  */
  trait Policy extends js.Object
  @js.native
  object Policy extends js.Object {
    
    var animationFrame: typings.plottable.plottableStrings.animationFrame = js.native
    
    var immediate: typings.plottable.plottableStrings.immediate = js.native
    
    var timeout: typings.plottable.plottableStrings.timeout = js.native
  }
}
