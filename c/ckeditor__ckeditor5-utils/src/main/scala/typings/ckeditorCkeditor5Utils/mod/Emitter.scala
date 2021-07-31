package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.anon.Priority
import typings.ckeditorCkeditor5Utils.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emitter extends StObject {
  
  def delegate(events: String*): EmitterMixinDelegateChain = js.native
  
  def fire(eventOrInfo: String, args: js.Any*): js.Any = js.native
  def fire(eventOrInfo: EventInfo[Emitter], args: js.Any*): js.Any = js.native
  
  def listenTo(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: Priority): Unit = js.native
  
  def off(event: String): Unit = js.native
  def off(event: String, callback: js.Function): Unit = js.native
  
  def on(event: String, callback: js.Function): Unit = js.native
  def on(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def once(event: String, callback: js.Function): Unit = js.native
  def once(event: String, callback: js.Function, options: `0`): Unit = js.native
  
  def stopDelegating(): Unit = js.native
  def stopDelegating(event: String): Unit = js.native
  def stopDelegating(event: String, emitter: Emitter): Unit = js.native
  def stopDelegating(event: Unit, emitter: Emitter): Unit = js.native
  
  def stopListening(): Unit = js.native
  def stopListening(emitter: Unit, event: String): Unit = js.native
  def stopListening(emitter: Unit, event: String, callback: js.Function): Unit = js.native
  def stopListening(emitter: Unit, event: Unit, callback: js.Function): Unit = js.native
  def stopListening(emitter: Emitter): Unit = js.native
  def stopListening(emitter: Emitter, event: String): Unit = js.native
  def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
  def stopListening(emitter: Emitter, event: Unit, callback: js.Function): Unit = js.native
}
