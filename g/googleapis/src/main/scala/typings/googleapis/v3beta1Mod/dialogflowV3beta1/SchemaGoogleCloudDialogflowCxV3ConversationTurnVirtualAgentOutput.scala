package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput extends StObject {
  
  /**
    * The Page on which the utterance was spoken. Only name and displayName will be set.
    */
  var currentPage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Page] = js.undefined
  
  /**
    * Required. Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
    */
  var diagnosticInfo: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Output only. If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
    */
  var differences: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestRunDifference]] = js.undefined
  
  /**
    * The session parameters available to the bot at this point.
    */
  var sessionParameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Response error from the agent in the test result. If set, other output is empty.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * The text responses from the agent for the turn.
    */
  var textResponses: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessageText]] = js.undefined
  
  /**
    * The Intent that triggered the response. Only name and displayName will be set.
    */
  var triggeredIntent: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Intent] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutput](x: Self) {
    
    inline def setCurrentPage(value: SchemaGoogleCloudDialogflowCxV3Page): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDiagnosticInfo(value: StringDictionary[Any]): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoNull: Self = StObject.set(x, "diagnosticInfo", null)
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setDifferences(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestRunDifference]): Self = StObject.set(x, "differences", value.asInstanceOf[js.Any])
    
    inline def setDifferencesUndefined: Self = StObject.set(x, "differences", js.undefined)
    
    inline def setDifferencesVarargs(value: SchemaGoogleCloudDialogflowCxV3TestRunDifference*): Self = StObject.set(x, "differences", js.Array(value*))
    
    inline def setSessionParameters(value: StringDictionary[Any]): Self = StObject.set(x, "sessionParameters", value.asInstanceOf[js.Any])
    
    inline def setSessionParametersNull: Self = StObject.set(x, "sessionParameters", null)
    
    inline def setSessionParametersUndefined: Self = StObject.set(x, "sessionParameters", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTextResponses(value: js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessageText]): Self = StObject.set(x, "textResponses", value.asInstanceOf[js.Any])
    
    inline def setTextResponsesUndefined: Self = StObject.set(x, "textResponses", js.undefined)
    
    inline def setTextResponsesVarargs(value: SchemaGoogleCloudDialogflowCxV3ResponseMessageText*): Self = StObject.set(x, "textResponses", js.Array(value*))
    
    inline def setTriggeredIntent(value: SchemaGoogleCloudDialogflowCxV3Intent): Self = StObject.set(x, "triggeredIntent", value.asInstanceOf[js.Any])
    
    inline def setTriggeredIntentUndefined: Self = StObject.set(x, "triggeredIntent", js.undefined)
  }
}
