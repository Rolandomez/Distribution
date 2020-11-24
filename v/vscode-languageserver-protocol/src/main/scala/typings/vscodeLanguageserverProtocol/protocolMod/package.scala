package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object protocolMod {
  
  type ClientCapabilities = typings.vscodeLanguageserverProtocol.protocolMod._ClientCapabilities with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersClientCapabilities with typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationClientCapabilities with typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressClientCapabilities
  
  type DefinitionOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentFormattingOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentHighlightOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentRangeFormattingOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type DocumentSelector = js.Array[
    java.lang.String | typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
  ]
  
  type DocumentSymbolOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type ExecuteCommandRegistrationOptions = typings.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandOptions
  
  type HoverOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type InitializeParams = typings.vscodeLanguageserverProtocol.protocolMod._InitializeParams with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
  
  type ReferenceOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type ServerCapabilities[T] = typings.vscodeLanguageserverProtocol.protocolMod._ServerCapabilities[T] with typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersServerCapabilities
  
  type WorkspaceSymbolOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
  
  type WorkspaceSymbolRegistrationOptions = typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolOptions
}
