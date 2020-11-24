package typings.requestPromiseNative.errorsMod

import org.scalablytyped.runtime.Instantiable4
import typings.requestPromiseNative.mod.FullResponse
import typings.requestPromiseNative.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodeErrorConstructor
  extends Error
     with Instantiable4[
      /* statusCode */ Double, 
      /* body */ js.Any, 
      /* options */ Options, 
      /* response */ FullResponse, 
      StatusCodeError
    ] {
  
  def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
}
