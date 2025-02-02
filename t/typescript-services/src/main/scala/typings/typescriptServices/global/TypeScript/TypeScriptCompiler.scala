package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.TypeScriptCompiler")
@js.native
open class TypeScriptCompiler ()
  extends StObject
     with typings.typescriptServices.TypeScript.TypeScriptCompiler {
  def this(logger: ILogger) = this()
  def this(logger: Unit, _settings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings) = this()
  def this(logger: ILogger, _settings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings) = this()
}
object TypeScriptCompiler {
  
  @JSGlobal("TypeScript.TypeScriptCompiler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getFullDiagnosticText(
    diagnostic: typings.typescriptServices.TypeScript.Diagnostic,
    resolvePath: js.Function1[/* path */ String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullDiagnosticText")(diagnostic.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getLocationText(location: Any, resolvePath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocationText")(location.asInstanceOf[js.Any], resolvePath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def mapToDTSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToDTSFileName")(fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def mapToFileNameExtension(`extension`: String, fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToFileNameExtension")(`extension`.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def mapToJSFileName(fileName: String, wholeFileNameReplaced: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mapToJSFileName")(fileName.asInstanceOf[js.Any], wholeFileNameReplaced.asInstanceOf[js.Any])).asInstanceOf[String]
}
