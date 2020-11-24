package typings.instagramPrivateApi.requestMod

import typings.instagramPrivateApi.anon.AcceptEncoding
import typings.instagramPrivateApi.anon.PartialAttemptOptionsany
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgResponse
import typings.instagramPrivateApi.errorsMod.IgClientError
import typings.request.mod.Options
import typings.rxjs.mod.Subject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
class Request protected () extends js.Object {
  def this(client: IgApiClient) = this()
  
  var attemptOptions: PartialAttemptOptionsany = js.native
  
  var client: js.Any = js.native
  
  var defaults: Partial[Options] = js.native
  
  @JSName("end$")
  var end$: Subject[_] = js.native
  
  @JSName("error$")
  var error$: Subject[IgClientError] = js.native
  
  /* protected */ def faultTolerantRequest(options: Options): js.Promise[_] = js.native
  
  def getDefaultHeaders(): AcceptEncoding = js.native
  
  var handleResponseError: js.Any = js.native
  
  def send[T](userOptions: Options): js.Promise[IgResponse[T]] = js.native
  def send[T](userOptions: Options, onlyCheckHttpStatus: Boolean): js.Promise[IgResponse[T]] = js.native
  
  def sign(payload: Payload): SignedPost = js.native
  
  def signature(data: String): String = js.native
  
  var updateState: js.Any = js.native
  
  def userBreadcrumb(size: Double): String = js.native
}
/* static members */
@JSImport("instagram-private-api/dist/core/request", "Request")
@js.native
object Request extends js.Object {
  
  var requestDebug: js.Any = js.native
  
  var requestTransform: js.Any = js.native
}
