package typings.angularHttp

import typings.angularHttp.enumsMod.RequestMethod
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/http_utils", JSImport.Namespace)
@js.native
object httpUtilsMod extends js.Object {
  
  def getResponseURL(xhr: js.Any): String | Null = js.native
  
  def isSuccess(status: Double): Boolean = js.native
  
  def normalizeMethodName(method: String): RequestMethod = js.native
  def normalizeMethodName(method: RequestMethod): RequestMethod = js.native
  
  def stringToArrayBuffer(input: String): ArrayBuffer = js.native
  
  def stringToArrayBuffer8(input: String): ArrayBuffer = js.native
}
