package typings.graphql.definitionMod

import typings.graphql.anon.GraphQLInputObjectTypeCon
import typings.graphql.anon.ReadonlyGraphQLInputObjec
import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type/definition", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends _GraphQLInputType
     with _GraphQLNamedType
     with _GraphQLNullableType
     with _GraphQLType {
  def this(config: ReadonlyGraphQLInputObjec) = this()
  var astNode: Maybe[InputObjectTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[InputObjectTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  def getFields(): GraphQLInputFieldMap = js.native
  def inspect(): String = js.native
  def toConfig(): GraphQLInputObjectTypeCon = js.native
  def toJSON(): String = js.native
}

