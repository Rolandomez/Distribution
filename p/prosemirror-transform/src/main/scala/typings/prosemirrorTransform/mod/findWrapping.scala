package typings.prosemirrorTransform.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeRange
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.anon.Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "findWrapping")
@js.native
object findWrapping extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S]): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: js.UndefOr[scala.Nothing],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: StringDictionary[js.Any],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[Attrs[S]] | Null] = js.native
}
