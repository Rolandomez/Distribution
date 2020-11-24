package typings.styledSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Config = /** Property name exposed for use in components */
  org.scalablytyped.runtime.StringDictionary[typings.styledSystem.mod.ConfigStyle | scala.Boolean]
  
  type ObjectOrArray[T, K /* <: /* keyof any */ java.lang.String */] = js.Array[T] | (typings.std.Record[K, T | (typings.std.Record[K, T]) | js.Array[T]])
  
  type ResponsiveValue[T, ThemeType /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */] = T | scala.Null | (js.Array[T | scala.Null]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in styled-system.styled-system.ThemeValue<'breakpoints', ThemeType, any> & string | number ]:? T}
    */ typings.styledSystem.styledSystemStrings.ResponsiveValue with org.scalablytyped.runtime.TopLevel[js.Any])
  
  type Scale = typings.styledSystem.mod.ObjectOrArray[scala.Double | java.lang.String, /* keyof any */ java.lang.String]
  
  type TLengthStyledSystem = java.lang.String | typings.styledSystem.styledSystemNumbers.`0` | scala.Double
  
  type ThemeValue[K /* <: /* keyof ThemeType */ java.lang.String */, ThemeType, TVal] = js.Any | scala.Double
}
