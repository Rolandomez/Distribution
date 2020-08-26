package typings.mocBetterSqlite3.mod.MocBetterSqlite3

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.integer.mod.IntClass
import typings.integer.mod.IntLike
import typings.mocBetterSqlite3.anon.TypeofInteger
import typings.mocBetterSqlite3.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConstructor
  extends Instantiable1[/* filename */ String, Database]
     with Instantiable2[/* filename */ String, /* options */ Options, Database] {
  @JSName("Integer")
  var Integer_Original: (js.Function1[/* val */ IntLike, IntClass]) with TypeofInteger = js.native
  var SqliteError: Instantiable2[/* message */ String, /* code */ String, typings.mocBetterSqlite3.mod.SqliteError] = js.native
  def apply(filename: String): Database = js.native
  def apply(filename: String, options: Options): Database = js.native
  def Integer(`val`: IntLike): IntClass = js.native
}

