package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightSource extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object HeightSource {
  
  inline def apply(): HeightSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightSource]
  }
  
  extension [Self <: HeightSource](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
