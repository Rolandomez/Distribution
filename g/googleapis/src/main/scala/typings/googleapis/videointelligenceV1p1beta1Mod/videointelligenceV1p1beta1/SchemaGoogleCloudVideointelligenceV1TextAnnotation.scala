package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1TextAnnotation extends StObject {
  
  /**
    * All video segments where OCR detected text appears.
    */
  var segments: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1TextSegment]] = js.undefined
  
  /**
    * The detected text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Feature version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1TextAnnotation {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1TextAnnotation](x: Self) {
    
    inline def setSegments(value: js.Array[SchemaGoogleCloudVideointelligenceV1TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SchemaGoogleCloudVideointelligenceV1TextSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
