package typings.googleapis.appengineV1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsDomainmappingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a managed certificate should be provided by App Engine. If true, a certificate ID must be manaually set in the DomainMapping resource to configure SSL for this domain. If false, a managed certificate will be provisioned and a certificate ID will be automatically populated.
    */
  var noManagedCertificate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the domain creation should override any existing mappings for this domain. By default, overrides are rejected.
    */
  var overrideStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDomainMapping] = js.undefined
}
object ParamsResourceAppsDomainmappingsCreate {
  
  inline def apply(): ParamsResourceAppsDomainmappingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsDomainmappingsCreate]
  }
  
  extension [Self <: ParamsResourceAppsDomainmappingsCreate](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setNoManagedCertificate(value: Boolean): Self = StObject.set(x, "noManagedCertificate", value.asInstanceOf[js.Any])
    
    inline def setNoManagedCertificateUndefined: Self = StObject.set(x, "noManagedCertificate", js.undefined)
    
    inline def setOverrideStrategy(value: String): Self = StObject.set(x, "overrideStrategy", value.asInstanceOf[js.Any])
    
    inline def setOverrideStrategyUndefined: Self = StObject.set(x, "overrideStrategy", js.undefined)
    
    inline def setRequestBody(value: SchemaDomainMapping): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
