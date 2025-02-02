package typings.three.buildThreeDotminMod

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "Mesh")
@js.native
/**
  * Create a new instance of {@link Mesh}
  * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}. Default {@link THREE.BufferGeometry | `new THREE.BufferGeometry()`}.
  * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
  */
open class Mesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] ()
  extends typings.three.srcThreeMod.Mesh[TGeometry, TMaterial] {
  def this(geometry: TGeometry) = this()
  def this(geometry: TGeometry, material: TMaterial) = this()
  def this(geometry: Unit, material: TMaterial) = this()
}
