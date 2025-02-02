package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.Animation
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsMdDotenterMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/animations/md.enter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdEnterAnimation(baseEl: HTMLElement): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("mdEnterAnimation")(baseEl.asInstanceOf[js.Any]).asInstanceOf[Animation]
}
