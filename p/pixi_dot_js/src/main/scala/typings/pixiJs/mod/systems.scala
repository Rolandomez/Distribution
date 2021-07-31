package typings.pixiJs.mod

import typings.pixiJs.anon.AnisotropicFiltering
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextEvent
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems are individual components to the Renderer pipeline.
  * @namespace PIXI.systems
  */
object systems {
  
  /**
    * System plugin to the renderer to manage masks of certain type
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.AbstractMaskSystem")
  @js.native
  class AbstractMaskSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.AbstractMaskSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * gets count of masks of certain type
      * @returns {number}
      */
    /* CompleteClass */
    override def getStackLength(): Double = js.native
    
    /**
      * The mask stack
      * @member {PIXI.MaskData[]} PIXI.systems.AbstractMaskSystem#maskStack
      */
    /* CompleteClass */
    var maskStack: js.Array[typings.pixiJs.PIXI.MaskData] = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Changes the mask stack that is used by this System.
      *
      * @param {PIXI.MaskData[]} maskStack - The mask stack
      */
    /* CompleteClass */
    override def setMaskStack(maskStack: js.Array[typings.pixiJs.PIXI.MaskData]): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage batching.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.BatchSystem")
  @js.native
  class BatchSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.BatchSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Assigns batch locations to textures in array based on boundTextures state.
      * All textures in texArray should have `_batchEnabled = _batchId`,
      * and their count should be less than `maxTextures`.
      *
      * @param {PIXI.BatchTextureArray} texArray - textures to bound
      * @param {PIXI.BaseTexture[]} boundTextures - current state of bound textures
      * @param {number} batchId - marker for _batchEnabled param of textures in texArray
      * @param {number} maxTextures - number of texture locations to manipulate
      */
    /* CompleteClass */
    override def boundArray(
      texArray: typings.pixiJs.PIXI.BatchTextureArray,
      boundTextures: js.Array[typings.pixiJs.PIXI.BaseTexture],
      batchId: Double,
      maxTextures: Double
    ): Unit = js.native
    
    /**
      * Handy function for batch renderers: copies bound textures in first maxTextures locations to array
      * sets actual _batchLocation for them
      *
      * @param {PIXI.BaseTexture[]} - arr copy destination
      * @param {number} maxTextures - number of copied elements
      */
    /* CompleteClass */
    override def copyBoundTextures(arr: js.Array[typings.pixiJs.PIXI.BaseTexture], maxTextures: Double): Unit = js.native
    
    /**
      * The currently active ObjectRenderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#currentRenderer
      */
    /* CompleteClass */
    var currentRenderer: typings.pixiJs.PIXI.ObjectRenderer = js.native
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * An empty renderer.
      *
      * @member {PIXI.ObjectRenderer} PIXI.systems.BatchSystem#emptyRenderer
      */
    /* CompleteClass */
    var emptyRenderer: typings.pixiJs.PIXI.ObjectRenderer = js.native
    
