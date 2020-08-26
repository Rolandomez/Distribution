package typings.semanticUiShape

import typings.semanticUiShape.SemanticUI.Shape
import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.SemanticUI.Shape.Translation
import typings.semanticUiShape.SemanticUI.ShapeSettings
import typings.semanticUiShape.semanticUiShapeStrings.`flip back`
import typings.semanticUiShape.semanticUiShapeStrings.`flip down`
import typings.semanticUiShape.semanticUiShapeStrings.`flip left`
import typings.semanticUiShape.semanticUiShapeStrings.`flip over`
import typings.semanticUiShape.semanticUiShapeStrings.`flip right`
import typings.semanticUiShape.semanticUiShapeStrings.`flip up`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typings.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typings.semanticUiShape.semanticUiShapeStrings.`is animating`
import typings.semanticUiShape.semanticUiShapeStrings.`set default side`
import typings.semanticUiShape.semanticUiShapeStrings.`set next side`
import typings.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typings.semanticUiShape.semanticUiShapeStrings.beforeChange
import typings.semanticUiShape.semanticUiShapeStrings.className
import typings.semanticUiShape.semanticUiShapeStrings.debug
import typings.semanticUiShape.semanticUiShapeStrings.destroy
import typings.semanticUiShape.semanticUiShapeStrings.duration
import typings.semanticUiShape.semanticUiShapeStrings.error
import typings.semanticUiShape.semanticUiShapeStrings.height
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.name
import typings.semanticUiShape.semanticUiShapeStrings.namespace
import typings.semanticUiShape.semanticUiShapeStrings.next
import typings.semanticUiShape.semanticUiShapeStrings.onChange
import typings.semanticUiShape.semanticUiShapeStrings.performance
import typings.semanticUiShape.semanticUiShapeStrings.queue
import typings.semanticUiShape.semanticUiShapeStrings.refresh
import typings.semanticUiShape.semanticUiShapeStrings.repaint
import typings.semanticUiShape.semanticUiShapeStrings.reset
import typings.semanticUiShape.semanticUiShapeStrings.selector
import typings.semanticUiShape.semanticUiShapeStrings.setting
import typings.semanticUiShape.semanticUiShapeStrings.silent
import typings.semanticUiShape.semanticUiShapeStrings.verbose
import typings.semanticUiShape.semanticUiShapeStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("shape")
  var shape_Original: Shape = js.native
  def shape(): JQuery = js.native
  def shape(behavior: setting, name: beforeChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def shape(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def shape(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def shape(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def shape(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def shape(behavior: setting, name: duration, value: Double): JQuery = js.native
  def shape(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def shape(behavior: setting, name: height, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def shape(behavior: setting, name: height, value: Double): JQuery = js.native
  def shape(behavior: setting, name: height, value: initial): JQuery = js.native
  def shape(behavior: setting, name: height, value: next): JQuery = js.native
  def shape(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def shape(behavior: setting, name: namespace, value: String): JQuery = js.native
  def shape(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def shape(behavior: setting, name: name, value: String): JQuery = js.native
  def shape(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def shape(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def shape(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def shape(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def shape(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def shape(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def shape(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: width, value: js.UndefOr[scala.Nothing]): next | initial | Double = js.native
  def shape(behavior: setting, name: width, value: Double): JQuery = js.native
  def shape(behavior: setting, name: width, value: initial): JQuery = js.native
  def shape(behavior: setting, name: width, value: next): JQuery = js.native
  def shape(settings: ShapeSettings): JQuery = js.native
  @JSName("shape")
  def shape_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("shape")
  def shape_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("shape")
  def shape_JQuery(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  @JSName("shape")
  def shape_destroy(behavior: destroy): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  @JSName("shape")
  def shape_flipback(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  @JSName("shape")
  def shape_flipdown(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  @JSName("shape")
  def shape_flipleft(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  @JSName("shape")
  def shape_flipover(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  @JSName("shape")
  def shape_flipright(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  @JSName("shape")
  def shape_flipup(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  @JSName("shape")
  def shape_gettransformdown(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  @JSName("shape")
  def shape_gettransformleft(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  @JSName("shape")
  def shape_gettransformright(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  @JSName("shape")
  def shape_gettransformup(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  @JSName("shape")
  def shape_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Queues an animation until after current animation
    */
  @JSName("shape")
  def shape_queue(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  @JSName("shape")
  def shape_refresh(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  @JSName("shape")
  def shape_repaint(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  @JSName("shape")
  def shape_reset(behavior: reset): JQuery = js.native
  /**
    * Set the next side to next sibling to active element
    */
  @JSName("shape")
  def shape_setdefaultside(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: String): JQuery = js.native
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  @JSName("shape")
  def shape_setstagesize(behavior: `set stage size`): JQuery = js.native
  @JSName("shape")
  def shape_setting(behavior: setting, value: ShapeSettings): JQuery = js.native
}

