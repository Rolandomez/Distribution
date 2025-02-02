package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientResolvedConfig
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceInputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod._ServiceOutputTypes
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ListTagsOfResourceInput
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ListTagsOfResourceOutput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsListTagsOfResourceCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/ListTagsOfResourceCommand", "ListTagsOfResourceCommand")
  @js.native
  open class ListTagsOfResourceCommand protected () extends Command[
          ListTagsOfResourceCommandInput, 
          ListTagsOfResourceCommandOutput, 
          DynamoDBClientResolvedConfig, 
          Any, 
          Any
        ] {
    /**
      * @public
      */
    def this(input: ListTagsOfResourceCommandInput) = this()
    
    /**
      * @internal
      */
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig
    ): Handler[ListTagsOfResourceCommandInput, ListTagsOfResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: DynamoDBClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListTagsOfResourceCommandInput, ListTagsOfResourceCommandOutput] = js.native
    
    /**
      * @internal
      */
    /* private */ var serialize: Any = js.native
  }
  /* static members */
  object ListTagsOfResourceCommand {
    
    @JSImport("@aws-sdk/client-dynamodb/dist-types/commands/ListTagsOfResourceCommand", "ListTagsOfResourceCommand")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
  }
  
  type ListTagsOfResourceCommandInput = ListTagsOfResourceInput
  
  trait ListTagsOfResourceCommandOutput
    extends StObject
       with ListTagsOfResourceOutput
       with MetadataBearer
       with _ServiceOutputTypes
  object ListTagsOfResourceCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListTagsOfResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsOfResourceCommandOutput]
    }
  }
}
