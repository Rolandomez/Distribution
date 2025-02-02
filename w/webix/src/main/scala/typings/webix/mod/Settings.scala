package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  var config: obj = js.native
  
  def define(property: String): Unit = js.native
  def define(property: String, value: Any): Unit = js.native
  def define(property: obj): Unit = js.native
  def define(property: obj, value: Any): Unit = js.native
  
  var name: String = js.native
}
object Settings {
  
  inline def apply: Settings = ^.asInstanceOf[js.Dynamic].selectDynamic("Settings").asInstanceOf[Settings]
}
