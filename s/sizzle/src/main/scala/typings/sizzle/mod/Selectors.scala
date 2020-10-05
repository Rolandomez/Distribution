package typings.sizzle.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sizzle.mod.Selectors.AttrHandleFunctions
import typings.sizzle.mod.Selectors.CreatePseudoFunction
import typings.sizzle.mod.Selectors.FilterFunctions
import typings.sizzle.mod.Selectors.FindFunctions
import typings.sizzle.mod.Selectors.Matches
import typings.sizzle.mod.Selectors.PreFilterFunctions
import typings.sizzle.mod.Selectors.PseudoFunction
import typings.sizzle.mod.Selectors.PseudoFunctions
import typings.sizzle.mod.Selectors.SetFilterFunctions
import typings.std.Document
import typings.std.Element
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selectors extends js.Object {
  var attrHandle: AttrHandleFunctions = js.native
  var cacheLength: Double = js.native
  var filter: FilterFunctions = js.native
  var find: FindFunctions = js.native
  var `match`: Matches = js.native
  var preFilter: PreFilterFunctions = js.native
  var pseudos: PseudoFunctions = js.native
  var setFilters: SetFilterFunctions = js.native
  def createPseudo(fn: CreatePseudoFunction): PseudoFunction = js.native
}

@JSImport("sizzle", "Selectors")
@js.native
object Selectors extends js.Object {
  type AttrHandleFunction = js.Function3[/* elem */ js.Any, /* casePreservedName */ String, /* isXML */ Boolean, String]
  type AttrHandleFunctions = StringDictionary[AttrHandleFunction]
  type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
  type FilterFunction = js.Function2[/* element */ String, /* repeated */ String, Boolean]
  type FilterFunctions = StringDictionary[FilterFunction]
  type FindFunction = js.Function3[
    /* match */ RegExpMatchArray, 
    /* context */ Element | Document, 
    /* isXML */ Boolean, 
    js.Array[Element] | Unit
  ]
  type FindFunctions = StringDictionary[FindFunction]
  type Matches = StringDictionary[RegExp]
  type PreFilterFunction = js.Function1[/* match */ RegExpMatchArray, js.Array[String]]
  type PreFilterFunctions = StringDictionary[PreFilterFunction]
  type PseudoFunction = js.Function1[/* elem */ Element, Boolean]
  type PseudoFunctions = StringDictionary[PseudoFunction]
  type SetFilterFunction = js.Function3[
    /* elements */ js.Array[Element], 
    /* argument */ Double, 
    /* not */ Boolean, 
    js.Array[Element]
  ]
  type SetFilterFunctions = StringDictionary[SetFilterFunction]
}

