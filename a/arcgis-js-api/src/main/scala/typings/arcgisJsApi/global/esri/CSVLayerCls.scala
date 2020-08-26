package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.CSVLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.CSVLayer")
@js.native
/**
  * The CSVLayer is a point layer based on a CSV file (.csv, .txt). CSV is a plain-text file format used to represent tabular data, including geographic point features (latitude, longitude). Typically the latitude coordinate is the Y value, and the longitude coordinate is the X value. Features from the CSV file are accessible via the API so you can query features and use them as input to geometry or geoprocessing services.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html)
  */
class CSVLayerCls ()
  extends typings.arcgisJsApi.esri.CSVLayer {
  def this(properties: CSVLayerProperties) = this()
}

