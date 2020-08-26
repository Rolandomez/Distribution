package typings.awsSdkProtocolQuery

import typings.awsSdkTypes.unmarshallerMod.BodyParser
import typings.awsSdkTypes.unmarshallerMod.ResponseParser
import typings.awsSdkTypes.unmarshallerMod.ServiceExceptionParser
import typings.awsSdkTypes.unmarshallerMod.StreamCollector
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/protocol-query/build/QueryParser", JSImport.Namespace)
@js.native
object queryParserMod extends js.Object {
  @js.native
  class QueryParser[StreamType] protected () extends ResponseParser[StreamType] {
    def this(
      bodyParser: BodyParser[String],
      parseServiceException: ServiceExceptionParser,
      streamCollector: StreamCollector[StreamType],
      utf8Encoder: Encoder
    ) = this()
    val bodyParser: js.Any = js.native
    val parseServiceException: js.Any = js.native
    var resolveBodyString: js.Any = js.native
    val streamCollector: js.Any = js.native
    var updateMetadata: js.Any = js.native
    val utf8Encoder: js.Any = js.native
  }
  
}