    /**
      * This should be called if you wish to do some custom rendering
      * It will basically render anything that may be batched up such as sprites
      */
    /* CompleteClass */
    override def flush(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Reset the system to an empty renderer
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * Changes the current renderer to the one given in parameter
      *
      * @param {PIXI.ObjectRenderer} objectRenderer - The object renderer to use.
      */
    /* CompleteClass */
    override def setObjectRenderer(objectRenderer: typings.pixiJs.PIXI.ObjectRenderer): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage the context.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ContextSystem")
  @js.native
  class ContextSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.ContextSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Handle the context change event
      * @param {WebGLRenderingContext} gl - new webgl context
      */
    /* CompleteClass */
    override def contextChange(gl: WebGLRenderingContext): Unit = js.native
    
    /**
      * Helper class to create a WebGL Context
      *
      * @param canvas {HTMLCanvasElement} the canvas element that we will get the context from
      * @param options {object} An options object that gets passed in to the canvas element containing the context attributes
      * @see https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement/getContext
      * @return {WebGLRenderingContext} the WebGL context
      */
    /* CompleteClass */
    override def createContext(canvas: HTMLCanvasElement, options: js.Any): WebGLRenderingContext = js.native
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Extensions being used
      * @member {object} PIXI.systems.ContextSystem#extensions
      * @readonly
      * @property {WEBGL_draw_buffers} drawBuffers - WebGL v1 extension
      * @property {WEBGL_depth_texture} depthTexture - WebGL v1 extension
      * @property {OES_texture_float} floatTexture - WebGL v1 extension
      * @property {WEBGL_lose_context} loseContext - WebGL v1 extension
      * @property {OES_vertex_array_object} vertexArrayObject - WebGL v1 extension
      * @property {EXT_texture_filter_anisotropic} anisotropicFiltering - WebGL v1 and v2 extension
      */
    /* CompleteClass */
    override val extensions: AnisotropicFiltering = js.native
    
    /**
      * Auto-populate the extensions
      *
      * @protected
      */
    /* CompleteClass */
    /* protected */ override def getExtensions(): Unit = js.native
    
    /**
      * Handles a lost webgl context
      *
      * @protected
      * @param {WebGLContextEvent} event - The context lost event.
      */
    /* CompleteClass */
    /* protected */ override def handleContextLost(event: WebGLContextEvent): Unit = js.native
    
    /**
      * Handles a restored webgl context
      *
      * @protected
      */
    /* CompleteClass */
    /* protected */ override def handleContextRestored(): Unit = js.native
    
    /**
      * Initialize the context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - WebGL context
      */
    /* CompleteClass */
    /* protected */ override def initFromContext(gl: WebGLRenderingContext): Unit = js.native
    
    /**
      * Initialize from context options
      *
      * @protected
      * @see https://developer.mozilla.org/en-US/docs/Web/API/HTMLCanvasElement/getContext
      * @param {object} options - context attributes
      */
    /* CompleteClass */
    /* protected */ override def initFromOptions(options: js.Any): Unit = js.native
    
    /**
      * `true` if the context is lost
      * @member {boolean}
      * @readonly
      */
    /* CompleteClass */
    override val isLost: Boolean = js.native
    
    /**
      * Handle the post-render runner event
      *
      * @protected
      */
    /* CompleteClass */
    /* protected */ override def postrender(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Validate context
      *
      * @protected
      * @param {WebGLRenderingContext} gl - Render context
      */
    /* CompleteClass */
    /* protected */ override def validateContext(gl: WebGLRenderingContext): Unit = js.native
    
    /**
      * Either 1 or 2 to reflect the WebGL version being used
      * @member {number} PIXI.systems.ContextSystem#webGLVersion
      * @readonly
      */
    /* CompleteClass */
    override val webGLVersion: Double = js.native
  }
  
  /**
    * System plugin to the renderer to manage the filters.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.FilterSystem")
  @js.native
  class FilterSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.FilterSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage framebuffers.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.FramebufferSystem")
  @js.native
  class FramebufferSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.FramebufferSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage geometry.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.GeometrySystem")
  @js.native
  class GeometrySystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.GeometrySystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage masks.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.MaskSystem")
  @js.native
  class MaskSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.MaskSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage the projection matrix.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ProjectionSystem")
  @js.native
  class ProjectionSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.ProjectionSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle)
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    /* CompleteClass */
    override def calculateProjection(
      destinationFrame: typings.pixiJs.PIXI.Rectangle,
      sourceFrame: typings.pixiJs.PIXI.Rectangle,
      resolution: Double,
      root: Boolean
    ): Unit = js.native
    
    /**
      * Default destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#defaultFrame
      * @readonly
      */
    /* CompleteClass */
    override val defaultFrame: typings.pixiJs.PIXI.Rectangle = js.native
    
    /**
      * Destination frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#destinationFrame
      * @readonly
      */
    /* CompleteClass */
    override val destinationFrame: typings.pixiJs.PIXI.Rectangle = js.native
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Project matrix
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#projectionMatrix
      * @readonly
      */
    /* CompleteClass */
    override val projectionMatrix: typings.pixiJs.PIXI.Matrix = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Sets the transform of the active render target to the given matrix
      *
      * @param {PIXI.Matrix} matrix - The transformation matrix
      */
    /* CompleteClass */
    override def setTransform(matrix: typings.pixiJs.PIXI.Matrix): Unit = js.native
    
    /**
      * Source frame
      * @member {PIXI.Rectangle} PIXI.systems.ProjectionSystem#sourceFrame
      * @readonly
      */
    /* CompleteClass */
    override val sourceFrame: typings.pixiJs.PIXI.Rectangle = js.native
    
    /**
      * A transform that will be appended to the projection matrix
      * if null, nothing will be applied
      * @member {PIXI.Matrix} PIXI.systems.ProjectionSystem#transform
      */
    /* CompleteClass */
    var transform: typings.pixiJs.PIXI.Matrix = js.native
    
    /**
      * Updates the projection matrix based on a projection frame (which is a rectangle).
      *
      * Make sure to run `renderer.framebuffer.setViewport(destinationFrame)` after calling this.
      *
      * @param {PIXI.Rectangle} destinationFrame - The destination frame.
      * @param {PIXI.Rectangle} sourceFrame - The source frame.
      * @param {Number} resolution - Resolution
      * @param {boolean} root - If is root
      */
    /* CompleteClass */
    override def update(
      destinationFrame: typings.pixiJs.PIXI.Rectangle,
      sourceFrame: typings.pixiJs.PIXI.Rectangle,
      resolution: Double,
      root: Boolean
    ): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage render textures.
    *
    * Should be added after FramebufferSystem
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.RenderTextureSystem")
  @js.native
  class RenderTextureSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.RenderTextureSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage scissor rects (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ScissorSystem")
  @js.native
  class ScissorSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.ScissorSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Pops scissor mask. MaskData is already removed from stack
      */
    /* CompleteClass */
    override def pop(): Unit = js.native
    
    /**
      * Applies the Mask and adds it to the current stencil stack. @alvin
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    /* CompleteClass */
    override def push(maskData: typings.pixiJs.PIXI.MaskData): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage shaders.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.ShaderSystem")
  @js.native
  class ShaderSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.ShaderSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage WebGL state machines.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.StateSystem")
  @js.native
  class StateSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.StateSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Whether current blend equation is different
      * @member {boolean} PIXI.systems.StateSystem#_blendEq
      * @protected
      */
    /* CompleteClass */
    var _blendEq: Boolean = js.native
    
    /**
      * Blend mode
      * @member {number} PIXI.systems.StateSystem#blendMode
      * @default PIXI.BLEND_MODES.NONE
      * @readonly
      */
    /* CompleteClass */
    override val blendMode: Double = js.native
    
    /**
      * Collection of check calls
      * @member {function[]} PIXI.systems.StateSystem#checks
      * @readonly
      */
    /* CompleteClass */
    override val checks: js.Array[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    
    /**
      * Default WebGL State
      * @member {PIXI.State} PIXI.systems.StateSystem#defaultState
      * @readonly
      */
    /* CompleteClass */
    override val defaultState: typings.pixiJs.PIXI.State = js.native
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Sets the state, when previous state is unknown
      *
      * @param {*} state - The state to set
      */
    /* CompleteClass */
    override def forceState(state: js.Any): Unit = js.native
    
    /**
      * GL context
      * @member {WebGLRenderingContext} PIXI.systems.StateSystem#gl
      * @readonly
      */
    /* CompleteClass */
    override val gl: WebGLRenderingContext = js.native
    
    /**
      * Collection of calls
      * @member {function[]} PIXI.systems.StateSystem#map
      * @readonly
      */
    /* CompleteClass */
    override val map: js.Array[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
    
    /**
      * Polygon offset
      * @member {number} PIXI.systems.StateSystem#polygonOffset
      * @readonly
      */
    /* CompleteClass */
    override val polygonOffset: Double = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Resets all the logic and disables the vaos
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * Sets the current state
      *
      * @param {*} state - The state to set.
      */
    /* CompleteClass */
    override def set(state: js.Any): Unit = js.native
    
    /**
      * Enables or disabled blending.
      *
      * @param {boolean} value - Turn on or off webgl blending.
      */
    /* CompleteClass */
    override def setBlend(value: Boolean): Unit = js.native
    
    /**
      * Sets the blend mode.
      *
      * @param {number} value - The blend mode to set to.
      */
    /* CompleteClass */
    override def setBlendMode(value: Double): Unit = js.native
    
    /**
      * Sets whether to enable or disable cull face.
      *
      * @param {boolean} value - Turn on or off webgl cull face.
      */
    /* CompleteClass */
    override def setCullFace(value: Boolean): Unit = js.native
    
    /**
      * Sets whether to enable or disable depth test.
      *
      * @param {boolean} value - Turn on or off webgl depth testing.
      */
    /* CompleteClass */
    override def setDepthTest(value: Boolean): Unit = js.native
    
    /**
      * Sets the gl front face.
      *
      * @param {boolean} value - true is clockwise and false is counter-clockwise
      */
    /* CompleteClass */
    override def setFrontFace(value: Boolean): Unit = js.native
    
    /**
      * Enables or disable polygon offset fill
      *
      * @param {boolean} value - Turn on or off webgl polygon offset testing.
      */
    /* CompleteClass */
    override def setOffset(value: Boolean): Unit = js.native
    
    /**
      * Sets the polygon offset.
      *
      * @param {number} value - the polygon offset
      * @param {number} scale - the polygon offset scale
      */
    /* CompleteClass */
    override def setPolygonOffset(value: Double, scale: Double): Unit = js.native
    
    /**
      * State ID
      * @member {number} PIXI.systems.StateSystem#stateId
      * @readonly
      */
    /* CompleteClass */
    override val stateId: Double = js.native
    
    /**
      * checks to see which updates should be checked based on which settings have been activated.
      * For example, if blend is enabled then we should check the blend modes each time the state is changed
      * or if polygon fill is activated then we need to check if the polygon offset changes.
      * The idea is that we only check what we have too.
      *
      * @param {Function} func - the checking function to add or remove
      * @param {boolean} value - should the check function be added or removed.
      */
    /* CompleteClass */
    override def updateCheck(func: js.Function1[/* repeated */ js.Any, js.Any], value: Boolean): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage stencils (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.StencilSystem")
  @js.native
  class StencilSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.StencilSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Pops stencil mask. MaskData is already removed from stack
      *
      * @param {PIXI.DisplayObject} maskObject - object of popped mask data
      */
    /* CompleteClass */
    override def pop(maskObject: typings.pixiJs.PIXI.DisplayObject): Unit = js.native
    
    /**
      * Applies the Mask and adds it to the current stencil stack.
      *
      * @param {PIXI.MaskData} maskData - The mask data
      */
    /* CompleteClass */
    override def push(maskData: typings.pixiJs.PIXI.MaskData): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
  
  /**
    * System plugin to the renderer to manage texture garbage collection on the GPU,
    * ensuring that it does not get clogged up with textures that are no longer being used.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.TextureGCSystem")
  @js.native
  class TextureGCSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.TextureGCSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Check count
      * @member {number} PIXI.systems.TextureGCSystem#checkCount
      * @readonly
      */
    /* CompleteClass */
    override val checkCount: Double = js.native
    
    /**
      * Maximum number of item to check
      * @member {number} PIXI.systems.TextureGCSystem#checkCountMax
      * @see PIXI.settings.GC_MAX_CHECK_COUNT
      */
    /* CompleteClass */
    var checkCountMax: Double = js.native
    
    /**
      * Count
      * @member {number} PIXI.systems.TextureGCSystem#count
      * @readonly
      */
    /* CompleteClass */
    override val count: Double = js.native
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Maximum idle time, in seconds
      * @member {number} PIXI.systems.TextureGCSystem#maxIdle
      * @see PIXI.settings.GC_MAX_IDLE
      */
    /* CompleteClass */
    var maxIdle: Double = js.native
    
    /**
      * Current garabage collection mode
      * @member {PIXI.GC_MODES} PIXI.systems.TextureGCSystem#mode
      * @see PIXI.settings.GC_MODE
      */
    /* CompleteClass */
    var mode: typings.pixiJs.PIXI.GC_MODES = js.native
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    /* CompleteClass */
    override def postrender(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    /* CompleteClass */
    override def run(): Unit = js.native
    
    /**
      * Removes all the textures within the specified displayObject and its children from the GPU
      *
      * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
      */
    /* CompleteClass */
    override def unload(displayObject: typings.pixiJs.PIXI.DisplayObject): Unit = js.native
  }
  
  /**
    * System plugin to the renderer to manage textures.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.TextureSystem")
  @js.native
  class TextureSystem protected ()
    extends StObject
       with typings.pixiJs.PIXI.systems.TextureSystem {
    def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
    
    /**
      * Generic destroy methods to be overridden by the subclass
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The renderer this manager works for.
      *
      * @member {PIXI.Renderer} PIXI.System#renderer
      */
    /* CompleteClass */
    var renderer: typings.pixiJs.PIXI.Renderer = js.native
  }
}
