package typings.awsSdk.global.AWS

import typings.awsSdk.libConfigMod.APIVersions
import typings.awsSdk.libConfigServicePlaceholdersMod.ConfigurationServicePlaceholders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
open class Config_ ()
  extends typings.awsSdk.mod.Config_ {
  def this(options: typings.awsSdk.libConfigBaseMod.ConfigurationOptions & ConfigurationServicePlaceholders & APIVersions) = this()
}
