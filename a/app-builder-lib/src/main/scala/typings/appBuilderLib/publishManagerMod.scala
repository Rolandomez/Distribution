package typings.appBuilderLib

import typings.appBuilderLib.anon.Provider
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.mod.CancellationToken
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import typings.electronPublish.mod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
@js.native
object publishManagerMod extends js.Object {
  
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: String, packager: PlatformPackager[_]): String = js.native
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: Null, packager: PlatformPackager[_]): String = js.native
  
  def createPublisher(
    context: PublishContext,
    version: String,
    publishConfig: PublishConfiguration,
    options: PublishOptions,
    packager: Packager
  ): Publisher | Null = js.native
  
  def getAppUpdatePublishConfiguration(packager: PlatformPackager[_], arch: Arch, errorIfCannot: Boolean): js.Promise[Provider | Null] = js.native
  
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: Null,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: Null,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_]): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: js.Array[PublishConfiguration]): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: js.Array[PublishConfiguration], arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: Null, arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  
  @js.native
  class PublishManager protected () extends PublishContext {
    def this(packager: Packager, publishOptions: PublishOptions) = this()
    def this(packager: Packager, publishOptions: PublishOptions, cancellationToken: CancellationToken) = this()
    
    var artifactCreatedWithoutExplicitPublishConfig: js.Any = js.native
    
    def awaitTasks(): js.Promise[Unit] = js.native
    
    def cancelTasks(): Unit = js.native
    
    var getAppInfo: js.Any = js.native
    
    def getGlobalPublishConfigurations(): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
    
    var getOrCreatePublisher: js.Any = js.native
    
    val isPublish: Boolean = js.native
    
    val nameToPublisher: js.Any = js.native
    
    val packager: js.Any = js.native
    
    val publishOptions: js.Any = js.native
    
    val taskManager: js.Any = js.native
    
    val updateFileWriteTask: js.Any = js.native
  }
}
