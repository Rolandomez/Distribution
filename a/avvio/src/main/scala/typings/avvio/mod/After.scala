package typings.avvio.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Avvio methods
@js.native
trait After[I, C] extends js.Object {
  
  def apply(fn: js.Function1[/* err */ Error, Unit]): C = js.native
  def apply(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): C = js.native
  def apply(fn: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): C = js.native
}
