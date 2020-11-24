package typings.croppie.mod

import typings.croppie.anon.Orientation
import typings.croppie.anon.ResultOptionstypebase64ca
import typings.croppie.anon.ResultOptionstypeblob
import typings.croppie.anon.ResultOptionstypehtml
import typings.croppie.anon.ResultOptionstyperawcanva
import typings.croppie.croppieNumbers.`-180`
import typings.croppie.croppieNumbers.`-270`
import typings.croppie.croppieNumbers.`-90`
import typings.croppie.croppieNumbers.`180`
import typings.croppie.croppieNumbers.`270`
import typings.croppie.croppieNumbers.`90`
import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Croppie extends js.Object {
  
  def bind(options: Orientation): js.Promise[Unit] = js.native
  
  def destroy(): Unit = js.native
  
  def get(): CropData = js.native
  
  def result(): js.Promise[HTMLCanvasElement] = js.native
  def result(options: ResultOptionstypebase64ca): js.Promise[String] = js.native
  def result(options: ResultOptionstypeblob): js.Promise[Blob] = js.native
  def result(options: ResultOptionstypehtml): js.Promise[HTMLElement] = js.native
  def result(options: ResultOptionstyperawcanva): js.Promise[HTMLCanvasElement] = js.native
  def result(options: ResultOptions): js.Promise[HTMLCanvasElement] = js.native
  
  @JSName("rotate")
  def rotate_180(degrees: `-180`): Unit = js.native
  @JSName("rotate")
  def rotate_180(degrees: `180`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `-270`): Unit = js.native
  @JSName("rotate")
  def rotate_270(degrees: `270`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `-90`): Unit = js.native
  @JSName("rotate")
  def rotate_90(degrees: `90`): Unit = js.native
  
  def setZoom(zoom: Double): Unit = js.native
}
