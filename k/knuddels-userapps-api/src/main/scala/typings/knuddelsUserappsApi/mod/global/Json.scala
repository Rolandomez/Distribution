package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.JsonData
import typings.knuddelsUserappsApi.mod._JsonData
import typings.knuddelsUserappsApi.mod._KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json
  extends /* x */ StringDictionary[js.UndefOr[JsonData]]
     with _JsonData
     with _KnuddelsEvent

object Json {
  @scala.inline
  def apply(): Json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Json]
  }
}

