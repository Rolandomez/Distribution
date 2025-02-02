package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsStairsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StairsSmall", JSImport.Default)
  @js.native
  val default: FC[StairsSmallProps] = js.native
  
  trait StairsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StairsSmallProps {
    
    inline def apply(): StairsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StairsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StairsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StairsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsStairsSmallMod.foo` */
  override def _to: FC[StairsSmallProps] = default
}
