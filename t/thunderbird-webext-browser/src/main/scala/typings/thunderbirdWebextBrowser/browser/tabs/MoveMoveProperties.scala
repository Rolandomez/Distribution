package typings.thunderbirdWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveMoveProperties extends StObject {
  
  /**
    * The position to move the window to. `-1` will place the tab at the end
    * of the window.
    */
  var index: Double
  
  /** Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[Double] = js.undefined
}
object MoveMoveProperties {
  
  inline def apply(index: Double): MoveMoveProperties = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveMoveProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveMoveProperties] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
