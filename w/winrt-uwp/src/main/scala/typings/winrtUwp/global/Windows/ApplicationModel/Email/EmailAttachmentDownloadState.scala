package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the states of an email attachment download. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachmentDownloadState")
@js.native
object EmailAttachmentDownloadState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState with Double
  ] = js.native
  
  /* 2 */ val downloaded: typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloaded with Double = js.native
  
  /* 1 */ val downloading: typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.downloading with Double = js.native
  
  /* 3 */ val failed: typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.failed with Double = js.native
  
  /* 0 */ val notDownloaded: typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState.notDownloaded with Double = js.native
}
