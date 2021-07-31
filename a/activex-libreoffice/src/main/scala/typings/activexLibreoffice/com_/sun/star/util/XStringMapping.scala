package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a mapping from `string` to `string` */
trait XStringMapping
  extends StObject
     with XInterface {
  
  /** provides a mapping for a given sequence of strings to a sequence of belonging strings. */
  def mapStrings(Parameter: js.Array[SeqEquiv[String]]): Boolean
}
object XStringMapping {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    mapStrings: js.Array[SeqEquiv[String]] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStringMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mapStrings = js.Any.fromFunction1(mapStrings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStringMapping]
  }
  
  @scala.inline
  implicit class XStringMappingMutableBuilder[Self <: XStringMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapStrings(value: js.Array[SeqEquiv[String]] => Boolean): Self = StObject.set(x, "mapStrings", js.Any.fromFunction1(value))
  }
}
