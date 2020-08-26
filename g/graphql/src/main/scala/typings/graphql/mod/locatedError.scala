package typings.graphql.mod

import typings.graphql.astMod.ASTNode
import typings.graphql.maybeMod.Maybe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "locatedError")
@js.native
object locatedError extends js.Object {
  def apply(originalError: typings.graphql.graphQLErrorMod.GraphQLError): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.UndefOr[scala.Nothing],
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: typings.graphql.graphQLErrorMod.GraphQLError, nodes: js.Array[ASTNode]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: typings.graphql.graphQLErrorMod.GraphQLError, nodes: ASTNode): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: ASTNode,
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.UndefOr[scala.Nothing], path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.Array[ASTNode]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: ASTNode): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
}

