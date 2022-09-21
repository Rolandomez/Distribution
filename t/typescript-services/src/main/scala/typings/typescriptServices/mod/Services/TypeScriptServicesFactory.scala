package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.IClassifierHost
import typings.typescriptServices.TypeScript.Services.ICoreServicesHost
import typings.typescriptServices.TypeScript.Services.ILanguageService
import typings.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typings.typescriptServices.TypeScript.Services.ILanguageServiceShim
import typings.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typings.typescriptServices.TypeScript.Services.IShim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.TypeScriptServicesFactory")
@js.native
open class TypeScriptServicesFactory ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.TypeScriptServicesFactory {
  
  /* private */ /* CompleteClass */
  var _shims: Any = js.native
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def createClassifier(host: IClassifierHost): typings.typescriptServices.TypeScript.Services.Classifier = js.native
  
  /* CompleteClass */
  override def createClassifierShim(host: IClassifierHost): typings.typescriptServices.TypeScript.Services.ClassifierShim = js.native
  
  /* CompleteClass */
  override def createCoreServices(host: ICoreServicesHost): typings.typescriptServices.TypeScript.Services.CoreServices = js.native
  
  /* CompleteClass */
  override def createCoreServicesShim(host: ICoreServicesHost): typings.typescriptServices.TypeScript.Services.CoreServicesShim = js.native
  
  /* CompleteClass */
  override def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim = js.native
  
  /* CompleteClass */
  override def createPullLanguageService(host: ILanguageServiceHost): ILanguageService = js.native
  
  /* CompleteClass */
  override def registerShim(shim: IShim): Unit = js.native
  
  /* CompleteClass */
  override def unregisterShim(shim: IShim): Unit = js.native
}
