package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayDestination extends StObject {
  
  /**
    * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the archive.
    */
  var Arn: typings.awsSdk.clientsEventbridgeMod.Arn
  
  /**
    * A list of ARNs for rules to replay events to.
    */
  var FilterArns: js.UndefOr[ReplayDestinationFilters] = js.undefined
}
object ReplayDestination {
  
  inline def apply(Arn: Arn): ReplayDestination = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayDestination] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setFilterArns(value: ReplayDestinationFilters): Self = StObject.set(x, "FilterArns", value.asInstanceOf[js.Any])
    
    inline def setFilterArnsUndefined: Self = StObject.set(x, "FilterArns", js.undefined)
    
    inline def setFilterArnsVarargs(value: Arn*): Self = StObject.set(x, "FilterArns", js.Array(value*))
  }
}
