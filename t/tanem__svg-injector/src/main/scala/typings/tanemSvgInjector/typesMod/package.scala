package typings.tanemSvgInjector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AfterAll = js.Function1[/* elementsLoaded */ scala.Double, scala.Unit]
  
  type BeforeEach = js.Function1[/* svg */ typings.std.SVGElement, scala.Unit]
  
  type Errback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* svg */ js.UndefOr[typings.std.SVGElement], 
    scala.Unit
  ]
}
