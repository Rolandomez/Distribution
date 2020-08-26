package typings.uirouterAngularjs.mod

import typings.std.RegExp
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "UrlMatcher")
@js.native
class UrlMatcher protected ()
  extends typings.uirouterCore.mod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(
    pattern: String,
    paramTypes: typings.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory
  ) = this()
  def this(
    pattern: String,
    paramTypes: typings.uirouterCore.paramTypesMod.ParamTypes,
    paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory,
    config: UrlMatcherCompileConfig
  ) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "UrlMatcher")
@js.native
object UrlMatcher extends js.Object {
  /** @internal */
  var nameValidator: RegExp = js.native
  /**
    * Compare two UrlMatchers
    *
    * This comparison function converts a UrlMatcher into static and dynamic path segments.
    * Each static path segment is a static string between a path separator (slash character).
    * Each dynamic segment is a path parameter.
    *
    * The comparison function sorts static segments before dynamic ones.
    */
  def compare(a: typings.uirouterCore.urlMatcherMod.UrlMatcher, b: typings.uirouterCore.urlMatcherMod.UrlMatcher): Double = js.native
  /** @internal */
  def encodeDashes(str: String): String = js.native
  /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
  def pathSegmentsAndParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): js.Any = js.native
  /** @internal Given a matcher, return an array with the matcher's query params */
  def queryParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[typings.uirouterCore.paramMod.Param] = js.native
}

