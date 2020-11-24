package typings.crc32

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crc-32", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def bstr(data: String): Double = js.native
  def bstr(data: String, seed: Double): Double = js.native
  
  def buf(data: js.Array[Double]): Double = js.native
  def buf(data: js.Array[Double], seed: Double): Double = js.native
  def buf(data: Uint8Array): Double = js.native
  def buf(data: Uint8Array, seed: Double): Double = js.native
  
  def str(data: String): Double = js.native
  def str(data: String, seed: Double): Double = js.native
  
  val version: String = js.native
}
