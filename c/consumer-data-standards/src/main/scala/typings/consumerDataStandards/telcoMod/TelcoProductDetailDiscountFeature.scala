package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductDetailDiscountFeature
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The description of the discount feature
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the discount feature
    */
  var displayName: String
}
object TelcoProductDetailDiscountFeature {
  
  inline def apply(displayName: String): TelcoProductDetailDiscountFeature = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProductDetailDiscountFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductDetailDiscountFeature] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
