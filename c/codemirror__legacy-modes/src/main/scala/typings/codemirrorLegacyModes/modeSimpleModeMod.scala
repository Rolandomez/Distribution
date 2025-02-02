package typings.codemirrorLegacyModes

import typings.codemirrorLanguage.mod.StreamParser
import typings.codemirrorLegacyModes.anon.Start
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modeSimpleModeMod {
  
  @JSImport("@codemirror/legacy-modes/mode/simple-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simpleMode_languageData[K /* <: String */](
    states: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: P extends 'languageData'? {[name: string] : any} : std.Array<@codemirror/legacy-modes.@codemirror/legacy-modes/mode/simple-mode.Rule>} */ js.Any) & Start
  ): StreamParser[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleMode")(states.asInstanceOf[js.Any]).asInstanceOf[StreamParser[Any]]
  
  trait Rule extends StObject {
    
    var dedent: js.UndefOr[Boolean] = js.undefined
    
    var dedentIfLineStart: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Boolean] = js.undefined
    
    var next: js.UndefOr[String] = js.undefined
    
    var pop: js.UndefOr[Boolean] = js.undefined
    
    var push: js.UndefOr[String] = js.undefined
    
    var regex: js.UndefOr[String | js.RegExp] = js.undefined
    
    var sol: js.UndefOr[Boolean] = js.undefined
    
    var token: js.UndefOr[
        String | js.Array[String] | Null | (js.Function1[/* matches */ RegExpMatchArray, String | js.Array[String] | Null])
      ] = js.undefined
  }
  object Rule {
    
    inline def apply(): Rule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      inline def setDedent(value: Boolean): Self = StObject.set(x, "dedent", value.asInstanceOf[js.Any])
      
      inline def setDedentIfLineStart(value: Boolean): Self = StObject.set(x, "dedentIfLineStart", value.asInstanceOf[js.Any])
      
      inline def setDedentIfLineStartUndefined: Self = StObject.set(x, "dedentIfLineStart", js.undefined)
      
      inline def setDedentUndefined: Self = StObject.set(x, "dedent", js.undefined)
      
      inline def setIndent(value: Boolean): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setRegex(value: String | js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setSol(value: Boolean): Self = StObject.set(x, "sol", value.asInstanceOf[js.Any])
      
      inline def setSolUndefined: Self = StObject.set(x, "sol", js.undefined)
      
      inline def setToken(
        value: String | js.Array[String] | (js.Function1[/* matches */ RegExpMatchArray, String | js.Array[String] | Null])
      ): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenFunction1(value: /* matches */ RegExpMatchArray => String | js.Array[String] | Null): Self = StObject.set(x, "token", js.Any.fromFunction1(value))
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setTokenVarargs(value: String*): Self = StObject.set(x, "token", js.Array(value*))
    }
  }
}
