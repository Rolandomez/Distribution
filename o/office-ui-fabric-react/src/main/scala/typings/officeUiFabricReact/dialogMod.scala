package typings.officeUiFabricReact

import typings.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typings.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typings.officeUiFabricReact.dialogTypesMod.IDialogProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Dialog", JSImport.Namespace)
@js.native
object dialogMod extends js.Object {
  
  val Dialog: FunctionComponent[IDialogProps] = js.native
  
  val DialogContent: FunctionComponent[IDialogContentProps] = js.native
  
  val DialogFooter: FunctionComponent[IDialogFooterProps] = js.native
  
  @js.native
  class DialogBase protected ()
    extends typings.officeUiFabricReact.dialogBaseMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    
    var defaultProps: IDialogProps = js.native
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typings.officeUiFabricReact.dialogContentBaseMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    
    var defaultProps: IDialogContentProps = js.native
  }
  
  @js.native
  class DialogFooterBase protected ()
    extends typings.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
  @js.native
  object DialogType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
    
    /* 2 */ val close: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    
    /* 1 */ val largeHeader: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    
    /* 0 */ val normal: typings.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
  }
}
