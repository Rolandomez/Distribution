package typings.chartJs.distTypesIndexMod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry_ extends StObject {
  
  def add(args: ChartComponentLike*): Unit
  
  def addControllers(args: ChartComponentLike*): Unit
  
  def addElements(args: ChartComponentLike*): Unit
  
  def addPlugins(args: ChartComponentLike*): Unit
  
  def addScales(args: ChartComponentLike*): Unit
  
  val controllers: TypedRegistry[
    DatasetController[
      ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ]
  ]
  
  val elements: TypedRegistry[default[AnyObject, AnyObject]]
  
  def getController(id: String): js.UndefOr[
    DatasetController[
      ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ]
  ]
  
  def getElement(id: String): js.UndefOr[default[AnyObject, AnyObject]]
  
  def getPlugin(id: String): js.UndefOr[Plugin[ChartType, AnyObject]]
  
  def getScale(id: String): js.UndefOr[Scale[CoreScaleOptions]]
  
  val plugins: TypedRegistry[Plugin[ChartType, AnyObject]]
  
  def remove(args: ChartComponentLike*): Unit
  
  val scales: TypedRegistry[Scale[CoreScaleOptions]]
}
object Registry_ {
  
  inline def apply(
    add: /* repeated */ ChartComponentLike => Unit,
    addControllers: /* repeated */ ChartComponentLike => Unit,
    addElements: /* repeated */ ChartComponentLike => Unit,
    addPlugins: /* repeated */ ChartComponentLike => Unit,
    addScales: /* repeated */ ChartComponentLike => Unit,
    controllers: TypedRegistry[
      DatasetController[
        ChartType, 
        default[AnyObject, AnyObject], 
        default[AnyObject, AnyObject], 
        ParsedDataType[ChartType]
      ]
    ],
    elements: TypedRegistry[default[AnyObject, AnyObject]],
    getController: String => js.UndefOr[
      DatasetController[
        ChartType, 
        default[AnyObject, AnyObject], 
        default[AnyObject, AnyObject], 
        ParsedDataType[ChartType]
      ]
    ],
    getElement: String => js.UndefOr[default[AnyObject, AnyObject]],
    getPlugin: String => js.UndefOr[Plugin[ChartType, AnyObject]],
    getScale: String => js.UndefOr[Scale[CoreScaleOptions]],
    plugins: TypedRegistry[Plugin[ChartType, AnyObject]],
    remove: /* repeated */ ChartComponentLike => Unit,
    scales: TypedRegistry[Scale[CoreScaleOptions]]
  ): Registry_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addControllers = js.Any.fromFunction1(addControllers), addElements = js.Any.fromFunction1(addElements), addPlugins = js.Any.fromFunction1(addPlugins), addScales = js.Any.fromFunction1(addScales), controllers = controllers.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getController = js.Any.fromFunction1(getController), getElement = js.Any.fromFunction1(getElement), getPlugin = js.Any.fromFunction1(getPlugin), getScale = js.Any.fromFunction1(getScale), plugins = plugins.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Registry_] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddControllers(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "addControllers", js.Any.fromFunction1(value))
    
    inline def setAddElements(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "addElements", js.Any.fromFunction1(value))
    
    inline def setAddPlugins(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "addPlugins", js.Any.fromFunction1(value))
    
    inline def setAddScales(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "addScales", js.Any.fromFunction1(value))
    
    inline def setControllers(
      value: TypedRegistry[
          DatasetController[
            ChartType, 
            default[AnyObject, AnyObject], 
            default[AnyObject, AnyObject], 
            ParsedDataType[ChartType]
          ]
        ]
    ): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setElements(value: TypedRegistry[default[AnyObject, AnyObject]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setGetController(
      value: String => js.UndefOr[
          DatasetController[
            ChartType, 
            default[AnyObject, AnyObject], 
            default[AnyObject, AnyObject], 
            ParsedDataType[ChartType]
          ]
        ]
    ): Self = StObject.set(x, "getController", js.Any.fromFunction1(value))
    
    inline def setGetElement(value: String => js.UndefOr[default[AnyObject, AnyObject]]): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    inline def setGetPlugin(value: String => js.UndefOr[Plugin[ChartType, AnyObject]]): Self = StObject.set(x, "getPlugin", js.Any.fromFunction1(value))
    
    inline def setGetScale(value: String => js.UndefOr[Scale[CoreScaleOptions]]): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
    
    inline def setPlugins(value: TypedRegistry[Plugin[ChartType, AnyObject]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: /* repeated */ ChartComponentLike => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setScales(value: TypedRegistry[Scale[CoreScaleOptions]]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
