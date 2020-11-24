package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typings.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", JSImport.Namespace)
@js.native
object extendedPickerMod extends js.Object {
  
  @js.native
  class BaseExtendedPeoplePicker ()
    extends typings.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedPeoplePicker ()
    extends typings.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
}
