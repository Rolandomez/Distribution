package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloneContext extends StObject {
  
  /**
    * The name of the allocated ip range for the private ip CloudSQL instance. For example: "google-managed-services-default". If set, the cloned instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?. Reserved for future use.
    */
  var allocatedIpRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Binary log coordinates, if specified, identify the position up to which the source instance is cloned. If not specified, the source instance is cloned up to the most recent binary log coordinates.
    */
  var binLogCoordinates: js.UndefOr[SchemaBinLogCoordinates] = js.undefined
  
  /**
    * Name of the Cloud SQL instance to be created as a clone.
    */
  var destinationInstanceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#cloneContext`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var pitrTimestampMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp, if specified, identifies the time to which the source instance is cloned.
    */
  var pointInTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloneContext {
  
  inline def apply(): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneContext]
  }
  
  extension [Self <: SchemaCloneContext](x: Self) {
    
    inline def setAllocatedIpRange(value: String): Self = StObject.set(x, "allocatedIpRange", value.asInstanceOf[js.Any])
    
    inline def setAllocatedIpRangeNull: Self = StObject.set(x, "allocatedIpRange", null)
    
    inline def setAllocatedIpRangeUndefined: Self = StObject.set(x, "allocatedIpRange", js.undefined)
    
    inline def setBinLogCoordinates(value: SchemaBinLogCoordinates): Self = StObject.set(x, "binLogCoordinates", value.asInstanceOf[js.Any])
    
    inline def setBinLogCoordinatesUndefined: Self = StObject.set(x, "binLogCoordinates", js.undefined)
    
    inline def setDestinationInstanceName(value: String): Self = StObject.set(x, "destinationInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDestinationInstanceNameNull: Self = StObject.set(x, "destinationInstanceName", null)
    
    inline def setDestinationInstanceNameUndefined: Self = StObject.set(x, "destinationInstanceName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPitrTimestampMs(value: String): Self = StObject.set(x, "pitrTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setPitrTimestampMsNull: Self = StObject.set(x, "pitrTimestampMs", null)
    
    inline def setPitrTimestampMsUndefined: Self = StObject.set(x, "pitrTimestampMs", js.undefined)
    
    inline def setPointInTime(value: String): Self = StObject.set(x, "pointInTime", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeNull: Self = StObject.set(x, "pointInTime", null)
    
    inline def setPointInTimeUndefined: Self = StObject.set(x, "pointInTime", js.undefined)
  }
}
