package typings.rdfExt

import typings.rdfExt.anon.Value
import typings.rdfJs.mod.DefaultGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rdf-ext/lib/DefaultGraph", JSImport.Namespace)
@js.native
object defaultGraphMod extends js.Object {
  
  @js.native
  trait DefaultGraphExt extends DefaultGraph {
    
    def toCanonical(): String = js.native
    
    def toJSON(): Value = js.native
  }
}
