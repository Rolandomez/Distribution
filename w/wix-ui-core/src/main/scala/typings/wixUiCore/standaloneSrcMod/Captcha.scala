package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.componentsCaptchaCaptchaMod.CaptchaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "Captcha")
@js.native
class Captcha protected ()
  extends typings.wixUiCore.srcComponentsCaptchaMod.Captcha {
  def this(props: CaptchaProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CaptchaProps, context: js.Any) = this()
}
/* static members */
object Captcha {
  
  @JSImport("wix-ui-core/dist/standalone/src", "Captcha")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "Captcha.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
