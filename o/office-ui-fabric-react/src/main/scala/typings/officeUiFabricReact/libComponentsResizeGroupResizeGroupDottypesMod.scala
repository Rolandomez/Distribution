package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDotbaseMod.ResizeGroupBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsResizeGroupResizeGroupDottypesMod {
  
  @js.native
  sealed trait ResizeGroupDirection extends StObject
  @JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.types", "ResizeGroupDirection")
  @js.native
  object ResizeGroupDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResizeGroupDirection & Double] = js.native
    
    @js.native
    sealed trait horizontal
      extends StObject
         with ResizeGroupDirection
    /* 0 */ val horizontal: typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.ResizeGroupDirection.horizontal & Double = js.native
    
    @js.native
    sealed trait vertical
      extends StObject
         with ResizeGroupDirection
    /* 1 */ val vertical: typings.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.ResizeGroupDirection.vertical & Double = js.native
  }
  
  trait IResizeGroup extends StObject {
    
    /**
      * Remeasures the available space.
      */
    def remeasure(): Unit
  }
  object IResizeGroup {
    
    inline def apply(remeasure: () => Unit): IResizeGroup = {
      val __obj = js.Dynamic.literal(remeasure = js.Any.fromFunction0(remeasure))
      __obj.asInstanceOf[IResizeGroup]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeGroup] (val x: Self) extends AnyVal {
      
      inline def setRemeasure(value: () => Unit): Self = StObject.set(x, "remeasure", js.Any.fromFunction0(value))
    }
  }
  
  trait IResizeGroupProps
    extends StObject
       with HTMLAttributes[ResizeGroupBase | HTMLElement] {
    
    /**
      * Optional callback to access the IResizeGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IResizeGroup]] = js.undefined
    
    /**
      * Initial data to be passed to the `onRenderData` function. When there is no `onGrowData` provided, this data should
      * represent what should be passed to the render function when the parent container of the ResizeGroup is at its
      * maximum supported width. A `cacheKey` property may optionally be included as part of the data. Two data objects
      * with the same `cacheKey` will be assumed to take up the same width and will prevent measurements.
      * The type of `cacheKey` is a string.
      */
    var data: Any
    
    /**
      * Function to be called every time data is rendered. It provides the data that was actually rendered.
      * A use case would be adding telemetry when a particular control is shown in an overflow well or
      * dropped as a result of onReduceData or to count the number of renders that an implementation of
      * onReduceData triggers.
      */
    var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ Any, Unit]] = js.undefined
    
    /**
      * Direction of this resize group, vertical or horizontal
      * @defaultvalue ResizeGroupDirection.horizontal
      */
    var direction: js.UndefOr[ResizeGroupDirection] = js.undefined
    
    /**
      * Function to be performed on the data in order to increase its width. It is called in scenarios where the
      * container has more room than the previous render and we may be able to fit more content. If there are no more
      * scaling operations to perform on teh data, it should return undefined to prevent an infinite render loop.
      */
    var onGrowData: js.UndefOr[js.Function1[/* prevData */ Any, Any]] = js.undefined
    
    /**
      * Function to be performed on the data in order to reduce its width and make it fit into the given space.
      * If there are no more scaling steps to apply, it should return undefined to prevent
      * an infinite render loop.
      */
    def onReduceData(prevData: Any): Any
    
    /**
      * Function to render the data. Called when rendering the contents to the screen and when
      * rendering in a hidden div to measure the size of the contents.
      */
    def onRenderData(data: Any): Element
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      * @deprecated Removed to reduce bundle size.  Please use `className` and add css rules to `className` instead.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IResizeGroupProps {
    
    inline def apply(data: Any, onReduceData: Any => Any, onRenderData: Any => Element): IResizeGroupProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onReduceData = js.Any.fromFunction1(onReduceData), onRenderData = js.Any.fromFunction1(onRenderData))
      __obj.asInstanceOf[IResizeGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeGroupProps] (val x: Self) extends AnyVal {
      
      inline def setComponentRef(value: IRefObject[IResizeGroup]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IResizeGroup | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataDidRender(value: /* renderedData */ Any => Unit): Self = StObject.set(x, "dataDidRender", js.Any.fromFunction1(value))
      
      inline def setDataDidRenderUndefined: Self = StObject.set(x, "dataDidRender", js.undefined)
      
      inline def setDirection(value: ResizeGroupDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnGrowData(value: /* prevData */ Any => Any): Self = StObject.set(x, "onGrowData", js.Any.fromFunction1(value))
      
      inline def setOnGrowDataUndefined: Self = StObject.set(x, "onGrowData", js.undefined)
      
      inline def setOnReduceData(value: Any => Any): Self = StObject.set(x, "onReduceData", js.Any.fromFunction1(value))
      
      inline def setOnRenderData(value: Any => Element): Self = StObject.set(x, "onRenderData", js.Any.fromFunction1(value))
      
      inline def setStyles(value: IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IResizeGroupStyleProps => DeepPartial[IResizeGroupStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IResizeGroupStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IResizeGroupStyleProps {
    
    inline def apply(theme: ITheme): IResizeGroupStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeGroupStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeGroupStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResizeGroupStyles extends StObject {
    
    /**
      * Style for the root element.
      */
    var root: IStyle
  }
  object IResizeGroupStyles {
    
    inline def apply(): IResizeGroupStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeGroupStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeGroupStyles] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
