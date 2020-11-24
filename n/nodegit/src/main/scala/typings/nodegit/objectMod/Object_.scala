package typings.nodegit.objectMod

import typings.nodegit.bufMod.Buf
import typings.nodegit.objectMod.Object.TYPE
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/object", "Object")
@js.native
class Object_ () extends js.Object {
  
  def dup(): js.Promise[Object] = js.native
  
  def free(): Unit = js.native
  
  def id(): Oid = js.native
  
  def lookupByPath(path: String, `type`: TYPE): js.Promise[Object] = js.native
  
  def owner(): Repository = js.native
  
  def peel(targetType: Double): js.Promise[Object] = js.native
  
  def shortId(): js.Promise[Buf] = js.native
  
  def `type`(): Double = js.native
}
