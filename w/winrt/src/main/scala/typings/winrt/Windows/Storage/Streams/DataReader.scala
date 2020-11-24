package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataReader
  extends IDataReader
     with IClosable {
  
  def dispose(): Unit = js.native
}
