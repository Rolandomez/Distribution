package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new RaycastResult.
  * @property entity - The entity that was hit.
  * @property point - The point at which the ray hit the entity in world space.
  * @property normal - The normal vector of the surface where the ray hit in world space.
  * @param entity - The entity that was hit.
  * @param point - The point at which the ray hit the entity in world space.
  * @param normal - The normal vector of the surface where the ray hit in world space.
  */
@JSGlobal("pc.RaycastResult")
@js.native
class RaycastResult protected ()
  extends StObject
     with typings.playcanvas.pc.RaycastResult {
  def this(
    entity: typings.playcanvas.pc.Entity,
    point: typings.playcanvas.pc.Vec3,
    normal: typings.playcanvas.pc.Vec3
  ) = this()
  
  /**
    * The entity that was hit.
    */
  /* CompleteClass */
  var entity: typings.playcanvas.pc.Entity = js.native
  
  /**
    * The normal vector of the surface where the ray hit in world space.
    */
  /* CompleteClass */
  var normal: typings.playcanvas.pc.Vec3 = js.native
  
  /**
    * The point at which the ray hit the entity in world space.
    */
  /* CompleteClass */
  var point: typings.playcanvas.pc.Vec3 = js.native
}
