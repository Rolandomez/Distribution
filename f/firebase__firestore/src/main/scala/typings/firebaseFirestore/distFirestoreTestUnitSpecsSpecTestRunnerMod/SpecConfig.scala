package typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecConfig extends StObject {
  
  /**
    * The maximum number of concurrently-active listens for limbo resolutions.
    * This value must be strictly greater than zero, or undefined to use the
    * default value.
    */
  var maxConcurrentLimboResolutions: js.UndefOr[Double] = js.undefined
  
  /** The number of active clients for this test run. */
  var numClients: Double
  
  /** A boolean to enable / disable eager GC for memory persistence. */
  var useEagerGCForMemory: Boolean
}
object SpecConfig {
  
  inline def apply(numClients: Double, useEagerGCForMemory: Boolean): SpecConfig = {
    val __obj = js.Dynamic.literal(numClients = numClients.asInstanceOf[js.Any], useEagerGCForMemory = useEagerGCForMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxConcurrentLimboResolutions(value: Double): Self = StObject.set(x, "maxConcurrentLimboResolutions", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentLimboResolutionsUndefined: Self = StObject.set(x, "maxConcurrentLimboResolutions", js.undefined)
    
    inline def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
    
    inline def setUseEagerGCForMemory(value: Boolean): Self = StObject.set(x, "useEagerGCForMemory", value.asInstanceOf[js.Any])
  }
}
