package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleDefinitionCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_basePermissions(): BasePermissions
  
  def get_description(): String
  
  def get_name(): String
  
  def get_order(): Double
  
  def set_basePermissions(value: BasePermissions): Unit
  
  def set_description(value: String): Unit
  
  def set_name(value: String): Unit
  
  def set_order(value: Double): Unit
}
object RoleDefinitionCreationInformation {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_basePermissions: () => BasePermissions,
    get_description: () => String,
    get_name: () => String,
    get_order: () => Double,
    get_typeId: () => String,
    set_basePermissions: BasePermissions => Unit,
    set_description: String => Unit,
    set_name: String => Unit,
    set_order: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): RoleDefinitionCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_basePermissions = js.Any.fromFunction0(get_basePermissions), get_description = js.Any.fromFunction0(get_description), get_name = js.Any.fromFunction0(get_name), get_order = js.Any.fromFunction0(get_order), get_typeId = js.Any.fromFunction0(get_typeId), set_basePermissions = js.Any.fromFunction1(set_basePermissions), set_description = js.Any.fromFunction1(set_description), set_name = js.Any.fromFunction1(set_name), set_order = js.Any.fromFunction1(set_order), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[RoleDefinitionCreationInformation]
  }
  
  extension [Self <: RoleDefinitionCreationInformation](x: Self) {
    
    inline def setGet_basePermissions(value: () => BasePermissions): Self = StObject.set(x, "get_basePermissions", js.Any.fromFunction0(value))
    
    inline def setGet_description(value: () => String): Self = StObject.set(x, "get_description", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setGet_order(value: () => Double): Self = StObject.set(x, "get_order", js.Any.fromFunction0(value))
    
    inline def setSet_basePermissions(value: BasePermissions => Unit): Self = StObject.set(x, "set_basePermissions", js.Any.fromFunction1(value))
    
    inline def setSet_description(value: String => Unit): Self = StObject.set(x, "set_description", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_order(value: Double => Unit): Self = StObject.set(x, "set_order", js.Any.fromFunction1(value))
  }
}
