package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFpgaImageAttributeResult extends StObject {
  
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typings.awsSdk.clientsEc2Mod.FpgaImageAttribute] = js.undefined
}
object DescribeFpgaImageAttributeResult {
  
  inline def apply(): DescribeFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImageAttributeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFpgaImageAttributeResult] (val x: Self) extends AnyVal {
    
    inline def setFpgaImageAttribute(value: FpgaImageAttribute): Self = StObject.set(x, "FpgaImageAttribute", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageAttributeUndefined: Self = StObject.set(x, "FpgaImageAttribute", js.undefined)
  }
}
