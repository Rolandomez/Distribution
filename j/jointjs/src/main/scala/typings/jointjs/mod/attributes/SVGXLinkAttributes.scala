package typings.jointjs.mod.attributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGXLinkAttributes extends StObject {
  
  @JSName("xlink:actuate")
  var xlinkColonactuate: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:arcrole")
  var xlinkColonarcrole: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:href")
  var xlinkColonhref: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:role")
  var xlinkColonrole: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:show")
  var xlinkColonshow: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:title")
  var xlinkColontitle: js.UndefOr[String] = js.undefined
  
  @JSName("xlink:type")
  var xlinkColontype: js.UndefOr[String] = js.undefined
}
object SVGXLinkAttributes {
  
  inline def apply(): SVGXLinkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGXLinkAttributes]
  }
  
  extension [Self <: SVGXLinkAttributes](x: Self) {
    
    inline def setXlinkColonactuate(value: String): Self = StObject.set(x, "xlink:actuate", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonactuateUndefined: Self = StObject.set(x, "xlink:actuate", js.undefined)
    
    inline def setXlinkColonarcrole(value: String): Self = StObject.set(x, "xlink:arcrole", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonarcroleUndefined: Self = StObject.set(x, "xlink:arcrole", js.undefined)
    
    inline def setXlinkColonhref(value: String): Self = StObject.set(x, "xlink:href", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonhrefUndefined: Self = StObject.set(x, "xlink:href", js.undefined)
    
    inline def setXlinkColonrole(value: String): Self = StObject.set(x, "xlink:role", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonroleUndefined: Self = StObject.set(x, "xlink:role", js.undefined)
    
    inline def setXlinkColonshow(value: String): Self = StObject.set(x, "xlink:show", value.asInstanceOf[js.Any])
    
    inline def setXlinkColonshowUndefined: Self = StObject.set(x, "xlink:show", js.undefined)
    
    inline def setXlinkColontitle(value: String): Self = StObject.set(x, "xlink:title", value.asInstanceOf[js.Any])
    
    inline def setXlinkColontitleUndefined: Self = StObject.set(x, "xlink:title", js.undefined)
    
    inline def setXlinkColontype(value: String): Self = StObject.set(x, "xlink:type", value.asInstanceOf[js.Any])
    
    inline def setXlinkColontypeUndefined: Self = StObject.set(x, "xlink:type", js.undefined)
  }
}
