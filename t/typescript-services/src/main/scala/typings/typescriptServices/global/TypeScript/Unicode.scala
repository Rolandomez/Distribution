package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Unicode")
@js.native
class Unicode ()
  extends typings.typescriptServices.TypeScript.Unicode
/* static members */
@JSGlobal("TypeScript.Unicode")
@js.native
object Unicode extends js.Object {
  
  def isIdentifierPart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  def isIdentifierStart(code: Double, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  def lookupInUnicodeMap(code: Double, map: js.Array[Double]): Boolean = js.native
  
  var unicodeES3IdentifierPart: js.Array[Double] = js.native
  
  var unicodeES3IdentifierStart: js.Array[Double] = js.native
  
  var unicodeES5IdentifierPart: js.Array[Double] = js.native
  
  var unicodeES5IdentifierStart: js.Array[Double] = js.native
}
