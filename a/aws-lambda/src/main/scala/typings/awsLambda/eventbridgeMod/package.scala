package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventbridgeMod {
  
  type EventBridgeHandler[TDetailType /* <: java.lang.String */, TDetail, TResult] = typings.awsLambda.handlerMod.Handler[typings.awsLambda.eventbridgeMod.EventBridgeEvent[TDetailType, TDetail], TResult]
}
