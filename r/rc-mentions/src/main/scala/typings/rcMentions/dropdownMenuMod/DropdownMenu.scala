package typings.rcMentions.dropdownMenuMod

import typings.rcMentions.mentionsContextMod.MentionsContextProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * We only use Menu to display the candidate.
  * The focus is controlled by textarea to make accessibility easy.
  */
@js.native
trait DropdownMenu
  extends Component[DropdownMenuProps, js.Object, js.Any] {
  def renderDropdown(hasNotFoundContentActiveIndexSetActiveIndexSelectOptionOnFocusOnBlur: MentionsContextProps): Element = js.native
}

