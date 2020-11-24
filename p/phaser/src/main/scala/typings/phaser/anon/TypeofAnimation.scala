package typings.phaser.anon

import org.scalablytyped.runtime.Instantiable3
import typings.phaser.spine.Animation
import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Timeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimation
  extends Instantiable3[
      /* name */ String, 
      /* timelines */ js.Array[Timeline], 
      /* duration */ Double, 
      Animation
    ] {
  
  def binarySearch(values: ArrayLike[Double], target: Double): Double = js.native
  def binarySearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
  
  def linearSearch(values: ArrayLike[Double], target: Double, step: Double): Double = js.native
}
