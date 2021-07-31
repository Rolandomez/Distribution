package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the material a (tool-) object is working on.
  *
  * Example: The introspection service allows the inspection of an object's properties and methods. The result is represented as {@link
  * XIntrospectionAccess} interface. The inspected object then is the material attached to the introspection tool and an implementation of {@link
  * XIntrospectionAccess} should also support {@link XMaterialHolder} to give access to this material.
  * @see XIntrospectionAccess
  */
trait XMaterialHolder
  extends StObject
     with XInterface {
  
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  val Material: js.Any
  
  /**
    * returns the material that is connected to this (tool-) object
    * @returns the material that is connected to this (tool-) object.
    */
  def getMaterial(): js.Any
}
object XMaterialHolder {
  
  @scala.inline
  def apply(
    Material: js.Any,
    acquire: () => Unit,
    getMaterial: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMaterialHolder = {
    val __obj = js.Dynamic.literal(Material = Material.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMaterial = js.Any.fromFunction0(getMaterial), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMaterialHolder]
  }
  
  @scala.inline
  implicit class XMaterialHolderMutableBuilder[Self <: XMaterialHolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMaterial(value: () => js.Any): Self = StObject.set(x, "getMaterial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaterial(value: js.Any): Self = StObject.set(x, "Material", value.asInstanceOf[js.Any])
  }
}
