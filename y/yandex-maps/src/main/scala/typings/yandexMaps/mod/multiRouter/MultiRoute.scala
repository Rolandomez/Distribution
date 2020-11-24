package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.anon.Dictindex
import typings.yandexMaps.mod.GeoObjectCollection
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import typings.yandexMaps.mod.IMultiRouteModelJson
import typings.yandexMaps.mod.multiRouter.driving.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.MultiRoute")
@js.native
class MultiRoute protected () extends IGeoObject[IGeometry] {
  def this(model: IMultiRouteModelJson) = this()
  def this(model: MultiRouteModel) = this()
  def this(model: IMultiRouteModelJson, options: Dictindex) = this()
  def this(model: MultiRouteModel, options: Dictindex) = this()
  
  var editor: EditorAddon = js.native
  
  def getActiveRoute(): Route | typings.yandexMaps.mod.multiRouter.masstransit.Route | Null = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getRoutes(): GeoObjectCollection = js.native
  
  def getViaPoints(): GeoObjectCollection = js.native
  
  def getWayPoints(): GeoObjectCollection = js.native
  
  var model: MultiRouteModel = js.native
  
  def setActiveRoute(): Unit = js.native
  def setActiveRoute(route: Route): Unit = js.native
  def setActiveRoute(route: typings.yandexMaps.mod.multiRouter.masstransit.Route): Unit = js.native
}
