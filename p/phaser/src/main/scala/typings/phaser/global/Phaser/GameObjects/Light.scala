package typings.phaser.global.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2D point light.
  * 
  * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
  * 
  * Any Game Objects using the Light2D pipeline will then be affected by these Lights.
  * 
  * They can also simply be used to represent a point light for your own purposes.
  */
@JSGlobal("Phaser.GameObjects.Light")
@js.native
class Light protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Light {
  /**
    * 
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    * @param radius The radius of the light.
    * @param r The red color of the light. A value between 0 and 1.
    * @param g The green color of the light. A value between 0 and 1.
    * @param b The blue color of the light. A value between 0 and 1.
    * @param intensity The intensity of the light.
    */
  def this(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double) = this()
  
  /**
    * The blue color of the light. A value between 0 and 1.
    */
  /* CompleteClass */
  var b: Double = js.native
  
  /**
    * The green color of the light. A value between 0 and 1.
    */
  /* CompleteClass */
  var g: Double = js.native
  
  /**
    * The intensity of the light.
    */
  /* CompleteClass */
  var intensity: Double = js.native
  
  /**
    * The red color of the light. A value between 0 and 1.
    */
  /* CompleteClass */
  var r: Double = js.native
  
  /**
    * The radius of the light.
    */
  /* CompleteClass */
  var radius: Double = js.native
  
  /**
    * The horizontal scroll factor of the light.
    */
  /* CompleteClass */
  var scrollFactorX: Double = js.native
  
  /**
    * The vertical scroll factor of the light.
    */
  /* CompleteClass */
  var scrollFactorY: Double = js.native
  
  /**
    * Set the properties of the light.
    * 
    * Sets both horizontal and vertical scroll factor to 1. Use {@link Phaser.GameObjects.Light#setScrollFactor} to set
    * the scroll factor.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    * @param radius The radius of the light.
    * @param r The red color. A value between 0 and 1.
    * @param g The green color. A value between 0 and 1.
    * @param b The blue color. A value between 0 and 1.
    * @param intensity The intensity of the light.
    */
  /* CompleteClass */
  override def set(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double): this.type = js.native
  
  /**
    * Set the color of the light from a single integer RGB value.
    * @param rgb The integer RGB color of the light.
    */
  /* CompleteClass */
  override def setColor(rgb: Double): this.type = js.native
  
  /**
    * Set the intensity of the light.
    * @param intensity The intensity of the light.
    */
  /* CompleteClass */
  override def setIntensity(intensity: Double): this.type = js.native
  
  /**
    * Set the position of the light.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    */
  /* CompleteClass */
  override def setPosition(x: Double, y: Double): this.type = js.native
  
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  /* CompleteClass */
  override def setRadius(radius: Double): this.type = js.native
  
  /**
    * Set the scroll factor of the light.
    * @param x The horizontal scroll factor of the light.
    * @param y The vertical scroll factor of the light.
    */
  /* CompleteClass */
  override def setScrollFactor(x: Double, y: Double): this.type = js.native
  
  /**
    * The horizontal position of the light.
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * The vertical position of the light.
    */
  /* CompleteClass */
  var y: Double = js.native
}
