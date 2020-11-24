package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = typings.react.mod.ComponentClass[
    (typings.reactInstantsearchCore.mod.Omit[TProps, TProvidedProps]) with TExposedProps, 
    typings.react.mod.ComponentState
  ]
  
  type ConnectorProvided[TProvided] = typings.reactInstantsearchCore.anon.CreateURL with TProvided
  
  type HighlightProps[TDoc] = typings.reactInstantsearchCore.mod.HighlightProvided[TDoc] with typings.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]
  
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typings.reactInstantsearchCore.reactInstantsearchCoreStrings.HighlightResult with org.scalablytyped.runtime.TopLevel[TDoc]
  
  type HighlightResultArray[TItem] = js.Array[
    typings.reactInstantsearchCore.mod.HighlightResult[TItem] | typings.reactInstantsearchCore.mod.HighlightResultPrimitive
  ]
  
  type HighlightResultField[TField] = typings.reactInstantsearchCore.mod.HighlightResult[TField] | typings.reactInstantsearchCore.mod.HighlightResultPrimitive | typings.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
  
  type Hit[TDoc] = TDoc with typings.reactInstantsearchCore.anon.HighlightResult[TDoc]
  
  type Omit[T1, T2] = typings.std.Pick[
    T1, 
    typings.std.Exclude[/* keyof T1 */ java.lang.String, /* keyof T2 */ java.lang.String]
  ]
  
  type Refinement = typings.reactInstantsearchCore.anon.Attribute with (typings.reactInstantsearchCore.anon.CurrentRefinement | typings.reactInstantsearchCore.anon.Items)
  
  type RefinementValue = js.Function1[
    /* searchState */ typings.reactInstantsearchCore.mod.SearchState, 
    typings.reactInstantsearchCore.mod.SearchState
  ]
}
