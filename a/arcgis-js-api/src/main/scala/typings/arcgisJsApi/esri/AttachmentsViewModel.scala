package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.add
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * The current [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html) being edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#activeAttachmentInfo)
  		 */
  var activeAttachmentInfo: AttachmentInfo = js.native
  
  /**
  		 * A collection of [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html) defined on a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#attachmentInfos)
  		 */
  val attachmentInfos: js.Array[AttachmentInfo] = js.native
  
  /**
  		 * Configures the attachment editing functionality that can be performed by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#capabilities)
  		 */
  var capabilities: AttachmentsCapabilities = js.native
  
  /**
  		 * Queries for the attachments on a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#getAttachments)
  		 */
  def getAttachments(): js.Promise[js.Array[AttachmentInfo]] = js.native
  
  /**
  		 * The graphic for the attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#graphic)
  		 */
  var graphic: Graphic = js.native
  
  /**
  		 * The current mode performed by the user.
  		 *
  		 * @default "view"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#mode)
  		 */
  var mode: view | add | edit = js.native
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default "ready"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#state)
  		 */
  val state: ready | disabled | loading = js.native
  
  /**
  		 * Defines whether or not the feature supports resizing attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#supportsResizeAttachments)
  		 */
  var supportsResizeAttachments: Boolean = js.native
}
