package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the resource. You can get this from the response to any request to the resource.
    */
  var ResourceArn: string
  
  /**
    * A comma-separated list of the tag keys to remove from the resource.
    */
  var TagKeys: listOfString
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: string, TagKeys: listOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: listOfString): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: string*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
