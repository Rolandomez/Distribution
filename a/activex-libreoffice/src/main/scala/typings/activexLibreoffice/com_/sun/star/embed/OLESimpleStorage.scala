package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service provides a simple functionality to allow read/write the storages in OLE storage format. */
trait OLESimpleStorage
  extends StObject
     with XOLESimpleStorage {
  
  /**
    * is used to initialize the object on it's creation.
    * @param xInputStream [in] the InputStream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromInputStream(xInputStream: XInputStream, bNoTempCopy: Boolean): Unit
  
  /**
    * is used to initialize the object on it's creation.
    * @param xStream [in] the Stream that contains data in OLE storage format.
    * @param bNoTempCopy [in] specifies whether a temporary copy should be created during substreams opening. If the copy is not created the storage must stay
    */
  def createFromStream(xStream: XStream, bNoTempCopy: Boolean): Unit
}
object OLESimpleStorage {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    commit: () => Unit,
    createFromInputStream: (XInputStream, Boolean) => Unit,
    createFromStream: (XStream, Boolean) => Unit,
    dispose: () => Unit,
    getByName: String => Any,
    getClassID: () => SafeArray[Double],
    getClassName: () => String,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, Any) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByName: String => Unit,
    removeEventListener: XEventListener => Unit,
    replaceByName: (String, Any) => Unit,
    revert: () => Unit,
    setClassInfo: (SeqEquiv[Double], String) => Unit
  ): OLESimpleStorage = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commit = js.Any.fromFunction0(commit), createFromInputStream = js.Any.fromFunction2(createFromInputStream), createFromStream = js.Any.fromFunction2(createFromStream), dispose = js.Any.fromFunction0(dispose), getByName = js.Any.fromFunction1(getByName), getClassID = js.Any.fromFunction0(getClassID), getClassName = js.Any.fromFunction0(getClassName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeEventListener = js.Any.fromFunction1(removeEventListener), replaceByName = js.Any.fromFunction2(replaceByName), revert = js.Any.fromFunction0(revert), setClassInfo = js.Any.fromFunction2(setClassInfo))
    __obj.asInstanceOf[OLESimpleStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OLESimpleStorage] (val x: Self) extends AnyVal {
    
    inline def setCreateFromInputStream(value: (XInputStream, Boolean) => Unit): Self = StObject.set(x, "createFromInputStream", js.Any.fromFunction2(value))
    
    inline def setCreateFromStream(value: (XStream, Boolean) => Unit): Self = StObject.set(x, "createFromStream", js.Any.fromFunction2(value))
  }
}
