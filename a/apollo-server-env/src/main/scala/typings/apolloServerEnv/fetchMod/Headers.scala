package typings.apolloServerEnv.fetchMod

import typings.std.Iterable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "Headers")
@js.native
class Headers ()
  extends Iterable[js.Tuple2[String, String]] {
  def this(init: HeadersInit) = this()
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  def entries(): Iterator[js.Tuple2[String, String], _, js.UndefOr[scala.Nothing]] = js.native
  
  def get(name: String): String | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  def keys(): Iterator[String, _, js.UndefOr[scala.Nothing]] = js.native
  
  def set(name: String, value: String): Unit = js.native
  
  def values(): Iterator[js.Array[String], _, js.UndefOr[scala.Nothing]] = js.native
}
