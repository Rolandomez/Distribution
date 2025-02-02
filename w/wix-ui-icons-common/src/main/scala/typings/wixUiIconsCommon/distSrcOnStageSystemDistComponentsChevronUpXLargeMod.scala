package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsChevronUpXLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ChevronUpXLarge", JSImport.Default)
  @js.native
  val default: FC[ChevronUpXLargeProps] = js.native
  
  trait ChevronUpXLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpXLargeProps {
    
    inline def apply(): ChevronUpXLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpXLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChevronUpXLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpXLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsChevronUpXLargeMod.foo` */
  override def _to: FC[ChevronUpXLargeProps] = default
}
