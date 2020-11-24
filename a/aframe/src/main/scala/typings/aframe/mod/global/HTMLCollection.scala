package typings.aframe.mod.global

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import typings.std.Element
import typings.std.HTMLCollectionBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCollection extends HTMLCollectionBase {
  
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: String): Element | (Entity[ObjectMap[Component[_, System[_]]]]) | Null = js.native
}
