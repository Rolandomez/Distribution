package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsBackToTopMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/BackToTop", JSImport.Default)
  @js.native
  val default: FC[BackToTopProps] = js.native
  
  trait BackToTopProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BackToTopProps {
    
    inline def apply(): BackToTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackToTopProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackToTopProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BackToTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsBackToTopMod.foo` */
  override def _to: FC[BackToTopProps] = default
}
