package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersRichReplyMod {
  
  @JSImport("matrix-bot-sdk/lib/helpers/RichReply", "RichReply")
  @js.native
  /* private */ open class RichReply () extends StObject
  /* static members */
  object RichReply {
    
    @JSImport("matrix-bot-sdk/lib/helpers/RichReply", "RichReply")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generates the event content required to reply to the provided event with the
      * provided text.
      * @param {string} roomId the room ID the event being replied to resides in
      * @param {any} event the event to reply to
      * @param {string} withText the plain text to reply with
      * @param {string} withHtml the HTML to reply with
      * @returns {any} the content of the event representing the reply
      */
    inline def createFor(roomId: String, event: Any, withText: String, withHtml: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createFor")(roomId.asInstanceOf[js.Any], event.asInstanceOf[js.Any], withText.asInstanceOf[js.Any], withHtml.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
