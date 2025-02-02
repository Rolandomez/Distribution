package typings.domWebcodecs

import typings.std.EncodedVideoChunkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedVideoChunk extends StObject {
  
  val byteLength: Double
  
  def copyTo(
    destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any
  ): Unit
  
  val duration: Double | Null
  
  val timestamp: Double
  
  val `type`: EncodedVideoChunkType
}
object EncodedVideoChunk {
  
  inline def apply(
    byteLength: Double,
    copyTo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any => Unit,
    timestamp: Double,
    `type`: EncodedVideoChunkType
  ): EncodedVideoChunk = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), timestamp = timestamp.asInstanceOf[js.Any], duration = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedVideoChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedVideoChunk] (val x: Self) extends AnyVal {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setCopyTo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowSharedBufferSource */ Any => Unit
    ): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncodedVideoChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
