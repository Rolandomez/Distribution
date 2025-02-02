package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the parameter to be passed to the resolve api method
  */
trait ResolveParams extends StObject {
  
  /**
    * The Bundle resource in which the reference will be resolved if the reference is a contained one within the bundle.
    */
  var bundle: js.UndefOr[Resource] = js.undefined
  
  /**
    * Represents a reference within a resource. It can be a contained one(within the resource or a bundle) or a remote resource(eg {ResourceType}/{id})
    */
  var reference: Reference
  
  /**
    * The resource in which the reference will be resolved if the reference is a contained one.
    */
  var resource: js.UndefOr[Resource] = js.undefined
}
object ResolveParams {
  
  inline def apply(reference: Reference): ResolveParams = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveParams] (val x: Self) extends AnyVal {
    
    inline def setBundle(value: Resource): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
