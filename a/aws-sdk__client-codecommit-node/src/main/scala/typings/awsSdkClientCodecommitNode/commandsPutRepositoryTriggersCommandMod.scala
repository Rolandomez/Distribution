package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typings.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
import typings.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutRepositoryTriggersCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PutRepositoryTriggersCommand", "PutRepositoryTriggersCommand")
  @js.native
  open class PutRepositoryTriggersCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutRepositoryTriggersInput, 
          OutputTypesUnion, 
          PutRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PutRepositoryTriggersInput) = this()
    
    /* CompleteClass */
    override val input: PutRepositoryTriggersInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
  }
}
