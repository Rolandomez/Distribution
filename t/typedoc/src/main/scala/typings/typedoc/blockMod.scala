package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.optionsDeclarationMod.SourceFileMode
import typings.typescript.mod.Block
import typings.typescript.mod.ModuleBlock
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/block", JSImport.Namespace)
@js.native
object blockMod extends js.Object {
  
  @js.native
  class BlockConverter () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
    
    def convert(context: Context, node: Block): Reflection = js.native
    def convert(context: Context, node: ModuleBlock): Reflection = js.native
    def convert(context: Context, node: SourceFile): Reflection = js.native
    
    var convertSourceFile: js.Any = js.native
    
    var convertStatements: js.Any = js.native
    
    var mode: SourceFileMode = js.native
  }
}
