package typings.ionic.definitionsMod

import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicEnvironment extends StObject {
  
  val client: IClient = js.native
  
  val config: IConfig = js.native
  
  val ctx: IonicContext = js.native
  
  val flags: IonicEnvironmentFlags = js.native
  
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  
  val log: ILogger = js.native
  
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  
  val session: ISession = js.native
  
  val shell: IShell = js.native
}
