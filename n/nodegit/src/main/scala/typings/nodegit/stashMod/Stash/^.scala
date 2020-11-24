package typings.nodegit.stashMod.Stash

import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import typings.nodegit.stashMod.StashApplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/stash", "Stash")
@js.native
object ^ extends js.Object {
  
  @JSName("apply")
  def apply(repo: Repository, index: Double): js.Promise[Double] = js.native
  @JSName("apply")
  def apply(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
  
  def drop(repo: Repository, index: Double): js.Promise[Double] = js.native
  
  def foreach(repo: Repository): js.Promise[Double] = js.native
  def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
  
  def pop(repo: Repository, index: Double): js.Promise[Double] = js.native
  def pop(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
  
  def save(repo: Repository, stasher: Signature, message: String, flags: Double): js.Promise[Oid] = js.native
}
