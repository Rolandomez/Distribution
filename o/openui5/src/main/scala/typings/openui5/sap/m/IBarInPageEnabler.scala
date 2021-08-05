package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.RenderManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBarInPageEnabler extends StObject {
  
  /**
    * Adds the sapMBarChildClass to a control.
    * @param oControl undefined
    */
  def addChildClassTo(oControl: Control): Unit
  
  /**
    * Renders the tooltip for the given control
    * @param oRM the RenderManager that can be used for writing to the render output buffer.
    * @param oControl an object representation of the control that should be rendered.
    */
  def renderTooltip(oRM: RenderManager, oControl: Control): Unit
}
object IBarInPageEnabler {
  
  inline def apply(addChildClassTo: Control => Unit, renderTooltip: (RenderManager, Control) => Unit): IBarInPageEnabler = {
    val __obj = js.Dynamic.literal(addChildClassTo = js.Any.fromFunction1(addChildClassTo), renderTooltip = js.Any.fromFunction2(renderTooltip))
    __obj.asInstanceOf[IBarInPageEnabler]
  }
  
  extension [Self <: IBarInPageEnabler](x: Self) {
    
    inline def setAddChildClassTo(value: Control => Unit): Self = StObject.set(x, "addChildClassTo", js.Any.fromFunction1(value))
    
    inline def setRenderTooltip(value: (RenderManager, Control) => Unit): Self = StObject.set(x, "renderTooltip", js.Any.fromFunction2(value))
  }
}
