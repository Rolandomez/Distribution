package typings.officeUiFabricReact

import typings.officeUiFabricReact.shimmerCircleTypesMod.IShimmerCircleProps
import typings.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typings.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typings.officeUiFabricReact.shimmerLineTypesMod.IShimmerLineProps
import typings.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Shimmer", JSImport.Namespace)
@js.native
object libShimmerMod extends js.Object {
  
  val Shimmer: FunctionComponent[IShimmerProps] = js.native
  
  val ShimmerCircle: FunctionComponent[IShimmerCircleProps] = js.native
  
  val ShimmerCircleBase: FunctionComponent[IShimmerCircleProps] = js.native
  
  val ShimmerElementsGroup: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  val ShimmerElementsGroupBase: FunctionComponent[IShimmerElementsGroupProps] = js.native
  
  val ShimmerGap: FunctionComponent[IShimmerGapProps] = js.native
  
  val ShimmerGapBase: FunctionComponent[IShimmerGapProps] = js.native
  
  val ShimmerLine: FunctionComponent[IShimmerLineProps] = js.native
  
  val ShimmerLineBase: FunctionComponent[IShimmerLineProps] = js.native
  
  @js.native
  class ShimmerBase protected ()
    extends typings.officeUiFabricReact.shimmerMod.ShimmerBase {
    def this(props: IShimmerProps) = this()
  }
  /* static members */
  @js.native
  object ShimmerBase extends js.Object {
    
    var defaultProps: IShimmerProps = js.native
  }
  
  @js.native
  object ShimmerElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType with Double] = js.native
    
    /* 2 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.circle with Double = js.native
    
    /* 3 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.gap with Double = js.native
    
    /* 1 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementType.line with Double = js.native
  }
  
  @js.native
  object ShimmerElementsDefaultHeights extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights with Double
      ] = js.native
    
    /* 24 */ val circle: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.circle with Double = js.native
    
    /* 16 */ val gap: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.gap with Double = js.native
    
    /* 16 */ val line: typings.officeUiFabricReact.shimmerTypesMod.ShimmerElementsDefaultHeights.line with Double = js.native
  }
}
