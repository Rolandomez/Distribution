package typings.tablestore.anon

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterModify extends StObject {
  
  var AfterModify: `2`
  
  var NONE: `0`
  
  var Primarykey: `1`
}
object AfterModify {
  
  inline def apply(): AfterModify = {
    val __obj = js.Dynamic.literal(AfterModify = 2, NONE = 0, Primarykey = 1)
    __obj.asInstanceOf[AfterModify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterModify] (val x: Self) extends AnyVal {
    
    inline def setAfterModify(value: `2`): Self = StObject.set(x, "AfterModify", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPrimarykey(value: `1`): Self = StObject.set(x, "Primarykey", value.asInstanceOf[js.Any])
  }
}
