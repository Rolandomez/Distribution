package typings.amcharts.amStockChartMod

import typings.amcharts.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmStockChart extends js.Object {
  
  /**
    * Adds event listener.
    * @param type - One of
    * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
    * "rollOverStockEvent", "zoomed".
    * @param handler - The event handler.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit = js.native
  
  /**
    * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanel(panel: typings.amcharts.stockPanelMod.default): Unit = js.native
  
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanelAt(panel: typings.amcharts.stockPanelMod.default, index: Double): Unit = js.native
  
  /**
    * Specifies if animation was already played.
    * Animation is only played once, when chart is rendered for the first time.
    * If you want the animation to be repeated, set this property to false.
    */
  var animationPlayed: Boolean = js.native
  
  /**
    * Balloon object.
    */
  var balloon: typings.amcharts.amBalloonMod.default = js.native
  
  /**
    * Settings for category axes.
    */
  var categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default = js.native
  
  /**
    * Indicates if the chart is created.
    */
  var chartCreated: Boolean = js.native
  
  /**
    * Chart cursor settings.
    */
  var chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default = js.native
  
  /**
    * Chart scrollbar settings.
    */
  var chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default = js.native
  
  /**
    * Destroys chart, all timeouts and listeners.
    */
  def clear(): Unit = js.native
  
  /**
    * Array of colors used by data sets if no color was set explicitly on data set itself.
    * [
    * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
    * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
    * ]
    */
  var colors: js.Array[_] = js.native
  
  /**
    * Array of data sets selected for comparing.
    */
  var comparedDataSets: js.Array[_] = js.native
  
  /**
    * DataSetSelector object.
    * You can add it if you have more than one data set and want users to be able to select/compare them.
    */
  var dataSetSelector: typings.amcharts.dataSetSelectorMod.default = js.native
  
  /**
    * Array of DataSets.
    */
  var dataSets: js.Array[_] = js.native
  
  /**
    * Current end date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var endDate: typings.std.Date = js.native
  
  /**
    * Defines on which day week starts. 0 - Sunday, 1 - Monday..
    * @default 1
    */
  var firstDayOfWeek: Double = js.native
  
  /**
    * If set to true the scope of the data view will be set to the end after data update.
    */
  var glueToTheEnd: Boolean = js.native
  
  /**
    * Hides event bullets.
    */
  def hideStockEvents(): Unit = js.native
  
  /**
    * Legend settings.
    */
  var legendSettings: typings.amcharts.legendSettingsMod.default = js.native
  
  /**
    * Data set selected as main.
    */
  var mainDataSet: typings.amcharts.dataSetMod.default = js.native
  
  /**
    * Array of StockPanels (charts).
    */
  var panels: js.Array[_] = js.native
  
  /**
    * Settings for stock panels.
    */
  var panelsSettings: typings.amcharts.panelSettingsMod.default = js.native
  
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  var periodSelector: typings.amcharts.periodSelectorMod.default = js.native
  
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
  
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def removePanel(panel: typings.amcharts.stockPanelMod.default): Unit = js.native
  
  /**
    * Scrollbar's chart object, get only.
    */
  var scrollbarChart: typings.amcharts.amSerialChartMod.default = js.native
  
  /**
    * Shows event bullets.
    */
  def showStockEvents(): Unit = js.native
  
  /**
    * Current start date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var startDate: typings.std.Date = js.native
  
  /**
    * Settings for stock events.
    */
  var stockEventsSettings: js.Any = js.native
  
  /**
    * Method which should be called after data was changed.
    */
  def validateData(): Unit = js.native
  
  /**
    * Method which forces the stock chart to rebuild. Should be called after properties are changed.
    */
  def validateNow(): Unit = js.native
  
  /**
    * Settings for value axes.
    */
  var valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default = js.native
  
  /**
    * read-only. Indicates current version of a script.
    */
  var version: String = js.native
  
  /**
    * Zooms chart to specified dates. startDate, endDate - Date objects.
    */
  def zoom(startDate: typings.std.Date, endDate: typings.std.Date): Unit = js.native
  
  /**
    * Zooms out the chart.
    */
  def zoomOut(): Unit = js.native
  
  /**
    * Specifies whether the chart should zoom-out when main data set is changed.
    */
  var zoomOutOnDataSetChange: Boolean = js.native
}
object AmStockChart {
  
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ Date, Unit]) => Unit,
    addPanel: typings.amcharts.stockPanelMod.default => Unit,
    addPanelAt: (typings.amcharts.stockPanelMod.default, Double) => Unit,
    animationPlayed: Boolean,
    balloon: typings.amcharts.amBalloonMod.default,
    categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default,
    chartCreated: Boolean,
    chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default,
    chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default,
    clear: () => Unit,
    colors: js.Array[_],
    comparedDataSets: js.Array[_],
    dataSetSelector: typings.amcharts.dataSetSelectorMod.default,
    dataSets: js.Array[_],
    endDate: typings.std.Date,
    firstDayOfWeek: Double,
    glueToTheEnd: Boolean,
    hideStockEvents: () => Unit,
    legendSettings: typings.amcharts.legendSettingsMod.default,
    mainDataSet: typings.amcharts.dataSetMod.default,
    panels: js.Array[_],
    panelsSettings: typings.amcharts.panelSettingsMod.default,
    periodSelector: typings.amcharts.periodSelectorMod.default,
    removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
    removePanel: typings.amcharts.stockPanelMod.default => Unit,
    scrollbarChart: typings.amcharts.amSerialChartMod.default,
    showStockEvents: () => Unit,
    startDate: typings.std.Date,
    stockEventsSettings: js.Any,
    validateData: () => Unit,
    validateNow: () => Unit,
    valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default,
    version: String,
    zoom: (typings.std.Date, typings.std.Date) => Unit,
    zoomOut: () => Unit,
    zoomOutOnDataSetChange: Boolean
  ): AmStockChart = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPanel = js.Any.fromFunction1(addPanel), addPanelAt = js.Any.fromFunction2(addPanelAt), animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], hideStockEvents = js.Any.fromFunction0(hideStockEvents), legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), removePanel = js.Any.fromFunction1(removePanel), scrollbarChart = scrollbarChart.asInstanceOf[js.Any], showStockEvents = js.Any.fromFunction0(showStockEvents), startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], validateData = js.Any.fromFunction0(validateData), validateNow = js.Any.fromFunction0(validateNow), valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoom = js.Any.fromFunction2(zoom), zoomOut = js.Any.fromFunction0(zoomOut), zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmStockChart]
  }
  
  @scala.inline
  implicit class AmStockChartOps[Self <: AmStockChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: (String, js.Function1[/* e */ Date, Unit]) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPanel(value: typings.amcharts.stockPanelMod.default => Unit): Self = this.set("addPanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPanelAt(value: (typings.amcharts.stockPanelMod.default, Double) => Unit): Self = this.set("addPanelAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAnimationPlayed(value: Boolean): Self = this.set("animationPlayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalloon(value: typings.amcharts.amBalloonMod.default): Self = this.set("balloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxesSettings(value: typings.amcharts.categoryAxesSettingsMod.default): Self = this.set("categoryAxesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartCreated(value: Boolean): Self = this.set("chartCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartCursorSettings(value: typings.amcharts.chartCursorSettingsMod.default): Self = this.set("chartCursorSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartScrollbarSettings(value: typings.amcharts.chartScrollbarSettingsMod.default): Self = this.set("chartScrollbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparedDataSetsVarargs(value: js.Any*): Self = this.set("comparedDataSets", js.Array(value :_*))
    
    @scala.inline
    def setComparedDataSets(value: js.Array[_]): Self = this.set("comparedDataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetSelector(value: typings.amcharts.dataSetSelectorMod.default): Self = this.set("dataSetSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetsVarargs(value: js.Any*): Self = this.set("dataSets", js.Array(value :_*))
    
    @scala.inline
    def setDataSets(value: js.Array[_]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: typings.std.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueToTheEnd(value: Boolean): Self = this.set("glueToTheEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideStockEvents(value: () => Unit): Self = this.set("hideStockEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLegendSettings(value: typings.amcharts.legendSettingsMod.default): Self = this.set("legendSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainDataSet(value: typings.amcharts.dataSetMod.default): Self = this.set("mainDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelsVarargs(value: js.Any*): Self = this.set("panels", js.Array(value :_*))
    
    @scala.inline
    def setPanels(value: js.Array[_]): Self = this.set("panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelsSettings(value: typings.amcharts.panelSettingsMod.default): Self = this.set("panelsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSelector(value: typings.amcharts.periodSelectorMod.default): Self = this.set("periodSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListener(value: (typings.amcharts.amChartMod.default, String, js.Any) => Unit): Self = this.set("removeListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemovePanel(value: typings.amcharts.stockPanelMod.default => Unit): Self = this.set("removePanel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollbarChart(value: typings.amcharts.amSerialChartMod.default): Self = this.set("scrollbarChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStockEvents(value: () => Unit): Self = this.set("showStockEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartDate(value: typings.std.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockEventsSettings(value: js.Any): Self = this.set("stockEventsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateData(value: () => Unit): Self = this.set("validateData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidateNow(value: () => Unit): Self = this.set("validateNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAxesSettings(value: typings.amcharts.valueAxesSettingsMod.default): Self = this.set("valueAxesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: (typings.std.Date, typings.std.Date) => Unit): Self = this.set("zoom", js.Any.fromFunction2(value))
    
    @scala.inline
    def setZoomOut(value: () => Unit): Self = this.set("zoomOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZoomOutOnDataSetChange(value: Boolean): Self = this.set("zoomOutOnDataSetChange", value.asInstanceOf[js.Any])
  }
}
