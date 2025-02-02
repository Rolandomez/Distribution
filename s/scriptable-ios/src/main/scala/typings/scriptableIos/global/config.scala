package typings.scriptableIos.global

import typings.scriptableIos.scriptableIosStrings.accessoryCircular
import typings.scriptableIos.scriptableIosStrings.accessoryInline
import typings.scriptableIos.scriptableIosStrings.accessoryRectangular
import typings.scriptableIos.scriptableIosStrings.extraLarge
import typings.scriptableIos.scriptableIosStrings.large
import typings.scriptableIos.scriptableIosStrings.medium
import typings.scriptableIos.scriptableIosStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Configuration the script runs with._
  * @see https://docs.scriptable.app/config
  */
object config {
  
  @JSGlobal("config")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Whether the script was run from the home screen. You can add a script to the home screen from the script settings.
    * @see https://docs.scriptable.app/config/#runsfromhomescreen
    */
  @JSGlobal("config.runsFromHomeScreen")
  @js.native
  def runsFromHomeScreen: Boolean = js.native
  inline def runsFromHomeScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsFromHomeScreen")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in a widget.
    *
    * This is true when running in an accessory widget. These widgets can appear on the Lock Screen. Accessory widgets are only available starting from iOS 16.
    * @see https://docs.scriptable.app/config/#runsinaccessorywidget
    */
  @JSGlobal("config.runsInAccessoryWidget")
  @js.native
  def runsInAccessoryWidget: Boolean = js.native
  inline def runsInAccessoryWidget_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInAccessoryWidget")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in the action extension.
    * @see https://docs.scriptable.app/config/#runsinactionextension
    */
  @JSGlobal("config.runsInActionExtension")
  @js.native
  def runsInActionExtension: Boolean = js.native
  inline def runsInActionExtension_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInActionExtension")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in the app.
    * @see https://docs.scriptable.app/config/#runsinapp
    */
  @JSGlobal("config.runsInApp")
  @js.native
  def runsInApp: Boolean = js.native
  inline def runsInApp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInApp")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in a notification.
    * @see https://docs.scriptable.app/config/#runsinnotification
    */
  @JSGlobal("config.runsInNotification")
  @js.native
  def runsInNotification: Boolean = js.native
  inline def runsInNotification_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInNotification")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running in a widget.
    *
    * This is true both when running in a widget on the Home Screen and when running in a widget on the Lock Screen.
    * @see https://docs.scriptable.app/config/#runsinwidget
    */
  @JSGlobal("config.runsInWidget")
  @js.native
  def runsInWidget: Boolean = js.native
  inline def runsInWidget_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsInWidget")(x.asInstanceOf[js.Any])
  
  /**
    * Whether the script is running with Siri.
    * @see https://docs.scriptable.app/config/#runswithsiri
    */
  @JSGlobal("config.runsWithSiri")
  @js.native
  def runsWithSiri: Boolean = js.native
  inline def runsWithSiri_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runsWithSiri")(x.asInstanceOf[js.Any])
  
  /**
    * The size of the widget the script is running in.
    *
    * Possible values are: `small`, `medium`, `large`, `extraLarge`, `accessoryRectangular`, `accessoryInline`, `accessoryCircular`, and `null`. The value is `null` when the script is
    * not running in a widget.
    *
    * `extraLarge` is only available on iPads running iPadOS 15. `accessoryRectangular`, `accessoryInline`, and `accessoryCircular` are only available starting from iOS 16.
    * @see https://docs.scriptable.app/config/#widgetfamily
    */
  @JSGlobal("config.widgetFamily")
  @js.native
  def widgetFamily: small | medium | large | extraLarge | accessoryRectangular | accessoryInline | accessoryCircular | Null = js.native
  inline def widgetFamily_=(
    x: small | medium | large | extraLarge | accessoryRectangular | accessoryInline | accessoryCircular | Null
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("widgetFamily")(x.asInstanceOf[js.Any])
}
