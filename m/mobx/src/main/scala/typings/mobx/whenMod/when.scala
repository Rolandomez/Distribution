package typings.mobx.whenMod

import typings.mobx.anon.Promisevoidcancelvoid
import typings.mobx.reactionMod.IReactionDisposer
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/api/when", "when")
@js.native
object when extends js.Object {
  def apply(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = js.native
}

