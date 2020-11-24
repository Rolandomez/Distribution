package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.vmMod.VmManager
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertificateFromStoreInfo")
@js.native
object getCertificateFromStoreInfo extends js.Object {
  
  def apply(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = js.native
}
