package typings.localtunnel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TunnelCallback = js.Function2[
    /* err */ js.UndefOr[java.lang.String], 
    /* tunnel */ js.UndefOr[typings.localtunnel.mod.Tunnel], 
    scala.Unit
  ]
}
