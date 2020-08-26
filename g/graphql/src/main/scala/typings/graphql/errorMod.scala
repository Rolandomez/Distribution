package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ASTNode
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.maybeMod.Maybe
import typings.graphql.sourceMod.Source
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class GraphQLError protected ()
    extends typings.graphql.graphQLErrorMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[Maybe[js.Array[ASTNode] | ASTNode]],
      source: js.UndefOr[Maybe[Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[String | Double]]],
      originalError: js.UndefOr[Maybe[Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  def formatError(error: typings.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def locatedError(originalError: typings.graphql.graphQLErrorMod.GraphQLError): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.UndefOr[scala.Nothing],
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: typings.graphql.graphQLErrorMod.GraphQLError, nodes: js.Array[ASTNode]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: typings.graphql.graphQLErrorMod.GraphQLError, nodes: ASTNode): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: ASTNode,
    path: Maybe[js.Array[String | Double]]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.UndefOr[scala.Nothing], path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: ASTNode): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def printError(error: typings.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def syntaxError(source: Source, position: Double, description: String): typings.graphql.graphQLErrorMod.GraphQLError = js.native
}

