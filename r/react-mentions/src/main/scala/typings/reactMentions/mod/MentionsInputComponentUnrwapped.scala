package typings.reactMentions.mod

import typings.react.mod.Component
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MentionsInputComponentUnrwapped
  extends Component[MentionsInputProps, js.Object, js.Any] {
  
  /**
    * @deprecated since version 2.4.0. Please use @see MentionsInputProps.inputRef
    */
  var inputRef: js.UndefOr[HTMLInputElement | HTMLTextAreaElement] = js.native
}
