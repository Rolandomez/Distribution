package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.marqueeSelectionTypesMod.IMarqueeSelectionProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/MarqueeSelection", JSImport.Namespace)
@js.native
object libMarqueeSelectionMod extends js.Object {
  
  val MarqueeSelection: FunctionComponent[IMarqueeSelectionProps] = js.native
  
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @js.native
  class Selection[TItem] protected ()
    extends typings.officeUiFabricReact.selectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @js.native
  object SelectionDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
  
  @js.native
  class SelectionZone protected ()
    extends typings.officeUiFabricReact.selectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    
    var defaultProps: IsSelectedOnFocus = js.native
    
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
}
