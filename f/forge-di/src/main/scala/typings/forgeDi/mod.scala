package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import typings.forgeDi.configMod.Config
import typings.forgeDi.constructorMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def inject[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
  
  @js.native
  class Binding protected ()
    extends typings.forgeDi.bindingMod.default {
    def this(forge: typings.forgeDi.forgeMod.default, name: String) = this()
  }
  
  @js.native
  class ConfigurationError protected ()
    extends typings.forgeDi.configurationErrorMod.default {
    def this(name: String, message: String) = this()
  }
  
  @js.native
  class Context ()
    extends typings.forgeDi.contextMod.default
  
  @js.native
  class Forge ()
    extends typings.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
  
  @js.native
  class FunctionResolver protected ()
    extends typings.forgeDi.functionResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  class InstanceResolver protected ()
    extends typings.forgeDi.instanceResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
  
  @js.native
  object Mode extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeDi.modeMod.Mode with String] = js.native
    
    /* "All" */ val All: typings.forgeDi.modeMod.Mode.All with String = js.native
    
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    
    /* "AtMostOne" */ val AtMostOne: typings.forgeDi.modeMod.Mode.AtMostOne with String = js.native
  }
  
  @js.native
  class RegexInspector ()
    extends typings.forgeDi.regexInspectorMod.RegexInspector
  
  @js.native
  class ResolutionError protected ()
    extends typings.forgeDi.resolutionErrorMod.default {
    def this(name: String, hint: js.Any, context: typings.forgeDi.contextMod.default, message: String) = this()
  }
  
  @js.native
  abstract class Resolver protected ()
    extends typings.forgeDi.resolverMod.default {
    def this(forge: typings.forgeDi.forgeMod.default, binding: typings.forgeDi.bindingMod.default) = this()
  }
  
  @js.native
  class SingletonLifecycle ()
    extends typings.forgeDi.singletonLifecycleMod.default
  
  @js.native
  class TransientLifecycle ()
    extends typings.forgeDi.transientLifecycleMod.TransientLifecycle
  
  @js.native
  class TypeResolver protected ()
    extends typings.forgeDi.typeResolverMod.default {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  class default ()
    extends typings.forgeDi.forgeMod.default {
    def this(config: Config) = this()
  }
}
