package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.protocolMod.OperationModel
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/commands/PutObjectCommand", JSImport.Namespace)
@js.native
object putObjectCommandMod extends js.Object {
  @js.native
  class PutObjectCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectInput[Blob], 
          OutputTypesUnion, 
          PutObjectOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutObjectInput[Blob]) = this()
    val middlewareStack: MiddlewareStack[PutObjectInput[Blob], PutObjectOutput, Blob] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectInput[Blob], PutObjectOutput] = js.native
  }
  
}

