package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTabletMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Tablet", JSImport.Default)
  @js.native
  val default: FC[TabletProps] = js.native
  
  trait TabletProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TabletProps {
    
    inline def apply(): TabletProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabletProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabletProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TabletProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTabletMod.foo` */
  override def _to: FC[TabletProps] = default
}
