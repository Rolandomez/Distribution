package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by documents that can create summaries of their {@link DrawPages} .
  * @deprecated Deprecated
  */
trait XDrawPageSummarizer
  extends StObject
     with XInterface {
  
  /** creates a new {@link DrawPage} with a summary of all {@link DrawPages} in the given collection. */
  def summarize(xPages: XDrawPages): XDrawPage
}
object XDrawPageSummarizer {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    summarize: XDrawPages => XDrawPage
  ): XDrawPageSummarizer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), summarize = js.Any.fromFunction1(summarize))
    __obj.asInstanceOf[XDrawPageSummarizer]
  }
  
  extension [Self <: XDrawPageSummarizer](x: Self) {
    
    inline def setSummarize(value: XDrawPages => XDrawPage): Self = StObject.set(x, "summarize", js.Any.fromFunction1(value))
  }
}
