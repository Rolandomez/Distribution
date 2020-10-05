package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.TextRange because Already inherited
- typings.typescript.mod.Node because Already inherited
- typings.typescript.mod.Declaration because Already inherited
- typings.typescript.mod.NamedDeclaration because Already inherited
- typings.typescript.mod.TypeElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _typeElementBrand, questionToken */ @js.native
trait MethodSignature
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _typeElementBrand: js.Any = js.native
  @JSName("kind")
  var kind_MethodSignature: typings.typescript.mod.SyntaxKind.MethodSignature = js.native
  @JSName("name")
  var name_MethodSignature: PropertyName = js.native
  @JSName("parent")
  var parent_MethodSignature: ObjectTypeDeclaration = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

