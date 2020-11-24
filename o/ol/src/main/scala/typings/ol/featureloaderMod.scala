package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/featureloader", JSImport.Namespace)
@js.native
object featureloaderMod extends js.Object {
  
  def loadFeaturesXhr(
    url: String,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[
      /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default], 
      Unit
    ]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[
      /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default], 
      Unit
    ]
  ): FeatureLoader = js.native
  
  def setWithCredentials(xhrWithCredentials: Boolean): Unit = js.native
  
  def xhr(url: String, format: default): FeatureLoader = js.native
  def xhr(url: FeatureUrlFunction, format: default): FeatureLoader = js.native
  
  type FeatureLoader = js.ThisFunction3[
    /* this */ typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] | typings.ol.olVectorTileMod.default, 
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projectionMod.default, 
    Unit
  ]
  
  type FeatureUrlFunction = js.Function3[/* p0 */ Extent, /* p1 */ Double, /* p2 */ typings.ol.projectionMod.default, String]
}
