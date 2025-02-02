package typings.opentok.mod

import typings.opentok.opentokStrings.`1280x720`
import typings.opentok.opentokStrings.`640x480`
import typings.opentok.opentokStrings.auto
import typings.opentok.opentokStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Archive extends StObject {
  
  var createdAt: Double
  
  def delete(callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit
  
  var duration: String
  
  var hasAudio: Boolean
  
  var hasVideo: Boolean
  
  var id: String
  
  var name: String
  
  var outputMode: OutputMode
  
  var partnerId: js.UndefOr[String] = js.undefined
  
  var projectId: js.UndefOr[String] = js.undefined
  
  var reason: String
  
  var resolution: js.UndefOr[`640x480` | `1280x720`] = js.undefined
  
  var sessionId: String
  
  var size: Double
  
  var status: ArchiveStatus
  
  def stop(callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[this.type], Unit]): Unit
  
  var streamMode: js.UndefOr[auto | manual] = js.undefined
  
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  
  var url: String
}
object Archive {
  
  inline def apply(
    createdAt: Double,
    delete: js.Function1[/* error */ js.Error | Null, Unit] => Unit,
    duration: String,
    hasAudio: Boolean,
    hasVideo: Boolean,
    id: String,
    name: String,
    outputMode: OutputMode,
    reason: String,
    sessionId: String,
    size: Double,
    status: ArchiveStatus,
    stop: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit] => Unit,
    url: String
  ): Archive = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), duration = duration.asInstanceOf[js.Any], hasAudio = hasAudio.asInstanceOf[js.Any], hasVideo = hasVideo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputMode = outputMode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stop = js.Any.fromFunction1(stop), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Archive] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: js.Function1[/* error */ js.Error | Null, Unit] => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHasAudio(value: Boolean): Self = StObject.set(x, "hasAudio", value.asInstanceOf[js.Any])
    
    inline def setHasVideo(value: Boolean): Self = StObject.set(x, "hasVideo", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputMode(value: OutputMode): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: `640x480` | `1280x720`): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ArchiveStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStop(value: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def setStreamMode(value: auto | manual): Self = StObject.set(x, "streamMode", value.asInstanceOf[js.Any])
    
    inline def setStreamModeUndefined: Self = StObject.set(x, "streamMode", js.undefined)
    
    inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
