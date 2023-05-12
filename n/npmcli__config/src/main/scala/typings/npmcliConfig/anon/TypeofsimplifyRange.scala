package typings.npmcliConfig.anon

import typings.semver.classesRangeMod.^
import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsimplifyRange extends StObject {
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  def apply(ranges: js.Array[String], range: String): String | ^ = js.native
  def apply(ranges: js.Array[String], range: String, options: Options): String | ^ = js.native
  def apply(ranges: js.Array[String], range: ^): String | ^ = js.native
  def apply(ranges: js.Array[String], range: ^, options: Options): String | ^ = js.native
}
