package typings.expoFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoFont.fontTypesMod.FontSource
import typings.expoFont.fontTypesMod.UnloadFontOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-font", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isLoaded(fontFamily: String): Boolean = js.native
  def isLoading(fontFamily: String): Boolean = js.native
  def loadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: String, source: FontSource): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
  def processFontFamily(): String | Null = js.native
  def processFontFamily(fontFamily: String): String | Null = js.native
  def unloadAllAsync(): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: String, options: UnloadFontOptions): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions]): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions], options: UnloadFontOptions): js.Promise[Unit] = js.native
  def useFonts(map: String): js.Tuple2[Boolean, Error | Null] = js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, Error | Null] = js.native
  @js.native
  object FontDisplay extends js.Object {
    /* "auto" */ val AUTO: typings.expoFont.fontTypesMod.FontDisplay.AUTO with String = js.native
    /* "block" */ val BLOCK: typings.expoFont.fontTypesMod.FontDisplay.BLOCK with String = js.native
    /* "fallback" */ val FALLBACK: typings.expoFont.fontTypesMod.FontDisplay.FALLBACK with String = js.native
    /* "optional" */ val OPTIONAL: typings.expoFont.fontTypesMod.FontDisplay.OPTIONAL with String = js.native
    /* "swap" */ val SWAP: typings.expoFont.fontTypesMod.FontDisplay.SWAP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expoFont.fontTypesMod.FontDisplay with String] = js.native
  }
  
}

