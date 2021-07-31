package typings.wonderJs

import typings.wonderJs.bufferContainerMod.BufferContainer
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.materialMod.Material
import typings.wonderJs.matrix4Mod.Matrix4
import typings.wonderJs.programMod.Program
import typings.wonderJs.renderCommandMod.RenderCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadCommandMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/command/QuadCommand", "QuadCommand")
  @js.native
  abstract class QuadCommand () extends RenderCommand {
    
    var buffers: BufferContainer = js.native
    
    /* protected */ def draw(material: Material): Unit = js.native
    
    var mMatrix: Matrix4 = js.native
    
    var material: Material = js.native
    
    val mvpMatrix: Matrix4 = js.native
    
    var pMatrix: Matrix4 = js.native
    
    val program: Program = js.native
    
    var sortId: Double = js.native
    
    var target: GameObject = js.native
    
    var vMatrix: Matrix4 = js.native
    
    val vpMatrix: Matrix4 = js.native
  }
}
