package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1BuildDetails extends StObject {
  
  /**
    * Required. The actual provenance for the build.
    */
  var provenance: js.UndefOr[SchemaBuildProvenance] = js.undefined
  
  /**
    * Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification. The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes.
    */
  var provenanceBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1beta1BuildDetails {
  
  inline def apply(): SchemaGrafeasV1beta1BuildDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1BuildDetails]
  }
  
  extension [Self <: SchemaGrafeasV1beta1BuildDetails](x: Self) {
    
    inline def setProvenance(value: SchemaBuildProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceBytes(value: String): Self = StObject.set(x, "provenanceBytes", value.asInstanceOf[js.Any])
    
    inline def setProvenanceBytesNull: Self = StObject.set(x, "provenanceBytes", null)
    
    inline def setProvenanceBytesUndefined: Self = StObject.set(x, "provenanceBytes", js.undefined)
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
  }
}
