package typings.chance.mod

import typings.chance.Chance.ChanceStatic
import typings.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedChance extends ChanceStatic {
  
  def Chance(): typings.chance.Chance.Chance = js.native
  def Chance(generator: js.Function0[_]): typings.chance.Chance.Chance = js.native
  def Chance(seed: Seed): typings.chance.Chance.Chance = js.native
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
}
