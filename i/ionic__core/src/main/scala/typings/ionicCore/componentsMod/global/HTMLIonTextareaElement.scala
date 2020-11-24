package typings.ionicCore.componentsMod.global

import org.scalablytyped.runtime.Instantiable0
import typings.ionicCore.ionicCoreStrings.decimal
import typings.ionicCore.ionicCoreStrings.done
import typings.ionicCore.ionicCoreStrings.email
import typings.ionicCore.ionicCoreStrings.enter
import typings.ionicCore.ionicCoreStrings.go
import typings.ionicCore.ionicCoreStrings.hard
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.next
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.numeric
import typings.ionicCore.ionicCoreStrings.off
import typings.ionicCore.ionicCoreStrings.previous
import typings.ionicCore.ionicCoreStrings.search
import typings.ionicCore.ionicCoreStrings.send
import typings.ionicCore.ionicCoreStrings.soft
import typings.ionicCore.ionicCoreStrings.tel
import typings.ionicCore.ionicCoreStrings.text
import typings.ionicCore.ionicCoreStrings.url
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ionicCore.componentsMod.Components.IonTextarea because var conflicts: autocapitalize, autofocus, spellcheck. Inlined autoGrow, clearOnEdit, color, cols, debounce, disabled, enterkeyhint, fireFocusEvents, getInputElement, inputmode, maxlength, minlength, mode, name, placeholder, readonly, required, rows, setBlur, setFocus, value, wrap */ @js.native
trait HTMLIonTextareaElement extends HTMLStencilElement {
  
  /**
    * If `true`, the element height will increase based on the value.
    */
  var autoGrow: Boolean = js.native
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  var clearOnEdit: Boolean = js.native
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * The visible width of the text control, in average character widths. If it is specified, it must be a positive integer.
    */
  var cols: js.UndefOr[Double] = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  var disabled: Boolean = js.native
  
  /**
    * A hint to the browser for which enter key to display. Possible values: `"enter"`, `"done"`, `"go"`, `"next"`, `"previous"`, `"search"`, and `"send"`.
    */
  var enterkeyhint: js.UndefOr[enter | done | go | next | previous | search | send] = js.native
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  var fireFocusEvents: Boolean = js.native
  
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  
  /**
    * A hint to the browser for which keyboard to display. Possible values: `"none"`, `"text"`, `"tel"`, `"url"`, `"email"`, `"numeric"`, `"decimal"`, and `"search"`.
    */
  var inputmode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the maximum number of characters that the user can enter.
    */
  var maxlength: js.UndefOr[Double] = js.native
  
  /**
    * If the value of the type attribute is `text`, `email`, `search`, `password`, `tel`, or `url`, this attribute specifies the minimum number of characters that the user can enter.
    */
  var minlength: js.UndefOr[Double] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String = js.native
  
  /**
    * Instructional text that shows before the input has a value.
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  
  /**
    * If `true`, the user cannot modify the value.
    */
  var readonly: Boolean = js.native
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  var required: Boolean = js.native
  
  /**
    * The number of visible text lines for the control.
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.blur()`.
    */
  def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.focus()`.
    */
  def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * The value of the textarea.
    */
  var value: js.UndefOr[String | Null] = js.native
  
  /**
    * Indicates how the control wraps text.
    */
  var wrap: js.UndefOr[hard | soft | off] = js.native
}
@JSGlobal("HTMLIonTextareaElement")
@js.native
object HTMLIonTextareaElement extends Instantiable0[HTMLIonTextareaElement]
