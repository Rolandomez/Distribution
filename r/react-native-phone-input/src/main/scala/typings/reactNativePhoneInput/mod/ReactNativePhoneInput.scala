package typings.reactNativePhoneInput.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactNative.mod.ImageRequireSource
import typings.reactNativePhoneInput.anon.TypeofTextInput
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactNativePhoneInput[TextComponentType /* <: ComponentType[js.Object] */]
  extends Component[ReactNativePhoneInputProps[TextComponentType], js.Object, js.Any] {
  
  /**
    * Blur the phone input
    */
  def blur(): Unit = js.native
  
  /**
    * Focus the phone input
    */
  def focus(): Unit = js.native
  
  /**
    * Return country object in country picker
    */
  def getAllCountries(): CountriesListItem = js.native
  
  /**
    * Return country dial code of current phone number
    */
  def getCountryCode(): String = js.native
  
  /**
    * Return flag image
    */
  def getFlag(iso2: String): ImageRequireSource = js.native
  
  /**
    * Return country iso code of current phone number
    */
  def getISOCode(): String = js.native
  
  /**
    * Return true type of current phone number
    */
  def getNumberType(): String = js.native
  
  /**
    * Return country object with flag image
    */
  def getPickerData(): PickerData = js.native
  
  /**
    * Return current phone number
    */
  def getValue(): String = js.native
  
  /**
    * Return true if current phone number is valid
    */
  def isValidNumber(): Boolean = js.native
  
  var picker: js.UndefOr[Ref[ThisType[ReactNativePhoneInput[TypeofTextInput]]]] = js.native
  
  /**
    * Set phone input to specific country
    */
  def selectCountry(iso2: String): Unit = js.native
}
