package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.OptionMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devToolsPluginMod extends Shortcut {
  
  @JSImport("@interactjs/dev-tools/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  @js.native
  sealed trait CheckName extends StObject
  @JSImport("@interactjs/dev-tools/plugin", "CheckName")
  @js.native
  object CheckName extends StObject {
    
    @js.native
    sealed trait boxSizing
      extends StObject
         with CheckName
    
    @js.native
    sealed trait noListeners
      extends StObject
         with CheckName
    
    @js.native
    sealed trait touchAction
      extends StObject
         with CheckName
  }
  
  trait Check extends StObject {
    
    def getInfo(interaction: Interaction[ActionName]): js.Array[Any]
    
    var name: CheckName
    
    def perform(interaction: Interaction[ActionName]): Boolean
    
    var text: String
  }
  object Check {
    
    inline def apply(
      getInfo: Interaction[ActionName] => js.Array[Any],
      name: CheckName,
      perform: Interaction[ActionName] => Boolean,
      text: String
    ): Check = {
      val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), name = name.asInstanceOf[js.Any], perform = js.Any.fromFunction1(perform), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Check]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
      
      inline def setGetInfo(value: Interaction[ActionName] => js.Array[Any]): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
      
      inline def setName(value: CheckName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPerform(value: Interaction[ActionName] => Boolean): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait DevToolsOptions extends StObject {
    
    var ignore: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckName * / any ]:? boolean} */ js.Any
  }
  object DevToolsOptions {
    
    inline def apply(
      ignore: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckName * / any ]:? boolean} */ js.Any
    ): DevToolsOptions = {
      val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
      __obj.asInstanceOf[DevToolsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DevToolsOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnore(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckName * / any ]:? boolean} */ js.Any
      ): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    def error(args: Any*): Unit
    
    def log(args: Any*): Unit
    
    def warn(args: Any*): Unit
  }
  object Logger {
    
    inline def apply(
      error: /* repeated */ Any => Unit,
      log: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `devToolsPluginMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractStaticAugmentingMod {
    
    trait InteractStatic extends StObject
  }
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    trait Interactable extends StObject {
      
      def devTools(): DevToolsOptions
      def devTools(options: DevToolsOptions): Any
      @JSName("devTools")
      var devTools_Original: OptionMethod[DevToolsOptions]
    }
    object Interactable {
      
      inline def apply(devTools: OptionMethod[DevToolsOptions]): Interactable = {
        val __obj = js.Dynamic.literal(devTools = devTools.asInstanceOf[js.Any])
        __obj.asInstanceOf[Interactable]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Interactable] (val x: Self) extends AnyVal {
        
        inline def setDevTools(value: OptionMethod[DevToolsOptions]): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait BaseDefaults extends StObject {
      
      var devTools: js.UndefOr[DevToolsOptions] = js.undefined
    }
    object BaseDefaults {
      
      inline def apply(): BaseDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseDefaults]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: BaseDefaults] (val x: Self) extends AnyVal {
        
        inline def setDevTools(value: DevToolsOptions): Self = StObject.set(x, "devTools", value.asInstanceOf[js.Any])
        
        inline def setDevToolsUndefined: Self = StObject.set(x, "devTools", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var logger: Logger
    }
    object Scope {
      
      inline def apply(logger: Logger): Scope = {
        val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
        
        inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
