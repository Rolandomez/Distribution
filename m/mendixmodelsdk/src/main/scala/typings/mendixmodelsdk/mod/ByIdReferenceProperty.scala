package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "ByIdReferenceProperty")
@js.native
open class ByIdReferenceProperty[T /* <: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container] */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalPropertiesMod.ByIdReferenceProperty[T] {
  /**
    * parent is the structure that the value of this property attaches to,
    * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
    *    item.container === this.parent.
    *
    * initialValue is default value except parts and GUID-typed primitives.
    * (by-id/name references do not have default values.)
    */
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: T,
    moreArgs: Any*
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: Null,
    moreArgs: Any*
  ) = this()
}
