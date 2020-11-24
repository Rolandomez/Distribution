package typings.sipJs.coreMod

import typings.sipJs.bodyMod.Body
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected ()
  extends typings.sipJs.messagesMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.UndefOr[scala.Nothing],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.UndefOr[scala.Nothing],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
}
/* static members */
@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  
  var makeNameAddrHeader: js.Any = js.native
}
