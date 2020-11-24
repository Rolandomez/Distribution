package typings.winrtUwp.global.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides random access of data in input and output streams for a file. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
abstract class RandomAccessStreamReference ()
  extends typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  
  /**
    * Creates a random access stream around a file.
    * @param file The file to create a stream around.
    * @return The stream that encapsulates file.
    */
  def createFromFile(file: IStorageFile): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  
  /**
    * Creates a random access stream around the specified stream.
    * @param stream The source stream.
    * @return The random access stream that encapsulates stream.
    */
  def createFromStream(stream: IRandomAccessStream): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  
  /**
    * Creates a random access stream around the specified URI.
    * @param uri The URI to create the stream around. The valid URI schemes are http, https, ms-appx, and ms-appdata.
    * @return The random access stream that encapsulates uri.
    */
  def createFromUri(uri: Uri): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
}
