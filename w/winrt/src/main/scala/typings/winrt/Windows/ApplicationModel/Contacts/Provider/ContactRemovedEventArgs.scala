package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactRemovedEventArgs extends IContactRemovedEventArgs

object ContactRemovedEventArgs {
  @scala.inline
  def apply(id: String): ContactRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactRemovedEventArgs]
  }
}

