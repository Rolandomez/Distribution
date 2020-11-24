package typings.nodemailer.fetchMod

import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableResponse extends Writable {
  
  var headers: IncomingHttpHeaders = js.native
  
  var statusCode: Double = js.native
}
