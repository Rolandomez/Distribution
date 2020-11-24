package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends DatabaseConnection {
  
  def commitAsync(): typings.bluebird.mod.^[Unit] = js.native
  
  def rollback(): Unit = js.native
}
