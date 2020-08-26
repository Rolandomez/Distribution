package typings.styledSystemCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSInterpolation = js.UndefOr[scala.Double | java.lang.String | typings.styledSystemCss.mod.CSSObject]
  type CssFunctionReturnType = js.Function1[
    /* props */ js.UndefOr[typings.styledSystemCss.mod.Theme | typings.styledSystemCss.anon.Theme], 
    typings.styledSystemCss.mod.CSSObject
  ]
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ResponsiveStyleValue[T] = T | (js.Array[T | scala.Null])
  type StandardCSSProperties = typings.csstype.mod.PropertiesFallback[scala.Double | java.lang.String, java.lang.String with js.Object]
  /* Rewritten from type alias, can be one of: 
    - typings.styledSystemCss.mod.SystemCssProperties
    - typings.styledSystemCss.mod.CSSPseudoSelectorProps
    - typings.styledSystemCss.mod.CSSSelectorObject
    - typings.styledSystemCss.mod.VariantProperty
    - typings.styledSystemCss.mod.UseThemeFunction
    - typings.styledSystemCss.mod.EmotionLabel
    - scala.Null
  */
  type SystemStyleObject = typings.styledSystemCss.mod._SystemStyleObject | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typings.styledSystemCss.anon.KinkeyofStandardCSSProper
    - typings.styledSystemCss.anon.PartialScaleThemeProperti
    - typings.styledSystemCss.mod.ThemeBreakPoints
    - org.scalablytyped.runtime.StringDictionary[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme * / js.Object]
  */
  type Theme = typings.styledSystemCss.mod._Theme | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.Theme */ js.Object
  ])
  type ThemeValue[T] = js.Array[T] | (org.scalablytyped.runtime.StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @styled-system/css.@styled-system/css.ThemeValue<T> */ js.Object)
  ])
}
