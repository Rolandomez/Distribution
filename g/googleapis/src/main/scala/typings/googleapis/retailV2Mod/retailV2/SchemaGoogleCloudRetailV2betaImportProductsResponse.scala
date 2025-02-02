package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaImportProductsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Echoes the destination for the complete errors in the request if set.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaImportErrorsConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2betaImportProductsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaImportProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaImportProductsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaImportProductsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2betaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
  }
}
