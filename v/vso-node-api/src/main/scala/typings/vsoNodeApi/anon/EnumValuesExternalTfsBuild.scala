package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesExternalTfsBuild extends StObject {
  
  var enumValues: ExternalTfsBuild
}
object EnumValuesExternalTfsBuild {
  
  inline def apply(enumValues: ExternalTfsBuild): EnumValuesExternalTfsBuild = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesExternalTfsBuild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesExternalTfsBuild] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: ExternalTfsBuild): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
