package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.Identifier
  - typings.solidityParserAntlr.mod.AssemblyBlock
  - typings.solidityParserAntlr.mod.AssemblyExpression
  - typings.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typings.solidityParserAntlr.mod.AssemblyAssignment
  - typings.solidityParserAntlr.mod.AssemblyStackAssignment
  - typings.solidityParserAntlr.mod.LabelDefinition
  - typings.solidityParserAntlr.mod.AssemblySwitch
  - typings.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typings.solidityParserAntlr.mod.AssemblyFor
  - typings.solidityParserAntlr.mod.AssemblyIf
  - typings.solidityParserAntlr.mod.Break
  - typings.solidityParserAntlr.mod.Continue
  - typings.solidityParserAntlr.mod.SubAssembly
  - typings.solidityParserAntlr.mod.NumberLiteral
  - typings.solidityParserAntlr.mod.StringLiteral
  - typings.solidityParserAntlr.mod.HexNumber
  - typings.solidityParserAntlr.mod.HexLiteral
  - typings.solidityParserAntlr.mod.DecimalNumber
*/
trait AssemblyItem extends ASTNode
object AssemblyItem {
  
  @scala.inline
  def NumberLiteral(number: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): AssemblyItem = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def StringLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyIf(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyFor(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyStackAssignment(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def DecimalNumber(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Continue(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Continue): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Break(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def HexLiteral(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Identifier): AssemblyItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def HexNumber(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexNumber, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblySwitch(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def LabelDefinition(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def SubAssembly(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
}
