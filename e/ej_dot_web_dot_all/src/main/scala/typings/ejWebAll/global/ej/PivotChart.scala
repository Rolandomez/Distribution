package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.PivotChart")
@js.native
class PivotChart protected ()
  extends typings.ejWebAll.ej.PivotChart {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object PivotChart {
  
  @JSGlobal("ej.PivotChart")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.PivotChart.ChartTypes")
  @js.native
  object ChartTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.PivotChart.ChartTypes with Double] = js.native
    
    /* 3 */ val Area: typings.ejWebAll.ej.PivotChart.ChartTypes.Area with Double = js.native
    
    /* 8 */ val Bar: typings.ejWebAll.ej.PivotChart.ChartTypes.Bar with Double = js.native
    
    /* 16 */ val Bubble: typings.ejWebAll.ej.PivotChart.ChartTypes.Bubble with Double = js.native
    
    /* 2 */ val Column: typings.ejWebAll.ej.PivotChart.ChartTypes.Column with Double = js.native
    
    /* 14 */ val Doughnut: typings.ejWebAll.ej.PivotChart.ChartTypes.Doughnut with Double = js.native
    
    /* 13 */ val Funnel: typings.ejWebAll.ej.PivotChart.ChartTypes.Funnel with Double = js.native
    
    /* 0 */ val Line: typings.ejWebAll.ej.PivotChart.ChartTypes.Line with Double = js.native
    
    /* 7 */ val Pie: typings.ejWebAll.ej.PivotChart.ChartTypes.Pie with Double = js.native
    
    /* 12 */ val Pyramid: typings.ejWebAll.ej.PivotChart.ChartTypes.Pyramid with Double = js.native
    
    /* 15 */ val Scatter: typings.ejWebAll.ej.PivotChart.ChartTypes.Scatter with Double = js.native
    
    /* 1 */ val Spline: typings.ejWebAll.ej.PivotChart.ChartTypes.Spline with Double = js.native
    
    /* 4 */ val SplineArea: typings.ejWebAll.ej.PivotChart.ChartTypes.SplineArea with Double = js.native
    
    /* 9 */ val StackingArea: typings.ejWebAll.ej.PivotChart.ChartTypes.StackingArea with Double = js.native
    
    /* 11 */ val StackingBar: typings.ejWebAll.ej.PivotChart.ChartTypes.StackingBar with Double = js.native
    
    /* 10 */ val StackingColumn: typings.ejWebAll.ej.PivotChart.ChartTypes.StackingColumn with Double = js.native
    
    /* 6 */ val StepArea: typings.ejWebAll.ej.PivotChart.ChartTypes.StepArea with Double = js.native
    
    /* 5 */ val StepLine: typings.ejWebAll.ej.PivotChart.ChartTypes.StepLine with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.PivotChart.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("ej.PivotChart.fn")
  @js.native
  def fn: typings.ejWebAll.ej.PivotChart = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.PivotChart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
