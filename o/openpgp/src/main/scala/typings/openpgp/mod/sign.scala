package typings.openpgp.mod

import typings.openpgp.anon.Data
import typings.openpgp.anon.Message
import typings.openpgp.anon.SignOptionsarmorfalsedeta
import typings.openpgp.anon.SignOptionsarmorfalsedetaArmor
import typings.openpgp.anon.SignOptionsarmortrueundef
import typings.openpgp.anon.SignOptionsarmortrueundefArmor
import typings.openpgp.anon.Signature
import typings.openpgp.anon.SignatureSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "sign")
@js.native
object sign extends js.Object {
  def apply(options: SignOptionsarmorfalsedeta): js.Promise[Message] = js.native
  def apply(options: SignOptionsarmorfalsedetaArmor): js.Promise[SignatureSignature] = js.native
  def apply(options: SignOptionsarmortrueundef): js.Promise[Data] = js.native
  def apply(options: SignOptionsarmortrueundefArmor): js.Promise[Signature] = js.native
  def apply(options: SignOptions): js.Promise[SignResult] = js.native
}

