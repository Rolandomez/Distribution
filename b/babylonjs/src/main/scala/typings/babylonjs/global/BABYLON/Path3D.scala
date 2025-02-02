package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Path3D")
@js.native
open class Path3D protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Path3D {
  /**
    * new Path3D(path, normal, raw)
    * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
    * please read the description in the tutorial : https://doc.babylonjs.com/features/featuresDeepDive/mesh/path3D
    * @param path an array of Vector3, the curve axis of the Path3D
    * @param firstNormal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
    * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
    * @param alignTangentsWithPath (optional, default false) : boolean, if true the tangents will be aligned with the path.
    */
  def this(/**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3]) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Nullable[typings.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Unit,
    raw: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Nullable[typings.babylonjs.BABYLON.Vector3],
    raw: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Unit,
    raw: Boolean,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Unit,
    raw: Unit,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Nullable[typings.babylonjs.BABYLON.Vector3],
    raw: Boolean,
    alignTangentsWithPath: Boolean
  ) = this()
  def this(
    /**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[typings.babylonjs.BABYLON.Vector3],
    firstNormal: Nullable[typings.babylonjs.BABYLON.Vector3],
    raw: Unit,
    alignTangentsWithPath: Boolean
  ) = this()
}
