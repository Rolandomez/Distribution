package typings.luminoMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MessageHook = typings.luminoMessaging.mod.IMessageHook | (js.Function2[
    /* handler */ typings.luminoMessaging.mod.IMessageHandler, 
    /* msg */ typings.luminoMessaging.mod.Message, 
    scala.Boolean
  ])
}
