package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fridaGum.InvocationContext because Already inherited */ trait UnixInvocationContext
  extends StObject
     with PortableInvocationContext {
  
  /**
    * Current errno value (you may replace it).
    */
  var errno: Double
}
object UnixInvocationContext {
  
  inline def apply(
    context: CpuContext,
    depth: Double,
    errno: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): UnixInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixInvocationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnixInvocationContext] (val x: Self) extends AnyVal {
    
    inline def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
  }
}
