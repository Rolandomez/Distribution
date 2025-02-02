package typings.nivoRadar

import typings.nivoRadar.distTypesTypesMod.RadarSvgProps
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarMod {
  
  @JSImport("@nivo/radar/dist/types/Radar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Radar[D /* <: Record[String, Any] */](param0: RadarSvgProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radar")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
