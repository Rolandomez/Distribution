package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYahooFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YahooFilled", JSImport.Default)
  @js.native
  val default: YahooFilledIconType = js.native
  
  @js.native
  trait YahooFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_YahooFilledIconType: String = js.native
  }
  
  type _To = YahooFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYahooFilledMod.foo` */
  override def _to: YahooFilledIconType = default
}
