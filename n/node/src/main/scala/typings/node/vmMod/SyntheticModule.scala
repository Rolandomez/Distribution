package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This feature is only available with the `--experimental-vm-modules` command
  * flag enabled.
  *
  *
  *
  * The `vm.SyntheticModule` class provides the [Synthetic Module Record](https://heycam.github.io/webidl/#synthetic-module-records) as
  * defined in the WebIDL specification. The purpose of synthetic modules is to
  * provide a generic interface for exposing non-JavaScript sources to ECMAScript
  * module graphs.
  *
  * ```js
  * const vm = require('node:vm');
  *
  * const source = '{ "a": 1 }';
  * const module = new vm.SyntheticModule(['default'], function() {
  *   const obj = JSON.parse(source);
  *   this.setExport('default', obj);
  * });
  *
  * // Use `module` in linking...
  * ```
  * @since v13.0.0, v12.16.0
  * @experimental
  */
@JSImport("vm", "SyntheticModule")
@js.native
open class SyntheticModule protected () extends Module {
  /**
    * Creates a new `SyntheticModule` instance.
    * @param exportNames Array of names that will be exported from the module.
    * @param evaluateCallback Called when the module is evaluated.
    */
  def this(
    exportNames: js.Array[String],
    evaluateCallback: js.ThisFunction0[/* this */ SyntheticModule, Unit]
  ) = this()
  def this(
    exportNames: js.Array[String],
    evaluateCallback: js.ThisFunction0[/* this */ SyntheticModule, Unit],
    options: SyntheticModuleOptions
  ) = this()
  
  /**
    * This method is used after the module is linked to set the values of exports. If
    * it is called before the module is linked, an `ERR_VM_MODULE_STATUS` error
    * will be thrown.
    *
    * ```js
    * import vm from 'node:vm';
    *
    * const m = new vm.SyntheticModule(['x'], () => {
    *   m.setExport('x', 1);
    * });
    *
    * await m.link(() => {});
    * await m.evaluate();
    *
    * assert.strictEqual(m.namespace.x, 1);
    * ```
    * @since v13.0.0, v12.16.0
    * @param name Name of the export to set.
    * @param value The value to set the export to.
    */
  def setExport(name: String, value: Any): Unit = js.native
}
