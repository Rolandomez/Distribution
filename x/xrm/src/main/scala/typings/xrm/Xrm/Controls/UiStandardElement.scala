package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for standard UI elements.
  */
trait UiStandardElement
  extends StObject
     with UiCanGetVisibleElement
     with UiLabelElement {
  
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}
object UiStandardElement {
  
  inline def apply(
    getLabel: () => String,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal(getLabel = js.Any.fromFunction0(getLabel), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[UiStandardElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiStandardElement] (val x: Self) extends AnyVal {
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
