package typings.apolloClient

import typings.apolloClient.anon.ErrorMessage
import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/errors/ApolloError", JSImport.Namespace)
@js.native
object apolloErrorMod extends js.Object {
  @js.native
  class ApolloError protected () extends Error {
    def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: ErrorMessage) = this()
    var extraInfo: js.Any = js.native
    var graphQLErrors: js.Array[GraphQLError] = js.native
    var networkError: Error | Null = js.native
  }
  
  def isApolloError(err: Error): /* is apollo-client.apollo-client/errors/ApolloError.ApolloError */ Boolean = js.native
}

