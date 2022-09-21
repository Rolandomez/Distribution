package typings.angular

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type JQLiteCssProperties = StringDictionary[String | Double | cssPropertySetter]

type JQueryStatic = js.Function1[
/* element */ String | Element | Document | Window | JQuery | ArrayLike[Element] | js.Function0[Unit], 
JQLite]

/**
  * The interface used to specify the properties parameter in css()
  */
// tslint:disable-next-line:class-name
type cssPropertySetter = js.Function2[/* index */ Double, /* value */ js.UndefOr[String], String | Double]
