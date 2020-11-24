package typings.rax.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  type Element = typings.rax.mod.RaxElement[js.Any, js.Any]
  
  type IntrinsicAttributes = typings.rax.mod.Attributes
  
  type IntrinsicClassAttributes[T] = typings.rax.mod.ClassAttributes[T]
  
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single Rax.lazy() around a single Rax.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = typings.rax.mod.RaxManagedAttributes[js.Any | C, P]
}
