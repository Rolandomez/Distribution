package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordTokenizer
  extends StObject
     with Tokenizer
object WordTokenizer {
  
  inline def apply(tokenize: String => js.Array[String]): WordTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[WordTokenizer]
  }
}
