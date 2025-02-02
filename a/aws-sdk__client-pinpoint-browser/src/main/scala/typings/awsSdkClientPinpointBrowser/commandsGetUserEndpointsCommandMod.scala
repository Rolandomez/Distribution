package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
import typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
import typings.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetUserEndpointsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetUserEndpointsCommand", "GetUserEndpointsCommand")
  @js.native
  open class GetUserEndpointsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetUserEndpointsInput, 
          OutputTypesUnion, 
          GetUserEndpointsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetUserEndpointsInput) = this()
    
    /* CompleteClass */
    override val input: GetUserEndpointsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
  }
}
