package typings.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typings.grommet.grommetStrings.icon
import typings.grommet.grommetStrings.id
import typings.grommet.grommetStrings.mask
import typings.grommet.grommetStrings.name
import typings.grommet.grommetStrings.onBlur
import typings.grommet.grommetStrings.plain
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.size
import typings.grommet.grommetStrings.value
import typings.grommet.maskedInputMod.MaskedInputProps
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6", "MaskedInput")
@js.native
class MaskedInput protected ()
  extends Component[
      MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | onBlur | plain | reverse | size | value
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | onBlur | plain | reverse | size | value
      ])) = this()
  def this(
    props: MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        icon | id | mask | name | onBlur | plain | reverse | size | value
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/es6", "MaskedInput")
@js.native
object MaskedInput extends TopLevel[
      ComponentClass[
        MaskedInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          icon | id | mask | name | onBlur | plain | reverse | size | value
        ]), 
        ComponentState
      ]
    ]

