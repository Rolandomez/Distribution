package typings.jose.mod.JWK

import org.scalablytyped.runtime.TopLevel
import typings.jose.joseStrings.embedded
import typings.jose.mod.keyOperation
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedJWK extends js.Object {
  
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
  
  val `type`: embedded = js.native
}
@JSImport("jose", "JWK.EmbeddedJWK")
@js.native
object EmbeddedJWK extends TopLevel[EmbeddedJWK]
