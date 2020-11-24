package typings.openpgp.mod.key

import typings.openpgp.anon.Err
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "key.read")
@js.native
object read extends js.Object {
  
  /**
    * Reads an unarmored OpenPGP key list and returns one or multiple key objects
    * @param data to be parsed
    * @returns result object with key and error arrays
    */
  def apply(data: Uint8Array): js.Promise[Err] = js.native
}
