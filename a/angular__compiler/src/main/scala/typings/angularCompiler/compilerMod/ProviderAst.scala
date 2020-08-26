package typings.angularCompiler.compilerMod

import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileTokenMetadata
import typings.angularCompiler.lifecycleReflectorMod.LifecycleHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "ProviderAst")
@js.native
class ProviderAst protected ()
  extends typings.angularCompiler.publicApiMod.ProviderAst {
  def this(
    token: CompileTokenMetadata,
    multiProvider: Boolean,
    eager: Boolean,
    providers: js.Array[CompileProviderMetadata],
    providerType: typings.angularCompiler.templateAstMod.ProviderAstType,
    lifecycleHooks: js.Array[LifecycleHooks],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    isModule: Boolean
  ) = this()
}

