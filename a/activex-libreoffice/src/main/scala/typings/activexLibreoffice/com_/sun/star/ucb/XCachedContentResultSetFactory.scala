package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates a {@link CachedContentResultSet} . */
trait XCachedContentResultSetFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a remote optimized {@link com.sun.star.sdbc.XResultSet} .
    * @param xSource must be an instance of service {@link CachedContentResultSetStub} .
    * @param xMapping can be used for optimization of remote access via the interface {@link XContentAccess} of the {@link CachedContentResultSet} . This para
    * @returns an instance of service {@link CachedContentResultSet} .
    */
  def createCachedContentResultSet(xSource: XResultSet, xMapping: XContentIdentifierMapping): XResultSet
}
object XCachedContentResultSetFactory {
  
  inline def apply(
    acquire: () => Unit,
    createCachedContentResultSet: (XResultSet, XContentIdentifierMapping) => XResultSet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XCachedContentResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCachedContentResultSet = js.Any.fromFunction2(createCachedContentResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCachedContentResultSetFactory]
  }
  
  extension [Self <: XCachedContentResultSetFactory](x: Self) {
    
    inline def setCreateCachedContentResultSet(value: (XResultSet, XContentIdentifierMapping) => XResultSet): Self = StObject.set(x, "createCachedContentResultSet", js.Any.fromFunction2(value))
  }
}
