package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesInputMod.GetCampaignActivitiesInput
import typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignActivitiesCommand", JSImport.Namespace)
@js.native
object getCampaignActivitiesCommandMod extends js.Object {
  @js.native
  class GetCampaignActivitiesCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignActivitiesInput, 
          OutputTypesUnion, 
          GetCampaignActivitiesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignActivitiesInput) = this()
    val middlewareStack: MiddlewareStack[GetCampaignActivitiesInput, GetCampaignActivitiesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignActivitiesInput, GetCampaignActivitiesOutput] = js.native
  }
  
}

