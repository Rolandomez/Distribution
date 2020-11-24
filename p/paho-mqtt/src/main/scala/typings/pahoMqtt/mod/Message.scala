package typings.pahoMqtt.mod

import typings.pahoMqtt.mod.global.Paho.MQTT.TypedArray
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An application message, sent or received.
  */
@JSImport("paho-mqtt", "Message")
@js.native
class Message protected ()
  extends typings.pahoMqtt.mod.global.Paho.MQTT.Message {
  /**
    * @param payload The message data to be sent.
    */
  def this(payload: String) = this()
  def this(payload: TypedArray) = this()
  def this(payload: ArrayBuffer) = this()
}
