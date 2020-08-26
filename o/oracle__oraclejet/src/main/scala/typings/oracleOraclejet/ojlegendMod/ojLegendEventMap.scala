package typings.oracleOraclejet.ojlegendMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentEventMap
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.ojlegendMod.ojLegend.ojDrill
import typings.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLegendEventMap[K, D] extends dvtBaseComponentEventMap[ojLegendSettableProperties[K, D]] {
  var asChanged: JetElementCustomEvent[String] = js.native
  var dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null] = js.native
  var drillingChanged: JetElementCustomEvent[on | off] = js.native
  var expandedChanged: JetElementCustomEvent[KeySet[K] | Null] = js.native
  var halignChanged: JetElementCustomEvent[center | end | start] = js.native
  var hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var hideAndShowBehaviorChanged: JetElementCustomEvent[on | off] = js.native
  var highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var hoverBehaviorChanged: JetElementCustomEvent[dim | none] = js.native
  var hoverBehaviorDelayChanged: JetElementCustomEvent[Double] = js.native
  var ojDrill: typings.oracleOraclejet.ojlegendMod.ojLegend.ojDrill = js.native
  var orientationChanged: JetElementCustomEvent[horizontal | vertical] = js.native
  var scrollingChanged: JetElementCustomEvent[off | asNeeded] = js.native
  var symbolHeightChanged: JetElementCustomEvent[Double] = js.native
  var symbolWidthChanged: JetElementCustomEvent[Double] = js.native
  var textStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var valignChanged: JetElementCustomEvent[middle | bottom | top] = js.native
}

object ojLegendEventMap {
  @scala.inline
  def apply[K, D](
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    asChanged: JetElementCustomEvent[String],
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dataChanged: JetElementCustomEvent[(DataProvider[K, D]) | Null],
    dblclick: MouseEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drillingChanged: JetElementCustomEvent[on | off],
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    expandedChanged: JetElementCustomEvent[KeySet[K] | Null],
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    halignChanged: JetElementCustomEvent[center | end | start],
    hiddenCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hideAndShowBehaviorChanged: JetElementCustomEvent[on | off],
    highlightedCategoriesChanged: JetElementCustomEvent[js.Array[String]],
    hoverBehaviorChanged: JetElementCustomEvent[dim | none],
    hoverBehaviorDelayChanged: JetElementCustomEvent[Double],
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    ojDrill: ojDrill,
    orientationChanged: JetElementCustomEvent[horizontal | vertical],
    paste: ClipboardEvent,
    pause: Event,
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
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    scrollingChanged: JetElementCustomEvent[off | asNeeded],
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    submit: Event,
    suspend: Event,
    symbolHeightChanged: JetElementCustomEvent[Double],
    symbolWidthChanged: JetElementCustomEvent[Double],
    textStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    trackResizeChanged: JetElementCustomEvent[on | off],
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    translationsChanged: JetElementCustomEvent[js.Object | Null],
    valignChanged: JetElementCustomEvent[middle | bottom | top],
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): ojLegendEventMap[K, D] = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asChanged = asChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dataChanged = dataChanged.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drillingChanged = drillingChanged.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], halignChanged = halignChanged.asInstanceOf[js.Any], hiddenCategoriesChanged = hiddenCategoriesChanged.asInstanceOf[js.Any], hideAndShowBehaviorChanged = hideAndShowBehaviorChanged.asInstanceOf[js.Any], highlightedCategoriesChanged = highlightedCategoriesChanged.asInstanceOf[js.Any], hoverBehaviorChanged = hoverBehaviorChanged.asInstanceOf[js.Any], hoverBehaviorDelayChanged = hoverBehaviorDelayChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojDrill = ojDrill.asInstanceOf[js.Any], orientationChanged = orientationChanged.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollingChanged = scrollingChanged.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], symbolHeightChanged = symbolHeightChanged.asInstanceOf[js.Any], symbolWidthChanged = symbolWidthChanged.asInstanceOf[js.Any], textStyleChanged = textStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], trackResizeChanged = trackResizeChanged.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], valignChanged = valignChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendEventMap[K, D]]
  }
  @scala.inline
  implicit class ojLegendEventMapOps[Self <: ojLegendEventMap[_, _], K, D] (val x: Self with (ojLegendEventMap[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsChanged(value: JetElementCustomEvent[String]): Self = this.set("asChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataChanged(value: JetElementCustomEvent[(DataProvider[K, D]) | Null]): Self = this.set("dataChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrillingChanged(value: JetElementCustomEvent[on | off]): Self = this.set("drillingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedChanged(value: JetElementCustomEvent[KeySet[K] | Null]): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalignChanged(value: JetElementCustomEvent[center | end | start]): Self = this.set("halignChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("hiddenCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideAndShowBehaviorChanged(value: JetElementCustomEvent[on | off]): Self = this.set("hideAndShowBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlightedCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("highlightedCategoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehaviorChanged(value: JetElementCustomEvent[dim | none]): Self = this.set("hoverBehaviorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoverBehaviorDelayChanged(value: JetElementCustomEvent[Double]): Self = this.set("hoverBehaviorDelayChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOjDrill(value: ojDrill): Self = this.set("ojDrill", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientationChanged(value: JetElementCustomEvent[horizontal | vertical]): Self = this.set("orientationChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollingChanged(value: JetElementCustomEvent[off | asNeeded]): Self = this.set("scrollingChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolHeightChanged(value: JetElementCustomEvent[Double]): Self = this.set("symbolHeightChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolWidthChanged(value: JetElementCustomEvent[Double]): Self = this.set("symbolWidthChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("textStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setValignChanged(value: JetElementCustomEvent[middle | bottom | top]): Self = this.set("valignChanged", value.asInstanceOf[js.Any])
  }
  
}

