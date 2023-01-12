package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers read and write access to the same stream. */
trait XStream
  extends StObject
     with XInterface {
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  val InputStream: XInputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  val OutputStream: XOutputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XInputStream} also closes any {@link XOutputStream} part. */
  def getInputStream(): XInputStream
  
  /** @returns the {@link XInputStream} part of the stream. Closing the returned {@link XOutputStream} also closes the {@link XInputStream} part. */
  def getOutputStream(): XOutputStream
}
object XStream {
  
  inline def apply(
    InputStream: XInputStream,
    OutputStream: XOutputStream,
    acquire: () => Unit,
    getInputStream: () => XInputStream,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInputStream = js.Any.fromFunction0(getInputStream), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XStream] (val x: Self) extends AnyVal {
    
    inline def setGetInputStream(value: () => XInputStream): Self = StObject.set(x, "getInputStream", js.Any.fromFunction0(value))
    
    inline def setGetOutputStream(value: () => XOutputStream): Self = StObject.set(x, "getOutputStream", js.Any.fromFunction0(value))
    
    inline def setInputStream(value: XInputStream): Self = StObject.set(x, "InputStream", value.asInstanceOf[js.Any])
    
    inline def setOutputStream(value: XOutputStream): Self = StObject.set(x, "OutputStream", value.asInstanceOf[js.Any])
  }
}
