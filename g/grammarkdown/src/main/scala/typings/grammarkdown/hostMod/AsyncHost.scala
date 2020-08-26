package typings.grammarkdown.hostMod

import typings.esfxCancelable.distMod.Cancelable
import typings.grammarkdown.nodesMod.SourceFile
import typings.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/host", "AsyncHost")
@js.native
class AsyncHost () extends HostBase {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
  var readFileCallback: js.Any = js.native
  var writeFileCallback: js.Any = js.native
  def getSourceFile(file: String): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[SourceFile]] = js.native
  def getSourceFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[SourceFile]] = js.native
  def readFile(file: String): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: Cancelable): js.Promise[js.UndefOr[String]] = js.native
  def readFile(file: String, cancelable: CancellationToken): js.Promise[js.UndefOr[String]] = js.native
  def writeFile(file: String, text: String): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: Cancelable): js.Promise[Unit] = js.native
  def writeFile(file: String, text: String, cancelable: CancellationToken): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("grammarkdown/dist/host", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): AsyncSingleFileHost = js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: AsyncHost): AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: AsyncHost): AsyncSingleFileHost = js.native
}

