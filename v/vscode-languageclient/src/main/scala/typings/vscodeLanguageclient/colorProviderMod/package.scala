package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object colorProviderMod {
  
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ typings.vscode.mod.Color, 
    /* context */ typings.vscodeLanguageclient.anon.Document, 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.ColorPresentation]]
  ]
  
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ typings.vscode.mod.TextDocument, 
    /* token */ typings.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typings.vscode.mod.ProviderResult[js.Array[typings.vscode.mod.ColorInformation]]
  ]
}
