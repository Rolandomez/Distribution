package typings.googleapis.v1beta2Mod.artifactregistryV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the tag to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
