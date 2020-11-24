package typings.jupyterlabCompleter

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
import typings.jupyterlabCompleter.widgetMod.Completer.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Completer protected ()
    extends typings.jupyterlabCompleter.widgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object Completer extends js.Object {
    
    /**
      * The default `IRenderer` instance.
      */
    val defaultRenderer: typings.jupyterlabCompleter.widgetMod.Completer.Renderer = js.native
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer ()
      extends typings.jupyterlabCompleter.widgetMod.Completer.Renderer
  }
  
  @js.native
  class CompleterModel ()
    extends typings.jupyterlabCompleter.modelMod.CompleterModel
  
  @js.native
  class CompletionConnector protected ()
    extends typings.jupyterlabCompleter.connectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: typings.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions) = this()
  }
  
  @js.native
  class CompletionHandler protected ()
    extends typings.jupyterlabCompleter.handlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typings.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions) = this()
  }
  @js.native
  object CompletionHandler extends js.Object {
    
    val ICompletionItemsResponseType: ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    @js.native
    object Msg extends js.Object {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      val InvokeRequest: Message = js.native
    }
  }
  
  @js.native
  class ContextConnector protected ()
    extends typings.jupyterlabCompleter.contextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  @js.native
  object ICompletionManager
    extends TopLevel[Token[typings.jupyterlabCompleter.tokensMod.ICompletionManager]]
  
  @js.native
  class KernelConnector protected ()
    extends typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
