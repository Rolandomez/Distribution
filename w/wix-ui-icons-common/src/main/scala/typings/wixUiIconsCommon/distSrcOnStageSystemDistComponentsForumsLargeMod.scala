package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsForumsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/ForumsLarge", JSImport.Default)
  @js.native
  val default: FC[ForumsLargeProps] = js.native
  
  trait ForumsLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ForumsLargeProps {
    
    inline def apply(): ForumsLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForumsLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForumsLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ForumsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsForumsLargeMod.foo` */
  override def _to: FC[ForumsLargeProps] = default
}
