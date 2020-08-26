package typings.graphqlQueryComplexity.queryComplexityMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLUnionType
import typings.graphql.mod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryComplexity extends js.Object {
  var OperationDefinition: js.Object = js.native
  var complexity: Double = js.native
  var context: ValidationContext = js.native
  var estimators: js.Array[ComplexityEstimator] = js.native
  var includeDirectiveDef: GraphQLDirective = js.native
  var options: QueryComplexityOptions = js.native
  var skipDirectiveDef: GraphQLDirective = js.native
  def createError(): GraphQLError = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _]): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLObjectType[_, _], complexity: Double): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FieldNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLObjectType[_, _]): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLObjectType[_, _], complexity: Double): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: FragmentDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLObjectType[_, _]): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLObjectType[_, _], complexity: Double): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: InlineFragmentNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLInterfaceType, complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLObjectType[_, _]): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLObjectType[_, _], complexity: Double): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType): Double = js.native
  def nodeComplexity(node: OperationDefinitionNode, typeDef: GraphQLUnionType, complexity: Double): Double = js.native
  def onOperationDefinitionEnter(operation: OperationDefinitionNode): Unit = js.native
  def onOperationDefinitionLeave(operation: OperationDefinitionNode): js.UndefOr[GraphQLError] = js.native
}

