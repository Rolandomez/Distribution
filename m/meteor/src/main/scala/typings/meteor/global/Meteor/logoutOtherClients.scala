package typings.meteor.global.Meteor

import typings.meteor.globalError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Meteor.logoutOtherClients")
@js.native
object logoutOtherClients extends js.Object {
  
  def apply(): Unit = js.native
  def apply(
    callback: js.Function1[
      /* error */ js.UndefOr[globalError | typings.meteor.Meteor.Error | typings.meteor.Meteor.TypedError], 
      Unit
    ]
  ): Unit = js.native
}
