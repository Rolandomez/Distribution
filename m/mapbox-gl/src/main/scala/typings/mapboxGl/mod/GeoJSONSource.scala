package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "GeoJSONSource")
@js.native
class GeoJSONSource ()
  extends StObject
     with GeoJSONSourceRaw
     with AnySourceImpl {
  def this(options: GeoJSONSourceOptions) = this()
  
  def getClusterChildren(
    clusterId: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  
  def getClusterExpansionZoom(clusterId: Double, callback: js.Function2[/* error */ js.Any, /* zoom */ Double, Unit]): this.type = js.native
  
  def getClusterLeaves(
    cluserId: Double,
    limit: Double,
    offset: Double,
    callback: js.Function2[
      /* error */ js.Any, 
      /* features */ js.Array[Feature[Geometry, GeoJsonProperties]], 
      Unit
    ]
  ): this.type = js.native
  
  def setData(data: String): this.type = js.native
  def setData(data: Feature[Geometry, GeoJsonProperties]): this.type = js.native
  def setData(data: FeatureCollection[Geometry, GeoJsonProperties]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  var type_GeoJSONSourceRaw: geojson = js.native
}
