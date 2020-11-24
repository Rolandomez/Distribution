package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Ray")
@js.native
class Ray protected ()
  extends typings.babylonjs.BABYLON.Ray {
  /**
    * Creates a new ray
    * @param origin origin point
    * @param direction direction
    * @param length length of the ray
    */
  def this(
    /** origin point */
  origin: typings.babylonjs.BABYLON.Vector3,
    /** direction */
  direction: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** origin point */
  origin: typings.babylonjs.BABYLON.Vector3,
    /** direction */
  direction: typings.babylonjs.BABYLON.Vector3,
    /** length of the ray */
  length: Double
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.Ray")
@js.native
object Ray extends js.Object {
  
  /**
    * Creates a new ray from screen space and viewport
    * @param x position
    * @param y y position
    * @param viewportWidth viewport width
    * @param viewportHeight viewport height
    * @param world world matrix
    * @param view view matrix
    * @param projection projection matrix
    * @returns new ray
    */
  def CreateNew(
    x: Double,
    y: Double,
    viewportWidth: Double,
    viewportHeight: Double,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    view: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    projection: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
    * transformed to the given world matrix.
    * @param origin The origin point
    * @param end The end point
    * @param world a matrix to transform the ray to. Default is the identity matrix.
    * @returns the new ray
    */
  def CreateNewFromTo(origin: typings.babylonjs.BABYLON.Vector3, end: typings.babylonjs.BABYLON.Vector3): typings.babylonjs.BABYLON.Ray = js.native
  def CreateNewFromTo(
    origin: typings.babylonjs.BABYLON.Vector3,
    end: typings.babylonjs.BABYLON.Vector3,
    world: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @returns the resulting new ray
    */
  def Transform(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ): typings.babylonjs.BABYLON.Ray = js.native
  
  /**
    * Transforms a ray by a matrix
    * @param ray ray to transform
    * @param matrix matrix to apply
    * @param result ray to store result in
    */
  def TransformToRef(
    ray: DeepImmutable[typings.babylonjs.BABYLON.Ray],
    matrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix],
    result: typings.babylonjs.BABYLON.Ray
  ): Unit = js.native
  
  /**
    * Creates a ray with origin and direction of 0,0,0
    * @returns the new ray
    */
  def Zero(): typings.babylonjs.BABYLON.Ray = js.native
  
  val _TmpVector3: js.Any = js.native
  
  var rayl: js.Any = js.native
  
  var smallnum: js.Any = js.native
}
