package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismantle extends StObject {
  
  var dismantle: typings.screeps.screepsInts.`2`
}
object Dismantle {
  
  inline def apply(): Dismantle = {
    val __obj = js.Dynamic.literal(dismantle = 2)
    __obj.asInstanceOf[Dismantle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dismantle] (val x: Self) extends AnyVal {
    
    inline def setDismantle(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "dismantle", value.asInstanceOf[js.Any])
  }
}
