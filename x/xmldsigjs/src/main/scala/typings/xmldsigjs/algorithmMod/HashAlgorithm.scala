package typings.xmldsigjs.algorithmMod

import typings.std.BufferSource
import typings.std.Node
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
- typings.xmldsigjs.algorithmMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs/build/types/algorithm", "HashAlgorithm")
@js.native
abstract class HashAlgorithm () extends XmlAlgorithm {
  
  def Digest(xml: String): js.Promise[Uint8Array] = js.native
  def Digest(xml: BufferSource): js.Promise[Uint8Array] = js.native
  def Digest(xml: Node): js.Promise[Uint8Array] = js.native
}
