package typings.googleapis.mod.tpuV1alpha1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud TPU API
  *
  * TPU API provides customers with access to Google TPU technology.
  *
  * @example
  * const {google} = require('googleapis');
  * const tpu = google.tpu('v1alpha1');
  *
  * @namespace tpu
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Tpu
  */
@JSImport("googleapis", "tpu_v1alpha1.Tpu")
@js.native
class Tpu protected ()
  extends typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1.Tpu {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
