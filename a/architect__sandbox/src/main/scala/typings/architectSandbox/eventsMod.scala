package typings.architectSandbox

import typings.architectSandbox.sharedMod.Callback
import typings.architectSandbox.sharedMod.StartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  object events {
    
    @JSImport("@architect/sandbox/events", "events")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Shuts down anything started by sandbox.events.start(). Invokes callback once shut down, or returns a promise if callback is falsy.
      */
    inline def end(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[js.Promise[String]]
    inline def end(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("end")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Starts up a local event bus, enabling interprocess communication for @queues and @events functions (if defined in your Architect project manifest).
      *
      * Invokes callback once everything is ready, or returns a promise if callback is falsy.
      */
    inline def start(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[String]]
    inline def start(opts: Unit, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def start(opts: StartOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def start(opts: StartOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
