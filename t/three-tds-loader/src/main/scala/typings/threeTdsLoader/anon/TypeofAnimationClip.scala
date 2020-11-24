package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable0
import typings.three.boneMod.Bone
import typings.three.geometryMod.MorphTarget
import typings.three.mod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationClip extends Instantiable0[AnimationClip] {
  
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.three.animationClipMod.AnimationClip] = js.native
  
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.three.animationClipMod.AnimationClip = js.native
  
  def findByName(clipArray: js.Array[typings.three.animationClipMod.AnimationClip], name: String): typings.three.animationClipMod.AnimationClip = js.native
  
  def parse(json: js.Any): typings.three.animationClipMod.AnimationClip = js.native
  
  def parseAnimation(animation: js.Any, bones: js.Array[Bone]): typings.three.animationClipMod.AnimationClip = js.native
  
  def toJSON(clip: typings.three.animationClipMod.AnimationClip): js.Any = js.native
}
