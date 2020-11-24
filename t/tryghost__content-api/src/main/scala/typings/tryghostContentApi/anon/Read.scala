package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.Author
import typings.tryghostContentApi.mod.Authors
import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends js.Object {
  
  def browse(): js.Promise[Authors] = js.native
  def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Authors] = js.native
  def browse(options: Params): js.Promise[Authors] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[Authors] = js.native
  @JSName("browse")
  var browse_Original: BrowseFunction[Authors] = js.native
  
  def read(data: Id): js.Promise[Author] = js.native
  def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Author] = js.native
  def read(data: Id, options: Params): js.Promise[Author] = js.native
  def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
  def read(data: Slug): js.Promise[Author] = js.native
  def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Author] = js.native
  def read(data: Slug, options: Params): js.Promise[Author] = js.native
  def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Author] = js.native
}
