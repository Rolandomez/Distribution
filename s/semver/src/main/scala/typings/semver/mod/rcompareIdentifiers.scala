package typings.semver.mod

import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", "rcompareIdentifiers")
@js.native
object rcompareIdentifiers extends js.Object {
  def apply(): `1` | `0` | `-1` = js.native
  def apply(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  def apply(a: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: Null, b: String): `1` | `0` | `-1` = js.native
}

