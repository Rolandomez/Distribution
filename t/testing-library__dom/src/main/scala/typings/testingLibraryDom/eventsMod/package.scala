package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventsMod {
  
  type CreateFunction = js.Function4[
    /* eventName */ java.lang.String, 
    /* node */ typings.std.Document | typings.std.Element | typings.std.Window | typings.std.Node, 
    /* init */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[typings.testingLibraryDom.anon.DefaultInit], 
    typings.std.Event
  ]
  
  type FireFunction = js.Function2[
    /* element */ typings.std.Document | typings.std.Element | typings.std.Window | typings.std.Node, 
    /* event */ typings.std.Event, 
    scala.Boolean
  ]
}
