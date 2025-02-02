package typings.raml1Parser.distParserArtifactsRaml08parserMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ExampleStringImpl")
@js.native
open class ExampleStringImpl protected () extends StringTypeImpl {
  def this(attr: IAttribute) = this()
}
/* static members */
object ExampleStringImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ExampleStringImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
