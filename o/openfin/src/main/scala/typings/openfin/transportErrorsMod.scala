package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportErrorsMod {
  
  @JSImport("openfin/_v2/transport/transport-errors", "DisconnectedError")
  @js.native
  open class DisconnectedError protected ()
    extends StObject
       with Error {
    def this(readyState: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var readyState: Double = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "DuplicateCorrelationError")
  @js.native
  open class DuplicateCorrelationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NoAckError")
  @js.native
  open class NoAckError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotImplementedError")
  @js.native
  open class NotImplementedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotSupportedError")
  @js.native
  open class NotSupportedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "RuntimeError")
  @js.native
  open class RuntimeError protected ()
    extends StObject
       with Error {
    def this(data: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "UnexpectedActionError")
  @js.native
  open class UnexpectedActionError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
