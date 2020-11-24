package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object terminalMod {
  
  type Autocompletion = (js.Function2[
    /* inputString */ java.lang.String, 
    /* callback */ typings.terminalKit.terminalMod.Callback[
      java.lang.String | typings.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
    ], 
    scala.Unit
  ]) | (js.Function1[
    /* inputString */ java.lang.String, 
    js.Promise[
      java.lang.String | typings.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
    ]
  ])
  
  type CTerminal = typings.terminalKit.terminalMod.Terminal with (js.Function1[/* repeated */ js.Any, typings.terminalKit.terminalMod.Terminal])
  
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ T, scala.Unit]
  
  type Chainable[T] = T with typings.terminalKit.terminalMod.ChainableInterface[T]
  
  type Palette = js.Array[typings.terminalKit.anon.G]
  
  type Terminal = typings.terminalKit.terminalMod.Impl with typings.nextgenEvents.mod.^ 
}
