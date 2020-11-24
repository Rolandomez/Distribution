package typings.geolib

import typings.geolib.anon.Altitude
import typings.geolib.anon.AltitudeLatitude
import typings.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
@js.native
object getCoordinateKeysMod extends js.Object {
  
  def default(point: GeolibInputCoordinates): AltitudeLatitude = js.native
  def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = js.native
}
