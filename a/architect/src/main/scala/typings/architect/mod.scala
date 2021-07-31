package typings.architect

import typings.architect.architectStrings.error
import typings.architect.architectStrings.plugin
import typings.architect.architectStrings.ready
import typings.architect.architectStrings.service
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("architect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createApp(config: Config): Architect = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(config.asInstanceOf[js.Any]).asInstanceOf[Architect]
  @scala.inline
  def createApp(config: Config, callback: js.Function2[/* err */ Error, /* app */ Architect, Unit]): Architect = (^.asInstanceOf[js.Dynamic].applyDynamic("createApp")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Architect]
  
  @scala.inline
  def loadConfig(configPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def loadConfig(configPath: String, callback: js.Function2[/* err */ Error, /* config */ Config, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Architect extends EventEmitter {
    
    def getService(name: String): js.Any = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_plugin(event: plugin, listener: js.Function1[/* plugin */ Plugin, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* app */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_service(
      event: service,
      listener: js.Function3[/* name */ String, /* service */ Service, /* plugin */ Plugin, Unit]
    ): this.type = js.native
  }
  
  type Config = js.Any
  
  type Plugin = js.Any
  
  type Service = js.Any
}
