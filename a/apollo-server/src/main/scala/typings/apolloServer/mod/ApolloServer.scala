package typings.apolloServer.mod

import typings.apolloServer.anon.ApolloServerExpressConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "ApolloServer")
@js.native
class ApolloServer protected ()
  extends typings.apolloServerExpress.mod.ApolloServer {
  def this(config: ApolloServerExpressConfig) = this()
  var cors: js.Any = js.native
  var createServerInfo: js.Any = js.native
  var httpServer: js.Any = js.native
  var onHealthCheck: js.Any = js.native
  def applyMiddleware(): Unit = js.native
  def listen(opts: js.Any*): js.Promise[ServerInfo] = js.native
}

