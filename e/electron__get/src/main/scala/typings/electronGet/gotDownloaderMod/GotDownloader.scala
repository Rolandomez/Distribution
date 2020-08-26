package typings.electronGet.gotDownloaderMod

import typings.electronGet.downloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@electron/get/dist/esm/GotDownloader", "GotDownloader")
@js.native
class GotDownloader () extends Downloader[GotDownloaderOptions] {
  def download(url: String, targetFilePath: String): js.Promise[Unit] = js.native
}

