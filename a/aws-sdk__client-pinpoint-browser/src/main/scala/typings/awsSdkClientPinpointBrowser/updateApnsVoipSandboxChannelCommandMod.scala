package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelInputMod.UpdateApnsVoipSandboxChannelInput
import typings.awsSdkClientPinpointBrowser.typesUpdateApnsVoipSandboxChannelOutputMod.UpdateApnsVoipSandboxChannelOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsVoipSandboxChannelCommand", JSImport.Namespace)
@js.native
object updateApnsVoipSandboxChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsVoipSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsVoipSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsVoipSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsVoipSandboxChannelInput) = this()
    val middlewareStack: MiddlewareStack[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsVoipSandboxChannelInput, UpdateApnsVoipSandboxChannelOutput] = js.native
  }
  
}

