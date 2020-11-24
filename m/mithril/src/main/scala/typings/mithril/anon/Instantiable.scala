package typings.mithril.anon

import org.scalablytyped.runtime.Instantiable1
import typings.mithril.mod.CVnode
import typings.mithril.mod.ClassComponent
import typings.mithril.mod._ComponentTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[A]
  extends _ComponentTypes[A, js.Any]
     with Instantiable1[/* vnode */ CVnode[A], ClassComponent[A]]
