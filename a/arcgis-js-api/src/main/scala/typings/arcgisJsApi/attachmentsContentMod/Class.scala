package typings.arcgisJsApi.attachmentsContentMod

import typings.arcgisJsApi.esri.AttachmentsContent
import typings.arcgisJsApi.esri.AttachmentsContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
@js.native
/**
  * An `AttachmentsContent` popup element represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
  */
class Class () extends AttachmentsContent {
  def this(properties: AttachmentsContentProperties) = this()
}

