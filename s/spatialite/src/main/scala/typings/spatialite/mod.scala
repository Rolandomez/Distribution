package typings.spatialite

import typings.sqlite3.mod.sqlite3
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("spatialite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val OPEN_CREATE: Double = js.native
  
  val OPEN_READONLY: Double = js.native
  
  val OPEN_READWRITE: Double = js.native
  
  def verbose(): sqlite3 = js.native
  
  @js.native
  class Database ()
    extends typings.sqlite3.mod.Database {
    
    def spatialite(cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  @js.native
  class Statement ()
    extends typings.sqlite3.mod.Statement
  
  @js.native
  object cached extends js.Object {
    
    def Database(filename: String): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: js.UndefOr[scala.Nothing],
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
    def Database(filename: String, mode: Double): typings.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typings.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typings.sqlite3.mod.Database = js.native
  }
}
