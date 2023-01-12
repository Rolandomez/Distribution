package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemeralStorage extends StObject {
  
  /**
    * The size of the function’s /tmp directory.
    */
  var Size: EphemeralStorageSize
}
object EphemeralStorage {
  
  inline def apply(Size: EphemeralStorageSize): EphemeralStorage = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EphemeralStorage] (val x: Self) extends AnyVal {
    
    inline def setSize(value: EphemeralStorageSize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
