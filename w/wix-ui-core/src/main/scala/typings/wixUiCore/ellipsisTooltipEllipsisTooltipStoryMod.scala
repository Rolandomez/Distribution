package typings.wixUiCore

import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.ChildrenArray
import typings.wixUiCore.anon.ChildrenShowTooltip
import typings.wixUiCore.anon.Component
import typings.wixUiCore.anon.TypeofEllipsisTooltipInstantiableEllipsisTooltip
import typings.wixUiCore.srcComponentsEllipsisTooltipMod.EllipsisTooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisTooltipEllipsisTooltipStoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.category")
    @js.native
    def category: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ js.Any = js.native
    inline def category_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.component")
    @js.native
    class component () extends EllipsisTooltip
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.component")
    @js.native
    def component: TypeofEllipsisTooltipInstantiableEllipsisTooltip = js.native
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    inline def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.componentProps")
    @js.native
    def componentProps: ChildrenShowTooltip = js.native
    inline def componentProps_=(x: ChildrenShowTooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    inline def componentWrapper(hasComponent: Component): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWrapper")(hasComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def component_=(x: TypeofEllipsisTooltipInstantiableEllipsisTooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.exampleProps")
    @js.native
    def exampleProps: ChildrenArray = js.native
    inline def exampleProps_=(x: ChildrenArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/ellipsis-tooltip/EllipsisTooltip.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    inline def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
