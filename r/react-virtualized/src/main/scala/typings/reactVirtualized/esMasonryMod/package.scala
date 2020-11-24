package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esMasonryMod {
  
  type CellRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esMasonryMod.MasonryCellProps, 
    typings.react.mod.ReactNode
  ]
  
  type OnCellsRenderedCallback = js.Function1[/* params */ typings.reactVirtualized.mod.IndexRange, scala.Unit]
  
  type OnScrollCallback = js.Function1[/* params */ typings.reactVirtualized.anon.ClientHeight, scala.Unit]
  
  type Positioner = (js.Function1[/* index */ scala.Double, typings.reactVirtualized.esMasonryMod.Position]) with typings.reactVirtualized.anon.Reset
  
  type emptyObject = js.Object
  
  type identity = js.Function1[/* value */ js.Any, js.Any]
  
  type noop = js.Function0[scala.Unit]
}
