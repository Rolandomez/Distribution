package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable2
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionCall
  extends Expression
     with Instantiable2[/* functionName */ String, /* args (repeated) */ js.Any, Expression] {
  
  var _args: js.Array[_] = js.native
  
  var _functionName: String = js.native
  
  var _re: RegExp = js.native
  
  def toAQL(): String = js.native
}
