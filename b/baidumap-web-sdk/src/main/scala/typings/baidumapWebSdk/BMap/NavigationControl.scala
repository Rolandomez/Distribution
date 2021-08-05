package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControl
  extends StObject
     with Control {
  
  def getType(): NavigationControlOptions
  
  def setType(`type`: NavigationControlType): Unit
}
object NavigationControl {
  
  inline def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getType: () => NavigationControlOptions,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setType: NavigationControlType => Unit,
    show: () => Unit
  ): NavigationControl = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getType = js.Any.fromFunction0(getType), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setType = js.Any.fromFunction1(setType), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[NavigationControl]
  }
  
  extension [Self <: NavigationControl](x: Self) {
    
    inline def setGetType(value: () => NavigationControlOptions): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSetType(value: NavigationControlType => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
  }
}
