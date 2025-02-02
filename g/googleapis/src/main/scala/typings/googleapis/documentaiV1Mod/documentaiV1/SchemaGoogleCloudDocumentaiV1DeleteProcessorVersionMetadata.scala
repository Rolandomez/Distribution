package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DeleteProcessorVersionMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1CommonOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DeleteProcessorVersionMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DeleteProcessorVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DeleteProcessorVersionMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DeleteProcessorVersionMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiV1CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
  }
}
