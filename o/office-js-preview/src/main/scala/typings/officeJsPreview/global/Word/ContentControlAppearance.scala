package typings.officeJsPreview.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Either bounding box, or tags, or hidden.
  *
  * [Api set: WordApi]
  * @remarks
  */
@JSGlobal("Word.ContentControlAppearance")
@js.native
object ContentControlAppearance extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Word.ContentControlAppearance with String] = js.native
  
  /* "BoundingBox" */ val boundingBox: typings.officeJsPreview.Word.ContentControlAppearance.boundingBox with String = js.native
  
  /* "Hidden" */ val hidden: typings.officeJsPreview.Word.ContentControlAppearance.hidden with String = js.native
  
  /* "Tags" */ val tags: typings.officeJsPreview.Word.ContentControlAppearance.tags with String = js.native
}
