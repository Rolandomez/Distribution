package typings.webix.webix.ui

import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fieldset
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("config")
  var config_fieldset: fieldsetConfig = js.native
  
  def getBody(): obj = js.native
  
  def resizeChildren(): Unit = js.native
}
