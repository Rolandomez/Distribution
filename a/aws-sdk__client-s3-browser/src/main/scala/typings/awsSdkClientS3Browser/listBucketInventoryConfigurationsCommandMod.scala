package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsInputMod.ListBucketInventoryConfigurationsInput
import typings.awsSdkClientS3Browser.typesListBucketInventoryConfigurationsOutputMod.ListBucketInventoryConfigurationsOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/ListBucketInventoryConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketInventoryConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketInventoryConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketInventoryConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketInventoryConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListBucketInventoryConfigurationsInput) = this()
    val middlewareStack: MiddlewareStack[
        ListBucketInventoryConfigurationsInput, 
        ListBucketInventoryConfigurationsOutput, 
        Blob
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketInventoryConfigurationsInput, ListBucketInventoryConfigurationsOutput] = js.native
  }
  
}

