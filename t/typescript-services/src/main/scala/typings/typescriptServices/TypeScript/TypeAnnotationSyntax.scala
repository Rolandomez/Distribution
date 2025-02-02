package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAnnotationSyntax
  extends StObject
     with SyntaxNode {
  
  var colonToken: ISyntaxToken = js.native
  
  var `type`: ITypeSyntax = js.native
  
  def update(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax = js.native
  
  def withColonToken(colonToken: ISyntaxToken): TypeAnnotationSyntax = js.native
  
  def withType(`type`: ITypeSyntax): TypeAnnotationSyntax = js.native
}
