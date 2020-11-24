package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lexMod {
  
  type LexCallback = typings.awsLambda.handlerMod.Callback[typings.awsLambda.lexMod.LexResult]
  
  type LexHandler = typings.awsLambda.handlerMod.Handler[typings.awsLambda.lexMod.LexEvent, typings.awsLambda.lexMod.LexResult]
  
  type LexSlotDetails = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.anon.OriginalValue]
}
