package typings.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reactSketchapp.reactSketchappNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp", "StyleSheet")
@js.native
object StyleSheet extends js.Object {
  
  var absoluteFill: StyleReference = js.native
  
  /**
    * Create an optimized `StyleSheet` reference from a style object.
    */
  def create[T /* <: StringDictionary[Style | TextStyle] */](t: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ typings.reactSketchapp.reactSketchappStrings.StyleSheet with TopLevel[js.Any] = js.native
  
  /**
    * Flatten an array of style objects into one aggregated object, or look up the definition for a
    * registered stylesheet.
    */
  def flatten(): Style | TextStyle = js.native
  def flatten(input: js.Array[Style | TextStyle | StyleReference]): Style | TextStyle = js.native
  def flatten(input: Style): Style | TextStyle = js.native
  def flatten(input: StyleReference): Style | TextStyle = js.native
  
  var hairlineWidth: `1` = js.native
  
   // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
    * resolve one style
    */
  def resolve(style: Style): typings.reactSketchapp.anon.Style = js.native
  def resolve(style: TextStyle): typings.reactSketchapp.anon.Style = js.native
}
