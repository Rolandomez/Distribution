package typings.useSidecar

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.std.Omit
import typings.useSidecar.distEs5TypesMod.Importer
import typings.useSidecar.distEs5TypesMod.SideCarHOC
import typings.useSidecar.useSidecarStrings.sideCar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5HocMod {
  
  @JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sidecar[T](importer: Importer[T]): FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])]]
  inline def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])] = (^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any], errorComponent.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[(Omit[T, sideCar]) & (SideCarHOC[Omit[T, sideCar]])]]
}
