package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gapi {
  
  type CallbackOrConfig = typings.gapi.gapi.LoadConfig | typings.gapi.gapi.LoadCallback
  
  type LoadCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
}
