package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecSyncOptionsWithBufferEncoding
  extends StObject
     with ExecSyncOptions {
  
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithBufferEncoding: js.UndefOr[buffer_ | Null] = js.undefined
}
object ExecSyncOptionsWithBufferEncoding {
  
  inline def apply(): ExecSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecSyncOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
