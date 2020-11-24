package typings.createSubscription

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Subscription[S, T] = typings.react.mod.ComponentClass[
    typings.createSubscription.mod.SubscriptionProps[S, T], 
    typings.react.mod.ComponentState
  ]
  
  type Unsubscribe = js.Function0[js.Any]
}
