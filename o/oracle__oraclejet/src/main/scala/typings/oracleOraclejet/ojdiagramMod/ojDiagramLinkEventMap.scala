package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typings.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DocumentAndElementEventHandlersEventMap
import typings.std.DragEvent
import typings.std.ElementEventMap
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.GlobalEventHandlersEventMap
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
trait ojDiagramLinkEventMap
  extends ElementEventMap
     with GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var categoriesChanged: JetElementCustomEvent[js.Array[String]] = js.native
  var colorChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var endConnectorTypeChanged: JetElementCustomEvent[
    js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
  ] = js.native
  var endNodeChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any
  ] = js.native
  var labelChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | Null]] = js.native
  var selectableChanged: JetElementCustomEvent[js.UndefOr[auto | off]] = js.native
  var shortDescChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var startConnectorTypeChanged: JetElementCustomEvent[
    js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
  ] = js.native
  var startNodeChanged: JetElementCustomEvent[
    /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any
  ] = js.native
  var svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]] = js.native
  var svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]] = js.native
  var widthChanged: JetElementCustomEvent[js.UndefOr[Double]] = js.native
}

object ojDiagramLinkEventMap {
  @scala.inline
  def apply(
    abort: UIEvent,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    categoriesChanged: JetElementCustomEvent[js.Array[String]],
    change: Event,
    click: MouseEvent,
    close: Event,
    colorChanged: JetElementCustomEvent[js.UndefOr[String]],
    contextmenu: MouseEvent,
    copy: ClipboardEvent,
    cuechange: Event,
    cut: ClipboardEvent,
    dblclick: MouseEvent,
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
    endConnectorTypeChanged: JetElementCustomEvent[
      js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
    ],
    endNodeChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any
    ],
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    fullscreenchange: Event,
    fullscreenerror: Event,
    gotpointercapture: PointerEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    labelChanged: JetElementCustomEvent[js.UndefOr[String]],
    labelStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object | Null]],
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
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectableChanged: JetElementCustomEvent[js.UndefOr[auto | off]],
    selectionchange: Event,
    selectstart: Event,
    shortDescChanged: JetElementCustomEvent[js.UndefOr[String]],
    stalled: Event,
    startConnectorTypeChanged: JetElementCustomEvent[
      js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
    ],
    startNodeChanged: JetElementCustomEvent[
      /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any
    ],
    submit: Event,
    suspend: Event,
    svgClassNameChanged: JetElementCustomEvent[js.UndefOr[String]],
    svgStyleChanged: JetElementCustomEvent[js.UndefOr[js.Object]],
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
    volumechange: Event,
    waiting: Event,
    wheel: WheelEvent,
    widthChanged: JetElementCustomEvent[js.UndefOr[Double]]
  ): ojDiagramLinkEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], categoriesChanged = categoriesChanged.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], colorChanged = colorChanged.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], endConnectorTypeChanged = endConnectorTypeChanged.asInstanceOf[js.Any], endNodeChanged = endNodeChanged.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelChanged = labelChanged.asInstanceOf[js.Any], labelStyleChanged = labelStyleChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectableChanged = selectableChanged.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], shortDescChanged = shortDescChanged.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], startConnectorTypeChanged = startConnectorTypeChanged.asInstanceOf[js.Any], startNodeChanged = startNodeChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], svgClassNameChanged = svgClassNameChanged.asInstanceOf[js.Any], svgStyleChanged = svgStyleChanged.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], widthChanged = widthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramLinkEventMap]
  }
  @scala.inline
  implicit class ojDiagramLinkEventMapOps[Self <: ojDiagramLinkEventMap] (val x: Self) extends AnyVal {
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
    def setCategoriesChanged(value: JetElementCustomEvent[js.Array[String]]): Self = this.set("categoriesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("colorChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndConnectorTypeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
        ]
    ): Self = this.set("endConnectorTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndNodeChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['endNode'] */ js.Any
        ]
    ): Self = this.set("endNodeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("labelChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object | Null]]): Self = this.set("labelStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectableChanged(value: JetElementCustomEvent[js.UndefOr[auto | off]]): Self = this.set("selectableChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDescChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("shortDescChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartConnectorTypeChanged(
      value: JetElementCustomEvent[
          js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded]
        ]
    ): Self = this.set("startConnectorTypeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartNodeChanged(
      value: JetElementCustomEvent[
          /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramLink['startNode'] */ js.Any
        ]
    ): Self = this.set("startNodeChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgClassNameChanged(value: JetElementCustomEvent[js.UndefOr[String]]): Self = this.set("svgClassNameChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgStyleChanged(value: JetElementCustomEvent[js.UndefOr[js.Object]]): Self = this.set("svgStyleChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthChanged(value: JetElementCustomEvent[js.UndefOr[Double]]): Self = this.set("widthChanged", value.asInstanceOf[js.Any])
  }
  
}

