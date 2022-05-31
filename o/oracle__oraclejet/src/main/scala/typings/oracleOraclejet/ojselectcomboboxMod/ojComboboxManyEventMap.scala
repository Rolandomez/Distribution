package typings.oracleOraclejet.ojselectcomboboxMod

import typings.oracleOraclejet.anon.Children
import typings.oracleOraclejet.anon.Class
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.LabelValue
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.OptionContext
import typings.oracleOraclejet.ojselectcomboboxMod.ojComboboxMany.ojAnimateEnd
import typings.oracleOraclejet.ojselectcomboboxMod.ojComboboxMany.ojAnimateStart
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojComboboxManyEventMap[K, D]
  extends StObject
     with ojComboboxEventMap[
      js.Array[js.Any] | Null, 
      ojComboboxManySettableProperties[K, D], 
      js.Array[js.Any] | Null, 
      String
    ] {
  
  var asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[js.Array[js.Any]]]]
  
  var converterChanged: JetElementCustomEvent[Converter[js.Any] | RegisteredConverter | Null]
  
  var minLengthChanged: JetElementCustomEvent[Double]
  
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojComboboxManyEventMap: ojAnimateEnd
  
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojComboboxManyEventMap: ojAnimateStart
  
  var optionRendererChanged: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]]
  
  var optionsChanged: JetElementCustomEvent[
    (js.Array[
      typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
    ]) | (DataProvider[K, D]) | Null
  ]
  
  var optionsKeysChanged: JetElementCustomEvent[Children]
  
  var pickerAttributesChanged: JetElementCustomEvent[Class]
  
  var placeholderChanged: JetElementCustomEvent[String | Null]
  
  var rawValueChanged: JetElementCustomEvent[String | Null]
  
  var readOnlyChanged: JetElementCustomEvent[Boolean]
  
  var requiredChanged: JetElementCustomEvent[Boolean]
  
  var validatorsChanged: JetElementCustomEvent[(js.Array[Validator[js.Array[js.Any]] | RegisteredValidator]) | Null]
  
  var valueOptionsChanged: JetElementCustomEvent[js.Array[LabelValue] | Null]
}
object ojComboboxManyEventMap {
  
  inline def apply[K, D](
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[js.Array[js.Any]]]],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    converterChanged: JetElementCustomEvent[Converter[js.Any] | RegisteredConverter | Null],
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
    describedByChanged: JetElementCustomEvent[String | Null],
    disabledChanged: JetElementCustomEvent[Boolean],
    displayOptionsChanged: JetElementCustomEvent[ConverterHint],
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    helpChanged: JetElementCustomEvent[Instruction],
    helpHintsChanged: JetElementCustomEvent[Definition],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelHintChanged: JetElementCustomEvent[String],
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    messagesCustomChanged: JetElementCustomEvent[js.Array[^]],
    minLengthChanged: JetElementCustomEvent[Double],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojAnimateEnd: ojAnimateEnd,
    ojAnimateStart: ojAnimateStart,
    optionRendererChanged: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]],
    optionsChanged: JetElementCustomEvent[
      (js.Array[
        typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
      ]) | (DataProvider[K, D]) | Null
    ],
    optionsKeysChanged: JetElementCustomEvent[Children],
    paste: ClipboardEvent,
    pause: Event,
    pickerAttributesChanged: JetElementCustomEvent[Class],
    placeholderChanged: JetElementCustomEvent[String | Null],
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    progress: ProgressEvent[EventTarget],
    ratechange: Event,
    rawValueChanged: JetElementCustomEvent[String | Null],
    readOnlyChanged: JetElementCustomEvent[Boolean],
    requiredChanged: JetElementCustomEvent[Boolean],
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    validChanged: JetElementCustomEvent[valid | pending | invalidHidden | invalidShown],
    validatorsChanged: JetElementCustomEvent[(js.Array[Validator[js.Array[js.Any]] | RegisteredValidator]) | Null],
    valueChanged: JetElementCustomEvent[js.Array[js.Any] | Null],
    valueOptionsChanged: JetElementCustomEvent[js.Array[LabelValue] | Null],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojComboboxManyEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asyncValidatorsChanged = asyncValidatorsChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minLengthChanged = minLengthChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], optionRendererChanged = optionRendererChanged.asInstanceOf[js.Any], optionsChanged = optionsChanged.asInstanceOf[js.Any], optionsKeysChanged = optionsKeysChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pickerAttributesChanged = pickerAttributesChanged.asInstanceOf[js.Any], placeholderChanged = placeholderChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rawValueChanged = rawValueChanged.asInstanceOf[js.Any], readOnlyChanged = readOnlyChanged.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], validatorsChanged = validatorsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], valueOptionsChanged = valueOptionsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojComboboxManyEventMap[K, D]]
  }
  
  extension [Self <: ojComboboxManyEventMap[?, ?], K, D](x: Self & (ojComboboxManyEventMap[K, D])) {
    
    inline def setAsyncValidatorsChanged(value: JetElementCustomEvent[js.Array[AsyncValidator[js.Array[js.Any]]]]): Self = StObject.set(x, "asyncValidatorsChanged", value.asInstanceOf[js.Any])
    
    inline def setConverterChanged(value: JetElementCustomEvent[Converter[js.Any] | RegisteredConverter | Null]): Self = StObject.set(x, "converterChanged", value.asInstanceOf[js.Any])
    
    inline def setMinLengthChanged(value: JetElementCustomEvent[Double]): Self = StObject.set(x, "minLengthChanged", value.asInstanceOf[js.Any])
    
    inline def setOjAnimateEnd(value: ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
    
    inline def setOjAnimateStart(value: ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
    
    inline def setOptionRendererChanged(
      value: JetElementCustomEvent[js.UndefOr[(js.Function1[/* param0 */ OptionContext, Element]) | Null]]
    ): Self = StObject.set(x, "optionRendererChanged", value.asInstanceOf[js.Any])
    
    inline def setOptionsChanged(
      value: JetElementCustomEvent[
          (js.Array[
            typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Option | typings.oracleOraclejet.ojselectcomboboxMod.ojCombobox.Optgroup
          ]) | (DataProvider[K, D]) | Null
        ]
    ): Self = StObject.set(x, "optionsChanged", value.asInstanceOf[js.Any])
    
    inline def setOptionsKeysChanged(value: JetElementCustomEvent[Children]): Self = StObject.set(x, "optionsKeysChanged", value.asInstanceOf[js.Any])
    
    inline def setPickerAttributesChanged(value: JetElementCustomEvent[Class]): Self = StObject.set(x, "pickerAttributesChanged", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "placeholderChanged", value.asInstanceOf[js.Any])
    
    inline def setRawValueChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "rawValueChanged", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "readOnlyChanged", value.asInstanceOf[js.Any])
    
    inline def setRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "requiredChanged", value.asInstanceOf[js.Any])
    
    inline def setValidatorsChanged(value: JetElementCustomEvent[(js.Array[Validator[js.Array[js.Any]] | RegisteredValidator]) | Null]): Self = StObject.set(x, "validatorsChanged", value.asInstanceOf[js.Any])
    
    inline def setValueOptionsChanged(value: JetElementCustomEvent[js.Array[LabelValue] | Null]): Self = StObject.set(x, "valueOptionsChanged", value.asInstanceOf[js.Any])
  }
}
