package typings.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Tree")
@js.native
class Tree ()
  extends typings.nodegit.treeMod.Tree
/* static members */
@JSImport("nodegit", "Tree")
@js.native
object Tree extends js.Object {
  
  def entryCmp(tree1: typings.nodegit.treeEntryMod.TreeEntry, tree2: typings.nodegit.treeEntryMod.TreeEntry): Double = js.native
  
  def entryDup(dest: typings.nodegit.treeEntryMod.TreeEntry, source: typings.nodegit.treeEntryMod.TreeEntry): Double = js.native
  
  /**
    * Retrieves the tree pointed to by the oid
    */
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String, callback: js.Function): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.oidMod.Oid,
    callback: js.Function
  ): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  def lookup(
    repo: typings.nodegit.repositoryMod.Repository,
    id: typings.nodegit.treeMod.Tree,
    callback: js.Function
  ): js.Promise[typings.nodegit.treeMod.Tree] = js.native
  
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.treeMod.Tree] = js.native
}
