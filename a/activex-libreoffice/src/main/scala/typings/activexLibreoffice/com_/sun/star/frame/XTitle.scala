package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** an interface representing an entity with a modifyable title. */
trait XTitle
  extends StObject
     with XInterface {
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: String
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): String
  
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: String): Unit
}
object XTitle {
  
  inline def apply(
    Title: String,
    acquire: () => Unit,
    getTitle: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XTitle]
  }
  
  extension [Self <: XTitle](x: Self) {
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
