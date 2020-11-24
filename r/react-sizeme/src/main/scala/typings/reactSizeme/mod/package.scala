package typings.reactSizeme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type WithSizeOnSizeCallback = js.Function1[/* size */ typings.reactSizeme.anon.Height, scala.Unit]
}
