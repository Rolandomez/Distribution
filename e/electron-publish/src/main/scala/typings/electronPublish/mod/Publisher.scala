package typings.electronPublish.mod

import typings.electronPublish.progressMod.ProgressBar
import typings.fsExtra.mod.Stats
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-publish", "Publisher")
@js.native
abstract class Publisher protected () extends js.Object {
  protected def this(context: PublishContext) = this()
  
  val context: PublishContext = js.native
  
  /* protected */ def createProgressBar(fileName: String, size: Double): ProgressBar | Null = js.native
  
  /* protected */ def createReadStreamAndProgressBar(file: String, fileStat: Stats, progressBar: Null, reject: js.Function1[/* error */ Error, Unit]): ReadableStream = js.native
  /* protected */ def createReadStreamAndProgressBar(
    file: String,
    fileStat: Stats,
    progressBar: ProgressBar,
    reject: js.Function1[/* error */ Error, Unit]
  ): ReadableStream = js.native
  
  def providerName: String = js.native
  
  def upload(task: UploadTask): js.Promise[_] = js.native
}
