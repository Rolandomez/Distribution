package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
import typings.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateImportJobCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateImportJobCommand", "CreateImportJobCommand")
  @js.native
  open class CreateImportJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateImportJobInput, 
          OutputTypesUnion, 
          CreateImportJobOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateImportJobInput) = this()
    
    /* CompleteClass */
    override val input: CreateImportJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateImportJobInput, CreateImportJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
  }
}
