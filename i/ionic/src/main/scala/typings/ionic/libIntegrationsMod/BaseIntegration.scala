package typings.ionic.libIntegrationsMod

import typings.ionic.definitionsMod.IIntegration
import typings.ionic.definitionsMod.IntegrationName
import typings.ionic.definitionsMod.ProjectIntegration
import typings.ionic.integrationsCapacitorMod.Integration
import typings.ionic.ionicStrings.capacitor
import typings.ionic.ionicStrings.cordova
import typings.ionic.ionicStrings.enterprise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
abstract class BaseIntegration[T /* <: ProjectIntegration */] protected () extends IIntegration[T] {
  def this(e: IntegrationDeps) = this()
  
  val e: IntegrationDeps = js.native
  
  def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
object BaseIntegration extends js.Object {
  
  def createFromName(deps: IntegrationDeps, name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  @JSName("createFromName")
  def createFromName_capacitor(deps: IntegrationDeps, name: capacitor): js.Promise[Integration] = js.native
  @JSName("createFromName")
  def createFromName_cordova(deps: IntegrationDeps, name: cordova): js.Promise[typings.ionic.integrationsCordovaMod.Integration] = js.native
  @JSName("createFromName")
  def createFromName_enterprise(deps: IntegrationDeps, name: enterprise): js.Promise[typings.ionic.integrationsEnterpriseMod.Integration] = js.native
}
