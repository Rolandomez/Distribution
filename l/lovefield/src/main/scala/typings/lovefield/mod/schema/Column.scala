package typings.lovefield.mod.schema

import typings.lovefield.mod.PredicateProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends PredicateProvider {
  
  def as(name: String): Column = js.native
  
  def getName(): String = js.native
  
  def getNormalizedName(): String = js.native
}
