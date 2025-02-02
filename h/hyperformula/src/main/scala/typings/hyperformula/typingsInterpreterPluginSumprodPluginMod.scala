package typings.hyperformula

import typings.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typings.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typings.hyperformula.typingsInterpreterPluginFunctionPluginMod.ImplementedFunctions
import typings.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginSumprodPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin")
  @js.native
  open class SumprodPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def sumproduct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object SumprodPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ImplementedFunctions = js.native
    inline def implementedFunctions_=(x: ImplementedFunctions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
