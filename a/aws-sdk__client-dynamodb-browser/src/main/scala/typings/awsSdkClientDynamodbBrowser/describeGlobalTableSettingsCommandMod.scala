package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
import typings.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsOutputMod.DescribeGlobalTableSettingsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableSettingsCommand", JSImport.Namespace)
@js.native
object describeGlobalTableSettingsCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableSettingsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableSettingsInput, 
          OutputTypesUnion, 
          DescribeGlobalTableSettingsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeGlobalTableSettingsInput) = this()
    val middlewareStack: MiddlewareStack[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableSettingsInput, DescribeGlobalTableSettingsOutput] = js.native
  }
  
}

