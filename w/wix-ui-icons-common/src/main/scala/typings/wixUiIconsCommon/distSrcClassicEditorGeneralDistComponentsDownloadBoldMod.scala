package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsDownloadBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DownloadBold", JSImport.Default)
  @js.native
  val default: FC[DownloadBoldProps] = js.native
  
  trait DownloadBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DownloadBoldProps {
    
    inline def apply(): DownloadBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadBoldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadBoldProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DownloadBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsDownloadBoldMod.foo` */
  override def _to: FC[DownloadBoldProps] = default
}
