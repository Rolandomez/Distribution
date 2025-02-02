package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEmailComposerService extends StObject {
  
  def addAlias(app: String, schema: String): Unit
  
  def isAvailable(): IPromise[Boolean]
  
  def open(properties: IEmailComposerOptions): IPromise[js.Any]
}
object IEmailComposerService {
  
  inline def apply(
    addAlias: (String, String) => Unit,
    isAvailable: () => IPromise[Boolean],
    open: IEmailComposerOptions => IPromise[js.Any]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IEmailComposerService]
  }
  
  extension [Self <: IEmailComposerService](x: Self) {
    
    inline def setAddAlias(value: (String, String) => Unit): Self = StObject.set(x, "addAlias", js.Any.fromFunction2(value))
    
    inline def setIsAvailable(value: () => IPromise[Boolean]): Self = StObject.set(x, "isAvailable", js.Any.fromFunction0(value))
    
    inline def setOpen(value: IEmailComposerOptions => IPromise[js.Any]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
