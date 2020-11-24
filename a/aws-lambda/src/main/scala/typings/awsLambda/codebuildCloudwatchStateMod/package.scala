package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codebuildCloudwatchStateMod {
  
  type CodeBuildCloudWatchStateHandler = typings.awsLambda.eventbridgeMod.EventBridgeHandler[
    typings.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`, 
    typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildStateEventDetail, 
    scala.Unit
  ]
}
