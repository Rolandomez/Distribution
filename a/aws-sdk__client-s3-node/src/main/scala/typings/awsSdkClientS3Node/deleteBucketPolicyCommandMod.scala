package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
import typings.awsSdkClientS3Node.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketPolicyCommand", JSImport.Namespace)
@js.native
object deleteBucketPolicyCommandMod extends js.Object {
  @js.native
  class DeleteBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketPolicyInput, 
          OutputTypesUnion, 
          DeleteBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketPolicyInput) = this()
    val middlewareStack: MiddlewareStack[DeleteBucketPolicyInput, DeleteBucketPolicyOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
  }
  
}

