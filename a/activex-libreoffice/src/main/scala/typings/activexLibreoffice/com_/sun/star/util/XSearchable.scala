package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables the object to look for specified contents of the object (in particular, for a text range which contains a specific string pattern).
  *
  * Example: in a {@link com.sun.star.text.TextDocument} : set all "search for" to bold using {@link findFirst()} /findNext():
  *
  * {{program example here, see documentation}}
  */
trait XSearchable
  extends StObject
     with XInterface {
  
  /**
    * creates a {@link SearchDescriptor} which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createSearchDescriptor(): XSearchDescriptor
  
  /**
    * searches the contained texts for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def findAll(xDesc: XSearchDescriptor): XIndexAccess
  
  /**
    * searches the contained texts for the next occurrence of whatever is specified.
    * @returns the position within the component, e.g. a {@link com.sun.star.text.XTextRange} which determines the found elements.
    * @see SearchDescriptor
    */
  def findFirst(xDesc: XSearchDescriptor): XInterface
  
  /**
    * searches the contained texts for the next occurrence of whatever is specified.
    * @param xStartAt represents a position within the component at which the search continues. This position is returned by {@link XSearchable.findFirst()} o
    * @param xDesc the descriptor used for searching.
    * @see SearchDescriptor
    */
  def findNext(xStartAt: XInterface, xDesc: XSearchDescriptor): XInterface
}
object XSearchable {
  
  inline def apply(
    acquire: () => Unit,
    createSearchDescriptor: () => XSearchDescriptor,
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSearchable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSearchDescriptor = js.Any.fromFunction0(createSearchDescriptor), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSearchable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSearchable] (val x: Self) extends AnyVal {
    
    inline def setCreateSearchDescriptor(value: () => XSearchDescriptor): Self = StObject.set(x, "createSearchDescriptor", js.Any.fromFunction0(value))
    
    inline def setFindAll(value: XSearchDescriptor => XIndexAccess): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
    
    inline def setFindFirst(value: XSearchDescriptor => XInterface): Self = StObject.set(x, "findFirst", js.Any.fromFunction1(value))
    
    inline def setFindNext(value: (XInterface, XSearchDescriptor) => XInterface): Self = StObject.set(x, "findNext", js.Any.fromFunction2(value))
  }
}
