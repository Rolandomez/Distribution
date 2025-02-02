package typings.materialUiLab

import typings.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typings.materialUiLab.materialUiLabStrings.default
import typings.materialUiLab.materialUiLabStrings.grey
import typings.materialUiLab.materialUiLabStrings.inherit
import typings.materialUiLab.materialUiLabStrings.outlined
import typings.materialUiLab.materialUiLabStrings.primary
import typings.materialUiLab.materialUiLabStrings.secondary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineDotTimelineDotMod {
  
  @JSImport("@material-ui/lab/TimelineDot/TimelineDot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.defaultDefault
    - typings.materialUiLab.materialUiLabStrings.defaultPrimary
    - typings.materialUiLab.materialUiLabStrings.defaultSecondary
    - typings.materialUiLab.materialUiLabStrings.outlinedDefault
    - typings.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typings.materialUiLab.materialUiLabStrings.outlinedSecondary
  */
  trait TimelineDotClassKey extends StObject
  object TimelineDotClassKey {
    
    inline def defaultDefault: typings.materialUiLab.materialUiLabStrings.defaultDefault = "defaultDefault".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultDefault]
    
    inline def defaultPrimary: typings.materialUiLab.materialUiLabStrings.defaultPrimary = "defaultPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultPrimary]
    
    inline def defaultSecondary: typings.materialUiLab.materialUiLabStrings.defaultSecondary = "defaultSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultSecondary]
    
    inline def outlinedDefault: typings.materialUiLab.materialUiLabStrings.outlinedDefault = "outlinedDefault".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedDefault]
    
    inline def outlinedPrimary: typings.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    inline def outlinedSecondary: typings.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    inline def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey, never> */
  trait TimelineDotProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapTimeliDefaultDefault] = js.undefined
    
    /**
      * The dot can have a different colors.
      */
    var color: js.UndefOr[inherit | primary | secondary | grey] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The dot can appear filled or outlined.
      */
    var variant: js.UndefOr[default | outlined] = js.undefined
  }
  object TimelineDotProps {
    
    inline def apply(): TimelineDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineDotProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimelineDotProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapTimeliDefaultDefault): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setColor(value: inherit | primary | secondary | grey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVariant(value: default | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
