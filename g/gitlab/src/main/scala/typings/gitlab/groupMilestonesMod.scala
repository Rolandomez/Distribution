package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.templatesMod.ResourceMilestones
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/GroupMilestones", JSImport.Namespace)
@js.native
object groupMilestonesMod extends js.Object {
  
  @js.native
  class GroupMilestones protected () extends ResourceMilestones {
    def this(options: BaseServiceOptions) = this()
  }
}
