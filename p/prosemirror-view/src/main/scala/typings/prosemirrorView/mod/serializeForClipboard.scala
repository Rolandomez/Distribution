package typings.prosemirrorView.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.anon.Dom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-view", "__serializeForClipboard")
@js.native
object serializeForClipboard extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], slice: Slice[S]): Dom = js.native
}
