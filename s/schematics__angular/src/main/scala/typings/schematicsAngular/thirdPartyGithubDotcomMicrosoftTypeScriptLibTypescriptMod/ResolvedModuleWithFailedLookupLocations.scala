package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedModuleWithFailedLookupLocations extends StObject {
  
  val resolvedModule: js.UndefOr[ResolvedModuleFull] = js.undefined
}
object ResolvedModuleWithFailedLookupLocations {
  
  inline def apply(): ResolvedModuleWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedModuleWithFailedLookupLocations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedModuleWithFailedLookupLocations] (val x: Self) extends AnyVal {
    
    inline def setResolvedModule(value: ResolvedModuleFull): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
    
    inline def setResolvedModuleUndefined: Self = StObject.set(x, "resolvedModule", js.undefined)
  }
}
