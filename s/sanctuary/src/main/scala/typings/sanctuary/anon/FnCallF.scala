package typings.sanctuary.anon

import typings.sanctuary.mod.ChainRec
import typings.sanctuary.mod.Either
import typings.sanctuary.mod.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallF extends js.Object {
  
  def apply[A, B](f: Fn[A, ChainRec[Either[A, B]]]): js.Function1[/* x */ A, ChainRec[B]] = js.native
}
