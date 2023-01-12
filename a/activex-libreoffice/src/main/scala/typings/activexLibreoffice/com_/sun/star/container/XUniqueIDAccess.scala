package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents via a unique ID. */
trait XUniqueIDAccess
  extends StObject
     with XInterface {
  
  /** @returns the element with the specified unique ID. */
  def getByUniqueID(ID: String): Any
  
  /** removes the element with the specified unique ID from this container. */
  def removeByUniqueID(ID: String): Unit
}
object XUniqueIDAccess {
  
  inline def apply(
    acquire: () => Unit,
    getByUniqueID: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByUniqueID: String => Unit
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByUniqueID = js.Any.fromFunction1(getByUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByUniqueID = js.Any.fromFunction1(removeByUniqueID))
    __obj.asInstanceOf[XUniqueIDAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XUniqueIDAccess] (val x: Self) extends AnyVal {
    
    inline def setGetByUniqueID(value: String => Any): Self = StObject.set(x, "getByUniqueID", js.Any.fromFunction1(value))
    
    inline def setRemoveByUniqueID(value: String => Unit): Self = StObject.set(x, "removeByUniqueID", js.Any.fromFunction1(value))
  }
}
