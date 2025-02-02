package typings.vexflow.mod.Flow

import typings.vexflow.anon.Copyright
import typings.vexflow.anon.Ha
import typings.vexflow.anon.XMax_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// from vexflow_font.js / gonville_original.js / gonville_all.js
object Font {
  
  @JSImport("vexflow", "Flow.Font")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vexflow", "Flow.Font.ascender")
  @js.native
  def ascender: Double = js.native
  inline def ascender_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascender")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.boundingBox")
  @js.native
  def boundingBox: XMax_ = js.native
  inline def boundingBox_=(x: XMax_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.cssFontStyle")
  @js.native
  def cssFontStyle: String = js.native
  inline def cssFontStyle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cssFontStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.cssFontWeight")
  @js.native
  def cssFontWeight: String = js.native
  inline def cssFontWeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cssFontWeight")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.descender")
  @js.native
  def descender: Double = js.native
  inline def descender_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("descender")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.familyName")
  @js.native
  def familyName: String = js.native
  inline def familyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("familyName")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.glyphs")
  @js.native
  def glyphs: js.Array[Ha] = js.native
  inline def glyphs_=(x: js.Array[Ha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glyphs")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.lineHeight")
  @js.native
  def lineHeight: Double = js.native
  inline def lineHeight_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
  
  //inconsistent member : this is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js
  @JSImport("vexflow", "Flow.Font.original_font_information")
  @js.native
  def originalFontInformation: Copyright = js.native
  
  inline def originalFontInformation_=(x: Copyright): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("original_font_information")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.resolution")
  @js.native
  def resolution: Double = js.native
  inline def resolution_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolution")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.underlinePosition")
  @js.native
  def underlinePosition: Double = js.native
  inline def underlinePosition_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underlinePosition")(x.asInstanceOf[js.Any])
  
  @JSImport("vexflow", "Flow.Font.underlineThickness")
  @js.native
  def underlineThickness: Double = js.native
  inline def underlineThickness_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underlineThickness")(x.asInstanceOf[js.Any])
}
