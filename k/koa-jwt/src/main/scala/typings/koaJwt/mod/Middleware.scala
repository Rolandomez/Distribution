package typings.koaJwt.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koaJwt.anon.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<ParameterizedContext<StateT, CustomT>> * / any */ @js.native
trait Middleware extends js.Object {
  
  def unless(): typings.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
  def unless(params: Custom): typings.koa.mod.Middleware[DefaultState, DefaultContext] = js.native
}
