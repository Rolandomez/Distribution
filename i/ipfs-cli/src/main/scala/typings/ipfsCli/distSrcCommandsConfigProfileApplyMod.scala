package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.distSrcTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCommandsConfigProfileApplyMod extends Shortcut {
  
  /**
    * @typedef {object} Argv
    * @property {import('../../../types').Context} Argv.ctx
    * @property {string} Argv.profile
    * @property {boolean} Argv.dryRun
    * @property {number} Argv.timeout
    */
  /** @type {import('yargs').CommandModule<Argv, Argv>} */
  @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = js.native
  
  trait Argv extends StObject {
    
    var ctx: Context
    
    var dryRun: Boolean
    
    var profile: String
    
    var timeout: Double
  }
  object Argv {
    
    inline def apply(ctx: Context, dryRun: Boolean, profile: String, timeout: Double): Argv = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distSrcCommandsConfigProfileApplyMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_yargs.CommandModule<Argv, Argv> */ Any = default
}
