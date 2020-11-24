package typings.antDesignIconsAngular

import typings.angularCommon.httpMod.HttpBackend
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularPlatformBrowser.mod.DomSanitizer
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.Manifest
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.Error
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/icons-angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  def DynamicLoadingTimeoutError(): Error = js.native
  
  def HttpModuleNotImport(): Null = js.native
  
  def IconNotFoundError(icon: String): Error = js.native
  
  def NameSpaceIsNotSpecifyError(): Error = js.native
  
  def SVGTagNotFoundError(): Error = js.native
  
  def UrlNotSafeError(url: String): Error = js.native
  
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  
  def error(message: String): Unit = js.native
  
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  
  def getSecondaryColor(primaryColor: String): String = js.native
  
  def hasNamespace(`type`: String): Boolean = js.native
  
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  
  val manifest: Manifest = js.native
  
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  
  def replaceFillColor(raw: String): String = js.native
  
  def warn(message: String): Unit = js.native
  
  def withSuffix(name: String): String = js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
  
  @js.native
  class IconDirective protected ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconDirective {
    def this(
      _iconService: typings.antDesignIconsAngular.iconServiceMod.IconService,
      _elementRef: ElementRef[_],
      _renderer: Renderer2
    ) = this()
  }
  
  @js.native
  class IconModule ()
    extends typings.antDesignIconsAngular.iconModuleMod.IconModule
  
  @js.native
  class IconService protected ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconService {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: js.Any,
      sanitizer: DomSanitizer
    ) = this()
  }
}
