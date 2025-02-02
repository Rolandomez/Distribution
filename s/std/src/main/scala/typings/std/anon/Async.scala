package typings.std.anon

import typings.std.stdBooleans.`false`
import typings.std.stdStrings.`not-equal`
import typings.std.stdStrings.`timed-out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Async extends StObject {
  
  /* standard es2022.sharedmemory */
  var async: `false`
  
  /* standard es2022.sharedmemory */
  var value: `not-equal` | `timed-out`
}
object Async {
  
  inline def apply(value: `not-equal` | `timed-out`): Async = {
    val __obj = js.Dynamic.literal(async = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `not-equal` | `timed-out`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
