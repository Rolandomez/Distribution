package typings.webix.webix.ui

import typings.webix.webix.DataStore
import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixProxy
import typings.webix.webix.WebixTemplate
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait datalayout
  extends StObject
     with baseview {
  
  def add(obj: obj): String | Double = js.native
  def add(obj: obj, index: Double): String | Double = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: datalayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: datalayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  @JSName("config")
  var config_datalayout: datalayoutConfig = js.native
  
  def count(): Double = js.native
  
  var data: DataStore = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback): Unit = js.native
  def filter(text: WebixCallback, value: String): Unit = js.native
  def filter(text: WebixCallback, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate): Unit = js.native
  def filter(text: WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate, value: Unit, preserve: Boolean): Unit = js.native
  
  def find(criterion: WebixCallback): Any = js.native
  def find(criterion: WebixCallback, first: Boolean): Any = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getItem(id: String): obj = js.native
  def getItem(id: Double): obj = js.native
  
  def getLastId(): Double | String = js.native
  
  def getNextId(id: String): String | Double = js.native
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getPrevId(id: String): String | Double = js.native
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getValue(): js.Array[Any] = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean): js.Promise[Any] = js.native
  def loadNext(count: Double, start: Double, callback: WebixCallback, url: String, now: Boolean, clear: Boolean): js.Promise[Any] = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def parse(data: String): Unit = js.native
  def parse(data: String, `type`: String): Unit = js.native
  def parse(data: String, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: String, `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any]): Unit = js.native
  def parse(data: js.Array[Any], `type`: String): Unit = js.native
  def parse(data: js.Array[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any]): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: obj): Unit = js.native
  def parse(data: obj, `type`: String): Unit = js.native
  def parse(data: obj, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: obj, `type`: Unit, clear: Boolean): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def render(id: String, obj: obj, mode: String): Unit = js.native
  def render(id: Double, obj: obj, mode: String): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setValue(values: js.Array[Any]): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  def sync(source: obj): Unit = js.native
  def sync(source: obj, filter: Unit, silent: Boolean): Unit = js.native
  def sync(source: obj, filter: WebixCallback): Unit = js.native
  def sync(source: obj, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def updateItem(id: String, data: obj): Unit = js.native
  def updateItem(id: Double, data: obj): Unit = js.native
  
  var waitData: js.Promise[Any] = js.native
  
  def waitSave(handler: WebixCallback): js.Promise[Any] = js.native
}
