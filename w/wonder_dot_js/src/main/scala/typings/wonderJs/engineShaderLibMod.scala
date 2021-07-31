package typings.wonderJs

import typings.wonderJs.engineShaderMod.EngineShader
import typings.wonderJs.materialMod.Material
import typings.wonderJs.programMod.Program
import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.shaderChunkMod.GLSLChunk
import typings.wonderJs.shaderLibMod.ShaderLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/EngineShaderLib", "EngineShaderLib")
  @js.native
  abstract class EngineShaderLib () extends ShaderLib {
    
    /* protected */ def addAttributeVariable(variableArr: js.Array[String]): Unit = js.native
    
    /* protected */ def addUniformVariable(variableArr: js.Array[String]): Unit = js.native
    
    var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
    
    var fsChunk: GLSLChunk = js.native
    
    var fsSource: String = js.native
    
    var fsSourceBody: String = js.native
    
    var fsSourceDefine: String = js.native
    
    var fsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
    
    var fsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
    
    var fsSourceFuncDeclare: String = js.native
    
    var fsSourceFuncDefine: String = js.native
    
    var fsSourceTop: String = js.native
    
    var fsSourceVarDeclare: String = js.native
    
    /* protected */ def getFsChunk(): js.Any = js.native
    /* protected */ def getFsChunk(chunk: GLSLChunk): js.Any = js.native
    
    /* protected */ def getVsChunk(): js.Any = js.native
    /* protected */ def getVsChunk(chunk: GLSLChunk): js.Any = js.native
    
    /* protected */ def sendAttributeBuffer(program: Program, name: String, data: js.Any): Unit = js.native
    
    /* protected */ def sendUniformData(program: Program, name: String, data: js.Any): Unit = js.native
    
    /* protected */ def setFsSource(fs: String): Unit = js.native
    /* protected */ def setFsSource(fs: String, operator: String): Unit = js.native
    /* protected */ def setFsSource(fs: GLSLChunk): Unit = js.native
    /* protected */ def setFsSource(fs: GLSLChunk, operator: String): Unit = js.native
    
    def setShaderDefinition(cmd: RenderCommand, material: Material): Unit = js.native
    
    /* protected */ def setVsSource(vs: String): Unit = js.native
    /* protected */ def setVsSource(vs: String, operator: String): Unit = js.native
    /* protected */ def setVsSource(vs: GLSLChunk): Unit = js.native
    /* protected */ def setVsSource(vs: GLSLChunk, operator: String): Unit = js.native
    
    @JSName("shader")
    var shader_EngineShaderLib: EngineShader = js.native
    
    var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
    
    var vsChunk: GLSLChunk = js.native
    
    var vsSource: String = js.native
    
    var vsSourceBody: String = js.native
    
    var vsSourceDefine: String = js.native
    
    var vsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
    
    var vsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
    
    var vsSourceFuncDeclare: String = js.native
    
    var vsSourceFuncDefine: String = js.native
    
    var vsSourceTop: String = js.native
    
    var vsSourceVarDeclare: String = js.native
  }
}
