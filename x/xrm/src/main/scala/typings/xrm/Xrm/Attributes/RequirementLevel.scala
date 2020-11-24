package typings.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link XrmEnum.AttributeRequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.none
  - typings.xrm.xrmStrings.recommended
  - typings.xrm.xrmStrings.required
*/
trait RequirementLevel extends js.Object
object RequirementLevel {
  
  @scala.inline
  def none: typings.xrm.xrmStrings.none = "none".asInstanceOf[typings.xrm.xrmStrings.none]
  
  @scala.inline
  def recommended: typings.xrm.xrmStrings.recommended = "recommended".asInstanceOf[typings.xrm.xrmStrings.recommended]
  
  @scala.inline
  def required: typings.xrm.xrmStrings.required = "required".asInstanceOf[typings.xrm.xrmStrings.required]
}
